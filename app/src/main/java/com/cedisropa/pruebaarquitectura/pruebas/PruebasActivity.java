package com.cedisropa.pruebaarquitectura.pruebas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.cedisropa.pruebaarquitectura.R;
import com.cedisropa.pruebaarquitectura.utils.ResourceProvider;
import com.cedisropa.sdk.DatosGenerales;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.view.KeyEvent.KEYCODE_ENTER;

public class PruebasActivity extends AppCompatActivity implements PruebasView {

    @BindView(R.id.txt_numSurt)
    EditText txtNumSurt;

    @BindView(R.id.lbl_nomSurt)
    TextView lblNomSurt;

    private PruebasViewPresenter viewPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pruebas);
        ButterKnife.bind(this);

        ResourceProvider resourceProvider = new ResourceProvider(this.getResources());
        this.viewPresenter = new PruebasPresenter(this, resourceProvider);

        DatosGenerales dg = new DatosGenerales();
        dg.setIpBodega("10.28.114.110");
        dg.setNumTerminal(1186);
        dg.setNumArea(1);

        viewPresenter.recibirDatosGenerales(dg);

        txtNumSurt.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if(keyCode == KEYCODE_ENTER && txtNumSurt.length() > 0) {
                    int numSurtidor = Integer.valueOf(txtNumSurt.getText().toString());
                    viewPresenter.obtenerNombreSurtido(numSurtidor);
                }
                return false;
            }
        });
    }

    @Override
    public void mostrarNomSurtidor(String nomSurtidor) {

    }
}
