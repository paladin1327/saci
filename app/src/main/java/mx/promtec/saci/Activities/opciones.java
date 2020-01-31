package mx.promtec.saci.Activities;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import mx.promtec.saci.R;

public class opciones extends AppCompatActivity {
    int posicion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menurestaurant);

        click_back();
        lista_estado();
    }
    public void lista_estado(){
        remove_back();

        LinearLayout list_task = findViewById(R.id.list_task);
        final Context context = list_task.getContext();

        //limpia el layout
        if(((LinearLayout) list_task).getChildCount() > 0)
            ((LinearLayout) list_task).removeAllViews();

        for (int i = 0; i < 10; i++) {

            final LinearLayout task = new LinearLayout(context);
            //Layout task
            task.setBackground(ContextCompat.getDrawable(context, R.drawable.task_corner));
            task.setOrientation(LinearLayout.HORIZONTAL);
            task.setId(i);

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, 130);
            layoutParams.setMargins(15, 25, 15, 0);
            task.setLayoutParams(layoutParams);

            //estado
            TextView estadox = new TextView(context);
            estadox.setText(String.format(Locale.US, "BAJA CALIFORNIA SUR", i));
            estadox.setTextSize(18);
            estadox.setTypeface(estadox.getTypeface(), Typeface.BOLD_ITALIC);
            estadox.setPadding(20, 20, 0, 0);
            task.addView(estadox);

            task.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String TAG = "task";
                    Log.i(TAG, "get item number "+v.getId());
                    String id = "get item number "+v.getId();
                    Toast.makeText(context, id, Toast.LENGTH_SHORT).show();
                    lista_municipio();
                }
            });

            list_task.addView(task);
        }

        //espacio estetica
        LinearLayout espacio = new LinearLayout(context);
        espacio.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 100);
        espacio.setLayoutParams(layoutParams4);
        list_task.addView(espacio);

    }
    public void lista_municipio(){

        posicion = 1;
        add_back();

        LinearLayout list_task = findViewById(R.id.list_task);
        final Context context = list_task.getContext();

        //limpia el layout
        if(((LinearLayout) list_task).getChildCount() > 0)
            ((LinearLayout) list_task).removeAllViews();

        for (int i = 0; i < 10; i++) {

            final LinearLayout task = new LinearLayout(context);
            //Layout task
            task.setBackground(ContextCompat.getDrawable(context, R.drawable.task_corner));
            task.setOrientation(LinearLayout.HORIZONTAL);
            task.setId(i);

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, 130);
            layoutParams.setMargins(15, 25, 15, 0);
            task.setLayoutParams(layoutParams);

            //estado
            TextView municipiox = new TextView(context);
            municipiox.setText(String.format(Locale.US, "MUNICIPIOS", i));
            municipiox.setTextSize(18);
            municipiox.setTypeface(municipiox.getTypeface(), Typeface.BOLD_ITALIC);
            municipiox.setPadding(20, 20, 0, 0);
            task.addView(municipiox);

            task.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String TAG = "task";
                    Log.i(TAG, "get item number "+v.getId());
                    String id = "get item number "+v.getId();
                    Toast.makeText(context, id, Toast.LENGTH_SHORT).show();
                    lista_tareas();
                }
            });

            list_task.addView(task);
        }

        //espacio estetica
        LinearLayout espacio = new LinearLayout(context);
        espacio.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 100);
        espacio.setLayoutParams(layoutParams4);
        list_task.addView(espacio);


    }
    public void lista_tareas(){
        posicion = 2;

        LinearLayout list_task = findViewById(R.id.list_task);
        final Context context = list_task.getContext();

        //limpia el layout
        if(((LinearLayout) list_task).getChildCount() > 0)
            ((LinearLayout) list_task).removeAllViews();


        for (int i = 0; i < 10; i++) {

            final LinearLayout task = new LinearLayout(context);

            //Layout task
            task.setBackground(ContextCompat.getDrawable(context, R.drawable.task_corner));
            task.setOrientation(LinearLayout.HORIZONTAL);
            task.setId(i);

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, 230);
            layoutParams.setMargins(15, 25, 15, 0);
            task.setLayoutParams(layoutParams);

            //icon
            ImageView icon = new ImageView(context);

            if (i % 2 == 0)
            {
//                icon.setBackground(ContextCompat.getDrawable(context, R.drawable.boton_verde_2));
                icon.setBackground(ContextCompat.getDrawable(context, R.drawable.spaghetti));
            }else{
//                icon.setBackground(ContextCompat.getDrawable(context, R.drawable.boton_azul_2));
                icon.setBackground(ContextCompat.getDrawable(context, R.drawable.pechuga));
            }
            if (i % 5 == 0)
            {
//                icon.setBackground(ContextCompat.getDrawable(context, R.drawable.boton_rojo2));
                icon.setBackground(ContextCompat.getDrawable(context, R.drawable.polloasado));
            }
            LinearLayout.LayoutParams icon_param = new LinearLayout.LayoutParams(170, 170);
            icon_param.setMargins(0, 60, 0, 0);
            icon.setLayoutParams(icon_param);
            task.addView(icon);

            //textos
            LinearLayout task_texts = new LinearLayout(context);
            task_texts.setOrientation(LinearLayout.VERTICAL);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            task_texts.setLayoutParams(layoutParams3);

            //folio
            TextView foliot = new TextView(context);
            foliot.setText(String.format(Locale.US, "Folio conavi:", i));
            foliot.setTextSize(12);
            foliot.setPadding(0, 5, 0, 0);
            task_texts.addView(foliot);

            //folio
            TextView folion = new TextView(context);
            folion.setText(String.format(Locale.US, "070170001U2810100200043605", i));
            folion.setTextSize(14);
            folion.setTypeface(folion.getTypeface(), Typeface.BOLD_ITALIC);
            folion.setPadding(0, 5, 0, 0);
            task_texts.addView(folion);

            //estado
            TextView estado = new TextView(context);
            estado.setText(String.format(Locale.US, "BAJA CALIFORNIA SUR", i));
            estado.setTextSize(12);
            estado.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_END);
            estado.setPadding(0, 0, 20, 0);
            task_texts.addView(estado);

            LinearLayout task_texts2 = new LinearLayout(context);
            task_texts2.setOrientation(LinearLayout.HORIZONTAL);

            //visita
            TextView visita = new TextView(context);
            visita.setText(String.format(Locale.US, "Visita 1", i));
            visita.setTextSize(12);
            visita.setPadding(0, 0, 0, 0);
            task_texts2.addView(visita);

            //municipio
            TextView municipio = new TextView(context);
            municipio.setText(String.format(Locale.US, "TLAXCALA PERRO CHICO", i));
            municipio.setTextSize(12);
            municipio.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_END);
            municipio.setPadding(0, 0, 20, 0);

            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            municipio.setLayoutParams(layoutParams6);

            task_texts2.addView(municipio);

            task_texts.addView(task_texts2);


            //otro
            TextView otro = new TextView(context);
            otro.setText(String.format(Locale.US, "", i));
            municipio.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_END);
            otro.setTextSize(12);
            otro.setPadding(0, 0, 0, 0);
            task_texts.addView(otro);

            task.addView(task_texts);


            // Implement it's on click listener.
            task.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Show a toast message.

                    String TAG = "task";
                    Log.i(TAG, "get item number "+v.getId());
                    String id = "get item number "+v.getId();
                    Toast.makeText(context, id, Toast.LENGTH_SHORT).show();
                }
            });

            list_task.addView(task);

        }
        //espacio estetica
        LinearLayout espacio = new LinearLayout(context);
        espacio.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 100);
        espacio.setLayoutParams(layoutParams4);
        list_task.addView(espacio);

    }
    public void click_back(){
        ConstraintSet set = new ConstraintSet();
        ConstraintLayout layout;
        ImageView btn_back = findViewById(R.id.imageView2);
        layout = (ConstraintLayout) findViewById(R.id.bodymain);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(posicion == 1) {
                    lista_estado();
                }
                if(posicion == 2) {
                    lista_municipio();
                }
            }
        });
    }
    public void add_back(){
        ConstraintSet set = new ConstraintSet();
        ConstraintLayout layout;
        ImageView btn_back = findViewById(R.id.imageView2);
        btn_back.setVisibility(View.VISIBLE);
    }
    public void remove_back(){
        ConstraintSet set = new ConstraintSet();
        ConstraintLayout layout;
        ImageView btn_back = findViewById(R.id.imageView2);
        btn_back.setVisibility(View.INVISIBLE);
    }
}
