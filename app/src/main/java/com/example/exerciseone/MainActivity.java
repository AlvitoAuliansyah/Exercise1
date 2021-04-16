package com.example.exerciseone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CustomAdapter.ContactsAdapterListener, SearchView.OnQueryTextListener {

    private SearchView searchView;
    public final Kontak[] DaftarKontak = new Kontak[]{
            new Kontak("My Ex1", "081234567890"),
            new Kontak("My Ex2", "081234567891"),
            new Kontak("My Ex3", "081234567892"),
            new Kontak("My Love1", "081234567893"),
            new Kontak("My Love2", "081234567894"),
            new Kontak("My Love3", "081234567895"),
            new Kontak("My Wife1", "081234567896"),
            new Kontak("My Wife2", "081234567897"),
            new Kontak("My Wife3", "081234567898"),
    };
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private CustomAdapter mAdapter;
    private ArrayList<Kontak> listNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         mRecyclerView = findViewById(R.id.lstKontak);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        listNama = new ArrayList<>();
        for (Kontak ki: DaftarKontak
        ) {
            this.listNama.add(ki);
        }
        mAdapter= new CustomAdapter(getApplicationContext(), listNama , this);
        mRecyclerView.setAdapter(mAdapter);

        searchView = findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(this);

    }

    @Override
    public void onContactSelected(Kontak contact) {

    }

    @Override
    public boolean onQueryTextSubmit(String query) {

        mAdapter.getFilter().filter(query);
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {

        mAdapter.getFilter().filter(newText);
        return false;
    }
}