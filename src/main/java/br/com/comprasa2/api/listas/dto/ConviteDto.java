package br.com.comprasa2.api.listas.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class ConviteDto {
	
	@SerializedName("id")
	@JsonProperty("id")	
	private String id;

	@SerializedName("ownerInfo")
	@JsonProperty("ownerInfo")	
	private ShortInfoUserDto ownerInfo;

	@SerializedName("createTime")
	@JsonProperty("createTime")	
	private long createTime;

	@SerializedName("listaInfo")
	@JsonProperty("listaInfo")	
	private ShortInfoListaDto listaInfo;

	
	
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public ShortInfoListaDto getListaInfo() {
		return listaInfo;
	}

	public void setListaInfo(ShortInfoListaDto listaInfo) {
		this.listaInfo = listaInfo;
	}

	public ShortInfoUserDto getOwnerInfo() {
		return ownerInfo;
	}

	public void setOwnerInfo(ShortInfoUserDto ownerInfo) {
		this.ownerInfo = ownerInfo;
	}
}
