package businessLayer;


import java.io.Serializable;

public class BaseProduct extends MenuItem implements Serializable{

	 private static final long serialVersionUID = 6529685098267757690L;
	
	private String productName;
	private double productPrice;
	private double rating;
	private int calories;
	private int sodium;
	private int fat;
	private int protein;

	public BaseProduct(String productName, double productPrice) {
		super(productName);
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public BaseProduct(String name, double productPrice, double rating, int calories, int sodium, int fat, int protein) {
		super(name);
		this.productName = productName;
		this.productPrice = productPrice;
		this.rating = rating;
		this.calories = calories;
		this.sodium = sodium;
		this.fat = fat;
		this.protein = protein;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return productName;
	}

	@Override
	public double computePrice() {
		return this.productPrice;		
	}
	@Override
	public void displayMenu() {
		System.out.println(getMenuItemName()+" : " + computePrice());
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public double getRating() {
		return rating;
	}

	public int getCalories() {
		return calories;
	}

	public int getSodium() {
		return sodium;
	}

	public int getFat() {
		return fat;
	}

	public int getProtein() {
		return protein;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}
}
