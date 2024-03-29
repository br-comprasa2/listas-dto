package br.com.comprasa2.api.listas.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class ItemPatchDto {

	@SerializedName("comprado")
	@JsonProperty("comprado")	
	private boolean comprado;

	@SerializedName("importante")
	@JsonProperty("importante")	
	private boolean importante;

	@SerializedName("reservadoPara")
	@JsonProperty("reservadoPara")	
	private ShortInfoUserDto reservadoPara;

	
	public boolean isComprado() {
		return comprado;
	}

	public void setComprado(boolean comprado) {
		this.comprado = comprado;
	}

	public ShortInfoUserDto getReservadoPara() {
		return reservadoPara;
	}

	public void setReservadoPara(ShortInfoUserDto reservadoPara) {
		this.reservadoPara = reservadoPara;
	}

	public boolean isImportante() {
		return importante;
	}

	public void setImportante(boolean importante) {
		this.importante = importante;
	}


	
}
