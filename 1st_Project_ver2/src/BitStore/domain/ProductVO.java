package BitStore.domain;

import java.io.Serializable;

public class ProductVO implements Serializable {
	private int productNo;
	private String productName;
	private int stock;
	private String exprtDate;
	private int price;
	
	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getExprtDate() {
		return exprtDate;
	}

	public void setExprtDate(String exprtDate) {
		this.exprtDate = exprtDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", stock=" + stock + ", exprtDate="
				+ exprtDate + ", price=" + price + "]";
	}
	
}
