package com.log.controller;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class SivaClass {

	@RequestMapping(value="test",method=RequestMethod.GET)
	public ResponseEntity<?>test(@RequestParam Map<String,String> request){
		try {
			Logger log = LogManager.getLogger("logsiva");

			log.debug("testAPI started: " + request);
			log.info("testAPI started: " + request);

			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(request,HttpStatus.OK);
		
	}
	@RequestMapping(value="testapi",method=RequestMethod.GET)
	public ResponseEntity<?>testEx(@RequestParam Map<String,String> request){
		try {
			Logger log = LogManager.getLogger("logsiva");

			log.debug("control started: " + request);
			log.info("control started: " + request);

			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(request,HttpStatus.OK);
		
	}


}
