package com.praktek.testiq;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseQuizIPS extends SQLiteOpenHelper {
    final static String DB_NAME = "db_quizappIPS";

    public DatabaseQuizIPS(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase dbIPS) {
        String sql = "CREATE TABLE IF NOT EXISTS tbl_soalQuiz(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, pil_d TEXT, jwban INTEGER)";
        dbIPS.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put("soal", "Perilaku yang benar dalam menjaga benda-benda peninggalan sejarah adalah");
        values.put("pil_a", "mengoleksi dirumah supaya aman");
        values.put("pil_b","menjual keluar negeri untuk menambah devisa negara");
        values.put("pil_c", "sebagai obyek untuk penelitian");
        values.put("pil_d", "merenovasi bagian tertentu untuk mengikuti perkembangan zaman");
        values.put("jwban",3);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Minyak bumi, biji besi dan gas alam. kelompok tersebut termasuk sumber daya alam");
        values.put("pil_a", "tanah");
        values.put("pil_b", "energi dan mineral");
        values.put("pil_c", "hutan");
        values.put("pil_d", "air");
        values.put("jwban",2);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Kerajinan tangan dari indonesia yang ditetapkan UNESCO sebagai warisan budaya dunia adalah");
        values.put("pil_a", "kain songket");
        values.put("pil_b", "tenun ikat");
        values.put("pil_c", "ukiran");
        values.put("pil_d", "batik");
        values.put("jwban",4);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Tujuan dibentuknya VOC di indonesia adalah");
        values.put("pil_a", "monopoli dagang diindonesia");
        values.put("pil_b", "membuat rakyat indonesia miskin");
        values.put("pil_c", "mengedarkan mata uang belanda");
        values.put("pil_d", "mengadakan kesepakatan dengan raja-raja");
        values.put("jwban",1);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Patung Merlion dan Angkorwatt terdapat di");
        values.put("pil_a", "Singapura dan Kamboja");
        values.put("pil_b", "Singapura dan Laos");
        values.put("pil_c", "Malaysia dan thailand");
        values.put("pil_d", "Thailand dan vietnam");
        values.put("jwban",1);
        dbIPS.insert("tbl_soalQuiz", "soal", values);
/*
        values.put("soal", "Terbenam >< ....");
        values.put("pil_a", "Pasti");
        values.put("pil_b","Terperosok");
        values.put("pil_c", "Tenggelam");
        values.put("pil_d", "Terkantung");
        values.put("jwban",3);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Preman >< .....");
        values.put("pil_a", "Pengawal");
        values.put("pil_b","Dinas");
        values.put("pil_c", "Mafia");
        values.put("pil_d", "Partikelir");
        values.put("jwban",1);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Emas : Tambang || ...... : ....");
        values.put("pil_a", "garam : logam");
        values.put("pil_b","permata : perhiasan");
        values.put("pil_c", "pramuka : seragam");
        values.put("pil_d", "kayu : pohon");
        values.put("jwban",3);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Motor : Roda || .... ; ....");
        values.put("pil_a", "Rumah : fondasi");
        values.put("pil_b","Rumah : pintu");
        values.put("pil_c", "Baju : kancing");
        values.put("pil_d", "Buku : balpoin");
        values.put("jwban",1);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Askes (sekten) konsisten. gemar (...) polemik");
        values.put("pil_a", "Armmik");
        values.put("pil_b","Kamrim");
        values.put("pil_c", "Mikram");
        values.put("pil_d", "Rammik");
        values.put("jwban",3);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Nakhoda (ohksin) nista. Vokatif (...) waduk");
        values.put("pil_a", "Wadtak");
        values.put("pil_b","Dawita");
        values.put("pil_c", "Itadaw");
        values.put("pil_d", "Takdaw");
        values.put("jwban",3);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "4 3 8 6 16 12 ...");
        values.put("pil_a", "47");
        values.put("pil_b","32");
        values.put("pil_c", "79");
        values.put("pil_d", "48");
        values.put("jwban",1);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "192 192 96 32 ... ");
        values.put("pil_a", "4");
        values.put("pil_b","6");
        values.put("pil_c", "8");
        values.put("pil_d", "10");
        values.put("jwban",2);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Dasawarsa + 3 lustrum - 1 windu = ... ");
        values.put("pil_a", "23 tahun");
        values.put("pil_b","20 tahun");
        values.put("pil_c", "17 tahun");
        values.put("pil_d", "13 tahun");
        values.put("jwban",2);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Semua guru adalah pegawai negeri. Sebagian guru adalah seniman");
        values.put("pil_a", "Sebagian pegawai negeri adalah guru");
        values.put("pil_b","sebagian seniman adalah guru");
        values.put("pil_c", "Tidak semua seniman adalah pegawai negeri");
        values.put("pil_d", "Semua seniman adalah pegawai negeri");
        values.put("jwban",3);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Jika jakarta adalah kuda, surabaya adalah sapi, dan makasar adalah ...");
        values.put("pil_a", "Kelalawar");
        values.put("pil_b","Kenari");
        values.put("pil_c", "Prosky");
        values.put("pil_d", "Harimau");
        values.put("jwban",3);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Apel : Pohon = � : �");
        values.put("pil_a", "Kayu : Triplek");
        values.put("pil_b","Batako : Tembok");
        values.put("pil_c", "Batu Bata : Semen");
        values.put("pil_d", "Emas : Tambang");
        values.put("jwban",3);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "bahan pokok makanan �");
        values.put("pil_a", "Ubi");
        values.put("pil_b", "Singkong");
        values.put("pil_c", "Ikan");
        values.put("pil_d", "Nasi");
        values.put("jwban",2);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "pengukuran menggunakan satuan buah �.");
        values.put("pil_a", "Liter");
        values.put("pil_b", "Lusin");
        values.put("pil_c", "Kodi");
        values.put("pil_d", "Gros");
        values.put("jwban",0);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Debat : �");
        values.put("pil_a", "Bantahan");
        values.put("pil_b","Komentar");
        values.put("pil_c", "Berbicara");
        values.put("pil_d", "Permasalahan");
        values.put("jwban",0);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Eksposisi : �");
        values.put("pil_a", "Bahaya");
        values.put("pil_b","Keterangan");
        values.put("pil_c", "Paparan");
        values.put("pil_d", "Gambaran");
        values.put("jwban",2);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Sporadis >< ��");
        values.put("pil_a", "Pemisahan");
        values.put("pil_b", "Bersatu");
        values.put("pil_c", "Jarang");
        values.put("pil_d", "Sering");
        values.put("jwban",3);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Sumbang >< ��");
        values.put("pil_a", "Derma");
        values.put("pil_b","Amal");
        values.put("pil_c", "Lurus");
        values.put("pil_d", "Benar");
        values.put("jwban",3);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "22.	0,75 x 8888 = �");
        values.put("pil_a", "4999");
        values.put("pil_b", "6788");
        values.put("pil_c", "7777");
        values.put("pil_d", "6666");
        values.put("jwban",3);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "87576 + 8997 = �");
        values.put("pil_a", "96563");
        values.put("pil_b","65347");
        values.put("pil_c", "96573");
        values.put("pil_d", "67764");
        values.put("jwban",2);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "1547 : 6 +7 = �");
        values.put("pil_a", "264,8");
        values.put("pil_b","267,8");
        values.put("pil_c", "26,48");
        values.put("pil_d", "26,78");
        values.put("jwban",0);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "656 x 14 � = �.");
        values.put("pil_a", "9512");
        values.put("pil_b","8512");
        values.put("pil_c", "951");
        values.put("pil_d", "951,2");
        values.put("jwban",0);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Sumbang >< ��");
        values.put("pil_a", "Derma");
        values.put("pil_b","Amal");
        values.put("pil_c", "Lurus");
        values.put("pil_d", "Benar");
        values.put("jwban",3);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Sumbang >< ��");
        values.put("pil_a", "Derma");
        values.put("pil_b","Amal");
        values.put("pil_c", "Lurus");
        values.put("pil_d", "Benar");
        values.put("jwban",3);
        dbIPS.insert("tbl_soalQuiz", "soal", values);

        values.put("soal", "Sumbang >< ��");
        values.put("pil_a", "Derma");
        values.put("pil_b","Amal");
        values.put("pil_c", "Lurus");
        values.put("pil_d", "Benar");
        values.put("jwban",3);
        dbIPS.insert("tbl_soalQuiz", "soal", values);*/

    }

    public List<Soal> getSoal(){
        List<Soal> listSoal = new ArrayList<Soal>();
        String query = "select * from tbl_soalQuiz";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                Soal s = new Soal();
                s.setSoal(cursor.getString(1));
                s.setPil_a(cursor.getString(2));
                s.setPil_b(cursor.getString(3));
                s.setPil_c(cursor.getString(4));
                s.setPil_d(cursor.getString(5));
                s.setJwban(cursor.getInt(6));
                listSoal.add(s);
            }while(cursor.moveToNext());
        }

        return listSoal;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tbl_soalQuiz");
        onCreate(db);

    }
}