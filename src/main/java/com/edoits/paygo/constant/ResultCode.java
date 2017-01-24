package com.edoits.paygo.constant;

public enum ResultCode {
	OK(0),
	ACCOUNT_NOT_FOUND(1),
	INSUFFICIENT_BALANCE(2),
	INVALID_REQUEST(3),
	INTERNAL_ERROR(9999);
	
	Integer resultCode;
	
	private ResultCode(Integer resultCode){
		this.resultCode =resultCode; 
	}
	

}
