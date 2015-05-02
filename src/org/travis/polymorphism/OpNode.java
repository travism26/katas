package org.travis.polymorphism;

abstract class OpNode extends Node {
	Node left;
	Node right;

	abstract double evaluate();
}
