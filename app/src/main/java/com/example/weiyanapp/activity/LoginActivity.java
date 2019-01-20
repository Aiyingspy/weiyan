package com.example.weiyanapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.weiyanapp.QueryString;
import com.example.weiyanapp.R;

import java.io.IOException;


public class LoginActivity extends Activity implements View.OnClickListener {
    private ImageView mBackBtn;
    private ListView mlistView;
    private TextView mUserText;
    private TextView mPwdText;
    private TextView mEditText;
    private Button searchBtn;


    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_login);
        mUserText = (TextView) findViewById(R.id.textView);

        mBackBtn.setOnClickListener(this);
        mPwdText = (TextView) findViewById(R.id.textView2);



        searchBtn = (Button) findViewById(R.id.button);
        searchBtn.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:

                String inputUser = mUserText.getText().toString();
                String inputPwd = mPwdText.getText().toString();
                QueryString query = new QueryString();
                try {
                    int j=query.LoginServer(inputUser,inputPwd);
                } catch (IOException e) {
                    e.printStackTrace();
                }


                    //转到功能面板
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    intent.putExtra("uno", inputUser);
                    startActivity(intent);						//启动功能Activity
                    finish();
              break;

            default:
                break;
        }

    }
}