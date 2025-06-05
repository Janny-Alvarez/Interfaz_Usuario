package com.example.interfaz_usuario;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {

    TextView tvDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvDatos = findViewById(R.id.tvDatos);

        // Obtener datos del Intent
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String cedula = extras.getString("cedula", "");
            String nombres = extras.getString("nombres", "");
            String fecha = extras.getString("fecha", "");
            String ciudad = extras.getString("ciudad", "");
            String genero = extras.getString("genero", "");
            String correo = extras.getString("correo", "");
            String telefono = extras.getString("telefono", "");

            // Formatear texto con etiquetas HTML
            String texto = "<b>Cédula:</b> " + cedula + "<br>" +
                    "<b>Nombres:</b> " + nombres + "<br>" +
                    "<b>Fecha de Nacimiento:</b> " + fecha + "<br>" +
                    "<b>Ciudad:</b> " + ciudad + "<br>" +
                    "<b>Género:</b> " + genero + "<br>" +
                    "<b>Correo:</b> " + correo + "<br>" +
                    "<b>Teléfono:</b> " + telefono;

            // Mostrar texto formateado
            tvDatos.setText(Html.fromHtml(texto, Html.FROM_HTML_MODE_LEGACY));
        }
    }
}
