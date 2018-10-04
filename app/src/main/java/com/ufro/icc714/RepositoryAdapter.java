package com.ufro.icc714;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RepositoryAdapter extends RecyclerView.Adapter<RepositoryAdapter.RepositoryViewHolder> {

    private static final String TAG = RepositoryAdapter.class.getSimpleName();

    // TODO (3) Crea un objeto final privado de tipo ListItemClickListener llamado mOnClickListener

    private int mNumberItems;

    // TODO (1) Crea una interfaz anidada llamada ListItemClickListener
    // TODO (2) Dentro de la interfaz define un método llamado onListItemClick que reciba un entero como parámetro

    // TODO (4) Añade un objeto ListItemClickListener como parámetro al constructor y guardalo en mOnClickListener

    public RepositoryAdapter(int mNumberItems) {
        this.mNumberItems = mNumberItems;
    }

    @Override
    public RepositoryViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.repository_list_item;
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

    // TODO (5) Implementa la interfaz OnClickListener en la clase NumberViewHolder class
    /**
     *
     */
    public class RepositoryViewHolder extends RecyclerView.ViewHolder {

        TextView listItemNumberView;

        /**
         *
         * @param itemView
         */
        public RepositoryViewHolder(View itemView) {
            super(itemView);
            listItemNumberView = itemView.findViewById(R.id.tv_item_number);
            // TODO (7) LLama a setOnClickListener en itemView (usa 'this' como OnClickListener)
        }

        /**
         *
         * @param listIndex
         */
        public void bind(int listIndex) {
            listItemNumberView.setText(String.valueOf(listIndex));
        }

        // TODO (6) Sobreescribe el método onClick, pasando la posición del item cliqueado (getAdapterPosition()) a mOnClickListener a traves del método onListItemClick
    }
}
