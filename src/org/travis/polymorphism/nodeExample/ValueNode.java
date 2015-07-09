package org.travis.polymorphism.nodeExample;


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