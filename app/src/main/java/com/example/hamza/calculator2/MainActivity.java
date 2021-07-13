package com.example.hamza.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtFirst,edtSecond;
    Button btnAdd,btnSubtract,btnMultiply,btnDivide;
    TextView tvResult;
    int First,Second,Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtFirst=(EditText)findViewById(R.id.edtFirst);
        edtSecond=(EditText)findViewById(R.id.edtSecond);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSubtract=(Button)findViewById(R.id.btnSubtract);
        btnMultiply=(Button)findViewById(R.id.btnMultiply);
        btnDivide=(Button)findViewById(R.id.btnDivide);
        tvResult=(TextView) findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnAdd:

                First=Integer.valueOf(edtFirst.getText().toString());
                Second=Integer.valueOf(edtSecond.getText().toString());
                Result=First+Second;
                tvResult.setText("Your Answer is: "+Result);
            break;

            case R.id.btnSubtract:
                First=Integer.valueOf(edtFirst.getText().toString());
                Second=Integer.valueOf(edtSecond.getText().toString());
                Result=First-Second;
                tvResult.setText("Your Answer is: "+Result);
                break;

            case R.id.btnMultiply:
                First=Integer.valueOf(edtFirst.getText().toString());
                Second=Integer.valueOf(edtSecond.getText().toString());
                Result=First*Second;
                tvResult.setText("Your Answer is: "+Result);
                break;
            case R.id.btnDivide:
                Float first,second,result;
                first=Float.valueOf(edtFirst.getText().toString());
                second=Float.valueOf(edtSecond.getText().toString());
                result=first/second;
                tvResult.setText("Your Answer is: "+result);
                break;
        }
    }
}
