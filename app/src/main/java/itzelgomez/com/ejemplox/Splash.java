package itzelgomez.com.ejemplox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread miHilo = new Thread(){

            @Override
            public void run() {

                try {
                    sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent1 = new Intent(Splash.this,Login.class);
                    startActivity(intent1);
                    finish();
                }
            }
        };
        miHilo.start();
    }
}
