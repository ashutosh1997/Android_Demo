package com.ashutosh.recyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ashutosh.recyclerview.R;
import com.ashutosh.recyclerview.model.Landscape;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{

    private static final String TAG = RecyclerAdapter.class.getSimpleName();
    private List<Landscape> mData;
    private LayoutInflater mInflater;

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        ImageView imgThumb,imgDelete,imgAdd;
        int position;
        Landscape current;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.tvTitle);
            imgThumb = (ImageView) itemView.findViewById(R.id.img_row);
            imgAdd = (ImageView) itemView.findViewById(R.id.img_row_add);
            imgDelete = (ImageView) itemView.findViewById(R.id.img_row_delete);
        }

        public void setData(Landscape current, int position) {

            this.title.setText(current.getTitle());
            this.imgThumb.setImageResource(current.getImageID());
            this.position=position;
            this.current=current;
        }
    }

    public RecyclerAdapter(Context context, List<Landscape> data)
    {
        this.mData=data;
        this.mInflater=LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Log.d(TAG, "onCreateViewHolder");
        View view = mInflater.inflate(R.layout.list_item,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Log.d(TAG, "onBindViewHolder "+position);
        Landscape currentObj = mData.get(position);
        holder.setData(currentObj,position);

    }


}
