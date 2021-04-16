package com.example.exerciseone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    TextInputLayout txEmail, txPass;
    Button btLogin;
    String Email, Pass;
    final String emailAdmin = "admin@mail.com";
    final String passAdmin = "123456";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txEmail = findViewById(R.id.txEmail);
        txPass = findViewById(R.id.txPass);
        btLogin = findViewById(R.id.btLogin);

        btLogin.setOnClickListener(v -> LoginNow());


    }

    private void LoginNow() {
        Email =  txEmail.getEditText().getText().toString();
        Pass = txPass.getEditText().getText().toString();

        if (Email.equals(emailAdmin)){
            if (Pass.equals (passAdmin)){
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);

                txEmail.setError(null);
                txPass.setError(null);
            } else {
                txPass.setError("Password Salah");
            }
        } else {
            txEmail.setError("Email anda salah");
        }

        if (Email == ""){
            txEmail.setError("email harus diisi");
        }

        if (Pass == ""){
            txPass.setError("password harus diisi");
        }
    }
}