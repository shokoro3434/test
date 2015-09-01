package com.eitax.recall.yahoo.rest;

import java.io.StringReader;

import javax.xml.bind.DataBindingException;
import javax.xml.bind.JAXB;

public class AmazonRestUtils2 {
	public static <T> T unmarshal (String xml,Class<T> c){
		StringReader sr = null;
		try{
			sr = new StringReader(xml.toString());
			return JAXB.unmarshal(sr, c);
		}
		catch(DataBindingException e){
			e.printStackTrace();
			return null;
		}
		finally{
			sr.close();
		}
	}
}
