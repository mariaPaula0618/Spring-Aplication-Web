package com.example.demo;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloWorldService {
	
	private static final String URL="https://free.currencyconverterapi.com/api/v6/convert?q=USD_COP&compact=ultra";

	private RestTemplate restTemplate= new RestTemplate();

	public HelloWorldDto getDtoWithTRM(String greeting) {
		return new HelloWorldDto(greeting, 1, getTRM());
	}

	private double getTRM() {
		try {
		// TODO Auto-generated method stub
		TrmdDto TRM=restTemplate.getForEntity(new URI(URL), TrmdDto.class).getBody();
		return TRM.getUSD_COP();
		}catch (Exception e) {
			e.printStackTrace();
		throw new RuntimeException("No TRM");
		}
		
	
	}
	


	
}
