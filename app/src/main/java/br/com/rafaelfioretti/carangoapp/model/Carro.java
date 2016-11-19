package br.com.rafaelfioretti.carangoapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rafaelfioretti on 11/19/16.
 */

public class Carro implements Parcelable{

    private String nome;
    @SerializedName("desc") //notação sempre em cima da variavel em questão
    private String descricao;
    private String foto;

    public Carro(String nome, String descricao, String foto) {
        this.nome = nome;
        this.descricao = descricao;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }
}
