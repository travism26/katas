package org.travis.polymorphism.pizzaShopExample;

public class Veggies {

}

class GreenPeppers implements Ingredient{

	@Override
	public String name()
	{
		return "Green Peppers";
	}

	@Override
	public double price()
	{
		return .45;
	}
	
}

class RedPeppers implements Ingredient{

	@Override
	public String name()
	{
		return "Red Peppers";
	}

	@Override
	public double price()
	{
		return 0.56;
	}
	
}
