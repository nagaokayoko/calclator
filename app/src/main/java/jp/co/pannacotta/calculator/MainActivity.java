package jp.co.pannacotta.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button keyButton;
    private Button twoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //１ってボタン押したら1って文字が入るようにする。
        final TextView textView = findViewById(R.id.anserTextView);
        final Button oneButton = findViewById(R.id.button9);
        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("1");
            }
        });

        //続けて2ってボタン押したら12って文字が入るようにする。
        Button twoButton = findViewById(R.id.button10);
        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("1"+"2");
            }
        });


    }
}
