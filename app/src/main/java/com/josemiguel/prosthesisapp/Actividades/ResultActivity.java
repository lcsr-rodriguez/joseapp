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
    private String doctorname, doctorid, doctoremail, doctorOccupation, weight, type, name, id, age;
    private TextView etDoctorName, etDoctorID, etDoctorEmail, etDoctorOcu;
    // personal info
    private TextView tvName, tvID, tvAge, tvWeight;
    // Table items
    private TextView kFoot,kKnee, kIndex, kLace, kSubjection , tvMaterial, tvcurrentTime, tvType;
    private int kvalue;
    // inputs
    private int fuerza,movilidad,sensibilidad,equilibrio;
    private String valuePie, valueRodilla, valueEncaje, valueSujecion;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        getDatos();

        setViewLayout();

        // values
        getKValue(kvalue, type);

        // Cambia los valores y muestra la info
        changeInfoLayout();

    }

    // Determina el valor de K
    public void getKValue(int value, String tipo) {
        //Toast.makeText(this, "val tipo"+tipo, Toast.LENGTH_SHORT).show();
        if(value < 4) {
            //Toast.makeText(this, "K0", Toast.LENGTH_SHORT).show();

        }
        else if(value >= 4 && value <= 12) {
            //Toast.makeText(this, "K1", Toast.LENGTH_SHORT).show();
            switch (tipo) {
                case "Transtibial":
                    //Toast.makeText(this, "opc1", Toast.LENGTH_SHORT).show();
                    valuePie = getPie1(fuerza);
                    valueRodilla = getRodilla1(movilidad);
                    valueEncaje = getEncaje1(sensibilidad);
                    valueSujecion = getSujecion1(equilibrio);
                    kIndex.setText("1");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);
                    break;
                case "Disarticulated knee":
                    valuePie = getPie11(fuerza);
                    valueRodilla = getRodilla11(movilidad);
                    valueEncaje = getEncaje11(sensibilidad);
                    valueSujecion = getSujecion11(equilibrio);
                    kIndex.setText("1");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);
                    break;
                case "Transfemoral":
                    valuePie = getPie111(fuerza);
                    valueRodilla = getRodilla111(movilidad);
                    valueEncaje = getEncaje111(sensibilidad);
                    valueSujecion = getSujecion111(equilibrio);
                    kIndex.setText("1");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);

                    break;
                case "Disarticulated hip":
                    valuePie = getPie1111(fuerza);
                    valueRodilla = getRodilla1111(movilidad);
                    valueEncaje = getEncaje1111(sensibilidad);
                    valueSujecion = getSujecion1111(equilibrio);
                    kIndex.setText("1");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);
                    break;
                case "Hemilpevectomy":
                    valuePie = getPie11111(fuerza);
                    valueRodilla = getRodilla11111(movilidad);
                    valueEncaje = getEncaje11111(sensibilidad);
                    valueSujecion = getSujecion11111(equilibrio);
                    kIndex.setText("1");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);
                    break;
                default:
                    Toast.makeText(this, "Ninguno", Toast.LENGTH_SHORT).show(); break;
            }
        }
        else if(value >= 13 && value <= 22) {
            //Toast.makeText(this, "K2", Toast.LENGTH_SHORT).show();
            switch (tipo) {
                case "Transtibial":
                    //Toast.makeText(this, "opc2", Toast.LENGTH_SHORT).show();
                    valuePie = getPie2(fuerza);
                    valueRodilla = getRodilla2(movilidad);
                    valueEncaje = getEncaje2(sensibilidad);
                    valueSujecion = getSujecion2(equilibrio);
                    kIndex.setText("2");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);
                    break;
                case "Disarticulated knee":
                    valuePie = getPie22(fuerza);
                    valueRodilla = getRodilla22(movilidad);
                    valueEncaje = getEncaje22(sensibilidad);
                    valueSujecion = getSujecion22(equilibrio);
                    kIndex.setText("2");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);
                    break;
                case "Transfemoral":
                    valuePie = getPie222(fuerza);
                    valueRodilla = getRodilla222(movilidad);
                    valueEncaje = getEncaje222(sensibilidad);
                    valueSujecion = getSujecion222(equilibrio);
                    kIndex.setText("2");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);
                    break;
                case "Disarticulated hip":
                    valuePie = getPie2222(fuerza);
                    valueRodilla = getRodilla2222(movilidad);
                    valueEncaje = getEncaje2222(sensibilidad);
                    valueSujecion = getSujecion2222(equilibrio);
                    kIndex.setText("2");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);
                    break;
                case "Hemilpevectomy":
                    valuePie = getPie22222(fuerza);
                    valueRodilla = getRodilla22222(movilidad);
                    valueEncaje = getEncaje22222(sensibilidad);
                    valueSujecion = getSujecion22222(equilibrio);
                    kIndex.setText("2");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);
                    break;
                default:
                    Toast.makeText(this, "Ninguno", Toast.LENGTH_SHORT).show(); break;
            }

        }
        else if(value >= 23 && value <= 28) {
            //Toast.makeText(this, "K3", Toast.LENGTH_SHORT).show();
            switch (tipo) {
                case "Transtibial":
                    //Toast.makeText(this, "opc3", Toast.LENGTH_SHORT).show();
                    valuePie = getPie3(fuerza);
                    valueRodilla = getRodilla3(movilidad);
                    valueEncaje = getEncaje3(sensibilidad);
                    valueSujecion = getSujecion3(equilibrio);
                    kIndex.setText("3");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);
                    break;
                case "Disarticulated knee":
                    valuePie = getPie33(fuerza);
                    valueRodilla = getRodilla33(movilidad);
                    valueEncaje = getEncaje33(sensibilidad);
                    valueSujecion = getSujecion33(equilibrio);
                    kIndex.setText("3");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);
                    break;
                case "Transfemoral":
                    valuePie = getPie333(fuerza);
                    valueRodilla = getRodilla333(movilidad);
                    valueEncaje = getEncaje333(sensibilidad);
                    valueSujecion = getSujecion333(equilibrio);
                    kIndex.setText("3");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);
                    break;
                case "Disarticulated hip":
                    valuePie = getPie3333(fuerza);
                    valueRodilla = getRodilla3333(movilidad);
                    valueEncaje = getEncaje3333(sensibilidad);
                    valueSujecion = getSujecion3333(equilibrio);
                    kIndex.setText("3");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);
                    break;
                case "Hemilpevectomy":
                    valuePie = getPie33333(fuerza);
                    valueRodilla = getRodilla33333(movilidad);
                    valueEncaje = getEncaje33333(sensibilidad);
                    valueSujecion = getSujecion33333(equilibrio);
                    kIndex.setText("3");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);
                    break;
                default:
                    Toast.makeText(this, "Ninguno", Toast.LENGTH_SHORT).show(); break;
            }

        }
        else if(value >= 29 && value <= 40) {
            //Toast.makeText(this, "K4", Toast.LENGTH_SHORT).show();
            switch (tipo) {
                case "Transtibial":
                    //Toast.makeText(this, "opc4", Toast.LENGTH_SHORT).show();
                    valuePie = getPie4(fuerza);
                    valueRodilla = getRodilla4(movilidad);
                    valueEncaje = getEncaje4(sensibilidad);
                    valueSujecion = getSujecion4(equilibrio);
                    kIndex.setText("4");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);
                break;
                case "Disarticulated knee":
                    valuePie = getPie44(fuerza);
                    valueRodilla = getRodilla44(movilidad);
                    valueEncaje = getEncaje44(sensibilidad);
                    valueSujecion = getSujecion44(equilibrio);
                    kIndex.setText("4");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);
                break;
                case "Transfemoral":
                    valuePie = getPie444(fuerza);
                    valueRodilla = getRodilla444(movilidad);
                    valueEncaje = getEncaje444(sensibilidad);
                    valueSujecion = getSujecion444(equilibrio);
                    kIndex.setText("4");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);
                break;
                case "Disarticulated hip":
                    valuePie = getPie4444(fuerza);
                    valueRodilla = getRodilla4444(movilidad);
                    valueEncaje = getEncaje4444(sensibilidad);
                    valueSujecion = getSujecion4444(equilibrio);
                    kIndex.setText("4");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);
                break;
                case "Hemipelvectomy":
                    valuePie = getPie44444(fuerza);
                    valueRodilla = getRodilla44444(movilidad);
                    valueEncaje = getEncaje44444(sensibilidad);
                    valueSujecion = getSujecion44444(equilibrio);
                    kIndex.setText("4");
                    kFoot.setText(valuePie);
                    kKnee.setText(valueRodilla);
                    kLace.setText(valueEncaje);
                    kSubjection.setText(valueSujecion);
                break;
                default:
                    Toast.makeText(this, "Ninguno", Toast.LENGTH_SHORT).show(); break;
            }

        }
        else{
            //Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }

    }
    // K1
    private String getSujecion1(int equilibrio) {
        String result = "N.A";

        if(equilibrio >=1 && equilibrio <3){
            result = "Neoprene";
        }
        return result;
    }

    private String getEncaje1(int sensibilidad) {

        return "HST lace";
    }

    private String getRodilla1(int movilidad) {

        return "N.A";
    }

    private String getPie1(int fuerza) {

        String result = "N.A";
        if(fuerza >=1 && fuerza< 3) {
            result = "SACH foot";
        }
        return result;
    }
    // K1 RODILLA
    private String getSujecion11(int equilibrio) {
        return "Pin / Shuttle";
    }

    private String getEncaje11(int sensibilidad) {
        return "Quadrangular lace without ischial support. Narrow at supracondylar level";
    }

    private String getRodilla11(int movilidad) {

        String result;
        if(movilidad >=1 && movilidad< 3) {
            result = "Polycentric";
        }
        else result = "N.A";
        return result;
    }

    private String getPie11(int fuerza) {

        String result;
        if(fuerza >=1 && fuerza< 3) {
            result = "SACH foot";
        }
        else result = "N.A";
        return result;
    }
    // K1 TRANSFEMORAL
    private String getSujecion111(int equilibrio) {

        String result;
        if(equilibrio >=1 && equilibrio< 3) {
            result = "Bi-directional valve and pin";
        }
        else result = "N.A";
        return result;
    }

    private String getEncaje111(int sensibilidad) {
        String result;
        if(sensibilidad >=1 && sensibilidad< 3) {
            result = "Quadrangular lace. Soft interface (Liner)";
        }
        else result = "N.A";
        return result;
    }

    private String getRodilla111(int movilidad) {

        String result;
        if(movilidad >=1 && movilidad< 3) {
            result = "Polycentric with load brake";
        }
        else result = "N.A";
        return result;
    }

    private String getPie111(int fuerza) {

        String result;
        if(fuerza >=1 && fuerza< 3) {
            result = "SACH foot";
        }
        else result = "N.A";
        return result;
    }
    // K1 CADERA
    private String getSujecion1111(int equilibrio) {
        String result = "N.A";

        if(equilibrio >=1 && equilibrio< 3) {
            result = "Belt systems";
        }
        return result;
    }

    private String getEncaje1111(int sensibilidad) {

        String result = "N.A";

        if(sensibilidad >=1 && sensibilidad< 3) {
            result = "UCLA anatomical prosthesis";
        }
        return result;
    }

    private String getRodilla1111(int movilidad) {

        String result = "N.A";

        if(movilidad >=1 && movilidad< 3) {
            result = "Manual release knee";
        }
        return result;
    }

    private String getPie1111(int fuerza) {

        String result = "N.A";

        if(fuerza >=1 && fuerza< 3) {
            result = "SACH foot";
        }
        return result;
    }
    // K1 HEMIPELVECTOMIA
    private String getSujecion11111(int equilibrio) {
        String result = "N.A";

        if(equilibrio >=1 && equilibrio< 3) {
            result = "Belt systems";
        }
        return result;
    }

    private String getEncaje11111(int sensibilidad) {

        return "Lace abdominal cavity cover";
    }

    private String getRodilla11111(int movilidad) {

        String result = "N.A";

        if(movilidad >=1 && movilidad< 3) {
            result = "Single-center free with brake";
        }
        return result;
    }

    private String getPie11111(int fuerza) {

        String result = "N.A";

        if(fuerza >=1 && fuerza< 3) {
            result = "SACH foot";
        }
        return result;
    }

    // K2
    private String getSujecion2(int equilibrio) {
        String result = "N.A";

        if(equilibrio >=1 && equilibrio <5){
            result = "Neoprene";
        }
        return result;
    }

    private String getEncaje2(int sensibilidad) {

        return "HST lace";
    }

    private String getRodilla2(int movilidad) {

        return "N.A";
    }

    private String getPie2(int fuerza) {

        String result = "N.A";

        if(fuerza >=1 && fuerza< 3) {
            result = "SACH foot";
        }
        else if(fuerza >=3 && fuerza< 5) {
            result = "Uniaxial foot";
        }
        return result;
    }
    //K2 RODILLA DESARTICULACION
    private String getSujecion22(int equilibrio) {
        return "Pin / Shuttle";
    }

    private String getEncaje22(int sensibilidad) {

        return "Quadrangular lace without ischial support. Narrow at supracondylar level";
    }

    private String getRodilla22(int movilidad) {

        String result = "N.A";

        if(movilidad >=1 && movilidad< 5) {
            result = "Polycentric";
        }
        return result;
    }

    private String getPie22(int fuerza) {

        String result = "N.A";

        if(fuerza >=1 && fuerza< 3) {
            result = "SACH foot";
        }
        else if(fuerza >=3 && fuerza< 5) {
            result = "Uniaxial foot";
        }
        else if(fuerza >=5 && fuerza< 7) {
            result = "Multiaxial";
        }
        return result;
    }
    // K2 TRANSFEMORAL
    private String getSujecion222(int equilibrio) {
        String result = "N.A";

        if(equilibrio >=1 && equilibrio< 5) {
            result = "Bi-directional valve and pin";
        }
        return result;
    }

    private String getEncaje222(int sensibilidad) {

        String result = "N.A";

        if(sensibilidad >=1 && sensibilidad< 3) {
            result = "Quadrangular lace. Soft interface (Liner)";
        }
        else if(sensibilidad >=3 && sensibilidad< 5) {
            result = "CAT-CAM ischial restraint socket. Soft interface (Liner)";
        }
        return result;
    }

    private String getRodilla222(int movilidad) {

        String result = "N.A";
        if(movilidad >=1 && movilidad< 5) {
            result = "Polycentric with load brake";
        }
        return result;
    }

    private String getPie222(int fuerza) {

        String result = "N.A";

        if(fuerza >=1 && fuerza< 3) {
            result = "SACH foot";
        }
        else if(fuerza >=3 && fuerza< 5) {
            result = "Uniaxial foot";
        }
        return result;
    }
    // K2 CADERA
    private String getSujecion2222(int equilibrio) {
        String result = "N.A";

        if(equilibrio >=1 && equilibrio< 5) {
            result = "Belt systems";
        }
        return result;
    }

    private String getEncaje2222(int sensibilidad) {

        String result = "N.A";

        if(sensibilidad >=1 && sensibilidad< 5) {
            result = "UCLA anatomical prosthesis";
        }
        return result;
    }

    private String getRodilla2222(int movilidad) {

        String result = "N.A";

        if(movilidad >=1 && movilidad< 3) {
            result = "Manual release knee";
        }
        else if(movilidad >=3 && movilidad< 5) {
            result = "Polycentric with load brake";
        }
        return result;
    }

    private String getPie2222(int fuerza) {

        String result = "N.A";

        if(fuerza >=1 && fuerza< 5) {
            result = "SACH foot";
        }
        return result;
    }
    // K2 HEMIPLEVECTOMIA
    private String getSujecion22222(int equilibrio) {
        String result = "N.A";

        if(equilibrio >=1 && equilibrio< 5) {
            result = "Belt systems";
        }
        return result;
    }

    private String getEncaje22222(int sensibilidad) {

        return "Lace abdominal cavity cover";
    }

    private String getRodilla22222(int movilidad) {

        String result = "N.A";

        if(movilidad >=1 && movilidad< 5) {
            result = "Single-center free with brake";
        }
        return result;
    }

    private String getPie22222(int fuerza) {

        String result = "N.A";

        if(fuerza >=1 && fuerza< 5) {
            result = "SACH foot";
        }
        return result;
    }
    //K3
    private String getSujecion3(int equilibrio) {
        return "Neoprene";
    }

    private String getEncaje3(int sensibilidad) {

        return "HST lace";
    }

    private String getRodilla3(int movilidad) {

        return "N.A";
    }

    private String getPie3(int fuerza) {

        String result = "N.A";

        if(fuerza >=3 && fuerza< 5) {
            result = "Uniaxial foot";
        }
        else if(fuerza >=5 && fuerza< 7) {
            result = "Multiaxial";
        }
        return result;
    }
    // K3 DESARTICULACION RODILLA
    private String getSujecion33(int equilibrio) {
        return "Pin / Shuttle";
    }

    private String getEncaje33(int sensibilidad) {

        return "Quadrangular lace without ischial support. Narrow at supracondylar level";
    }

    private String getRodilla33(int movilidad) {
        String result = "N.A";
        if (movilidad >= 3 && movilidad < 7) {
            result = "Polycentric";
        }
        return result;
    }

    private String getPie33(int fuerza) {
        String result = "N.A";
        if (fuerza >= 3 && fuerza < 5) {
            result = "Uniaxial foot";
        } else if (fuerza >= 5 && fuerza < 7) {
            result = "Multiaxial";
        }
        return result;
    }
    // K3 TRANSFEMORAL
    private String getSujecion333(int equilibrio) {
        String result = "N.A";

        if(equilibrio >=1 && equilibrio< 5) {
            result = "Bi-directional valve and pin";
        }
        return result;
    }

    private String getEncaje333(int sensibilidad) {

        String result = "N.A";

        if(sensibilidad >=3 && sensibilidad < 5) {
            result = "CAT-CAM ischial restraint socket. Soft interface (Liner)";
        }
        else if(sensibilidad >=5 && sensibilidad< 7) {
            result = "Soft ISNY.Intersafe Flexible Lace (Liner)";
        }
        return result;
    }

    private String getRodilla333(int movilidad) {

        String result = "N.A";

        if(movilidad >=3 && movilidad< 5) {
            result = "Polycentric with load brake";
        }
        else if(movilidad >=5 && movilidad< 7) {
            result = "4-axis pneumatic polycentric knee";
        }
        return result;
    }

    private String getPie333(int fuerza) {

        String result = "N.A";

        if(fuerza >=3 && fuerza< 5) {
            result = "Uniaxial foot";
        }
        else if(fuerza >=5 && fuerza< 7) {
            result = "Multiaxial";
        }
        return result;
    }
    // K3 CADERA
    private String getSujecion3333(int equilibrio) {
        String result = "N.A";

        if(equilibrio >=3 && equilibrio< 7) {
            result = "Belt systems";
        }
        return result;
    }

    private String getEncaje3333(int sensibilidad) {

        String result = "N.A";

        if(sensibilidad >=3 && sensibilidad< 7) {
            result = "UCLA anatomical prosthesis";
        }
        return result;
    }

    private String getRodilla3333(int movilidad) {

        String result = "N.A";

        if(movilidad >=3 && movilidad< 5) {
            result = "Polycentric with load brake";
        }
        else if(movilidad >=5 && movilidad < 7) {
            result = "4-axis pneumatic polycentric knee";
        }
        return result;
    }

    private String getPie3333(int fuerza) {

        String result = "N.A";

        if(fuerza >=3 && fuerza< 7) {
            result = "SACH foot";
        }
        return result;
    }
    // K3 HEMIPLEVECTOMIA
    private String getSujecion33333(int equilibrio) {
        String result = "N.A";

        if(equilibrio >=3 && equilibrio < 7) {
            result = "Belt systems";
        }
        return result;
    }

    private String getEncaje33333(int sensibilidad) {

        return "Lace abdominal cavity cover";
    }

    private String getRodilla33333(int movilidad) {

        String result = "N.A";

        if(movilidad >=3 && movilidad < 5) {
            result = "Single-center free with brake";
        }
        else if(movilidad >=5 && movilidad < 7) {
            result = "Monocentric with load brake";
        }
        return result;
    }

    private String getPie33333(int fuerza) {

        String result = "N.A";

        if(fuerza >=3 && fuerza< 7) {
            result = "SACH foot";
        }
        return result;
    }
    // K4
    private String getSujecion4(int equilibrio) {
        return "Neoprene";
    }

    private String getEncaje4(int sensibilidad) {

        return "HST lace";
    }

    private String getRodilla4(int movilidad) {

        return "N.A";
    }

    private String getPie4(int fuerza) {

        if(fuerza >=5 && fuerza< 7) {
            return "Multiaxial";
        }
        else if(fuerza >=7 && fuerza< 10) {
            return  "Absorption";
        }
        else {
            return "N.A";
        }

    }
    // K4 DESARTICULACION RODILLA
    private String getSujecion44(int equilibrio) {
        return "Pin / Shuttle";
    }

    private String getEncaje44(int sensibilidad) {

        return "Quadrangular lace without ischial support. Narrow at supracondylar level";
    }

    private String getRodilla44(int movilidad) {

        String result = "N.A";
        if (movilidad >= 5 && movilidad < 10) {
            result = "Polycentric";
        }
        return result;
    }

    private String getPie44(int fuerza) {

        String result = "N.A";
        if (fuerza >= 5 && fuerza < 7) {
            result = "Multiaxial";
        }
        else if (fuerza >= 7 && fuerza < 10) {
            result = "Absorption";
        }
        return result;
    }
    // K4 TRANSFEMORAL
    private String getSujecion444(int equilibrio) {
        String result = "N.A";

        if(equilibrio >=5 && equilibrio< 10) {
            result = "Bi-directional valve and pin";
        }
        return result;
    }

    private String getEncaje444(int sensibilidad) {

        String result = "N.A";

        if(sensibilidad >=5 && sensibilidad< 10) {
            result = "Soft ISNY.Intersae Flexible Lace (Liner)";
        }
        return result;
    }

    private String getRodilla444(int movilidad) {

        String result = "N.A";

        if(movilidad >=5 && movilidad < 10) {
            result = "4-axis pneumatic polycentric knee";
        }
        return result;
    }

    private String getPie444(int fuerza) {

        String result = "N.A";

        if(fuerza >=5 && fuerza< 7) {
            result = "Multiaxial";
        }
        else if(fuerza >=7 && fuerza< 10) {
            result = "Energy absorption or storage";
        }
        return result;
    }
    // K4 CADERA
    private String getSujecion4444(int equilibrio) {
        String result = "N.A";

        if(equilibrio >=5 && equilibrio< 10) {
            result = "Belt systems";
        }
        return result;
    }

    private String getEncaje4444(int sensibilidad) {

        String result = "N.A";

        if(sensibilidad >=5 && sensibilidad < 10) {
            result = "UCLA anatomical prosthesis";
        }
        return result;
    }

    private String getRodilla4444(int movilidad) {

        String result = "N.A";

        if(movilidad >=5 && movilidad< 10) {
            result = "4-axis pneumatic polycentric knee";
        }
        return result;
    }

    private String getPie4444(int fuerza) {

        String result = "N.A";

        if(fuerza >=5 && fuerza< 10) {
            result = "SACH foot";
        }
        return result;
    }
    // K4 HEMIPELVECTOMIA
    private String getSujecion44444(int equilibrio) {
        String result = "N.A";

        if(equilibrio >=5 && equilibrio< 10) {
            result = "Belt systems";
        }
        return result;
    }

    private String getEncaje44444(int sensibilidad) {

        return "Lace abdominal cavity cover";
    }

    private String getRodilla44444(int movilidad) {

        String result = "N.A";

        if(movilidad >=5 && movilidad< 10) {
            result = "Monocentric with load brake";
        }
        return result;
    }

    private String getPie44444(int fuerza) {

        String result = "N.A";

        if(fuerza >=5 && fuerza< 10) {
            result = "SACH foot";
        }
        return result;
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
        tvType.setText( String.valueOf(type) );
        // patiente
        tvName.setText(name);
        tvAge.setText(age);
        tvID.setText(id);
        tvWeight.setText(weight);

    }

    private void setViewLayout() {

        etDoctorName = (TextView) findViewById(R.id.tvDName);
        etDoctorID = (TextView) findViewById(R.id.tvDID);
        etDoctorEmail = (TextView) findViewById(R.id.tvDEmail);
        etDoctorOcu = (TextView) findViewById(R.id.tvDOccupation);
        // table items
        kIndex = (TextView) findViewById(R.id.kIndex);
        kFoot = (TextView) findViewById(R.id.kFoot);
        kKnee = (TextView) findViewById(R.id.kKnee);
        kLace = (TextView) findViewById(R.id.kLace);
        kSubjection = (TextView) findViewById(R.id.kSubjection);
        tvMaterial = (TextView) findViewById(R.id.tvMaterial);
        tvcurrentTime = (TextView) findViewById(R.id.tvCurrentTime);
        tvType = (TextView) findViewById(R.id.tvType);
        // patiente
        tvName = (TextView) findViewById(R.id.tvName);
        tvID = (TextView) findViewById(R.id.tvID);
        tvAge = (TextView) findViewById(R.id.tvAge);
        tvWeight = (TextView) findViewById(R.id.tvWeight);

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
        type = getIntent().getStringExtra("AMPUTATION");
        name = getIntent().getStringExtra("NAME");
        id = getIntent().getStringExtra("ID");
        age = getIntent().getStringExtra("AGE");
        weight = getIntent().getStringExtra("WEIGHT");
        getIntent().getStringExtra("ADDRESS");
        getIntent().getStringExtra("HEALTH");
        fuerza = Integer.parseInt( getIntent().getStringExtra("C1") );
        movilidad = Integer.parseInt( getIntent().getStringExtra("C2") );
        sensibilidad = Integer.parseInt( getIntent().getStringExtra("C3") );
        equilibrio = Integer.parseInt( getIntent().getStringExtra("C4") );
        //Toast.makeText(this, "tipo"+type, Toast.LENGTH_SHORT).show();
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
    private void parametrosR(String value){



    }


}