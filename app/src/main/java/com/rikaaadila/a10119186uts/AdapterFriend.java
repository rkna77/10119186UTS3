package com.rikaaadila.a10119186uts;
//<!--Tanggal Pengerjaan : 20/5/2022 NIM : 10119186 Nama : Rika Nur'adila Kelas: IF-5-->
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rikaaadila.a10119186uts.R;

import java.util.ArrayList;


public class AdapterFriend extends RecyclerView.Adapter<AdapterFriend.myviewholder> {

    ArrayList<FriendModel> FriendModel;

    public AdapterFriend(ArrayList<FriendModel> friendlistModel) {
        this.FriendModel = friendlistModel;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.friend_item, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.Friendlist.setImageResource(FriendModel.get(position).getImage());
        holder.textviewJudul.setText(FriendModel.get(position).getNama());
    }

    @Override
    public int getItemCount() {
        return FriendModel.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView Friendlist;
        TextView textviewJudul;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            Friendlist = itemView.findViewById(R.id.img_thumbnail);
            textviewJudul = itemView.findViewById(R.id.sub_head);
        }
    }
}
