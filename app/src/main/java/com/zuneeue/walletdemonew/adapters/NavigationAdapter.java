package com.zuneeue.walletdemonew.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zuneeue.walletdemonew.R;
import com.zuneeue.walletdemonew.models.NavDrawerItem;

import java.util.Collections;
import java.util.List;


/**
 * Created by anupamsarfare on 9/29/15.
 */
public class NavigationAdapter extends RecyclerView.Adapter<NavigationAdapter.MyViewHolder> {

    LayoutInflater inflater;
    Context context;
    List<NavDrawerItem> data = Collections.emptyList();


    public NavigationAdapter(Context context, List<NavDrawerItem> data){
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data = data;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view = inflater.inflate(R.layout.custom_navigation_row,viewGroup,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int i) {

        NavDrawerItem current = data.get(i);
        viewHolder.title.setText(current.getTitle());

    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView title;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
       }

    }

}
