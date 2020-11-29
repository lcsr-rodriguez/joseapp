package com.josemiguel.prosthesisapp.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.josemiguel.prosthesisapp.R;

public class PersonalActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spConveyance, spSocioeconomic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        setViewPersonal();

        setSpinners();

    }

    private void setSpinners() {

        ArrayAdapter<CharSequence> adapterConveyance = ArrayAdapter.createFromResource(this, R.array.conveyance, android.R.layout.simple_spinner_item);
        adapterConveyance.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spConveyance.setAdapter(adapterConveyance);
        spConveyance.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapterSocioeconomic = ArrayAdapter.createFromResource(this, R.array.socioeconomic, android.R.layout.simple_spinner_item);
        adapterSocioeconomic.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spSocioeconomic.setAdapter(adapterSocioeconomic);
        spSocioeconomic.setOnItemSelectedListener(this);

    }

    // Init Values
    private void setViewPersonal() {

        spConveyance = (Spinner) findViewById(R.id.spConveyance);
        spSocioeconomic = (Spinner) findViewById(R.id.spSocioeconomic);

    }

    // Methods Interface AdapterView.OnItemSelectedListener
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        String text = adapterView.getItemAtPosition(position).toString();
        Toast.makeText(adapterView.getContext(), ""+text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}