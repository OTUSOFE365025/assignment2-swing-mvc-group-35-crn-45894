import javax.swing.*;
import java.awt.*;

public class View {
	private JFrame frame;
	private JButton scanButton;
	private JTextArea itemsArea;
	private JLabel subtotalLabel;

	public View(String title) {
		frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLayout(new BorderLayout());

		scanButton = new JButton("Scan");
		itemsArea = new JTextArea();
		itemsArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(itemsArea);
		subtotalLabel = new JLabel("Subtotal: $0.00");

		frame.add(scanButton, BorderLayout.NORTH);
		frame.add(scrollPane, BorderLayout.CENTER);
		frame.add(subtotalLabel, BorderLayout.SOUTH);

		frame.setVisible(true);
	}

	public JButton getScanButton() { return scanButton; }
	public JTextArea getItemsArea() { return itemsArea; }
	public JLabel getSubtotalLabel() { return subtotalLabel; }
}
