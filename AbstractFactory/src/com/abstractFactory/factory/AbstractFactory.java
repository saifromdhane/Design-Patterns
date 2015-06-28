package com.abstractFactory.factory;

import com.abstractFactory.color.Color;
import com.abstractFactory.flower.Flower;

public abstract class AbstractFactory {

	abstract public Color getColor(String color);
	abstract public Flower getFlower(String flower);
	
}
