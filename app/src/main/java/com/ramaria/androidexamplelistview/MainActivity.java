package com.ramaria.androidexamplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaLocais;
    private String[] itens = {"Angra dos Reis", "Caldas Novas", "Capitólio", "São Thomé das Letras", "Domingos Martins", "Vila Velha",
                                "Rio de Janeiro", "Salvador", "Curitiba", "Manaus", "Natal", "Belo Horizonte"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main);

        listaLocais = findViewById(R.id.listaLocais);

        //adapter necessário para exibir dados
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(), android.R.layout.simple_list_item_1,
                android.R.id.text1, itens
        );

        listaLocais.setAdapter(adapter);
        listaLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String valorSelect = listaLocais.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(),valorSelect, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
