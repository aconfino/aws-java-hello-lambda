package com.confino.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import java.util.Random;

public class LambdaFunctionHandler implements RequestHandler<S3Event, String> {

    @Override
    public String handleRequest(S3Event event, Context context) {
    	
    	String [] lunchOptions = { 
    			"Wegmans", 
    			"Jimmys BBQ",
    			"Bamboo",
    			"Buena Vista",
    			"Manam",
    			"Nectar",
    			"Smashburger",
    			"Classic Diner",
    			"Paneras",
    			"Chipotle",
    			"Chic-Fil-A",
    			"Royal-Thai",
    			"Naf Naf Grill",
    			"Zoup"
    			};
    	
    	context.getLogger().log("Where should we go to lunch?");
    	int randomIndex = new Random().nextInt(lunchOptions.length);
		return "Let's have lunch at " + lunchOptions[randomIndex] + "!";
		
    }
}