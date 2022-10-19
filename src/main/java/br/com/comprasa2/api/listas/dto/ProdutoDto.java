package br.com.comprasa2.api.listas.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class ProdutoDto {
	
	
	@SerializedName("id")
	@JsonProperty("id")	
	private String id;

	@SerializedName("name")
	@JsonProperty("name")	
	private String name;

	@SerializedName("categoria")
	@JsonProperty("categoria")	
	private String categoria;
	
	@SerializedName("userId")
	@JsonProperty("userId")	
	private String userId;

	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

}
