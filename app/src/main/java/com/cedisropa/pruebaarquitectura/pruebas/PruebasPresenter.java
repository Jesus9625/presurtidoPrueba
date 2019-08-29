package com.cedisropa.pruebaarquitectura.pruebas;

import com.cedisropa.pruebaarquitectura.utils.ResourceProvider;
import com.cedisropa.sdk.DatosGenerales;

public class PruebasPresenter implements PruebasViewPresenter {
    private ResourceProvider resourceProvider;
    private DatosGenerales datosGenerales;

    private PruebasProvider provider;

    public PruebasPresenter(ResourceProvider resourceProvider) {
        this.resourceProvider = resourceProvider;
    }

    @Override
    public void recibirDatosGenerales(DatosGenerales datosGenerales) {
        this.datosGenerales = datosGenerales;
    }

    @Override
    public void obtenerNombreSurtido(int numSurtidor) {
        provider.obtenerNombreSurtidor(datosGenerales.getIpBodega(), datosGenerales.getNumTerminal(),
                datosGenerales.getNumArea(), numSurtidor);
    }
}
