package br.com.comprasa2.api.listas.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class ShortInfoUserDto {
	
	@SerializedName("id")
	@JsonProperty("id")	
	private String id;

	@SerializedName("name")
	@JsonProperty("name")	
	private String name;

	
	public ShortInfoUserDto(String _id, String _name) {
		this.id = _id;
		this.name = _name;
	}
	public ShortInfoUserDto() {}
	
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

}
