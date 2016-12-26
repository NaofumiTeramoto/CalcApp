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
    EditText mEditText1;
    EditText mEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        mTextView = null;
        mTextView = (TextView) findViewById(R.id.textView);
        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);

    }
    @Override
    public void onClick(View v) {
        if (v != null) {
            Intent intent = new Intent(this, SecondActivity.class);
            double Num1 = Double.parseDouble(mEditText1.getText().toString());
            double Num2 = Double.parseDouble(mEditText2.getText().toString());
            switch (v.getId()) {
                case R.id.button1:
                    intent.putExtra("VALUE1", Num1 + Num2);
                    startActivity(intent);
                    break;

                case R.id.button2:
                    intent.putExtra("VALUE1", Num1 - Num2);
                    startActivity(intent);
                    break;

                case R.id.button3:
                    intent.putExtra("VALUE1", Num1 * Num2);
                    startActivity(intent);
                    break;

                case R.id.button4:
                    intent.putExtra("VALUE1", Num1 / Num2);
                    startActivity(intent);
                    break;

            }
        }

   }
}
