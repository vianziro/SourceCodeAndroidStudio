package com.dolog.om.wab;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

import com.dolog.om.wab.mData.SpaceCraftsCollection;
import com.dolog.om.wab.mDetail.DetailActivity;
import com.dolog.om.wab.mListView.CustomAdapterSearch;


public class MainSearch extends AppCompatActivity {

    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_main);


        ListView lv = (ListView) findViewById(R.id.lv);
        CustomAdapterSearch adapter = new CustomAdapterSearch(this, SpaceCraftsCollection.getSpaceCraft());
        lv.setAdapter(adapter);


    }
    
    
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search, menu);
        MenuItem item = menu.findItem(R.id.menuSearch);
        SearchView searchView = (SearchView)item.getActionView();


        
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {


            @Override
            public boolean onQueryTextSubmit(String query) {

                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("NAME_KEY",name);
                startActivity(intent);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                return false;
            }
        });


        return super.onCreateOptionsMenu(menu);
    }

}
