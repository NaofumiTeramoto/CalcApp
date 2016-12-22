package jp.techakademy.naofumi.teramoto.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mTextView;
    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.textView);
        mEditText = (EditText) findViewById(R.id.editText1);
    }
    @Override
    public void onClick(View v) {
 //       Log.d("UI_PARTS", "ボタンをタップしました");
//        Intent intent = new Intent(this, SecondActivity.class);
//        intent.putExtra("VALUE1", 10);
//        intent.putExtra("VALUE2", 20);
//        startActivity(intent);

    }
}
