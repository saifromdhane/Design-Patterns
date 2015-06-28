package com.abstractFactory.factory;

import com.abstractFactory.color.Color;
import com.abstractFactory.flower.Flower;
import com.abstractFactory.flower.Peony;
import com.abstractFactory.flower.Ranunculus;

public class FlowerFactory extends AbstractFactory{

	@Override
	public Color getColor(String color) {		
		return null;
	}

	@Override
	public Flower getFlower(String flower) {
		if(flower == null)
			return null;
		
		if(flower.equals("PEONY"))
			return new Peony();
		else if(flower.equals("RENUNCULUS"))
		    return new Ranunculus();
		
		return null;
	}

}
