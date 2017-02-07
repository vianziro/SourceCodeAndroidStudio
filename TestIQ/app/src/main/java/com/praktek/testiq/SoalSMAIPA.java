package com.praktek.testiq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
 
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.content.Intent;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SoalSMAIPA extends Activity {
    private DatabaseQuizIPA dbIPA;
    private TextView txtnama, txtumur, txtno, txttanggal, txtwaktu, txtsoal;
    private RadioGroup rg;
    private RadioButton rdA, rdB, rdC, rdD;
    private List<Soal> listSoal;
    private CountDownTimer mCountDownTimer;
    private int detik = 600 * 1000; // --> 10 menit
    private Button btnPrev, btnNext, btnSelesai;
    int jawabanYgDiPilih[] = null;
    int jawabanYgBenar[] = null;
    boolean cekPertanyaan = false;
    int urutanPertanyaan = 0;
    String Keterangan;
     
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soalsma);
        dbIPA = new DatabaseQuizIPA(this);
        txtnama = (TextView) findViewById(R.id.textViewNama);
        txtumur = (TextView) findViewById(R.id.textViewUmur);
        txtno = (TextView) findViewById(R.id.textViewHalaman);
        txttanggal = (TextView) findViewById(R.id.textViewTanggal);
        txtwaktu = (TextView) findViewById(R.id.textViewWaktu);
        txtsoal = (TextView) findViewById(R.id.textViewSoal);
        rg = (RadioGroup) findViewById(R.id.radioGroup1);
        rdA = (RadioButton) findViewById(R.id.radio0);
        rdB = (RadioButton) findViewById(R.id.radio1);
        rdC = (RadioButton) findViewById(R.id.radio2);
        rdD = (RadioButton) findViewById(R.id.radio3);
        btnPrev = (Button) findViewById(R.id.buttonPrev);
        btnNext = (Button) findViewById(R.id.buttonNext);
        btnSelesai = (Button) findViewById(R.id.buttonSelesai);
        final Calendar c = Calendar.getInstance();
        int day = c.get(Calendar.DAY_OF_MONTH);
        int month = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);
        txttanggal.setText(Integer.toString(day)+"-"+Integer.toString(month+1)+"-"+Integer.toString(year));
         
        listSoal = new ArrayList<Soal>();
        listSoal = dbIPA.getSoal();
  
        btnSelesai.setOnClickListener(klikSelesai);
        btnPrev.setOnClickListener(klikSebelum);
        btnNext.setOnClickListener(klikBerikut);
        //new GetSoal().execute();
        jawabanYgDiPilih = new int[listSoal.size()];
        java.util.Arrays.fill(jawabanYgDiPilih, -1);
        jawabanYgBenar = new int[listSoal.size()];
        java.util.Arrays.fill(jawabanYgBenar, -1);
        showInputUser();
    }
 
    private void showInputUser() {
        LayoutInflater mInflater = LayoutInflater.from(this);
        View v = mInflater.inflate(R.layout.identitas, null);
 
        final AlertDialog dialog = new AlertDialog.Builder(this).create();
 
        dialog.setView(v);
        dialog.setTitle("Ketikkan Nama & Sekolah Anda");
        dialog.setCancelable(false);
 
        final Button btnMulaiOk = (Button) v.findViewById(R.id.btnMulai);
        final Button btnKembaliOk = (Button) v.findViewById(R.id.btnKembali);
        final EditText txtNamaOk = (EditText) v.findViewById(R.id.txtNama);
        final EditText txtUmurOk = (EditText) v.findViewById(R.id.txtUmur);
 
        btnKembaliOk.setOnClickListener(new View.OnClickListener()
        {            
            public void onClick(View v)
            {
            	calMenuUtama();
            }
        });

        btnMulaiOk.setOnClickListener(new View.OnClickListener()
        {            
            public void onClick(View v)
            {
                if(txtNamaOk.getText().toString().equals("")){
                    Toast.makeText(getBaseContext(), "Isi dulu", Toast.LENGTH_LONG).show();
                }else{
                txtnama.setText(txtNamaOk.getText().toString());
                txtumur.setText(txtUmurOk.getText().toString());
                mulaiKuis();
                dialog.dismiss();
                }
 
            }
        });
 
        dialog.show();
    }
 
    public void calMenuUtama(){
        Intent i = new Intent(this, testiq.class);
        startActivity(i);
    }
    
    protected void mulaiKuis() {
        setUpWaktu();
        setUpSoal();
         
    }
 
    private void setUpSoal() {
        this.tunjukanPertanyaan(0, cekPertanyaan);
    }
 
    private void tunjukanPertanyaan(int urutan_soal_soal, boolean review) {
        try {
            rg.clearCheck();
            Soal soal = new Soal();
            soal = listSoal.get(urutan_soal_soal);
            String pertanyaan = soal.getSoal();
            if (jawabanYgBenar[urutan_soal_soal] == -1) {
                jawabanYgBenar[urutan_soal_soal] = soal.getJwban();
            }
             
            txtsoal.setText(pertanyaan.toCharArray(), 0, pertanyaan.length());
            rg.check(-1);
            String jwb_a = soal.getPil_a();
            rdA.setText(jwb_a.toCharArray(), 0,
                    jwb_a.length());
            String jwb_b = soal.getPil_b();
            rdB.setText(jwb_b.toCharArray(), 0,
                    jwb_b.length());
            String jwb_c = soal.getPil_c();
            rdC.setText(jwb_c.toCharArray(), 0,
                    jwb_c.length());
            String jwb_d = soal.getPil_d();
            rdD.setText(jwb_d.toCharArray(), 0,
                    jwb_d.length());
             
            Log.d("", jawabanYgDiPilih[urutan_soal_soal] + "");
            if (jawabanYgDiPilih[urutan_soal_soal] == 0)
                rg.check(R.id.radio0);
            if (jawabanYgDiPilih[urutan_soal_soal] == 1)
                rg.check(R.id.radio1);
            if (jawabanYgDiPilih[urutan_soal_soal] == 2)
                rg.check(R.id.radio2);
            if (jawabanYgDiPilih[urutan_soal_soal] == 3)
                rg.check(R.id.radio3);
 
            pasangLabelDanNomorUrut();
 
            if (urutan_soal_soal == (listSoal.size() - 1))
                btnNext.setEnabled(false);
 
            if (urutan_soal_soal == 0)
                btnPrev.setEnabled(false);
 
            if (urutan_soal_soal > 0)
                btnPrev.setEnabled(true);
 
            if (urutan_soal_soal < (listSoal.size() - 1))
                btnNext.setEnabled(true);
 
        } catch (Exception e) {
            Log.e(this.getClass().toString(), e.getMessage(), e.getCause());
        }
    }
 
    private void setUpWaktu() {
        mCountDownTimer = new CountDownTimer(detik, 1000)
        {
 
            @Override
            public void onTick(long millisUntilFinished)
            {
                // TODO Auto-generated method stub
                txtwaktu.setText("Sisa waktu: " +(int) (millisUntilFinished / 60000) +
                        " menit");
            }
 
            @Override
            public void onFinish()
            {
                // TODO Auto-generated method stub
                txtwaktu.setText("Sisa waktu: 0 menit");
                Toast.makeText(SoalSMAIPA.this, "Waktu Habis",
                        Toast.LENGTH_SHORT).show();                
            }
        };
 
        mCountDownTimer.start();
    }
     
    private OnClickListener klikSelesai = new OnClickListener() {
        public void onClick(View v) {
            aturJawaban_nya();
         // hitung berapa yg benar
            int jumlahJawabanYgBenar = 0;
            int jmlBenar1 = 0;
            int jmlBenar2 = 0;
            int jmlBenar3 = 0;
            int jmlBenar4 = 0;
            int jmlBenar5 = 0;
            int jmlBenar6 = 0;
            float CA = Float.parseFloat(txtumur.getText().toString());
            
            for (int i = 0; i < 5; i++) {
            	if ((jawabanYgBenar[i] != -1) && (jawabanYgBenar[i] == jawabanYgDiPilih[i]))
            		jmlBenar1++;
            }                		
            double MA1 = CA * (jmlBenar1/5);
            
            for (int j = 5; j < 10; j++) {
            	if ((jawabanYgBenar[j] != -1) && (jawabanYgBenar[j] == jawabanYgDiPilih[j]))
            		jmlBenar2++;
            }                		
            double MA2 = 2 * (jmlBenar2/5);
            
            for (int k = 10; k < 15; k++) {
            	if ((jawabanYgBenar[k] != -1) && (jawabanYgBenar[k] == jawabanYgDiPilih[k]))
            		jmlBenar3++;
            }                		
            double MA3 = 2 * (jmlBenar3/5);
            
            for (int l = 15; l < 20; l++) {
            	if ((jawabanYgBenar[l] != -1) && (jawabanYgBenar[l] == jawabanYgDiPilih[l]))
            		jmlBenar4++;
            }                		
            double MA4 = 2 * (jmlBenar4/5);
            
            for (int m = 20; m < 25; m++) {
            	if ((jawabanYgBenar[m] != -1) && (jawabanYgBenar[m] == jawabanYgDiPilih[m]))
            		jmlBenar5++;
            }                		
            double MA5 = 2 * (jmlBenar5/5);
            
            for (int n = 25; n < 30; n++) {
            	if ((jawabanYgBenar[n] != -1) && (jawabanYgBenar[n] == jawabanYgDiPilih[n]))
            		jmlBenar6++;
            }                		
            double MA6 = 2 * (jmlBenar6/5);
            
            jumlahJawabanYgBenar=jmlBenar1+jmlBenar2+jmlBenar3+jmlBenar4+jmlBenar5+jmlBenar6;
            double MA = MA1+MA2+MA3+MA4+MA5+MA6;
            double IQ = (MA/CA)*100;
            if (IQ<50) {
            	Keterangan="Idiot";
            }
            else if (IQ<70) {
            	Keterangan="Moron (Lemah Pikir)";
            }
            else if (IQ<80) {
            	Keterangan="Garis Batas (Bodoh)";
            }
            else if (IQ<90) {
            	Keterangan="Di bawah Rata-rata";
            }
            else if (IQ<110) {
            	Keterangan="Normal(Rata-rata)";
            }
            else if (IQ<120) {
            	Keterangan="Cerdas (Superior)";
            }
            else if (IQ<=140) {
            	Keterangan="Sangat Cerdas";
            }
            else {
            	Keterangan="Genius";
            }
            AlertDialog tampilKotakAlert;
            tampilKotakAlert = new AlertDialog.Builder(SoalSMAIPA.this).create();
            tampilKotakAlert.setTitle("Nilai");
            tampilKotakAlert.setMessage("Benar " +jumlahJawabanYgBenar + " dari "
                    + (listSoal.size() +" soal" + " MA = "+MA + " CA = "+CA + " IQ = "+IQ + " Klasifikasi = "+Keterangan ) );
 
            tampilKotakAlert.setButton(AlertDialog.BUTTON_NEUTRAL, "Lagi",
                    new DialogInterface.OnClickListener() {
 
                        public void onClick(DialogInterface dialog, int which) {
                            cekPertanyaan = false;
                            urutanPertanyaan = 0;
                             
                            SoalSMAIPA.this.tunjukanPertanyaan(0,
                                    cekPertanyaan);
                        }
                    });
 
            tampilKotakAlert.setButton(AlertDialog.BUTTON_NEGATIVE, "Keluar",
                    new DialogInterface.OnClickListener() {
 
                        public void onClick(DialogInterface dialog, int which) {
                            cekPertanyaan = false;
                            finish();
                        }
                    });
 
            tampilKotakAlert.show();
 
        }
    };
 
    private void aturJawaban_nya() {
        if (rdA.isChecked())
            jawabanYgDiPilih[urutanPertanyaan] = 0;
        if (rdB.isChecked())
            jawabanYgDiPilih[urutanPertanyaan] = 1;
        if (rdC.isChecked())
            jawabanYgDiPilih[urutanPertanyaan] = 2;
        if (rdD.isChecked())
            jawabanYgDiPilih[urutanPertanyaan] = 3;

        Log.d("", Arrays.toString(jawabanYgDiPilih));
        Log.d("", Arrays.toString(jawabanYgBenar));
 
    }
 
    private OnClickListener klikBerikut = new OnClickListener() {
        public void onClick(View v) {
            aturJawaban_nya();
            urutanPertanyaan++;
            if (urutanPertanyaan >= listSoal.size())
                urutanPertanyaan = listSoal.size() - 1;
 
            tunjukanPertanyaan(urutanPertanyaan, cekPertanyaan);
        }
    };
 
    private OnClickListener klikSebelum = new OnClickListener() {
        public void onClick(View v) {
            aturJawaban_nya();
            urutanPertanyaan--;
            if (urutanPertanyaan < 0)
                urutanPertanyaan = 0;
 
            tunjukanPertanyaan(urutanPertanyaan, cekPertanyaan);
        }
    };
 
    private void pasangLabelDanNomorUrut() {
        txtno.setText("Soal ke-" + (urutanPertanyaan + 1) + " dari "
                + listSoal.size());
    }
}