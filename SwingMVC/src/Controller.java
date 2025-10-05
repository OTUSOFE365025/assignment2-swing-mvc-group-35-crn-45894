public class Controller {
	private Model model;
	private View view;
	private Scanner scanner;


	public Controller(Model model, View view, Scanner scanner) {
		this.model = model;
		this.view = view;
		this.scanner = scanner;

		view.getScanButton().addActionListener(e -> {
			String upc = scanner.generateUPC();
			if (upc != null) {
				model.addItemByUPC(upc);
				updateView();
			}
		});
	}



	private void updateView() {
		StringBuilder sb = new StringBuilder();
		for (Model.Product p : model.getScannedItems()) {
			sb.append(p.name).append(" - $").append(p.price).append("\n");
		}
		view.getItemsArea().setText(sb.toString());
		view.getSubtotalLabel().setText(String.format("Subtotal: $%.2f", model.getSubtotal()));
	}
}
