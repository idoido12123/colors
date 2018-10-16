package com.example.idoid.colors;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {
    LinearLayout rl2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        rl2=(LinearLayout)findViewById(R.id.background2);

    }
        public boolean onCreateOptionsMenu(Menu menu){
            getMenuInflater().inflate(R.menu.main, menu);
            menu.add("black");
            return super.onCreateOptionsMenu(menu);
        }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String st=item.getTitle().toString();
        if(st.equals("blue"))
            rl2.setBackgroundColor(Color.BLUE);
        if(st.equals("red"))
            rl2.setBackgroundColor(Color.RED);
        if(st.equals("yellow"))
            rl2.setBackgroundColor(Color.YELLOW);
        if(st.equals("black"))
            rl2.setBackgroundColor(Color.BLACK);



        return super.onOptionsItemSelected(item);
    }
}
