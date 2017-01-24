package com.edoits.web.pojo;

import javax.validation.constraints.NotNull;

public class SessionRequest {
	
	String mac;
	@NotNull
	String sessionId;
	Integer usu;
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public Integer getUsu() {
		return usu;
	}
	public void setUsu(Integer usu) {
		this.usu = usu;
	}
	
	
}
