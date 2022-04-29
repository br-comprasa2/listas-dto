package br.com.comprasa2.api.listas.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class ListaDto {
	
	@SerializedName("id")
	@JsonProperty("id")	
	private String id;
	
	@SerializedName("name")
	@JsonProperty("name")	
	private String name;
	
	@SerializedName("description")
	@JsonProperty("description")	
	private String description;
	
	@SerializedName("users")
	@JsonProperty("users")	
	private List<ShortInfoUserDto> users;
	
	@SerializedName("itens")
	@JsonProperty("itens")	
	private List<ItemDto> itens;
	
	@SerializedName("createdTime")
	@JsonProperty("createdTime")	
	private Long createdTime;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}




	public Long getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Long createdTime) {
		this.createdTime = createdTime;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public List<ItemDto> getItens() {
		return itens;
	}

	public void setItens(List<ItemDto> itens) {
		this.itens = itens;
	}

	public List<ShortInfoUserDto> getUsers() {
		return users;
	}

	public void setUsers(List<ShortInfoUserDto> users) {
		this.users = users;
	}
	
}
