package innerclasses;

public class Outer {
	String className="Outer instance variable";
	public class Inner{
		public  void print(){
			System.out.println(className);
		}
	}
	public void methodWithInnerClass(){
		final class InnerClassInMethod{
			public void printInnerClassInMethod(){
				System.out.println(className);
			}
		}
	}
	
}
