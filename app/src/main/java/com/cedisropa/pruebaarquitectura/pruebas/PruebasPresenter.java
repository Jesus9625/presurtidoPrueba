package com.cedisropa.pruebaarquitectura.pruebas;

import com.cedisropa.pruebaarquitectura.utils.ResourceProvider;
import com.cedisropa.sdk.DatosGenerales;

public class PruebasPresenter implements PruebasViewPresenter, PruebasObtainer {
    private ResourceProvider resourceProvider;
    private DatosGenerales datosGenerales;

    private PruebasProvider provider;
    private PruebasView view;

    public PruebasPresenter(PruebasView view, ResourceProvider resourceProvider) {
        this.resourceProvider = resourceProvider;
        this.provider = new PruebasInteractor(this, resourceProvider);
        this.view = view;
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

    @Override
    public void responseValidarNomSurtidor(String nomSurtidor) {
        view.mostrarNomSurtidor(nomSurtidor);
    }
}
