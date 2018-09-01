package com.example.aula_01.revisaoromario.Adaptadores;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;


public class AdapterFrag extends FragmentPagerAdapter {

    List<Fragment>listaFragmento;
    List<String>tituloFragmento;




    public AdapterFrag(FragmentManager fm,List<Fragment> listaFragmento,List<String> tituloFragmento) {
        super(fm);
        this.tituloFragmento = tituloFragmento;
        this.listaFragmento = listaFragmento;
    }

    @Override
    public Fragment getItem(int position) {
        return listaFragmento.get(position);
    }


    @Override
    public int getCount() {
        return listaFragmento.size();
    }

    @Override
     public CharSequence getPageTitle(int position){
        return tituloFragmento.get(position);

    }
}
