import javax.swing.SwingUtilities;

public class MySwingMVCApp {
	public static void main(String[] args) {

		System.out.println("Current working dir: " + System.getProperty("user.dir"));

		SwingUtilities.invokeLater(() -> {
			Scanner scanner = new Scanner("products.txt");
			Model model = new Model("products.txt");
			View view = new View("Cash Register");
			Controller controller = new Controller(model, view, scanner);
		});
	}
}
