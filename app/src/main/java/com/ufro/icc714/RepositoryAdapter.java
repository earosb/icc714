package com.ufro.icc714;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RepositoryAdapter extends RecyclerView.Adapter<RepositoryAdapter.RepositoryViewHolder> {

    // TODO (1) Crea un layout en res/layout/ llamado repository_list_item.xml

    // haz los pasos 2 al 11 en repository_list_item.xml
    // TODO (2) Haz el layout raíz un FrameLayout
    // TODO (3) El ancho match_parent y el alto wrap_content
    // TODO (4) Asigna un padding de 16dp
    // TODO (5) Crea un TextView como el único hijo de FrameLayout
    // TODO (6) El TextView debe tener un ID "@+id/tv_item_number"
    // TODO (7) El ancho y alto deben ser wrap_content
    // TODO (8) Alinea el TextView al inicio del padre
    // TODO (9) Centra el TexView verticalmente en el layout
    // TODO (10) Cambia el font family a monospace
    // TODO (11) Asigna un tamaño de texto a 42sp

    private static final String TAG = RepositoryAdapter.class.getSimpleName();

    private int mNumberItems;

    public RepositoryAdapter(int mNumberItems) {
        this.mNumberItems = mNumberItems;
    }

    @Override
    public RepositoryViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.number_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        RepositoryViewHolder viewHolder = new RepositoryViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RepositoryViewHolder holder, int position) {
        Log.d(TAG, "#" + position);
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }

    // TODO (12) Crea una clase llamada RepositoryViewHolder que herede de RecyclerView.ViewHolder

    // TODO (13) En RepositoryViewHolder, Crear una variable de tipo TextView llamado listItemNumberView

    // TODO (14) Crea un constructor para RepositoryViewHolder que acepte un parámetro de tipo View llamado itemView
    // TODO (15) En el constructor llama a super(itemView) y encuentra a listItemNumberView por su ID usando itemView (itemView.find...)

    // TODO (16) En la clase RepositoryViewHolder, crea un método void llamado bind que acepte un parámetro de tipo entero llamado listIndex
    // TODO (17) En bind, asigna el texto de listItemNumberView igual a listIndex
    // TODO (18) Ten ciudado al asignar un entero usando setText, debes usar la representación en texto del valor de listIndex
}
