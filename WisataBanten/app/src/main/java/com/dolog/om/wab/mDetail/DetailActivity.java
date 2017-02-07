package com.dolog.om.wab.mDetail;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dolog.om.wab.R;

public class DetailActivity extends AppCompatActivity {

    TextView nameTxt,isiTxt,rinciTxt;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



        nameTxt= (TextView) findViewById(R.id.nameTxtDetail);
        rinciTxt= (TextView) findViewById(R.id.rinciTxtDetail);
        isiTxt= (TextView) findViewById(R.id.isiTextDetail);
        img= (ImageView) findViewById(R.id.spacecrafImageDetail);

        Intent i=this.getIntent();
        String name=i.getExtras().getString("NAME_KEY");
        String rinciText=i.getExtras().getString("RINCI_KEY");
        String isiText=i.getExtras().getString("TEXT_KEY");
        int image=i.getExtras().getInt("IMAGE_KEY");

        nameTxt.setText(name);
        rinciTxt.setText(rinciText);
        isiTxt.setText(isiText);
        img.setImageResource(image);

    }


    public void goHotel (View view) {

        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Kampung Baduy")) {
                Toast.makeText(DetailActivity.this, "Hotel Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Masjid Agung Banten")) {
                Toast.makeText(DetailActivity.this, "Hotel Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pantai Anyer")) {
                goToUrl("https://www.google.co.id/maps/place/Hotel+The+Acacia+Anyer/@-6.1322719,105.8643431,16z/data=!4m12!1m6!3m5!1s0x0:0xa36c9f30e6101d78!2sPantai+Anyer!8m2!3d-6.1299674!4d105.8643597!3m4!1s0x0:0xf2d4a28afe1d6ab5!8m2!3d-6.1344237!4d105.8639091");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pantai Ciputih")) {
                goToUrl("https://www.google.co.id/maps/place/Ciputih+Resort/@-6.7013059,105.546922,17z/data=!3m1!4b1!4m5!3m4!1s0x2e43a502cbd1530d:0x30891197fb64e172!8m2!3d-6.7013059!4d105.5491107");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pantai Sambolo")) {
                goToUrl("https://www.google.co.id/maps/place/Pantai+Sambolo/@-6.2579364,105.8620706,17z/data=!3m1!4b1!4m5!3m4!1s0x2e422c1000000001:0xfdb3220e44de2663!8m2!3d-6.2579364!4d105.8642593");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pantai Sawarna")) {
                goToUrl("https://www.google.co.id/maps/place/Camp+Bimbim/@-6.9877628,106.3087636,17z/data=!4m12!1m6!3m5!1s0x0:0x76a2bfeb4bac39f3!2sPantai+Pasir+Putih+Sawarna!8m2!3d-6.9891463!4d106.3089439!3m4!1s0x0:0x60dc15c1c9a89f8a!8m2!3d-6.9904209!4d106.3106049");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pulau Dua")) {
                Toast.makeText(DetailActivity.this, "Hotel Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pulau Oar")) {
                goToUrl("https://www.google.co.id/maps/place/Wisma+Sarang+Badak/@-6.6571201,105.5833572,17.75z/data=!4m12!1m6!3m5!1s0x2e43baeab693a511:0xe38c3cef92c6a422!2sPulau+Oar!8m2!3d-6.6474789!4d105.5704423!3m4!1s0x0:0xa902b901c5115413!8m2!3d-6.6559785!4d105.586157");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pulau Pamaitan")) {
                Toast.makeText(DetailActivity.this, "Hotel Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pulau Sangiang")) {
                Toast.makeText(DetailActivity.this, "Hotel Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Rawa Dano")) {
                Toast.makeText(DetailActivity.this, "Hotel Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("S.B Mata Air Citaman")) {
                goToUrl("https://www.google.co.id/maps/place/Ponpes+AL+Khoziny+Jiput/@-6.3452447,105.9007558,16z/data=!4m12!1m6!3m5!1s0x2e4231cdbafde531:0x2c6f3ea3bd3dc265!2sMata+Air+Citaman+Jiput+Pandeglang!8m2!3d-6.3401919!4d105.9191606!3m4!1s0x0:0xefb0ef16baf3b0f3!8m2!3d-6.3493507!4d105.9007452?hl=id");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Tanjung Lesung")) {
                goToUrl("https://www.google.co.id/maps/place/Kalicaa+Villa+Tanjung+Lesung/@-6.4804508,105.6554007,16z/data=!4m5!3m4!1s0x0:0x3d41ffdf5191bdb6!8m2!3d-6.4803838!4d105.6522748?hl=id");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Ujung Kulon")) {
                Toast.makeText(DetailActivity.this, "Hotel Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Bendungan Pintu Air 10")) {
                Toast.makeText(DetailActivity.this, "Hotel Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Curug Cigumawang")) {
                Toast.makeText(DetailActivity.this, "Hotel Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Danau Situ Cipondoh")) {
                Toast.makeText(DetailActivity.this, "Hotel Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Gunung Batu Lawang")) {
                Toast.makeText(DetailActivity.this, "Hotel Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pantai Karang Bolong")) {
                Toast.makeText(DetailActivity.this, "Hotel Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pantai Kelapa Tujuh")) {
                Toast.makeText(DetailActivity.this, "Hotel Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pulau Merak Besar")) {
                goToUrl("https://www.google.co.id/maps/place/Pulorida+Hotel/@-5.9336541,105.9979083,17z/data=!4m5!3m4!1s0x0:0xa22f293377c41db3!8m2!3d-5.934693!4d106.0022601?hl=id");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pulau Merak Kecil")) {
                goToUrl("https://www.google.co.id/maps/place/Hotel+Feri+Merak/@-5.9421685,106.0003968,17z/data=!4m5!3m4!1s0x0:0xc8b2c8cd75ff5c2d!8m2!3d-5.9409823!4d106.002059?hl=id");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Danau Tasikardi")) {
                goToUrl("https://www.google.co.id/maps/place/Resto+Bu+Ujang+%26+Mama+Khadafi/@-6.0590782,106.1134317,18z/data=!4m12!1m6!3m5!1s0x0:0x9bd62835d43837df!2sResto+Bu+Ujang+%26+Mama+Khadafi!8m2!3d-6.0593813!4d106.1134981!3m4!1s0x0:0x9bd62835d43837df!8m2!3d-6.0593813!4d106.1134981");
            } else {
            }
        }
    }

    public void goRestoran (View view) {

        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Kampung Baduy")) {
                Toast.makeText(DetailActivity.this, "Restoran Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Masjid Agung Banten")) {
                goToUrl("https://www.google.co.id/maps/place/RM.+Mitra/@-6.0363208,106.1623005,17z/data=!4m12!1m6!3m5!1s0x2e418cd5bc717595:0xfcd392b0b6fb096a!2sMasjid+Agung+Banten!8m2!3d-6.0359999!4d106.1540139!3m4!1s0x0:0x32a500410b66bb4c!8m2!3d-6.0370262!4d106.1627012");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pantai Anyer")) {
                goToUrl("https://www.google.co.id/maps/place/Pondok+Ciparay+(POCI)+RM/@-6.1322719,105.8643431,16z/data=!4m12!1m6!3m5!1s0x0:0xa36c9f30e6101d78!2sPantai+Anyer!8m2!3d-6.1299674!4d105.8643597!3m4!1s0x0:0x8ec165de02266117!8m2!3d-6.1329596!4d105.8734417");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pantai Ciputih")) {
                Toast.makeText(DetailActivity.this, "Restoran Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pantai Sambolo")) {
                goToUrl("https://www.google.co.id/maps/place/Pantai+Datu+Carita/@-6.2637049,105.8190197,15z/data=!4m12!1m6!3m5!1s0x2e422c1000000001:0xfdb3220e44de2663!2sPantai+Sambolo!8m2!3d-6.2579364!4d105.8642593!3m4!1s0x0:0xd7a4f07f829b9fba!8m2!3d-6.2637049!4d105.8277744");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pantai Sawarna")) {
                goToUrl("https://www.google.co.id/maps/place/Saung+Neng+Refi/@-6.9877628,106.3087636,17z/data=!4m12!1m6!3m5!1s0x0:0x76a2bfeb4bac39f3!2sPantai+Pasir+Putih+Sawarna!8m2!3d-6.9891463!4d106.3089439!3m4!1s0x0:0x2020df1997ffb9c!8m2!3d-6.9896195!4d106.3098391");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pulau Dua")) {
                goToUrl("Pecak Bandeng Sawah Luhur (Tanpa Duri) https://www.google.co.id/maps/place/Pecak+Bandeng+Sawah+Luhur+(Tanpa+Duri)/@-6.0338506,106.1926812,16z/data=!4m5!3m4!1s0x0:0x397448986cfa9e4f!8m2!3d-6.0323323!4d106.1971924");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pulau Oar")) {
                Toast.makeText(DetailActivity.this, "Restoran Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pulau Pamaitan")) {
                Toast.makeText(DetailActivity.this, "Restoran Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pulau Sangiang")) {
                Toast.makeText(DetailActivity.this, "Restoran Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Rawa Dano")) {
                Toast.makeText(DetailActivity.this, "Restoran Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("S.B Mata Air Citaman")) {
                Toast.makeText(DetailActivity.this, "Restoran Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Tanjung Lesung")) {
                goToUrl("https://www.google.co.id/maps/place/Bale+Bale+Resto+Tanjung+Lesung/@-6.4804508,105.6554007,16z/data=!4m5!3m4!1s0x0:0x5d4697a5d7bafa7c!8m2!3d-6.4812207!4d105.6513414?hl=id");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Ujung Kulon")) {
                Toast.makeText(DetailActivity.this, "Restoran Tidak Di Temukan",
                        Toast.LENGTH_SHORT).show();
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Bendungan Pintu Air 10")) {
                goToUrl("https://www.google.co.id/maps/place/Sangego/@-6.1602645,106.6249709,17z/data=!4m8!1m2!2m1!1sbendungan+pintu+air+10!3m4!1s0x0:0x72b8e6ebfed46854!8m2!3d-6.1593049!4d106.6256169");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Curug Cigumawang")) {
                goToUrl("https://www.google.co.id/maps/place/Gerai+Bring+B-Exprezz+FC+Padarincang/@-6.2197067,105.941427,19z/data=!4m12!1m6!3m5!1s0x2e4228f29198324d:0x37770d35d4e64414!2sCurug+Cigumawang!8m2!3d-6.2135286!4d105.9444257!3m4!1s0x0:0x104d2ce5fa07d4a6!8m2!3d-6.2196841!4d105.9416791");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Danau Situ Cipondoh")) {
                goToUrl("https://www.google.co.id/maps/place/Rumah+Makan+Kinantan/@-6.1958688,106.6770535,18z/data=!4m12!1m6!3m5!1s0x2e69f90aecea8923:0x3269649a3cabaa70!2sDANAU+CIPONDOH!8m2!3d-6.1960687!4d106.6771523!3m4!1s0x0:0x72d1272cb31322e8!8m2!3d-6.1947811!4d106.6768887");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Gunung Batu Lawang")) {
                goToUrl("https://www.google.co.id/maps/place/Saung+Bambu+Kuring+%22Bukit+Palm%22/@-5.9870352,106.0334363,17z/data=!4m12!1m6!3m5!1s0x2e4191b08d3625f3:0xe136e159895b4d47!2sBatu+Lawang+Merak!8m2!3d-5.95296!4d106.0420474!3m4!1s0x0:0x144dcdfb6fc4998a!8m2!3d-5.9885032!4d106.0373441?hl=i");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pantai Karang Bolong")) {
                goToUrl("https://www.google.co.id/maps/place/Warung+Gado+-+Gado+%26+Karedok+murah/@-6.1651366,105.8526604,18z/data=!4m5!3m4!1s0x0:0x1488c070feb95787!8m2!3d-6.164379!4d105.8548138");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pantai Kelapa Tujuh")) {
                goToUrl("https://www.google.co.id/maps/place/R.M+Sate+Solo+Mas+Dar+2/@-5.8955653,106.0211929,17z/data=!4m12!1m6!3m5!1s0x2e4196e0985c03c9:0x877be36ff28623a8!2sPantai+Kelapa+Tujuh!8m2!3d-5.8945526!4d106.0212918!3m4!1s0x0:0x370feff0582f0d7c!8m2!3d-5.8950622!4d106.0231894?hl=id");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pulau Merak Besar")) {
                goToUrl("https://www.google.co.id/maps/place/Rumah+Makan+Pada+Suka/@-5.9307835,105.9951081,17z/data=!4m5!3m4!1s0x0:0xc1114efef44b1705!8m2!3d-5.9319438!4d105.9994197?hl=id");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pulau Merak Kecil")) {
                goToUrl("https://www.google.co.id/maps/place/Ikan+Bakar+Bonang/@-5.9425633,106.0004075,17z/data=!4m5!3m4!1s0x0:0xd1324d47265660fe!8m2!3d-5.942523!4d106.0017391?hl=id");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Danau Tasikardi")) {
                goToUrl("https://www.google.co.id/maps/place/Hotel+Mitrasono/@-6.0606989,106.1162094,18z/data=!4m12!1m6!3m5!1s0x2e418c8d22ad4d63:0xe5977e414f52b412!2stasikardi!8m2!3d-6.0566889!4d106.1206044!3m4!1s0x0:0x9c65a61ea796a1dc!8m2!3d-6.0603088!4d106.1164244");
            } else {
            }
        }
    }
    public void goLokasi (View view) {

        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Kampung Baduy")) {
                goToUrl("https://www.google.co.id/maps/place/Baduy+Corner/@-6.6633803,106.2277685,12z/data=!4m5!3m4!1s0x2e42691704df7dcd:0x94ec41c9053f6a58!8m2!3d-6.5942959!4d106.2249454?hl=id");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Masjid Agung Banten")) {
                goToUrl("https://www.google.co.id/maps/place/Masjid+Agung+Banten/@-6.0359999,106.1518252,17z/data=!3m1!4b1!4m5!3m4!1s0x2e418cd5bc717595:0xfcd392b0b6fb096a!8m2!3d-6.0359999!4d106.1540139");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pantai Anyer")) {
                goToUrl("https://www.google.co.id/maps/place/Pantai+Anyer/@-6.1356641,105.8614678,14z/data=!4m8!1m2!2m1!1spantai+anyer!3m4!1s0x0:0xa36c9f30e6101d78!8m2!3d-6.1299674!4d105.8643597");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pantai Ciputih")) {
                goToUrl("https://www.google.co.id/maps/place/Ciputih+Resort/@-6.7013059,105.546922,17z/data=!3m1!4b1!4m5!3m4!1s0x2e43a502cbd1530d:0x30891197fb64e172!8m2!3d-6.7013059!4d105.5491107");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pantai Sambolo")) {
                goToUrl("https://www.google.co.id/maps/place/Pantai+Sambolo/@-6.2579364,105.8620706,17z/data=!3m1!4b1!4m5!3m4!1s0x2e422c1000000001:0xfdb3220e44de2663!8m2!3d-6.2579364!4d105.8642593");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pantai Sawarna")) {
                goToUrl("https://www.google.co.id/maps/place/Pantai+Pasir+Putih+Sawarna/@-6.9882846,106.3027715,16z/data=!4m5!3m4!1s0x0:0x76a2bfeb4bac39f3!8m2!3d-6.9891463!4d106.3089439");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pulau Dua")) {
                goToUrl("https://www.google.co.id/maps/place/Pulau+Dua%2F+Burung/@-6.0166667,106.1908669,17z/data=!4m5!3m4!1s0x0:0x65ae039c54004b81!8m2!3d-6.0170528!4d106.1940723");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pulau Oar")) {
                goToUrl("https://www.google.co.id/maps/place/Pulau+Oar/@-6.6474789,105.5682536,17z/data=!3m1!4b1!4m5!3m4!1s0x2e43baeab693a511:0xe38c3cef92c6a422!8m2!3d-6.6474789!4d105.5704423?ion=1&espv=2&q=pulau+oar&bav=on.2,or.&biw=1366&bih=662&dpr=1&um=1&ie=UTF-8&sa=X&ved=0ahUKEwjh392nk6nRAhUFsI8KHftMBtoQ_AUIBygC");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pulau Pamaitan")) {
                goToUrl("https://www.google.co.id/maps/place/Pulau+Panaitan/@-6.6013311,105.1144289,12z/data=!3m1!4b1!4m5!3m4!1s0x2e438e777fc9dc1b:0xcfb1624ed63d5473!8m2!3d-6.5875355!4d105.2077798");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pulau Sangiang")) {
                goToUrl("https://www.google.co.id/maps/place/Sangiang/@-5.9589447,105.8304856,14z/data=!3m1!4b1!4m5!3m4!1s0x2e419c5ef32a1cc7:0x9247428cbaeffb9d!8m2!3d-5.9536723!4d105.8495796");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Rawa Dano")) {
                goToUrl("https://www.google.co.id/maps/place/Rw.+Dano/@-6.1623071,105.9802208,17z/data=!4m5!3m4!1s0x2e41881d62066755:0x542621157d9fcf2!8m2!3d-6.1619444!4d105.9836111?hl=id");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("S.B Mata Air Citaman")) {
                goToUrl("https://www.google.co.id/maps/place/Mata+Air+Citaman+Jiput+Pandeglang/@-6.3401919,105.9169719,17z/data=!3m1!4b1!4m5!3m4!1s0x2e4231cdbafde531:0x2c6f3ea3bd3dc265!8m2!3d-6.3401919!4d105.9191606?hl=id");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Tanjung Lesung")) {
                goToUrl("https://www.google.co.id/maps/place/Tanjung+Lesung/@-6.4814957,105.6535766,15z/data=!4m5!3m4!1s0x0:0xe33e25c97586c173!8m2!3d-6.471669!4d105.6658494?hl=id");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Ujung Kulon")) {
                goToUrl("https://www.google.co.id/maps/place/Taman+Nasional+Ujung+Kulon/@-6.7859942,105.3750444,16z/data=!4m5!3m4!1s0x2e42233395979ea1:0x8df3a34e43b4c872!8m2!3d-6.7846944!4d105.3751088?hl=id");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Bendungan Pintu Air 10")) {
                goToUrl("https://www.google.co.id/maps/place/Bendungan+pintu+air+10/@-6.1596458,106.6261081,17z/data=!4m8!1m2!2m1!1sbendungan+pintu+air+10!3m4!1s0x0:0xadfa3cfc9f4f8ac3!8m2!3d-6.1593242!4d106.628682");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Curug Cigumawang")) {
                goToUrl("https://www.google.co.id/maps/place/Curug+Cigumawang/@-6.2135286,105.942237,17z/data=!3m1!4b1!4m5!3m4!1s0x2e4228f29198324d:0x37770d35d4e64414!8m2!3d-6.2135286!4d105.9444257");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Danau Situ Cipondoh")) {
                goToUrl("https://www.google.co.id/maps/place/DANAU+CIPONDOH/@-6.1960687,106.6749636,17z/data=!3m1!4b1!4m5!3m4!1s0x2e69f90aecea8923:0x3269649a3cabaa70!8m2!3d-6.1960687!4d106.6771523");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Gunung Batu Lawang")) {
                goToUrl("https://www.google.co.id/maps/place/Batu+Lawang+Merak/@-5.955413,106.0379797,15z/data=!4m5!3m4!1s0x2e4191b08d3625f3:0xe136e159895b4d47!8m2!3d-5.95296!4d106.0420474?hl=id");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pantai Karang Bolong")) {
                goToUrl("https://www.google.co.id/maps/place/Pantai+Karang+Bolong/@-6.166217,105.8509011,17z/data=!4m5!3m4!1s0x0:0x7f70f3b3ff05b596!8m2!3d-6.166145!4d105.8527645");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pantai Kelapa Tujuh")) {
                goToUrl("https://www.google.co.id/maps/place/Pantai+Kelapa+Tujuh/@-5.8946467,106.017476,15z/data=!4m5!3m4!1s0x2e4196e0985c03c9:0x877be36ff28623a8!8m2!3d-5.8945526!4d106.0212918?hl=id");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pulau Merak Besar")) {
                goToUrl("https://www.google.co.id/maps/place/Pulau+Merak+Besar/@-5.9338889,105.9897222,17z/data=!4m5!3m4!1s0x2e4190bef0c8349d:0xa6045447eb8c43dd!8m2!3d-5.9338889!4d105.9897222?hl=id");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Pulau Merak Kecil")) {
                goToUrl("https://www.google.co.id/maps/place/Merak+Kecil/@-5.9419444,105.9975,17z/data=!4m5!3m4!1s0x2e4190ec76af6481:0xc16e9b615009bcc1!8m2!3d-5.9419444!4d105.9975?hl=id");
            } else {
            }
        }
        if (nameTxt.getText() != null) {
            if (nameTxt.getText().toString().equals("Danau Tasikardi")) {
                goToUrl("https://www.google.co.id/maps/place/tasikardi/@-6.0566889,106.1184157,17z/data=!3m1!4b1!4m5!3m4!1s0x2e418c8d22ad4d63:0xe5977e414f52b412!8m2!3d-6.0566889!4d106.1206044");
            } else {
            }
        }
    }
        public void goYoutube (View view) {

            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Kampung Baduy")) {
                    goToUrl("https://www.youtube.com/watch?v=hBuifj0X4Xw");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Masjid Agung Banten")) {
                    goToUrl("https://www.youtube.com/watch?v=0IITWQE3A_Y");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Pantai Anyer")) {
                    goToUrl("https://www.youtube.com/watch?v=ZWaFvBD7cq0");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Pantai Ciputih")) {
                    goToUrl("https://www.youtube.com/watch?v=CGOsHcWdzDo");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Pantai Sambolo")) {
                    goToUrl("https://www.youtube.com/watch?v=LZJK98MZ4F8");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Pantai Sawarna")) {
                    goToUrl("https://www.youtube.com/watch?v=AkILOlabu0Y");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Pulau Dua")) {
                    goToUrl("https://www.youtube.com/watch?v=c0fOw9iREGk");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Pulau Oar")) {
                    goToUrl("https://www.youtube.com/watch?v=h-6YtS5vjgs");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Pulau Pamaitan")) {
                    goToUrl("https://www.youtube.com/watch?v=r1lipJv0CCs");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Pulau Sangiang")) {
                    goToUrl("https://www.youtube.com/watch?v=tYFUxlucUio");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Rawa Dano")) {
                    goToUrl("https://www.youtube.com/watch?v=IpKYE7hN-F0");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("S.B Mata Air Citaman")) {
                    goToUrl("https://www.youtube.com/watch?v=EMcU9ePZ6ps");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Tanjung Lesung")) {
                    goToUrl("https://www.youtube.com/watch?v=MFr89HfGVkY");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Ujung Kulon")) {
                    goToUrl("https://www.youtube.com/watch?v=kPJmDCUSeIc");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Bendungan Pintu Air 10")) {
                    goToUrl("https://www.youtube.com/watch?v=JsdeouteEaM");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Curug Cigumawang")) {
                    goToUrl("https://www.youtube.com/watch?v=4ONhhCoOJn8");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Danau Situ Cipondoh")) {
                    goToUrl("https://www.youtube.com/watch?v=_sWMcUVy-Co");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Gunung Batu Lawang")) {
                    goToUrl("https://www.youtube.com/watch?v=BPzTnAUtUXw");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Pantai Karang Bolong")) {
                    goToUrl("https://www.youtube.com/watch?v=L5CQPOVKfRs");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Pantai Kelapa Tujuh")) {
                    goToUrl("https://www.youtube.com/watch?v=YpNQj3eJZ7Y");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Pulau Merak Besar")) {
                    goToUrl("https://www.youtube.com/watch?v=r6O_2owfIiE");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Pulau Merak Kecil")) {
                    goToUrl("https://www.youtube.com/watch?v=evE9WBaDbtE");
                } else {
                }
            }
            if (nameTxt.getText() != null) {
                if (nameTxt.getText().toString().equals("Danau Tasikardi")) {
                    goToUrl("https://www.youtube.com/watch?v=IuAusXtQDxY");
                } else {
                }
            }
        }
    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }



}

