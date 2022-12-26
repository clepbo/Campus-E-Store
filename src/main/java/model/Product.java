package model;

public class Product {
	private String productId, vendorId, productName, datePosted, productStatus, adsStatus, brandName, keywords;
	private byte productSample1, prodcutSample2, productSample3;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDatePosted() {
		return datePosted;
	}

	public void setDatePosted(String datePosted) {
		this.datePosted = datePosted;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public String getAdsStatus() {
		return adsStatus;
	}

	public void setAdsStatus(String adsStatus) {
		this.adsStatus = adsStatus;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public byte getProductSample1() {
		return productSample1;
	}

	public void setProductSample1(byte productSample1) {
		this.productSample1 = productSample1;
	}

	public byte getProdcutSample2() {
		return prodcutSample2;
	}

	public void setProdcutSample2(byte prodcutSample2) {
		this.prodcutSample2 = prodcutSample2;
	}

	public byte getProductSample3() {
		return productSample3;
	}

	public void setProductSample3(byte productSample3) {
		this.productSample3 = productSample3;
	}

}
