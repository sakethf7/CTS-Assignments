package assignmentone;

	import java.util.Arrays;
	import java.util.Comparator;
	import java.util.List;
	public class lambdacomparator {

		public static void main(String[] args) {
				 

				List<String> names = Arrays.asList("ABC", "CDEF", "A", "BV");

				names.sort (Comparator.comparingInt(str->str.length()));
				
				names.forEach (str->System.out.println(str));

		}
	}