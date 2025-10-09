import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Scanner {
	private List<String> upcList = new ArrayList<>();
	private Random random = new Random();


	public Scanner(String file) {
		try {
			java.util.Scanner sc = new java.util.Scanner(new File(file));
			while (sc.hasNextLine()) {
				String[] tokens = sc.nextLine().trim().split("\\s+");
				if (tokens.length >= 1) {
					upcList.add(tokens[0]);
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Product file not found!");
		}
	}


	public String generateUPC() {
		if (upcList.isEmpty()) return null;
		int idx = random.nextInt(upcList.size());
		return upcList.get(idx);
	}
}
