package com.example.android.basicweather;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private LayoutInflater layout;
    private List<String> data;
    private ItemClickListener clickListener;

    RecyclerViewAdapter(Context context, List<String> data) {
        this.layout = LayoutInflater.from(context);
        this.data = data;
    }

    //inflate row from xml
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layout.inflate(R.layout.recyclerview_row, parent, false);
        return new ViewHolder(view);
    }

    //bind data to TextView for every row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String animal = data.get(position);
        holder.myTextView.setText(animal);
    }

    //total number of rows
    @Override
    public int getItemCount() {
        return data.size();
    }


    //stores/recycles views as scroll off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView myTextView;
        ViewHolder(View itemView) {
            super(itemView);
            myTextView = itemView.findViewById(R.id.tvAnimalName);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (clickListener != null) clickListener.onItemClick(view, getAdapterPosition());
        }
    }
    //convenience method to get data at click position
    String getItem(int id) {
        return data.get(id);
    }

    //allow click event to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }

    //parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}