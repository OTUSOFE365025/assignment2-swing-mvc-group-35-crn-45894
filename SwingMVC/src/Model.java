import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Model {
	private Map<String, Product> productCatalog = new HashMap<>();
	private List<Product> scannedItems = new ArrayList<>();

	public Model(String productFilePath) {
		loadProducts(productFilePath);
	}

	private void loadProducts(String path) {
		try {
			java.util.Scanner sc = new java.util.Scanner(new File(path));
			while (sc.hasNextLine()) {
				String[] tokens = sc.nextLine().trim().split("\\s+");
				if (tokens.length >= 3) {
					String upc = tokens[0];
					String name = tokens[1];
					double price = Double.parseDouble(tokens[2]);
					productCatalog.put(upc, new Product(upc, name, price));
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Product file not found!");
		}
	}

	public void addItemByUPC(String upc) {
		if (productCatalog.containsKey(upc)) {
			scannedItems.add(productCatalog.get(upc));
		}
	}

	public List<Product> getScannedItems() {
		return scannedItems;
	}

	public double getSubtotal() {
		return scannedItems.stream().mapToDouble(p -> p.price).sum();
	}


	public static class Product {
		public String upc;
		public String name;
		public double price;

		public Product(String upc, String name, double price) {
			this.upc = upc;
			this.name = name;
			this.price = price;
		}
	}
}
