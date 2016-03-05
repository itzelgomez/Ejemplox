package itzelgomez.com.ejemplox;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity{

    private EditText user, pass;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText)findViewById(R.id.textUserName);
        pass = (EditText)findViewById(R.id.textPass);
        login = (Button)findViewById(R.id.buttonLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = pass.getText().toString();
                String usuario = user.getText() .toString();

                if (usuario.equalsIgnoreCase("")){
                    user.setError("Este campo es necesario");
                    user.requestFocus();
                }

                if (password.equalsIgnoreCase("")){
                    pass.setError("Este campo es necesario");
                    user.requestFocus();
                }

                if (usuario.equalsIgnoreCase("itzelgab") && password.equalsIgnoreCase("gomez")){
                    Toast.makeText(Login.this, "Login exitoso",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(Login.this, "Login fallido",Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}
