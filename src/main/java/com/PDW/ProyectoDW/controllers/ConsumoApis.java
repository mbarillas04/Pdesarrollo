package com.PDW.ProyectoDW.controllers;


import com.PDW.ProyectoDW.DTO.Product;
import com.PDW.ProyectoDW.DTO.USD_GTQ;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


public class ConsumoApis {	
	public static USD_GTQ consumo_cambio() {

		RestTemplate restTemplate=new RestTemplate();
		String url="https://api.exchangerate.host/convert";	
        UriComponentsBuilder uri=UriComponentsBuilder.fromHttpUrl(url)
        		.queryParam("from","USD")
        		.queryParam("to","GTQ");
		System.out.println(uri.toUriString());
		 

		
		ResponseEntity<USD_GTQ> responseEntity = 
				  restTemplate.exchange(
				    uri.toUriString(),
				    HttpMethod.GET,
				    null,
				    new ParameterizedTypeReference<USD_GTQ>() {}
						  );
		
		
		USD_GTQ valor=responseEntity.getBody();
		return valor;
		
	}
	
	
	
	
	
	
	
	public static Product consumo_producto(String urlParam) {
		RestTemplate restTemplate=new RestTemplate();
		String url="https://axesso-axesso-amazon-data-service-v1.p.rapidapi.com/amz/amazon-lookup-product";	
        UriComponentsBuilder uri=UriComponentsBuilder.fromHttpUrl(url)
        		.queryParam("url",urlParam);
		
        HttpHeaders headers=new HttpHeaders();
        headers.set("x-rapidapi-host", "axesso-axesso-amazon-data-service-v1.p.rapidapi.com");
        headers.set("x-rapidapi-key", "3f9f77f962mshea89c1314d5fa77p10402ejsn994cd9549220");
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Product> entity=new HttpEntity<>(headers);
        
		System.out.println(uri.toUriString());
		
		
		ResponseEntity<Product> responseEntity = 
				  restTemplate.exchange(
				    uri.toUriString(),
				    HttpMethod.GET,
				    entity,
				    new ParameterizedTypeReference<Product>() {}
						  );
		
		
		Product producto=responseEntity.getBody();
		return producto;
		
		
	}
}













