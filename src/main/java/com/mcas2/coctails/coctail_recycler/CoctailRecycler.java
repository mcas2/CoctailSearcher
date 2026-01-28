package com.mcas2.coctails.coctail_recycler;

import android.content.Context;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.mcas2.coctails.Drinks;
import com.mcas2.coctails.R;

import java.util.ArrayList;

public class CoctailRecycler extends RecyclerView.Adapter<CoctailRecycler.CoctailViewHolder> {
    Context context;
    ArrayList<CoctailModel> coctailModels;
    public CoctailRecycler(Context context, ArrayList<CoctailModel> coctailModels) {
        this.context=context;
        this.coctailModels=coctailModels;
    }

    @NonNull
    @Override
    public CoctailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.tarjeta, parent, false);
        return new CoctailRecycler.CoctailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoctailViewHolder holder, int position) {
        holder.coctailName.setText(coctailModels.get(position).getCoctailName());
        String url = coctailModels.get(position).getCoctailImageUrl();
        Glide.with(context)
                .load(url)
                .centerCrop()
                .placeholder(R.drawable.beber)
                .into(holder.coctailImage);
    }

    @Override
    public int getItemCount() {
        return coctailModels.size();
    }

    public static class CoctailViewHolder extends RecyclerView.ViewHolder {
        TextView coctailName;
        ImageView coctailImage;

        public CoctailViewHolder(@NonNull View itemView) {
            super(itemView);
            coctailName = itemView.findViewById(R.id.textoTarjetaCoctail);
            coctailImage = itemView.findViewById(R.id.imagenTarjetaCoctail);
        }
    }
}
