package com.igorjmv2000.gmail.course.entities.enums;

public enum OrderStatus {
	WATTING_PAYMENT(1, "Watting payment"),
	PAID(2, "Paid"),
	SHIPPED(3, "Shipped"),
	DELIVERED(4, "Delivered"),
	CANCELED(5, "Canceled");

	private int code;
	private String description;
	
	private OrderStatus(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus x : OrderStatus.values()) {
			if(x.getCode() == code) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Invalid OrderStatus code! Id: " + code);
	}
}
