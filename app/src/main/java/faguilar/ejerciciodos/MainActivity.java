package faguilar.ejerciciodos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBoton = (Button) findViewById(R.id.btnMostrarMensaje);
        btnBoton.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnMostrarMensaje:
                Toast.makeText(getApplicationContext(), "Hola este es un Toast", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
