package com.webconsultng.ekom2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    ArrayList<Model> modela;
    Context context;

    public RecyclerAdapter(ArrayList<Model> modela, Context context) {
        this.modela = modela;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.childrecyclerlayout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        int profilePix = modela.get(position).getProfilePix();
        String txt1 = modela.get(position).getTxt1();
        String txt2 = modela.get(position).getTxt2();
        String txtTime = modela.get(position).getTxtTime();

        holder.bindData(profilePix, txt1, txt2, txtTime);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            Integer txt = holder.getAdapterPosition();
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Item"+String.valueOf(txt+1)+" has been clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, MainActivity2.class);
                context.startActivity(intent.putExtra("clickedItem", txt));
            }
        });

    }

    @Override
    public int getItemCount() {
        return modela.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ppix ;
        TextView txxt1, txxt2, txxtTime;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ppix = itemView.findViewById(R.id.profilePix);
            txxt1 = itemView.findViewById(R.id.txt1);
            txxt2 = itemView.findViewById(R.id.txt2);
            txxtTime = itemView.findViewById(R.id.txtTime);
        }

        public void bindData(int profilePix, String txt1, String txt2, String txtTime) {
            ppix.setImageResource(profilePix);
            txxt1.setText(txt1);
            txxt2.setText(txt2);
            txxtTime.setText(txtTime);
        }
    }
}
