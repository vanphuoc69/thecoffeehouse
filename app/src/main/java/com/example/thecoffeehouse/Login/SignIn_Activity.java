package com.example.thecoffeehouse.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.thecoffeehouse.MainActivity;
import com.example.thecoffeehouse.R;

public class SignIn_Activity extends AppCompatActivity {

    Button signin;
    EditText edtemail, edtpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_);

        edtemail=(EditText) findViewById(R.id.edtEmail_332);
        edtpassword=(EditText) findViewById(R.id.edtPassword_332);
        signin=(Button) findViewById(R.id.btn_signin_332);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControlButton();
            }
        });
    }
    private void ControlButton() {
        if (edtemail.getText().length() != 0 && edtpassword.getText().length() != 0) {
            if (edtemail.getText().toString().equals("vp@gmail.com") && edtpassword.getText().toString().equals("123456")) {
                Toast.makeText(SignIn_Activity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();

                //chuyen giua cac giao dien vói nhau
                Intent intent = new Intent(SignIn_Activity.this, MainActivity.class);
                startActivity(intent);

            } else {
                Toast.makeText(SignIn_Activity.this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(SignIn_Activity.this, "Mời bạn nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
        }
    }


    public void btn_signup(View view) {
            startActivity(new Intent(getApplicationContext(), SignUp_Activity.class));
    }
}