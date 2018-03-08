package jp.techacademy.yuki.fujita.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText1;
    EditText mEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button kasan = (Button) findViewById(R.id.kasan);
        kasan.setOnClickListener(this);

        Button gensan = (Button) findViewById(R.id.gensan);
        gensan.setOnClickListener(this);

        Button jousan = (Button) findViewById(R.id.josan);
        jousan.setOnClickListener(this);

        Button josan = (Button) findViewById(R.id.jousan);
        josan.setOnClickListener(this);

        mEditText1 = (EditText) findViewById(R.id.edit1);
        mEditText2 = (EditText) findViewById(R.id.edit2);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Output.class);
        double answer = 0.0;
        double value1 = Double.parseDouble(mEditText1.getText().toString());
        double value2 = Double.parseDouble(mEditText2.getText().toString());

        if (v.getId() == R.id.kasan) {
            answer = value1 + value2;
        } else if (v.getId() == R.id.gensan) {
            answer = value1 - value2;
        } else if (v.getId() == R.id.jousan) {
            answer = value1 * value2;
        } else if (v.getId() == R.id.josan) {
            answer = value1 / value2;
        }
        intent.putExtra("Answer", answer);
        startActivity(intent);
    }
}

//課題：四則計算アプリ
//        2つの画面があり、1つ目の画面に数値2つと演算子を選ぶと、次の画面で計算結果を表示する四則計算アプリを作成してください。
//
//        プロジェクトを新規作成し、 CalcApp というプロジェクト名をつけてください
//        画面を2つ作成してください
//        1つ目の画面では、数値入力用の2つのEditTextと、四則計算それぞれのボタンを4つ作成してください
//        4つの四則計算ボタンのどれかをタップすると、2つ目の画面へ移動させてTextViewで対応する計算結果を表示してください
//        数値は小数点に対応してください
