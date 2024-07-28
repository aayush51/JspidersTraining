package Encapsulation.SwiggyOrderProcess;

public class Order {
	private int orderId;
	private String orderDate;
	private String customerName;
	private String orderAmount;
	
	public Order() {

	}
	
	public Order(int orderId, String orderDate, String customerName, String orderAmount) {
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.customerName = customerName;
		this.orderAmount = orderAmount;
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public String getOrderDate() {
		return orderDate;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String getOrderAmount() {
		return orderAmount;
	}
	
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	public void displayOrderDetails() {
		System.out.println("Order ID: " + orderId);
		System.out.println("Order Date: " + orderDate);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Order Amount: " + orderAmount);
	}

}
