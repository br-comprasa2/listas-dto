package br.com.comprasa2.api.listas.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class ConviteResponseDto {
	
	public ConviteResponseDto(String _url) {
		this.urlInvite = _url;
	}
	public ConviteResponseDto() {
	}

	@SerializedName("urlInvite")
	@JsonProperty("urlInvite")	
	private String urlInvite;

	public String getUrlInvite() {
		return urlInvite;
	}

	public void setUrlInvite(String urlInvite) {
		this.urlInvite = urlInvite;
	}

}
