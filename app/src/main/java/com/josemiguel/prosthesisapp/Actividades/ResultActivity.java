package com.josemiguel.prosthesisapp.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.josemiguel.prosthesisapp.R;

public class ResultActivity extends AppCompatActivity {

    private String doctorname, doctorid, doctoremail, doctorOccupation;
    private TextView etDoctorName, etDoctorID, etDoctorEmail, etDoctorOcu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        getDatos();

        setViewLayout();

        // Cambia los valores y muestra la info
        changeInfoLayout();

    }

    private void changeInfoLayout() {

        etDoctorName.setText(doctorname.toString());
        etDoctorID.setText(doctorid.toString());
        etDoctorEmail.setText(doctoremail.toString());
        etDoctorOcu.setText(doctorOccupation.toString());


    }

    private void setViewLayout() {

        etDoctorName = (TextView) findViewById(R.id.tvDName);
        etDoctorID = (TextView) findViewById(R.id.tvDID);
        etDoctorEmail = (TextView) findViewById(R.id.tvDEmail);
        etDoctorOcu = (TextView) findViewById(R.id.tvDOccupation);

    }

    private void getDatos() {

        getIntent().getIntExtra("KVALUE", PersonalActivity.total);
        Toast.makeText(this, "total : " + PersonalActivity.total, Toast.LENGTH_SHORT).show();
        doctorname = getIntent().getStringExtra("DOCTORNAME");
        doctorid = getIntent().getStringExtra("DOCTORID");
        doctoremail = getIntent().getStringExtra("DOCTOREMAIL");
        doctorOccupation = getIntent().getStringExtra("DOCTOROCCUPATION");
        getIntent().getStringExtra("CONVEYANCE");
        getIntent().getStringExtra("SOCIOECONOMIC");
        getIntent().getStringExtra("AMPUTATION");
        getIntent().getStringExtra("NAME");
        getIntent().getStringExtra("ID");
        getIntent().getStringExtra("NAME");
        getIntent().getStringExtra("AGE");
        getIntent().getStringExtra("HEIGHT");
        getIntent().getStringExtra("ADDRESS");
        getIntent().getStringExtra("HEALTH");
        getIntent().getStringExtra("C1");
        getIntent().getStringExtra("C2");
        getIntent().getStringExtra("C3");
        getIntent().getStringExtra("C4");

    }


}