package assignmentone;

public class lambda_basic {

	interface A{
		int sum(int x,int y);
	}

	interface B{
		String upperCase(String x);
	}

 

	public static void main(String[] args) {

		A a = (a1,b1)->a1+b1;
		System.out.println(a.sum(17, 20));

		B b = str->str.toUpperCase();
		System.out.println(b.upperCase("saketh"));
	}
}
