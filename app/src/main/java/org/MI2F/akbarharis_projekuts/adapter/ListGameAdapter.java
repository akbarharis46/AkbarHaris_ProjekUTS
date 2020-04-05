package org.MI2F.akbarharis_projekuts.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.MI2F.akbarharis_projekuts.Game;
import org.MI2F.akbarharis_projekuts.R;

import java.util.ArrayList;

public class ListGameAdapter extends RecyclerView.Adapter<ListGameAdapter.ListViewHolder> {

    private final ArrayList<Game> listGame;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListGameAdapter(ArrayList<Game> list) {
        this.listGame = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rycle_game, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder listViewHolder, int i) {
        final Game game = listGame.get(i);

        Glide.with(listViewHolder.itemView.getContext())
                .load(game.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(listViewHolder.imgPhoto);

        listViewHolder.tvName.setText(game.getNama_game());
        listViewHolder.tvDetail.setText(game.getDetail_game());

        listViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(game);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listGame.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
