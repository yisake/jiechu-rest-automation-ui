package com.neo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class FeatureController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
    @RequestMapping("/getFeatureTree")
    public void getFeatureTree() {
    	
    }
}