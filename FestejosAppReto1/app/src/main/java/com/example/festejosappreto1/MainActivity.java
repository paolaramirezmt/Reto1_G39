package com.example.festejosappreto1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * se crea clase Main Activity
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        Drawable drawable = res.getDrawable(R.drawable.logo, getTheme());

        ImageView imagen1 = (ImageView) findViewById(R.id.imagen1);
        imagen1.setImageDrawable(drawable);

        Button boton1 = (Button) findViewById(R.id.boton1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sucursalesScreen = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(sucursalesScreen);
            }
        });

    }

    /* -------------------------------------------------- */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int idItem = item.getItemId();
        if(idItem == R.id.productos){
            Intent productosScreen = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(productosScreen);
        }
        if(idItem == R.id.servicios){

            Intent serviciosScreen = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(serviciosScreen);
        }
        if(idItem == R.id.sucursales){

            Intent sucursalesScreen = new Intent(getApplicationContext(), MainActivity4.class);
            startActivity(sucursalesScreen);
        }
        if(idItem == R.id.nosotros){

            Intent nosotrosScreen = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(nosotrosScreen);
        }

        return super.onOptionsItemSelected(item);
    }
    /* -------------------------------------------------- */
}