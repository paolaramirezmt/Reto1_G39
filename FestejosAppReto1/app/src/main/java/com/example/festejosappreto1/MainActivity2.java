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
import android.widget.ImageView;

/**
 * se crea clase Main Activity
 */
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Resources res = getResources();
        Drawable drawable = res.getDrawable(R.drawable.comida, getTheme());

        ImageView imagen2 = (ImageView) findViewById(R.id.imagen2);
        imagen2.setImageDrawable(drawable);

    }

    /* -------------------------------------------------- */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones2, menu);
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