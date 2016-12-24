package otherpackage;

import innerclasses.Outer;

public class TestRunner extends Outer{
	public static void main(String [] args){
		Outer ou = new Outer();
		Outer.Inner in = ou.new Inner();
		in.print();
		
	}
}
