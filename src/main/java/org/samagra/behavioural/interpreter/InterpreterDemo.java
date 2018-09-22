package org.samagra.behavioural.interpreter;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterDemo {
	
	public static final Logger log = Logger.getLogger(org.samagra.behavioural.interpreter.InterpreterDemo.class.getName());
	
	public static void main(String[] args) {
		String input = "Z is going from Pune to Udaipur";

		String configItm = "Udaipur;Maharshtra;Pune".replaceAll(";", "|");
	
		log.info(configItm);
		
		Pattern p = Pattern.compile(configItm);
		
		Matcher m =  p.matcher(input);
		
		String result =null;
		
		while(m.find()) {
			result =m.group();
			log.info(result);
		}
	}
}
