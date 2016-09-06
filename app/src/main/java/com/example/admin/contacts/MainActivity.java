package com.example.admin.contacts;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contacts=(Button)findViewById(R.id.contacts);
        contacts.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent contacts=new Intent(Intent.ACTION_VIEW, Uri.parse(" content://contacts/people/"));
        startActivity(contacts);
    }
}
