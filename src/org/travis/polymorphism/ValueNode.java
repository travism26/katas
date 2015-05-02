package org.travis.polymorphism;

class ValueNode extends Node {

	double value;

	public ValueNode(double value)
	{
		this.value = value;
	}

	@Override
	double evaluate()
	{
		return value;
	}
}