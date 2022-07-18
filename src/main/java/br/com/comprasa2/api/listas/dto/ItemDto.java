package br.com.comprasa2.api.listas.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class ItemDto {
	
	@SerializedName("id")
	@JsonProperty("id")	
	private String id;

	@SerializedName("name")
	@JsonProperty("name")	
	private String name;

	@SerializedName("listId")
	@JsonProperty("listId")	
	private String listId;
	
	@SerializedName("comprado")
	@JsonProperty("comprado")	
	private boolean comprado;

	@SerializedName("importante")
	@JsonProperty("importante")	
	private boolean importante;

	
	@SerializedName("unidade")
	@JsonProperty("unidade")	
	private String unidade;

	@SerializedName("quantidade")
	@JsonProperty("quantidade")	
	private double quantidade;
 	
	@SerializedName("categoria")
	@JsonProperty("categoria")	
	private String categoria;
	
	@SerializedName("reservadoPara")
	@JsonProperty("reservadoPara")	
	private ShortInfoUserDto reservadoPara;

	@SerializedName("updateTime")
	@JsonProperty("updateTime")	
	private Long updateTime;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public ShortInfoUserDto getReservadoPara() {
		return reservadoPara;
	}

	public void setReservadoPara(ShortInfoUserDto reservadoPara) {
		this.reservadoPara = reservadoPara;
	}

	public String getListId() {
		return listId;
	}

	public void setListId(String listId) {
		this.listId = listId;
	}

	public boolean isComprado() {
		return comprado;
	}

	public void setComprado(boolean comprado) {
		this.comprado = comprado;
	}

	public boolean isImportante() {
		return importante;
	}

	public void setImportante(boolean importante) {
		this.importante = importante;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	
	
	
}
