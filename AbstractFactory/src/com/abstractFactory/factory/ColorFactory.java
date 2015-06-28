package com.abstractFactory.factory;

import com.abstractFactory.color.Color;
import com.abstractFactory.color.Pink;
import com.abstractFactory.color.Purple;
import com.abstractFactory.flower.Flower;

public class ColorFactory extends AbstractFactory{
		
	
	@Override
	public Color getColor(String color) {
		if(color == null)
			return null;
		
		if(color.equals("PINK"))
			return new Pink();
		else if(color.equals("PURPLE"))
			return new Purple();
		
		return null;
	}

	@Override
	public Flower getFlower(String flower) {
		return null;
	}

}
