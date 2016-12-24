package innerclasses;

public class TestInnerClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner in=new Outer().new Inner();
		in.print();
		
		new Outer().methodWithInnerClass();
	}

}
