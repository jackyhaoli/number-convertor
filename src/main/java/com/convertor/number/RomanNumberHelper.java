package com.convertor.number;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RomanNumberHelper {

	private static final Logger logger = LoggerFactory.getLogger(RomanNumberHelper.class);

	//only support latin number i < 5000 case
	public static String latinToRomanNumber(int latin) {
		
		if(latin >= 5000){
			throw new RuntimeException("input latin number error, should < 5000");
		}
		
	    String result = String.valueOf(new char[latin]).replace('\0', 'I')
	    .replace("IIIII", "V")
	    .replace("IIII", "IV")
	    .replace("VV", "X")
	    .replace("VIV", "IX")
	    .replace("XXXXX", "L")
	    .replace("XXXX", "XL")
	    .replace("LL", "C")
	    .replace("LXL", "XC")
	    .replace("CCCCC", "D")
	    .replace("CCCC", "CD")
	    .replace("DD", "M")
	    .replace("DCD", "CM");

		logger.info(latin + " --> " + result);
		return result;
	}
}
