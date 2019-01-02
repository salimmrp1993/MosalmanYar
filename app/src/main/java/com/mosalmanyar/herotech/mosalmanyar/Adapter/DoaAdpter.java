package com.mosalmanyar.herotech.mosalmanyar.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mosalmanyar.herotech.mosalmanyar.Models.Doas;
import com.mosalmanyar.herotech.mosalmanyar.R;

import java.util.List;

public class DoaAdpter extends RecyclerView.Adapter<DoaAdpter.DoaViewHolder>
{
    List<Doas> doas;

    public DoaAdpter(List<Doas> doas) {

        this.doas = doas;
    }

    @NonNull
    @Override
    public DoaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.doa_list_row,viewGroup,false);
        return new DoaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DoaViewHolder doaViewHolder, int i) {
        Doas doa = doas.get(i);
        doaViewHolder.tv_title.setText(doa.getTitle());
        doaViewHolder.tvnum.setText(doa.getNum());
    }

    @Override
    public int getItemCount() {
        return doas.size();
    }

    public class DoaViewHolder extends RecyclerView.ViewHolder{

     public    TextView tv_title;
     public    TextView tvnum;

        public DoaViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.txt_title);
            tvnum = itemView.findViewById(R.id.textView_num);
        }
    }
}
