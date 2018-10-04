package com.ufro.icc714;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

// TODO (8) Implementa RepositoryAdapter.ListItemClickListener en la clase MainActivity
public class MainActivity extends AppCompatActivity {

    private static final int NUM_LIST_ITEMS = 100;

    /*
     * References to RecyclerView and Adapter to reset the list to its
     * "pretty" state when the reset menu item is clicked.
     */
    private RepositoryAdapter mAdapter;
    private RecyclerView mNumbersList;

    // TODO (9) Crea una variable de tipo Toast llamada mToast para guardar el Toast actual

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencia de RecyclerView desde xml
        mNumbersList = (RecyclerView) findViewById(R.id.rv_numbers);

        // LinearLayoutManager es el responsable de posicionar los items dentro del
        // RecyclerView en una lista
        // Existen otros LayoutManagers para desplegar datos en grillas, listas horizontales, etc
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mNumbersList.setLayoutManager(layoutManager);

        // Usa esta configuración para mejorar el rendimiento si sabes que los cambios en el
        // contenido no cambian el tamaño del diseño hijo en el RecyclerView
        mNumbersList.setHasFixedSize(true);

        // TODO (13) Pasa this como segundo parámetro al constructor de RepositoryAdapter
        /*
         * RepositoryAdapter es el responsable de mostrar cada elemento en la lista
         */
        mAdapter = new RepositoryAdapter(NUM_LIST_ITEMS);

        mNumbersList.setAdapter(mAdapter);
    }

    // TODO (10) Sobrescribe el método onListItemClick de ListItemClickListener
    // TODO (11) Al principio del método cancela el toast si es distinto de nulo
    // TODO (12) Muestra un toast cuando el item es cliqueado mostrado el número que fue cliqueado
}
