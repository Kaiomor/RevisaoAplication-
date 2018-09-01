package com.example.aula_01.revisaoromario;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import com.example.aula_01.revisaoromario.Adaptadores.AdapterFrag;
import com.example.aula_01.revisaoromario.Fragmentos.BlankFragment;
import com.example.aula_01.revisaoromario.Fragmentos.BlankFragment2;
import com.example.aula_01.revisaoromario.Fragmentos.BlankFragment3;
import com.example.aula_01.revisaoromario.Fragmentos.BlankFragment4;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Fragment>listaFragmento = new ArrayList<>();
        List<String>tituloFragmento = new ArrayList<>();


        String Fragment = "Sonic";
        String Fragment2 = "Sonimagicos";
        String Fragment3 = "Sonofigonigo";
        String Fragment4 = "Sonimito";

        tituloFragmento.add(Fragment);
        tituloFragmento.add(Fragment2);
        tituloFragmento.add(Fragment3);
        tituloFragmento.add(Fragment4);


        BlankFragment blankFragment = new BlankFragment();
        BlankFragment2 blankFragment2 = new BlankFragment2();
        BlankFragment3 blankFragment3 = new BlankFragment3();
        BlankFragment4 blankFragment4 = new BlankFragment4();


        listaFragmento.add(blankFragment);
        listaFragmento.add(blankFragment2);
        listaFragmento.add(blankFragment3);
        listaFragmento.add(blankFragment4);

        ViewPager viewPager = findViewById(R.id.hhhh);
        TabLayout tabLayout = findViewById(R.id.kaio);

        AdapterFrag adapterFrag =
                new AdapterFrag(getSupportFragmentManager(),listaFragmento,tituloFragmento);
        viewPager.setAdapter(adapterFrag);
        tabLayout.setupWithViewPager(viewPager);



    }
}
