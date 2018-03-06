package br.com.luiztools.forcavendas;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button angryButton007 = (Button) findViewById(R.id.angry_btn007);
        angryButton007.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MenuActivity.this,MapsActivity.class);
                startActivity(intent);
// Click event trigger here
            }
        });
    }
}