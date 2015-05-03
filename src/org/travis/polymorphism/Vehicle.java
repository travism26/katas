package org.travis.polymorphism;

import java.util.ArrayList;

public abstract class Vehicle {
	int wheelCount;
	double engineSize;
	String Name;

	public int wheelCount()
	{
		return wheelCount;
	}

	public double engineSize()
	{
		return engineSize;
	}

	public abstract String setName();
}
