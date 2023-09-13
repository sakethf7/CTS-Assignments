package assignmentone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;
import java.util.function.Supplier;

 

public class Consumer_supplier {

 

	public static void main(String[] args) {

		Consumer<String> consumer = str->System.out.println(str);
		consumer.accept("My name is Saketh.");

		Supplier<String> supplier = ()->{
			LocalDateTime dt = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			return dt.format(formatter);
		};
		System.out.println(supplier.get());
	}
}
