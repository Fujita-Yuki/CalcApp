package jp.techacademy.yuki.fujita.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.util.Log;

public class Output extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        Intent intent = getIntent();
        double answer = intent.getDoubleExtra("Answer",0);

        TextView textView = (TextView)findViewById(R.id.text);
        textView.setText(String .valueOf(answer));
    }
}
