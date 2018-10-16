package com.example.idoid.colors;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout RL;
    Button btn;
    Intent t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RL=(LinearLayout)findViewById(R.id.background);
        btn=(Button)findViewById(R.id.button);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String st=item.getTitle().toString();
        if(st.equals("blue"))
            RL.setBackgroundColor(Color.BLUE);
        if(st.equals("red"))
            RL.setBackgroundColor(Color.RED);
        if(st.equals("yellow"))
            RL.setBackgroundColor(Color.YELLOW);


        return super.onOptionsItemSelected(item);
    }
    void onclick(View view){
        t=new Intent(this,Main2Activity.class);
        startActivity(t);

    }
}
