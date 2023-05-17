package mx.uach.fing.climita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.logging.Logger;

public class HomeAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final Button btncdmx = findViewById(R.id.btncdmx);
            btncdmx.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Logger.getLogger("app-->").info("Presione un boton");
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    intent.putExtra("city", "Chihuahua");
                    startActivity(intent);
                }
            });
    }
    public void gotodeli(View v){
        Logger.getLogger("app-->").warning("presione el deli");
    }
}