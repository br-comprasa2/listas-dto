package br.com.comprasa2.api.listas.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class ShortInfoListaDto {

	@SerializedName("idLista")
	@JsonProperty("idLista")	
	private String idLista;
	
	@SerializedName("nomeLista")
	@JsonProperty("nomeLista")	
	private String nomeLista;


	public String getIdLista() {
		return idLista;
	}

	public void setIdLista(String idLista) {
		this.idLista = idLista;
	}

	public String getNomeLista() {
		return nomeLista;
	}

	public void setNomeLista(String nomeLista) {
		this.nomeLista = nomeLista;
	}



	
}
