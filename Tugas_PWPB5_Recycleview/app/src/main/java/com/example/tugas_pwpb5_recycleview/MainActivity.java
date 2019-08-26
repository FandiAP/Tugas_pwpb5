package com.example.tugas_pwpb5_recycleview;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHeadset;
    private ArrayList<Headset> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHeadset = findViewById(R.id.rv_headset);
        rvHeadset.setHasFixedSize(true);

        list.addAll(HeadsetData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvHeadset.setLayoutManager(new LinearLayoutManager(this));
        ListHeadsetAdapter listHeroAdapter = new ListHeadsetAdapter(list);
        rvHeadset.setAdapter(listHeroAdapter);
    }

    private void showRecylerCardView() {
        rvHeadset.setLayoutManager(new LinearLayoutManager(this));
        CardViewHeadsetAdapter cardViewHeadsetAdapter = new CardViewHeadsetAdapter(list);
        rvHeadset.setAdapter(cardViewHeadsetAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_cardview:
                showRecylerCardView();
                break;
        }
    }
}
