package itzelgomez.com.ejemplox;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText user, pass;
    private Button login;
    private String usuario, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText) findViewById(R.id.textUserName);
        pass = (EditText) findViewById(R.id.textPass);
        login = (Button) findViewById(R.id.buttonLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                password = pass.getText().toString();
                usuario = user.getText().toString();

                if (Validation()) {

                    if (usuario.equalsIgnoreCase("itzelgab") && password.equalsIgnoreCase("gomez")) {
                        Toast.makeText(Login.this, getString(R.string.login_successfully), Toast.LENGTH_LONG).show();

                        Intent listinntent = new Intent(Login.this, List.class);
                        startActivity(listinntent);

                    } else {
                        Toast.makeText(Login.this, getString(R.string.error_bad_credentials), Toast.LENGTH_LONG).show();

                    }

                }

            }


        });
    }

    private boolean Validation() {

        boolean success = true;

        if (usuario.equalsIgnoreCase("")) {
            user.setError(getString(R.string.error_field_required));
            user.requestFocus();
            success = true;
        }

        if (password.equalsIgnoreCase("")) {
            pass.setError(getString(R.string.error_field_required));
            user.requestFocus();
            success = false;
        }
        return success;
    }
}