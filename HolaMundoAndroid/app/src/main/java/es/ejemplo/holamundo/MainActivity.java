package es.ejemplo.holamundo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView mensaje = findViewById(R.id.mensaje);
        Button boton = findViewById(R.id.boton);

        boton.setOnClickListener(v -> {
            mensaje.setText(R.string.hola_mundo);
            Toast.makeText(this, R.string.hola_mundo, Toast.LENGTH_SHORT).show();
        });
    }
}
