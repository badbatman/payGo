package com.edoits.web.pojo;

import com.edoits.paygo.constant.ResultCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class SessionResponse {
	
	ResultCode resultCode;
	Integer gsu;
	public ResultCode getResultCode() {
		return resultCode;
	}
	public void setResultCode(ResultCode resultCode) {
		this.resultCode = resultCode;
	}
	public Integer getGsu() {
		return gsu;
	}
	public void setGsu(Integer gsu) {
		this.gsu = gsu;
	}
	

}
