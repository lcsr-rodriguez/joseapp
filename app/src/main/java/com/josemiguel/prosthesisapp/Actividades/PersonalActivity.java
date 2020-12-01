package com.josemiguel.prosthesisapp.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.josemiguel.prosthesisapp.R;

public class PersonalActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private EditText FuerzaArt, MovilidadArt, Sensibilidad, Equilibrio;
    private EditText etPatienteName,etPatienteID,etPatienteAge,etPatienteWeight,etPatienteAddress,etPatienteHealth;
    private Spinner spConveyance, spSocioeconomic, spAmputation;
    private Button btnResponse;
    private String pie, rodilla, encaje, tipoSujecion, valueSpinnerAmp, valueSpinnerConv, valueSpinnerSoc;
    public static int total;
    private String doctorname, doctorid, doctoremail, doctorOccupation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        getDataDoctor();

        setViewPersonal();

        setSpinners();

        btnResponse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dataIntent = new Intent(PersonalActivity.this , ResultActivity.class);

                // Amputation type => K value
                switch(valueSpinnerAmp) {
                    case "Transtibial":
                            total = getFuerzaArt() + getMovilidad() + getSensibilidad() + getSujecion();
                        break;
                    case "Disarticulated knee":
                            total = getFuerzaArt() + getMovilidad() + getSensibilidad() + getSujecion();
                        break;
                    case "Transfemoral":
                            total = getFuerzaArt() + getMovilidad() + getSensibilidad() + getSujecion();
                        break;
                    case "Disarticulated hip":
                            total = getFuerzaArt() + getMovilidad() + getSensibilidad() + getSujecion();
                        break;
                    case "Hemilpevectomy":
                            total = getFuerzaArt() + getMovilidad() + getSensibilidad() + getSujecion();
                        break;
                    default:
                            total = getFuerzaArt() + getMovilidad() + getSensibilidad() + getSujecion();
                        Toast.makeText(PersonalActivity.this, "¡Invalid Option!", Toast.LENGTH_SHORT).show();
                }


                getKValue(total);


                // Key, Value
                dataIntent.putExtra("KVALUE", total);
                dataIntent.putExtra("DOCTORNAME", doctorname);
                dataIntent.putExtra("DOCTORID", doctorid);
                dataIntent.putExtra("DOCTOREMAIL", doctoremail);
                dataIntent.putExtra("DOCTOROCCUPATION", doctorOccupation);
                dataIntent.putExtra("CONVEYANCE", valueSpinnerConv.toString());
                dataIntent.putExtra("SOCIOECONOMIC", valueSpinnerSoc.toString());
                dataIntent.putExtra("AMPUTATION", valueSpinnerAmp.toString());
                dataIntent.putExtra("NAME", etPatienteName.getText().toString() );
                dataIntent.putExtra("ID", etPatienteID.getText().toString() );
                dataIntent.putExtra("NAME", etPatienteName.getText().toString() );
                dataIntent.putExtra("AGE", etPatienteAge.getText().toString() );
                dataIntent.putExtra("WEIGHT", etPatienteWeight.getText().toString() );
                dataIntent.putExtra("ADDRESS", etPatienteAddress.getText().toString() );
                dataIntent.putExtra("HEALTH", etPatienteHealth.getText().toString() );
                dataIntent.putExtra("C1", pie );
                dataIntent.putExtra("C2", rodilla );
                dataIntent.putExtra("C3", encaje );
                dataIntent.putExtra("C4", tipoSujecion );


                startActivity(dataIntent);
            }
        });

    }

    private void getDataDoctor() {

        doctorname = getIntent().getStringExtra("DOCTORNAME");
        doctorid = getIntent().getStringExtra("DOCTORID");
        doctoremail = getIntent().getStringExtra("DOCTOREMAIL");
        doctorOccupation = getIntent().getStringExtra("DOCTOROCCUPATION");

    }

    // Determina el valor de K
    public void getKValue(int value) {

        if(value < 4) {
            //Toast.makeText(this, "K0", Toast.LENGTH_SHORT).show();
        }
        else if(value >= 4 && value <= 12) {
            //Toast.makeText(this, "K1", Toast.LENGTH_SHORT).show();
        }
        else if(value >= 13 && value <= 22) {
            //Toast.makeText(this, "K2", Toast.LENGTH_SHORT).show();
        }
        else if(value >= 23 && value <= 28) {
            //Toast.makeText(this, "K3", Toast.LENGTH_SHORT).show();
        }
        else if(value >= 29 && value <= 40) {
            //Toast.makeText(this, "K4", Toast.LENGTH_SHORT).show();
        }
        else{
            //Toast.makeText(this, "Usted está jodido", Toast.LENGTH_SHORT).show();
        }

    }

    // Return value 1 to 10
    private int getSensibilidad() {

        int value = Integer.parseInt( Sensibilidad.getText().toString() );
        encaje = "Encaje HST";

        return value;

    }

    // Return value 1 to 10
    private int getMovilidad() {

        int value = Integer.parseInt( MovilidadArt.getText().toString() );
        rodilla = "N.A";

        return value;

    }

    // Return value 1 to 10
    private int getFuerzaArt() {
        int value = Integer.parseInt( FuerzaArt.getText().toString() );
        if(value >=1 && value <=3) {
            pie = "Pie tipo SACH";
        }
        else if(value >3 && value <=10) {
            pie = "N.A";
        }
        else{
            pie = " - - -";
        }

        return value;
    }

    // Return value 1 to 10
    private int getSujecion() {
        int value = Integer.parseInt( Equilibrio.getText().toString() );
        if(value >=1 && value <=3) {
            this.tipoSujecion = "Manga Neopreno";
        }
        else if(value >3 && value <=10) {
            pie = "N.A";
        }
        else{
            pie = " - - -";
        }

        return value;
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

        ArrayAdapter<CharSequence> adapterAmputation = ArrayAdapter.createFromResource(this, R.array.amputation, android.R.layout.simple_spinner_item);
        adapterAmputation.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spAmputation.setAdapter(adapterAmputation);
        spAmputation.setOnItemSelectedListener(this);

    }

    // Init Values
    private void setViewPersonal() {

        btnResponse = (Button) findViewById(R.id.btnResponse);
        spConveyance = (Spinner) findViewById(R.id.spConveyance);
        spSocioeconomic = (Spinner) findViewById(R.id.spSocioeconomic);
        spAmputation = (Spinner) findViewById(R.id.spAmputation);
        FuerzaArt = (EditText) findViewById(R.id.etFuerzaArticulacion);
        MovilidadArt = (EditText) findViewById(R.id.etMovilidadArt);
        Sensibilidad = (EditText) findViewById(R.id.etSensibilidadmun);
        Equilibrio = (EditText) findViewById(R.id.etEquilibriomon);
        // Values Personal
        etPatienteName = (EditText) findViewById(R.id.etPatienteName);
        etPatienteID = (EditText) findViewById(R.id.etPatienteID);
        etPatienteAge = (EditText) findViewById(R.id.etPatienteAge);
        etPatienteWeight = (EditText) findViewById(R.id.etPatienteWeight);
        etPatienteAddress = (EditText) findViewById(R.id.etPatienteAddress);
        etPatienteHealth = (EditText) findViewById(R.id.etPatienteHealth);

    }

    // Methods Interface AdapterView.OnItemSelectedListener
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        String text = adapterView.getItemAtPosition(position).toString();
        valueSpinnerAmp = text;
        valueSpinnerConv = text;
        valueSpinnerSoc = text;
        Toast.makeText(adapterView.getContext(), ""+text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    // Methods K --------------------------------------
    public void K1(String option, int opt1, int opt2, int opt3, int opt4) {



    }
    public void K2(String option, int opt1, int opt2, int opt3, int opt4) {



    }
    public void K3(String option, int opt1, int opt2, int opt3, int opt4) {



    }
    public void K4(String option, int opt1, int opt2, int opt3, int opt4) {



    }

}