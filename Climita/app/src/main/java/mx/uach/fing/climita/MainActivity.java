package mx.uach.fing.climita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;



public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tvwTemp=findViewById(R.id.tvwTemp);
        final TextView tvwCity=findViewById(R.id.tvwCity);
        RequestQueue queue= Volley.newRequestQueue(this);
        String url="http://localhost";

        StringRequest sr = new StringRequest(Request.Method.GET,url, new Res);

        String city= this.getIntent().getStringExtra("cty");
        tvwCity.setText(city);

        tvwTemp.setText("35 grados centigrados");
    }
}

