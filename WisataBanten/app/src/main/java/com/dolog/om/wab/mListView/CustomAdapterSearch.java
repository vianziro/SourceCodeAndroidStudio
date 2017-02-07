package com.dolog.om.wab.mListView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.dolog.om.wab.R;
import com.dolog.om.wab.mData.SpaceCraft;
import com.dolog.om.wab.mDetail.DetailActivity;

import java.util.ArrayList;

/**
 * Created by Banne-PC on 31/12/2016.
 */

public class CustomAdapterSearch extends BaseAdapter {

    Context c;
    ArrayList<SpaceCraft>spaceCrafts;
    LayoutInflater inflater;

    public CustomAdapterSearch(Context c, ArrayList<SpaceCraft> spaceCrafts) {
        this.c = c;
        this.spaceCrafts = spaceCrafts;

        inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return spaceCrafts.size();
    }

    @Override
    public Object getItem(int position) {
        return spaceCrafts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.recycle_search,parent,false);
        }

        TextView nameTxt= (TextView) convertView.findViewById(R.id.nameTxt);
        TextView isiTxt= (TextView) convertView.findViewById(R.id.isiText);
        ImageView img= (ImageView) convertView.findViewById(R.id.spacecrafImage);

        final String name=spaceCrafts.get(position).getName();
        final String isiText=spaceCrafts.get(position).getIsiText();
        final int image=spaceCrafts.get(position).getImage();

        nameTxt.setText(name);
        isiTxt.setText(isiText);
        img.setImageResource(image);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailActivity(name,isiText,image);
            }
        });

        return convertView;
    }

    private void openDetailActivity(String name,String isiText,int image)
    {
        Intent i=new Intent(c, DetailActivity.class);

        i.putExtra("NAME_KEY",name);
        i.putExtra("TEXT_KEY",isiText);
        i.putExtra("IMAGE_KEY",image);

        c.startActivity(i);
    }
}
