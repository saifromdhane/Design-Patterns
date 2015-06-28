package com.abstractFactory.client;

import com.abstractFactory.color.Color;
import com.abstractFactory.factory.AbstractFactory;
import com.abstractFactory.factory.FactoryProducer;
import com.abstractFactory.flower.Flower;

public class Main {

	public static void main(String[] args) {
		// get the flower factory object
		AbstractFactory flowerFactory = FactoryProducer.getFactory("FLOWER");
		// get the color factory object
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR	");
				
		// create a pink Peony 
		Flower peony = flowerFactory.getFlower("PEONY");
		peony.emitOdor();
		Color pinkColor = colorFactory.getColor("PINK");
		pinkColor.fill();
		
		// create a pink Ranunculus 
		Flower ranunculus = flowerFactory.getFlower("RENUNCULUS");
		ranunculus.emitOdor();
		Color purpleColor = colorFactory.getColor("PURPLE");
		purpleColor.fill();
	}

}
