package com.poc.jponnuve.happypath;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import android.view.LayoutInflater;

import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by MTAMILM1 on 6/7/2017.
 */

public class HappyAdapter extends RecyclerView.Adapter<HappyAdapter.MyViewHolder>{
    private Context mContext;
    private String[] albumList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;
        CardView card;


        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            card= (CardView) view.findViewById(R.id.card_view);


        }
    }


    public HappyAdapter(Context mContext, String[] albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.album_card, parent, false);

        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.title.setText(albumList[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailViewActivity(position);
                holder.title.setText("changed");
            }
        });

    }

    private void DetailViewActivity(int pos) {
        Intent detail= new Intent(this.mContext,DetailViewActivity.class);
        detail.putExtra("position",pos+1);
        this.mContext.startActivity(detail);
    }

    @Override
    public int getItemCount() {
        return albumList.length;
    }
}
