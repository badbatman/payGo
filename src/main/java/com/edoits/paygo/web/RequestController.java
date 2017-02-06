package com.edoits.web;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.edoits.paygo.constant.ResultCode;
import com.edoits.web.pojo.SessionRequest;
import com.edoits.web.pojo.SessionResponse;

@RestController
@ComponentScan
public class RequestController {
	 private final Logger logger = LoggerFactory.getLogger(this.getClass());
	 @RequestMapping(value="/login",method=RequestMethod.POST)
	 @ResponseBody
	 public SessionResponse login(@Valid @RequestBody SessionRequest request){
		 logger.info("request's mac = {}, session id = {}", request.getMac(),request.getSessionId());
		 SessionResponse response = new SessionResponse();
		 response.setResultCode(ResultCode.OK);
		 return response;
	 }
	 
	 @RequestMapping(value="/reserve",method=RequestMethod.POST)
	 public SessionResponse reserve(SessionRequest request){
		 logger.info("request's mac = {}, session id = {}, usu = {}", request.getMac(),request.getSessionId(),request.getUsu());
		 SessionResponse response = new SessionResponse();
		 response.setResultCode(ResultCode.OK);
		 response.setGsu(1000);
		 return response;
	 }
	 
	 @RequestMapping(value="/terminate",method=RequestMethod.POST)
	 public SessionResponse terminate(SessionRequest request){
		 logger.info("request's mac = {}, session id = {}, usu = {}", request.getMac(),request.getSessionId(), request.getUsu());
		 SessionResponse response = new SessionResponse();
		 response.setResultCode(ResultCode.OK);
		 return response;
	 }
	 

}
