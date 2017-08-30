import javax.swing.JOptionPane;

public class printpogui{

	public static void main(String[] args){
		String itemname;
		double price;
		int qty;

		itemname =JOptionPane.showInputDialog("name of purchars item:");
		price =Double.parseDouble(JOptionPane.showInputDialog("Price of one item:"));
		qty=Integer.parseInt(
			JOptionPane.showInputDialog("Quantity:"));
		JOptionPane.showMessageDialog(null,
			"Purchase Order:\n\n"+
			"Item:" + itemname +"\nQuantity: "+ qty+
			"\nTotal price: $"+ price*qty);
	}
}