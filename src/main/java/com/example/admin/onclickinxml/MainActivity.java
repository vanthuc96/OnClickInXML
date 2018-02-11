package com.example.admin.onclickinxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btntong2so;
    private TextView tv_info;
    private EditText edt_a;
    private EditText edt_b;
    private TextView tv_a;
    private  TextView tv_b;
    private  TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        setEventClickView();

    }

    public void btn_tong2so(View view) {
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_tong2so:
            int result = Integer.parseInt(edt_b.getText().toString()) + Integer.parseInt(edt_a.getText().toString());
            tv_result.setText(result + "");
            break;
            default:
                break;
        }
    }
    private void initWidget(){
        btntong2so=(Button) findViewById(R.id.btn_tong2so);
        tv_info=(TextView) findViewById(R.id.tv_info);
        tv_a=(TextView) findViewById(R.id.tv_a);
        tv_b=(TextView) findViewById(R.id.tv_b);
        tv_result=(TextView) findViewById(R.id.tv_result);
        edt_a=(EditText) findViewById(R.id.edt_a);
        edt_b=(EditText)findViewById(R.id.edt_b);
    }
    private  void setEventClickView(){
        btntong2so.setOnClickListener(this);
    }

}
