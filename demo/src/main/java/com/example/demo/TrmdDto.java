package com.example.demo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TrmdDto {
	
	@JsonProperty("USD_COP")
	private Double trm;
	
	public Double getUSD_COP() {
		return trm;
	}

	public void setUSD_COP(Double uSD_COP) {
		trm = uSD_COP;
	}

	/**
	 * @param uSD_COP
	 */
	public TrmdDto(Double uSD_COP) {
		super();
		trm = uSD_COP;
	}
	
	public TrmdDto(){
		super();
	}

}
