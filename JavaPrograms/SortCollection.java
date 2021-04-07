import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.lang.Comparable;

class Basket{
	private final String name;
	private final Map<StockItem, Integer> list;

	public Basket(String name){
		this.name=name;
		this.list=new HashMap<>();
	}

	public int addToBasket(StockItem item, int quantity){
		if ((item!=null) && (quantity>0)) {
			int inStock = list.getOrDefault(item,0);
			list.put(item, inStock+quantity);
			return quantity;
		}
		return 0;
	}

	@Override
	public String toString(){
		String s = "\nShopping Basket " + name + " contains " + list.size() + " items\n";
		double totalCost = 0.0;
		for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
			s = s + item.getKey() + ", " + item.getValue() + " purchase.\n";
			totalCost = item.getKey().getPrice() * item.getValue();
		}
		return s + "Total Cost : " + totalCost; 
	}
}

class StockList{
	private final Map<String, StockItem> list;

	public StockList(){
		this.list = new LinkedHashMap<>();
	}

	public int addStock(StockItem item){
		if (item!=null) {
			StockItem inStock = list.getOrDefault(item.getName(), item);
			if (inStock!=item) {
				item.adjsutStock(item.quantityInStock());
			}

			list.put(item.getName(), item);
			return item.quantityInStock();
		}
		return 0;
	}

	public int sellStock(String item, int quantity){
		StockItem inStock = list.getOrDefault(item, null);
		if ((inStock!=null) && (inStock.quantityInStock()>quantity) && (quantity>0)) {
			inStock.adjsutStock(-quantity);
			return quantity;
		}

		return 0;
	}

	public StockItem get(String key){
		return list.get(key);
	}

	public Map<String, StockItem> Items(){
		return Collections.unmodifiableMap(list);
	}

	@Override
	public String toString(){
		String s = "\nStock List\n";
		double totalCost = 0.0;
		for (Map.Entry<String, StockItem> item : list.entrySet()) {
			StockItem stockItem = item.getValue();

			double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

			s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in Stock. Value of Item : ";
			s = s + String.format("%.2f",itemValue) + "\n";
			totalCost += itemValue; 
		}

		return s + "Total Stock Value " + String.format("%.2f",totalCost);
	}


}

class StockItem implements Comparable<StockItem>{
	private final String name;
	private double price;
	private int quantityStock = 0;

	public StockItem(String name, double price){
		this.name=name;
		this.price=price;
		this.quantityStock = 0;
	}

	public StockItem(String name, double price, int quantityStock){
		this.name=name;
		this.price=price;
		this.quantityStock=quantityStock;
	}

	public String getName(){
		return name;
	}

	public double getPrice(){
		return price;
	}

	public int quantityInStock(){
		return quantityStock;
	}

	public void setPrice(double newPrice){
		if (newPrice > 0) {
			this.price+=newPrice;
		}
	}

	public void adjsutStock(int stockHere){
		int newStock = this.quantityStock+stockHere;
		if (newStock>=0) {
			this.quantityStock = newStock;
		}
	}

	@Override
	public String toString(){
		return this.name + " : price " + this.price;
	}

	@Override
	public boolean equals(Object obj){
		System.out.println("Entering StockItem.equals");
		if (this == obj) {
			return true;
		}

		if ((obj==null) ||  ((obj.getClass()) != (this.getClass()))) {
			return false;
		}

		String theObject = ((StockItem)obj).getName();
		return this.name.equals(theObject);
	}

	@Override
	public int hashCode(){
		return this.name.hashCode() + 31;
	}

	@Override
	public int compareTo(StockItem o){
		if (o == this) {
			return 0;
		}

		if (o != null) {
			return this.name.compareTo(o.getName());
		}

		return 0;
		//throw NullPointerException;
	}
}	

public class SortCollection{
	public static StockList stockList = new StockList();

	public static void main(String[] args) {
		StockItem temp = new StockItem("Bread", 1.10, 100);
		stockList.addStock(temp);

		temp = new StockItem("Car", 12.50, 2);
		stockList.addStock(temp);

		temp = new StockItem("Chair", 62.00, 10);
		stockList.addStock(temp);

		temp = new StockItem("Cup", 0.50, 200);
		stockList.addStock(temp);

		temp = new StockItem("Door", 72.95, 4);
		stockList.addStock(temp);

		temp = new StockItem("Juice", 2.50, 36);
		stockList.addStock(temp);

		temp = new StockItem("Phone", 96.99, 35);
		stockList.addStock(temp);

		temp = new StockItem("Towel", 2.40, 80);
		stockList.addStock(temp);

		temp = new StockItem("Vase", 8.76, 40);
		stockList.addStock(temp);

		temp = new StockItem("Cake", 1.1, 7);
		stockList.addStock(temp);

		System.out.println(stockList);
	}
}