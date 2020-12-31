package admin.formapro.administrationformapro.GestionFormateur;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import admin.formapro.administrationformapro.R;

public class login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
    public void login (View view) {
        Intent intent = new Intent(login.this, MainActivity.class);
        startActivity(intent);
    }
}