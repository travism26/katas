package org.travis.polymorphism.nodeExample;


public class polymorphismTest {

	public static void main(String[] args)
	{
		AdditionNode add = new AdditionNode();

		add.left = new ValueNode(11.5);
		add.right = new ValueNode(9.5);

		System.out.println(add.evaluate());
	}
}

/*
 * Sub Classes to extend the functionality of the app.
 */
class AdditionNode extends OpNode {

	double evaluate()
	{
		return left.evaluate() + right.evaluate();
	}
}

class MultiplicationNode extends OpNode {

	double evaluate()
	{
		return left.evaluate() * right.evaluate();
	}
}