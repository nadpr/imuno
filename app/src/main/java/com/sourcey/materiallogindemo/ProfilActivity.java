package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;

public class ProfilActivity extends AppCompatActivity {

    TextView tBold, tLight, tReg, tItalic;

    /*menu*/
    @Bind(R.id.action_profil) Button _actionProfil;
    @Bind(R.id.action_kalendar) Button _actionKalendar;
    @Bind(R.id.action_peta) Button _actionPeta;
    @Bind(R.id.action_keluar) Button _actionKeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        /*font*/
        tBold = (TextView) findViewById(R.id.profilNama);
        tBold = (TextView) findViewById(R.id.profilUsia);
        tBold = (TextView) findViewById(R.id.profilPanjang);
        tBold = (TextView) findViewById(R.id.profilStatus);
        Typeface cus = Typeface.createFromAsset(getAssets(),"fonts/Aller_Bd.ttf");
        tBold.setTypeface(cus);

        tReg = (TextView) findViewById(R.id.profilNama1);
        tReg = (TextView) findViewById(R.id.profilUsia1);
        tReg = (TextView) findViewById(R.id.profilPanjang1);
        tReg = (TextView) findViewById(R.id.profilStatus1);
        tReg = (TextView) findViewById(R.id.profilRiwayat);
        Typeface cus1 = Typeface.createFromAsset(getAssets(),"fonts/Aller_Rg.ttf");
        tReg.setTypeface(cus1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_profil) {
            profil();
            return true;
        }
        if (id == R.id.action_kalendar) {
            kalendar();
            return true;
        }
        if (id == R.id.action_peta) {
            peta();
            return true;
        }
        if (id == R.id.action_keluar) {
            keluar();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    // Intent activity
        public void profil() {
            Intent intent = new Intent(getApplicationContext(), ProfilActivity.class);
            startActivity(intent);
        }
        public void kalendar() {
            Intent intent = new Intent(getApplicationContext(), KalendarActivity.class);
            startActivity(intent);
        }
        public void peta() {
            Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
            startActivity(intent);
        }
        public void keluar() {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
        }
}
