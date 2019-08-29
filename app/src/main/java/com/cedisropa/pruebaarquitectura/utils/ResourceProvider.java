package com.cedisropa.pruebaarquitectura.utils;

import android.content.res.Resources;

import com.cedisropa.pruebaarquitectura.R;

public class ResourceProvider {
    public Resources resources;
    public String pruebasNumSurtidor;

    public ResourceProvider(Resources resources){
        this.resources = resources;
        this.pruebasNumSurtidor = resources.getString(R.string.pruebas_numero_surt);
    }
}
