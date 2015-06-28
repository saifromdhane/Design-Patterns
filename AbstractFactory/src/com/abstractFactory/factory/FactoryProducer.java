package com.abstractFactory.factory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String type){
		if(type == null)
			return null; 
		
		if(type.equals("FLOWER"))			
			return new FlowerFactory();
		else if(type.equals("COLOR"))
			return new ColorFactory();
		
		return null;
	}
	
}
