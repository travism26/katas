package org.travis.polymorphism.nodeExample;

abstract class OpNode extends Node {
	Node left;
	Node right;

	abstract double evaluate();
}
