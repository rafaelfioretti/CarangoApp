package br.com.rafaelfioretti.carangoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import br.com.rafaelfioretti.carangoapp.model.Carro;

public class DetalheActivity extends AppCompatActivity {

    private ImageView ivimagemdetalhe;
    private TextView  tvdescricaodetalhe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        if(getIntent() != null){
            Carro carro = getIntent().getParcelableExtra("carro");
            tvdescricaodetalhe = (TextView) findViewById(R.id.tvdescdetalhe);
            tvdescricaodetalhe.setText(carro.getDescricao());
            ivimagemdetalhe = (ImageView) findViewById(R.id.ivcarrodetalhe);
            Picasso.with(this)
                    .load(carro.getFoto())
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .into(ivimagemdetalhe);







            Toast.makeText(this, carro.getNome(), Toast.LENGTH_SHORT).show();
        }

        ;
    }
}
