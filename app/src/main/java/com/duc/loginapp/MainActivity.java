package com.duc.loginapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText usernameInput;
    private  EditText passwordInput;
    private Button login_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);


            usernameInput = findViewById(R.id.username_input);
            passwordInput = findViewById(R.id.password_input);
            login_btn= findViewById(R.id.login_btn);

            login_btn.setOnClickListener(view -> {
                String username = usernameInput.getText().toString();
                String password = passwordInput.getText().toString();
                Log.i("Text Credentials","Username: $username and Password: $password");
            });



            return insets;
        });

    }
}