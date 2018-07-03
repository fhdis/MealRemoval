package mealremoval.shifenshenghuo.com.mealremoval;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText login_id;
    private EditText login_password;
    private Button  login_button;
    private Button  button_zhuce;
    private Button  button_forgetpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.login);
        login_id = (EditText)findViewById(R.id.login_id);
        login_password = (EditText)findViewById(R.id.login_password);
        login_button = (Button)findViewById(R.id.login_button);
        button_zhuce = (Button)findViewById(R.id.button_zhuce);
        button_forgetpassword = (Button)findViewById(R.id.button_forgetpassword);

        button_zhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Registered.class);
                startActivity(intent);
            }
        });

        button_forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ForgetPassword.class);
                startActivity(intent);
            }
        });

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Homepage.class);
                startActivity(intent);
            }
        });
    }
}
