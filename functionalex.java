package assignmentone;

import java.util.function.Function;



public class functionalex {



	public static void main(String args[]){
		Function<String,Integer> function = (str)->str.length();
		System.out.println(function.apply("Saketh"));

		Function<String,String> function1 = (str)->str.toLowerCase();
		System.out.println(function1.apply("SAKETH"));
	}
}
