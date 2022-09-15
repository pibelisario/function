package app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entities.Product;
import util.UperCase;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// List<String> uperName = list.stream().map(new
		// UperCase()).collect(Collectors.toList());
		// List<String> uperName =
		// list.stream().map(Product::staticUperName).collect(Collectors.toList());
		// List<String> uperName =
		// list.stream().map(Product::nonStaticUperName).collect(Collectors.toList());

		// Function<Product, String> uper = p -> p.getName().toUpperCase();

		/*Function<Product, String> uper = new Function<Product, String>() {

			@Override
			public String apply(Product p) {
				return p.getName().toUpperCase();
			}
		};*/
		//List<String> uperName = list.stream().map(uper).collect(Collectors.toList());
		 List<String> uperName = list.stream().map(p ->
		 p.getName().toUpperCase()).collect(Collectors.toList());

		uperName.forEach(System.out::println);
	}

}
