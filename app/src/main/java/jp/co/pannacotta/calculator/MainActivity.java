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

        final TextView textView = findViewById(R.id.anserTextView);

        Button oneButton = findViewById(R.id.button9);
        Button twoButton = findViewById(R.id.button10);
        Button threeButton = findViewById(R.id.button11);
        Button fourButton = findViewById(R.id.button5);
        Button fiveButton = findViewById(R.id.button6);
        Button sixButton = findViewById(R.id.button7);
        Button sevenButton = findViewById(R.id.button1);
        Button eightButton = findViewById(R.id.button2);
        Button nineButton = findViewById(R.id.button3);
        Button zeroButton = findViewById(R.id.button15);

        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1ってボタン押したら今まで押されたボタンの表示が残ったまま1って文字が入るようにする。
                //テキストビューから表示されている文字を取り出して箱に入れる。（今まで入っている文字が取り出せる）
                String displayString = textView.getText().toString();//空中にきてるだけになっちゃうから取ってきたものの型が何なのか書く。
                //文字列を連結する
                StringBuilder stringBuilder = new StringBuilder();
                //文字列を追加する
                stringBuilder.append(displayString).append("1");
                textView.setText(stringBuilder);
            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //2ってボタン押したら今まで押されたボタンの表示が残ったまま2って文字が追加で入るようにする。
                //表示される材料を用意する。
                //テキストビューから表示されている文字を取り出して箱に入れる。（今まで入っている文字が取り出せる）
                String displayString = textView.getText().toString();//空中にきてるだけになっちゃうから取ってきたものの型が何なのか書く。
                //文字列を連結する
                StringBuilder stringBuilder = new StringBuilder();
                //文字列を追加する
                stringBuilder.append(displayString).append("2");
                textView.setText(stringBuilder);
            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //3ってボタン押したら今まで押されたボタンの表示が残ったまま3って文字が追加で入るようにする。
                //表示される材料を用意する。
                //テキストビューから表示されている文字を取り出して箱に入れる。（今まで入っている文字が取り出せる）
                String displayString = textView.getText().toString();//空中にきてるだけになっちゃうから取ってきたものの型が何なのか書く。
                //文字列を連結する
                StringBuilder stringBuilder = new StringBuilder();
                //文字列を追加する
                stringBuilder.append(displayString).append("3");
                textView.setText(stringBuilder);
            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //4ってボタン押したら今まで押されたボタンの表示が残ったまま4って文字が追加で入るようにする。
                //表示される材料を用意する。
                //テキストビューから表示されている文字を取り出して箱に入れる。（今まで入っている文字が取り出せる）
                String displayString = textView.getText().toString();//空中にきてるだけになっちゃうから取ってきたものの型が何なのか書く。
                //文字列を連結する
                StringBuilder stringBuilder = new StringBuilder();
                //文字列を追加する
                stringBuilder.append(displayString).append("4");
                textView.setText(stringBuilder);
            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //5ってボタン押したら今まで押されたボタンの表示が残ったまま5って文字が追加で入るようにする。
                //表示される材料を用意する。
                //テキストビューから表示されている文字を取り出して箱に入れる。（今まで入っている文字が取り出せる）
                String displayString = textView.getText().toString();//空中にきてるだけになっちゃうから取ってきたものの型が何なのか書く。
                //文字列を連結する
                StringBuilder stringBuilder = new StringBuilder();
                //文字列を追加する
                stringBuilder.append(displayString).append("5");
                textView.setText(stringBuilder);
            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //6ってボタン押したら今まで押されたボタンの表示が残ったまま6って文字が追加で入るようにする。
                //表示される材料を用意する。
                //テキストビューから表示されている文字を取り出して箱に入れる。（今まで入っている文字が取り出せる）
                String displayString = textView.getText().toString();//空中にきてるだけになっちゃうから取ってきたものの型が何なのか書く。
                //文字列を連結する
                StringBuilder stringBuilder = new StringBuilder();
                //文字列を追加する
                stringBuilder.append(displayString).append("6");
                textView.setText(stringBuilder);
            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //7ってボタン押したら今まで押されたボタンの表示が残ったまま7って文字が追加で入るようにする。
                //表示される材料を用意する。
                //テキストビューから表示されている文字を取り出して箱に入れる。（今まで入っている文字が取り出せる）
                String displayString = textView.getText().toString();//空中にきてるだけになっちゃうから取ってきたものの型が何なのか書く。
                //文字列を連結する
                StringBuilder stringBuilder = new StringBuilder();
                //文字列を追加する
                stringBuilder.append(displayString).append("7");
                textView.setText(stringBuilder);
            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //8ってボタン押したら今まで押されたボタンの表示が残ったまま8って文字が追加で入るようにする。
                //表示される材料を用意する。
                //テキストビューから表示されている文字を取り出して箱に入れる。（今まで入っている文字が取り出せる）
                String displayString = textView.getText().toString();//空中にきてるだけになっちゃうから取ってきたものの型が何なのか書く。
                //文字列を連結する
                StringBuilder stringBuilder = new StringBuilder();
                //文字列を追加する
                stringBuilder.append(displayString).append("8");
                textView.setText(stringBuilder);
            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //9ってボタン押したら今まで押されたボタンの表示が残ったまま9って文字が追加で入るようにする。
                //表示される材料を用意する。
                //テキストビューから表示されている文字を取り出して箱に入れる。（今まで入っている文字が取り出せる）
                String displayString = textView.getText().toString();//空中にきてるだけになっちゃうから取ってきたものの型が何なのか書く。
                //文字列を連結する
                StringBuilder stringBuilder = new StringBuilder();
                //文字列を追加する
                stringBuilder.append(displayString).append("9");
                textView.setText(stringBuilder);
            }
        });

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //0ってボタン押したら今まで押されたボタンの表示が残ったまま0って文字が追加で入るようにする。
                //表示される材料を用意する。
                //テキストビューから表示されている文字を取り出して箱に入れる。（今まで入っている文字が取り出せる）
                String displayString = textView.getText().toString();//空中にきてるだけになっちゃうから取ってきたものの型が何なのか書く。
                //文字列を連結する
                StringBuilder stringBuilder = new StringBuilder();
                //文字列を追加する
                stringBuilder.append(displayString).append("0");
                textView.setText(stringBuilder);
            }
        });





    }
}
