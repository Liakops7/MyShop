//class for the sales
public class Sale extends CommonFeautures  {

	private  int salecode;
	private String customername;
	private String telephone;
	private String saledate;
	private double price;
	
	
	
	
	public Sale(String name,String customername,String telephone,String saledate,double price,int salecode) 
	{  this.salecode=salecode;
	   this.salecode+=1;
	   super.setName(name);
	   this.customername=customername;
	   this.telephone=telephone;
	   this.saledate=saledate;
	   this.price=price; }
	  
	public int getSalecode() 
	{ return this.salecode; }
	
	public String getCustomerName() 
	{ return customername; }
	
	public String getTelephone() 
	{ return telephone; }
	
	public String getSaledate() 
	{ return saledate; }
	
	public static double HardwareCost(double price) {
			price=(price-price*0.25);
			return price;
	}		
	public static  double PeripheralsCost(double price) {
			price=(price-price*0.10);
			return price;
	}

	public double getPrice() 
	{ return price; }
	
	public String toString() 
	{ return("Model name:"+super.getName()+" "+"Sale Code:"+getSalecode()+" "+"Customer Name:"+getCustomerName()+" "+'\n'+"Telephone:"+getTelephone()+" "+"Sale Date:"+getSaledate()+" "+"Final Cost:"+getPrice()+"$"); }
		
			
}
