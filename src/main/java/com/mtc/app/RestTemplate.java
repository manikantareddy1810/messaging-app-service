package com.mtc.app;

public interface RestTemplate {
	
	enum HttpMethod { GET, PUT, POST, DELETE }
	
	/**
	* Makes a HTTP REST Request
	*/
	
	<R, T> T exchange(String url, HttpMethod method, R requestBody, Class<T> returnType);


}
