//class for the orders
public class Order extends CommonFeautures {
		
		private int ordercode;
		private String customername;
		private String telephone;
		private String orderdate;
		private String arrivaldate;
		private double price;
		private String orderstatus;
		
		public Order(String name,String customername,String telephone,String orderdate,String arrivaldate,String orderstatus,double price,int ordercode)
		{ this.ordercode=ordercode;
		  this.ordercode+=1;
		  super.setName(name);
		  this.customername=customername;
		  this.telephone=telephone;
		  this.orderdate=orderdate;
		  this.arrivaldate=arrivaldate;
		  this.price=price;
		  this.orderstatus=orderstatus; }
		
		public int getOrderCode() 
		{ return this.ordercode; }
		
		public String getCustomerName() 
		{ return customername; }
		
		public String getTelephone() 
		{ return telephone; }
		
		public String getOrderDate() 
		{ return orderdate; }
		
		public String getArrivalDate() 
		{ return arrivaldate; }
		
		public String getOrderStatus() 
		{ return orderstatus; }
		
		public static double HardwareCost(double price) 
		{	price=price-price*0.25;
			return price; }
		
		public static double PeripheralsCost(double price)
		{ price=price-price*0.10; 
		  return price; }
		
		 public double getPrice()
		 { return price; }
		 
		 public String toString() 
		 { return("Model Name:"+super.getName()+" "+"Order Code:"+getOrderCode()+" "+"Customer Name:"+getCustomerName()+" "+'\n'+"Telephone:"+getTelephone()+" "+"Order Date:"+getOrderDate()+" "+"Expected date of arrival:"+getArrivalDate()+" "+'\n'+"Order Status:"+getOrderStatus()+" "+"Final Cost:"+getPrice()+"$"); }
		 
}