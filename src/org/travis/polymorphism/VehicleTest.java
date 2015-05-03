package org.travis.polymorphism;

import java.util.ArrayList;

public class VehicleTest {
	
	public static void main(String[] args)
	{
		ArrayList<Vehicle> vehicleList = new ArrayList<>();

		vehicleList.add(new car(4, 2.4));
		vehicleList.add(new truck());
		vehicleList.add(new tracktor());
		
		for (int i = 0; i < vehicleList.size(); i++)
		{
			vehicleList.get(i).setName();
		}

		for (int i = 0; i < vehicleList.size(); i++)
		{
			System.out.println(vehicleList.get(i).Name);
		}
	}
}

class tracktor extends Vehicle {
	
	@Override
	public String setName()
	{
		this.Name = "tracktor";
		return Name;
	}

}

class truck extends Vehicle {
	
	@Override
	public String setName()
	{
		this.Name = "truck";
		return Name;
	}

}

class car extends Vehicle {
	public car(int wheelCount, double engineSize)
	{
		this.wheelCount = wheelCount;
		this.engineSize = engineSize;
	}

	@Override
	public int wheelCount()
	{
		return wheelCount + 1;
	}

	@Override
	public double engineSize()
	{
		return engineSize + 1;
	}

	@Override
	public String setName()
	{
		this.Name = "car";
		return Name;
	}

}
