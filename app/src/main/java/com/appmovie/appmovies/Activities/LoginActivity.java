package com.appmovie.appmovies.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.appmovie.appmovies.R;

public class LoginActivity extends AppCompatActivity {
    private EditText username, password;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();

    }
    private void initView(){
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().isEmpty() || password.getText().toString().isEmpty()){
                    Toast.makeText(LoginActivity.this, "Vui lòng không bỏ trống tên tài khoản và mật khẩu!", Toast.LENGTH_SHORT).show();
                }else if (username.getText().toString().equals("nvh") && password.getText().toString().equals("123")){
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                }else{
                    Toast.makeText(LoginActivity.this, "Mật khẩu hoặc tên tài khoản nhập không đúng!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}