package com.cedisropa.pruebaarquitectura.pruebas;

import com.cedisropa.pruebaarquitectura.api.APIPruebas;
import com.cedisropa.pruebaarquitectura.utils.ResourceProvider;
import com.cedisropa.pruebaarquitectura.services.RetrofitClient;
import com.cedisropa.sdk.WebServices;
import com.cedisropa.sdk.WebserviceNotFoundException;

public class PruebasInteractor implements  PruebasProvider {
    private ResourceProvider resourceProvider;
    private APIPruebas pruebasService;

    PruebasInteractor(ResourceProvider resourceProvider) {
        this.resourceProvider = resourceProvider;

        try {
            pruebasService = RetrofitClient.getService(APIPruebas.class, WebServices
                    .getService(9).getUrl().toString());

        } catch(WebserviceNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void obtenerNombreSurtidor(String ip, int numTerminal, int numArea, int numSurtidor) {

    }
}
