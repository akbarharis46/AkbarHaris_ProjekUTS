package org.MI2F.akbarharis_projekuts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import org.MI2F.akbarharis_projekuts.adapter.ListGameAdapter;
import org.MI2F.akbarharis_projekuts.adapter.OnItemClickCallback;

import java.util.ArrayList;

public class HomeGame extends AppCompatActivity {
    private RecyclerView rycle_game;
    private ArrayList<Game> list = new ArrayList<>();
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_game);
        button = findViewById(R.id.button);
        rycle_game = findViewById(R.id.rycle_game);
        rycle_game.setHasFixedSize(true);


        list.addAll(DataGame.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rycle_game.setLayoutManager(new LinearLayoutManager(this));
        ListGameAdapter listGameAdapter = new ListGameAdapter(list);
        rycle_game.setAdapter(listGameAdapter);

        listGameAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Game game) {
                Intent moveIntent1 = new Intent(HomeGame.this, DetailGame.class);
                moveIntent1.putExtra(DetailGame.ITEM_EXTRA, game);
                startActivity(moveIntent1);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

}
