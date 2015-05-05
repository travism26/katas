package org.travis.polymorphism;

import java.util.Iterator;

public class calculateArea {
	
	public double calculateTotalArea(shape[] shape){
		double totalArea = 0;
		for(shape item : shape){
			totalArea += item.calculateArea();
		}
		return totalArea;
	}
}
