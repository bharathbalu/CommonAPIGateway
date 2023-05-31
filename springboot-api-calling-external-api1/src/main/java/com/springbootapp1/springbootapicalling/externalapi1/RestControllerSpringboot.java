package com.springbootapp1.springbootapicalling.externalapi1;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class RestControllerSpringboot {
@RequestMapping("/hello")
public String StringHello() {
	return "hello world";
}
@GetMapping(value="/callclienthello")
private String getHelloclient(){
	String Uri="http://localhost:8089/hello";
	RestTemplate restTemplate= new RestTemplate();
	String result= restTemplate.getForObject(Uri,String.class);
	return result;
}
@GetMapping(value="products")
public List<Object> getcountries1(){
	RestTemplate restTemplate= new RestTemplate();	
	String Url="http://localhost:8085/products";
	//String result= restTemplate.getForObject(Url,String.class);
	Object[] products = restTemplate.getForObject(Url,Object[].class);
	return Arrays.asList(products);
}
@GetMapping(value="countries")
public List<Object> getcountries(){
	RestTemplate restTemplate= new RestTemplate();	
	String Url="https://restcountries.com/v3.1/all";
	String result= restTemplate.getForObject(Url,String.class);
	//Object[] products = restTemplate.getForObject(Url,Object[].class);
	return Arrays.asList(result);
}
/*@RequestMapping(value = "/template/products")
public String getProductList() {
   HttpHeaders headers = new HttpHeaders();
   headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
   HttpEntity <String> entity = new HttpEntity<String>(headers);
   
   return restTemplate.exchange("http://localhost:8089/products", HttpMethod.GET, entity, String.class).getBody();
}
	public RestControllerSpringboot() {
		
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
