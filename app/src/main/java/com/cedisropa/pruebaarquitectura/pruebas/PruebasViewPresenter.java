package com.cedisropa.pruebaarquitectura.pruebas;

import com.cedisropa.sdk.DatosGenerales;

public interface PruebasViewPresenter {
    void recibirDatosGenerales(DatosGenerales datosGenerales);
    void obtenerNombreSurtido(int numSurtidor);
}
