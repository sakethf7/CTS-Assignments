package assignmentone;

import java.util.Arrays;
import java.util.List;

public class functionalprogrammingreduce {

	public static void main(String[] args) {
		
		
		       List<String> stringList = Arrays.asList("cognizant", "adm", "cherry", "date", "fig");

		       String result = stringList.stream()
		               .map(String::toUpperCase) // Convert to uppercase
		               .filter(s -> s.length() >= 4) // Filter strings with 4 or more characters
		               .reduce("", (partialResult, str) -> partialResult + str); // Concatenate using reduce

		       System.out.println(result);
		   }
		}
