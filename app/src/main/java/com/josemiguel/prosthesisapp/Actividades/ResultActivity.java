package com.josemiguel.prosthesisapp.Actividades;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.josemiguel.prosthesisapp.R;

import java.time.LocalDateTime;

public class ResultActivity extends AppCompatActivity {

    // doctor info
    private String doctorname, doctorid, doctoremail, doctorOccupation, weight;
    private TextView etDoctorName, etDoctorID, etDoctorEmail, etDoctorOcu;
    // personal info

    // Table items
    private TextView kTotal,kRecommendations, kIndex, tvMaterial, tvcurrentTime;
    private int kvalue;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        getDatos();

        setViewLayout();

        // values
        getKValue(kvalue);

        // Cambia los valores y muestra la info
        changeInfoLayout();

    }

    // Determina el valor de K
    public void getKValue(int value) {

        if(value < 4) {
            //Toast.makeText(this, "K0", Toast.LENGTH_SHORT).show();
            kIndex.setText("0");
            kTotal.setText( String.valueOf(value) );
        }
        else if(value >= 4 && value <= 12) {
            //Toast.makeText(this, "K1", Toast.LENGTH_SHORT).show();
            kIndex.setText("1");
            kTotal.setText( String.valueOf(value) );
            kRecommendations.setText("SACH type prosthetic foot, single axis foot and constant friction knee.");
        }
        else if(value >= 13 && value <= 22) {
            //Toast.makeText(this, "K2", Toast.LENGTH_SHORT).show();
            kIndex.setText("2");
            kTotal.setText( String.valueOf(value) );
            kRecommendations.setText("Flexible and / or multiaxial feet (also monoaxial), constant friction knee.");
        }
        else if(value >= 23 && value <= 28) {
            //Toast.makeText(this, "K3", Toast.LENGTH_SHORT).show();
            kIndex.setText("3");
            kTotal.setText( String.valueOf(value) );
            kRecommendations.setText("Flexible foot system, feet with energy storage, multi-axis foot or dynamic fluid response, pneumatic control feet and knees.");
        }
        else if(value >= 29 && value <= 40) {
            //Toast.makeText(this, "K4", Toast.LENGTH_SHORT).show();
            kIndex.setText("4");
            kTotal.setText( String.valueOf(value) );
            kRecommendations.setText("Hydraulic or pneumatic suspension systems.");
        }
        else{
            //Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void changeInfoLayout() {

        LocalDateTime localDate = LocalDateTime.now();

        etDoctorName.setText(doctorname.toString());
        etDoctorID.setText(doctorid.toString());
        etDoctorEmail.setText(doctoremail.toString());
        etDoctorOcu.setText(doctorOccupation.toString());
        tvcurrentTime.setText( String.valueOf(localDate) );
        tvMaterial.setText( setMaterial( Integer.parseInt(weight) ) );

    }

    private void setViewLayout() {

        etDoctorName = (TextView) findViewById(R.id.tvDName);
        etDoctorID = (TextView) findViewById(R.id.tvDID);
        etDoctorEmail = (TextView) findViewById(R.id.tvDEmail);
        etDoctorOcu = (TextView) findViewById(R.id.tvDOccupation);
        // table items
        kIndex = (TextView) findViewById(R.id.kIndex);
        kTotal = (TextView) findViewById(R.id.kTotal);
        kRecommendations = (TextView) findViewById(R.id.kResult);
        tvMaterial = (TextView) findViewById(R.id.tvMaterial);
        tvcurrentTime = (TextView) findViewById(R.id.tvCurrentTime);

    }

    private void getDatos() {

        //Toast.makeText(this, "total : " + PersonalActivity.total, Toast.LENGTH_SHORT).show();
        kvalue = getIntent().getIntExtra("KVALUE", PersonalActivity.total);
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
        weight = getIntent().getStringExtra("WEIGHT");
        getIntent().getStringExtra("ADDRESS");
        getIntent().getStringExtra("HEALTH");
        getIntent().getStringExtra("C1");
        getIntent().getStringExtra("C2");
        getIntent().getStringExtra("C3");
        getIntent().getStringExtra("C4");

    }

    private String setMaterial(int weight) {

        String value;

        if(weight >= 40 && weight <= 60) {
            value="Titanium";
        }
        else if(weight >= 61 && weight <= 85) {
            value="Titanium /Steel";
        }
        else if(weight >= 61 && weight <= 85) {
            value="Duralumnium";
        }
        else if(weight >= 86 && weight <= 115) {
            value="Duralumnium";
        }
        else {
            value = "Weight greater than 115 kg";
        }

        return value;

    }


}