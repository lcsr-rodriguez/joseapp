package com.josemiguel.prosthesisapp.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.josemiguel.prosthesisapp.R;

public class DoctorActivity extends AppCompatActivity {

    private EditText Name, ID, Email, Occupation;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);

        setViewDoctor(); // Set initials values with constructor

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dataIntent = new Intent(DoctorActivity.this , PersonalActivity.class);
                // Key, Value
                dataIntent.putExtra("DOCTORNAME", Name.getText().toString());
                dataIntent.putExtra("DOCTORID", ID.getText().toString());
                dataIntent.putExtra("DOCTOREMAIL", Email.getText().toString());
                dataIntent.putExtra("DOCTOROCCUPATION", Occupation.getText().toString());

                startActivity(dataIntent);
            }
        });

    }

    // Init Values
    private void setViewDoctor() {

        Name = (EditText) findViewById(R.id.etName);
        ID = (EditText) findViewById(R.id.etID);
        Email = (EditText) findViewById(R.id.etEmail);
        Occupation = (EditText) findViewById(R.id.etOccupation);
        btnNext = (Button) findViewById(R.id.btnNext);

    }

}