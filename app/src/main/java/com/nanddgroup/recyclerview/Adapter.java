package com.nanddgroup.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by Nikita on 22.02.2016.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private LayoutInflater influater;
    List<Information> data = Collections.emptyList();

    public Adapter(Context context, List<Information> data) {
        influater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = influater.inflate(R.layout.custom_row, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Information current = data.get(position);

        holder.tvTitle.setText(current.sTitle);
        holder.tvData.setText(current.sData);
        holder.tvName.setText(current.sName);
        holder.tvSurname.setText(current.sSurname);
        holder.tvEmail.setText(current.sEmail);
        holder.ivLogo.setImageResource(R.drawable.def_logo);
        Log.d("ITEM CREATED", "new item _ " + position );
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle;
        ImageView ivLogo;
        TextView tvName;
        TextView tvSurname;
        TextView tvEmail;
        TextView tvData;

        public MyViewHolder(View itemView) {
            super(itemView);
             tvTitle = (TextView) itemView.findViewById(R.id.title);
             ivLogo = (ImageView) itemView.findViewById(R.id.ivLogo);
             tvName = (TextView) itemView.findViewById(R.id.txtName);
             tvSurname = (TextView) itemView.findViewById(R.id.txtSurname);
             tvEmail = (TextView) itemView.findViewById(R.id.txtEmail);
             tvData = (TextView) itemView.findViewById(R.id.txtData);

        }
    }
}
