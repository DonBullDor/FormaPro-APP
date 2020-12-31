package admin.formapro.administrationformapro.GestionFormateur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import admin.formapro.administrationformapro.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mButton = (Button) findViewById(R.id.GestFormateur);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, GestionFormateur.class);
                startActivity(mIntent);
                finish();
            }
        });

        Button fButton = (Button) findViewById(R.id.GestFormations);
        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, GestionFormation.class);
                startActivity(mIntent);
                finish();
            }
        });

        /*
        Button zButton = (Button) findViewById(R.id.GestClient);
        zButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, AjouterClient.class);
                startActivity(mIntent);
                finish();
            }
        }); */
    }

    public void Stats (View view) {
        Intent intent = new Intent(MainActivity.this, Statistique.class);
        startActivity(intent);
    }
    public void ajoutClient (View view) {
        Intent intent = new Intent(MainActivity.this, AddClient.class);
        startActivity(intent);
    }
}
