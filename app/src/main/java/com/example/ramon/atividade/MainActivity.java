package com.example.ramon.atividade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {
    int idade;
    String id;
    private Button button;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText2 = (EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button);

    }



    public void resul(View view) {
        id = editText2.getText().toString();
        idade = Integer.valueOf(id);
            if (idade > 0 || idade <= 12){
                Toast toast = makeText(getApplicationContext()," É uma Criança",Toast.LENGTH_SHORT);
                toast.show();
        }
            if (idade >= 13 || idade <= 18){
                Toast toast = makeText(getApplicationContext()," É um Adolescente",Toast.LENGTH_SHORT);
                toast.show();
            }

            if (idade > 18){
                Toast toast = makeText(getApplicationContext()," É um Adulto",Toast.LENGTH_SHORT);
                toast.show();
            }else{
                Toast toast = makeText(getApplicationContext()," Idade Invalida",Toast.LENGTH_SHORT);
                toast.show();
            }


    }
}
