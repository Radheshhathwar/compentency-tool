package com.sphere.compentencytool.common.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {

	
	@Value("${user.read.api}")
	private String UserReadApi;
	
	@Value("${content.read.api}")
	private String ContentReadAapi;
	
	@Value("${generate.token}")
	private String GenerateToken;
	
	public String getGenerateToken() {
		return GenerateToken;
	}

	public void setGenerateToken(String generateToken) {
		GenerateToken = generateToken;
	}

	public String getVerifyToken() {
		return VerifyToken;
	}

	public void setVerifyToken(String verifyToken) {
		VerifyToken = verifyToken;
	}

	@Value("${verify.token}")
	private String VerifyToken;
	
	public String getUserReadApi() {
		return UserReadApi;
	}

	public void setUserReadApi(String userReadApi) {
		UserReadApi = userReadApi;
	}

	public String getContentReadAapi() {
		return ContentReadAapi;
	}

	public void setContentReadAapi(String contentReadAapi) {
		ContentReadAapi = contentReadAapi;
	}

	
}
