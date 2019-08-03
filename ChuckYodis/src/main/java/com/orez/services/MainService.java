package com.orez.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.orez.pojos.ChackNorris;
import com.orez.pojos.ChackYodaFacts;
import com.orez.pojos.Translate;

@Service
public class MainService {
	
	
	@Autowired
	private MongoOperations mongoOperations;
	RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
   
	
	public ChackYodaFacts getChuckNorrisRundom(){
		
	    final String uri = "https://api.chucknorris.io/jokes/random";
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 "+
			"(KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	    
            ChackNorris result = restTemplate.exchange(uri, HttpMethod.GET,entity,ChackNorris.class)
		    .getBody();
		String resultString = "";
		ChackYodaFacts chack = new ChackYodaFacts();
      
		
	    try { resultString = yodaTranslate(result.getValue()); } 
		
            catch(Exception e) {
        	   resultString = result.getValue();  
		   System.out.println(e.getMessage());
		       }
            
                chack.setFact_text(resultString);
        	chack.setEnterd_date(new Date());
        	
        	chack.setId((int) this.mongoOperations.count(null, ChackYodaFacts.class));
		this.mongoOperations.save(chack);
	    return chack;
	}
	
	public String yodaTranslate(String value) {
		
		
		String url = "https://api.funtranslations.com/translate/yoda.json?text=";
		String uri =  url+value;
		
		CloseableHttpClient httpClient = HttpClients.custom()
                      .setSSLHostnameVerifier(new NoopHostnameVerifier())
                      .build();
		HttpComponentsClientHttpRequestFactory requestFactory = 
			new HttpComponentsClientHttpRequestFactory();
		requestFactory.setHttpClient(httpClient);
		RestTemplate restTemplate = new RestTemplate(requestFactory);

	        Translate result = restTemplate.getForObject(uri,Translate.class);
		
		return result.getContents().getText();
	}

	
	public List<ChackYodaFacts> getFacts(){

		List<ChackYodaFacts>facts = this.mongoOperations.findAll(ChackYodaFacts.class);
		return facts;
		}
	
	
}
