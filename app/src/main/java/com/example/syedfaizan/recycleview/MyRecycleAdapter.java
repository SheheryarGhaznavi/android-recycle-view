package com.example.syedfaizan.recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Syed Faizan on 8/16/2016.
 */
public class MyRecycleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public String myDataSet[];
    public String designations[];
    public String code[];
    public TextView title;
    public TextView des;
    public TextView cod;
    public MyRecycleAdapter(String MyDataSet[], String Designations[],String[] comapnyCode) {
        this.myDataSet = MyDataSet;
        this.designations = Designations;
        this.code = comapnyCode;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        RecyclerView.ViewHolder vh = new MyViewHolder(view);
        return (RecyclerView.ViewHolder) vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        title.setText(myDataSet[position]);
        des.setText( designations[position] );
        cod.setText( code[position] );

    }

    @Override
    public int getItemCount() {
        return myDataSet.length;

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.info_text);
            des = (TextView) itemView.findViewById( R.id.des );
            cod = (TextView) itemView.findViewById( R.id.code );
        }
    }
}