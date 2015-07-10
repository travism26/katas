package org.travis.polymorphism.pizzaShopExample;

import java.util.ArrayList;

public class meatLoversPizza extends basePizza{

	ArrayList<Ingredient> ingredients = new ArrayList<>();
	
	public static void main (String[] args){
		meatLoversPizza obj = new meatLoversPizza();
	}
}
