package org.travis.polymorphism.pizzaShopExample;

import java.util.ArrayList;

public abstract class basePizza {
	
	ArrayList<Ingredient> ingredients = new ArrayList();
	/*
	 * I will be using the template method pattern here generalizing the some functionality.
	 */
	public basePizza make(){
		return putSauce().putCheese().addIngredient(null);
	}
	
	public basePizza putSauce(){
		System.out.println("put sauce on dat pizza yo");
		return this;
	}
	
	public basePizza putCheese(){
		System.out.println("put some cheese on the pizza");
		return this;
	}
	
	/*
	 * this method will allow all sub classes to customize the pizzas main ingredient
	 * based off the template we created for them, Ex: every pizza must have sauce, and
	 * cheese, followed by some main ingredient (bacon, ham, extra 'X', ...etc)
	 */
	public abstract basePizza addIngredient(ArrayList<Ingredient> ingredients);
	
}
