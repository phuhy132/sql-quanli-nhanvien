package com.example.asm_mob403;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    TextView tvid, tvname, tvemail, tvcontact, tvaddress;
    int position;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        //Initializing Views
        tvid = findViewById(R.id.txtid);
        tvname = findViewById(R.id.txtname);
        tvemail = findViewById(R.id.txtemail);
        tvcontact = findViewById(R.id.txcontact);
        tvaddress = findViewById(R.id.txtaddress);

        Intent intent = getIntent();
        position = intent.getExtras().getInt("position");

        tvid.setText("ID: " + com.example.asm_mob403.MainActivity.employeeArrayList.get(position).getId());
        tvname.setText("Name: " + com.example.asm_mob403.MainActivity.employeeArrayList.get(position).getName());
        tvemail.setText("Email: " + com.example.asm_mob403.MainActivity.employeeArrayList.get(position).getEmail());
        tvcontact.setText("Contact: " + com.example.asm_mob403.MainActivity.employeeArrayList.get(position).getContact());
        tvaddress.setText("Address: " + com.example.asm_mob403.MainActivity.employeeArrayList.get(position).getAddress());


    }
}
