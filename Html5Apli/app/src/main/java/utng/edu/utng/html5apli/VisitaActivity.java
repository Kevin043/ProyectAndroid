package utng.edu.utng.html5apli;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by kevin on 04/04/2016.
 */
public class VisitaActivity extends AppCompatActivity {
    private Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visita_layout);
        btnRegistrar = (Button)findViewById(R.id.btn_regis);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VisitaActivity.this, RegistroActivity.class);
                startActivity(intent);
            }
        });
    }
}
