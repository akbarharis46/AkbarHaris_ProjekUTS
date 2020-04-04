package org.MI2F.akbarharis_projekuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import org.MI2F.akbarharis_projekuts.adapter.ListGameAdapter;
import org.MI2F.akbarharis_projekuts.adapter.OnItemClickCallback;

import java.util.ArrayList;

public class mainDataGame extends AppCompatActivity {
    Button button;
    private RecyclerView rycle_game;
    private ArrayList<Game> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_data_game);

        rycle_game = findViewById(R.id.rycle_game);
        rycle_game.setHasFixedSize(true);

        list.addAll(DataGame.getListData());
        showRecyclerList();

        button = findViewById(R.id.button);
    }

    private void showRecyclerList() {
        rycle_game.setLayoutManager(new LinearLayoutManager(this));
        ListGameAdapter listGameAdapter = new ListGameAdapter(list);
        rycle_game.setAdapter(listGameAdapter);

        listGameAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Game makanan) {
                Intent moveIntent1 = new Intent(mainDataGame.this, DetailGame.class);
                moveIntent1.putExtra(DetailGame.ITEM_EXTRA, makanan);
                startActivity(moveIntent1);
            }
        });
    }
}
