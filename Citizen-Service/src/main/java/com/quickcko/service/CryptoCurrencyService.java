package com.quickcko.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import com.quickcko.model.Response;
import com.quickcko.model.Currency;


@Service
public class CryptoCurrencyService {

	@Autowired
	private RestTemplate restTemplate;
	
	private static final String RAPID_API_KEY="X-RapidAPI-Key";
	private static final String RAPID_API_HOST="X-RapidAPI-Host";
	private static final String coinBaseUrl="https://coinlore-cryptocurrency.p.rapidapi.com";
	private static final String rapidApiPublicKey = "f18c1c8b13msh2bdb03c83b1c61fp1b5211jsn2468bc7479b8";
	private static final String rapidApiHost = "coinlore-cryptocurrency.p.rapidapi.com";
	
	
	public Response getAllCoinTicker() {
		ResponseEntity<Response> res = null;
		final HttpHeaders headers = new HttpHeaders();
        headers.add(RAPID_API_KEY, rapidApiPublicKey);
        headers.add(RAPID_API_HOST, rapidApiHost);
        headers.setContentType(MediaType.APPLICATION_JSON);
        final HttpEntity<String> entity = new HttpEntity<String>(headers);
        try {
        res=restTemplate.exchange(coinBaseUrl+"/api/tickers/?start=0&limit=100", HttpMethod.GET, entity, Response.class);
        }catch (ResourceAccessException e) {
        	return new Response("Crypto Service Is Down Check your Internet Connection", 500);
		}
        Response cryptoCurrency=new Response();
		if (res != null && res.getStatusCodeValue() == 200) {
			 cryptoCurrency.setData(res.getBody().getData());
		}
		return cryptoCurrency;
	}

	public Response getCoinTickerById(Integer id) {
		ResponseEntity<Currency[]> res = null;
		final HttpHeaders headers = new HttpHeaders();
        headers.add(RAPID_API_KEY, rapidApiPublicKey);
        headers.add(RAPID_API_HOST, rapidApiHost);
        headers.setContentType(MediaType.APPLICATION_JSON);
        final HttpEntity<String> entity = new HttpEntity<String>(headers);
        try{
             res=restTemplate.exchange(coinBaseUrl+"/api/ticker/?id="+id, HttpMethod.GET, entity, Currency[].class);
        }catch (ResourceAccessException e) {
			return new Response("Crypto Service Is Down Check your Internet Connection ,", 500);
		}
        if (res != null && res.getStatusCodeValue() == 200) {
        	return new Response(java.util.Arrays.asList(res.getBody()), 200);
		}
		return new Response("something went wrong", 500);
	}
}
