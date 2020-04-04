package org.MI2F.akbarharis_projekuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailGame extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_game);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvDeskripsi = findViewById(R.id.tv_item_deskripsi);
        TextView tvHarga = findViewById(R.id.tv_item_harga);

        Game game = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (game != null) {
            Glide.with(this)
                    .load(game.getPhoto())
                    .into(imgItemPhoto);
            tvName.setText(game.getNama_game());
            tvDeskripsi.setText(game.getDetail_game());
            tvHarga.setText(game.getHarga());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Makanan");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
