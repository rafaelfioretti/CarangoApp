package br.com.rafaelfioretti.carangoapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import br.com.rafaelfioretti.carangoapp.R;
import br.com.rafaelfioretti.carangoapp.listener.OnClickListener;
import br.com.rafaelfioretti.carangoapp.model.Carro;

/**
 * Created by rafaelfioretti on 11/19/16.
 */

public class CarroListAdapter extends RecyclerView.Adapter<CarroListAdapter.CarrosViewHolder>{

    private Context context;
    private List<Carro> carros;
    private OnClickListener clickListener;

    public CarroListAdapter(Context context, List<Carro> carros){
        this.context = context;
        this.carros = carros;
        this.clickListener = clickListener;
    }



    @Override
    public CarrosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context)
                 .inflate(R.layout.carro_row, parent, false);

        return new CarrosViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final CarrosViewHolder holder, final int position) {
        holder.tvNome.setText(carros.get(position).getNome());
        holder.tvDesc.setText(carros.get(position).getDescricao());
        Picasso.with(context)
                .load(carros.get(position).getFoto())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(holder.ivCarro);

        if (clickListener != null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickListener.onClick(holder.itemView, position);
                }
            });



        }

    }

    public Carro getItem(int position){
        return carros.get(position);
    }


    @Override
    public int getItemCount() {
        return carros.size();
    }

    public static class CarrosViewHolder extends RecyclerView.ViewHolder{

        TextView tvNome;
        TextView tvDesc;
        ImageView ivCarro;


        public CarrosViewHolder(View itemView) {
            super(itemView);

            tvNome = (TextView) itemView.findViewById(R.id.tvnome);
            tvDesc = (TextView) itemView.findViewById(R.id.tvdesc);
            ivCarro = (ImageView) itemView.findViewById(R.id.ivcarro);

        }
    }
}
