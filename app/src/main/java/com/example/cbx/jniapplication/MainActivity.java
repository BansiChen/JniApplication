package com.example.cbx.jniapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static {
        System.loadLibrary("MyJniLib"); //和生成so文件的名字对应。
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JniUtils jniUtils = new JniUtils();
        TextView tv = (TextView) findViewById(R.id.tv_jni);
        tv.setText(jniUtils.getString());
    }
}
