package org.travis.polymorphism;

public class shapeTest {

}

/*
 * now to add functionality to the calculateArea we just need to create a class
 * that implements a shape and bamb following open/close principal.
 */

class square implements shape {
	double width;
	double height;

	public square(double width, double height){
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea()
	{
		return width * height;
	}

}

class circle implements shape {

	@Override
	public double calculateArea()
	{

		return 0;
	}

}

class triangle implements shape {

	@Override
	public double calculateArea()
	{

		return 0;
	}

}