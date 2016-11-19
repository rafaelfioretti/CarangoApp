package br.com.rafaelfioretti.carangoapp.api;

import java.util.List;

import br.com.rafaelfioretti.carangoapp.model.Carro;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by rafaelfioretti on 11/19/16.
 */

public interface CarroAPI {

    @GET("/carros/tipo/{tipo}")
    Call<List<Carro>> findBy(@Path("tipo") String tipo);

}
