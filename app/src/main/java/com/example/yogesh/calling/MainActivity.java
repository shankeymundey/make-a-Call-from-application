package com.example.yogesh.calling;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText)findViewById(R.id.t1);
    }


    @SuppressLint("MissingPermission")
    public void callbtn(View view) {
        String no=t1.getText().toString().trim();
        if(no.length()==10){
            Intent intent=new Intent(Intent.ACTION_CALL);
            Uri uri=Uri.parse("tel:"+no);
            intent.setData(uri);
            startActivity(intent);}
        else
            Toast.makeText(this,"invalid no.",Toast.LENGTH_LONG).show();

    }
}
