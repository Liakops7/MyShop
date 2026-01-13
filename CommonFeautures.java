 public  class CommonFeautures {
	private String name;
	private int year;
	private String manufacturer;
	private double price;
	
	public void setName(String name) {
		this.name=name; }
	
	public void setYear(int year) {
		this.year=year; }
		
	public void setManufacturer(String manufacturer) {
			this.manufacturer=manufacturer; }
			
	public void setPrice(double price) {
			this.price=price; }
	
	public  String getName() 
		{return name; }
	
	public int getYear() 
		{ return year; }
	
	public String getManufacturer()
		{ return manufacturer; }
	
	public double getPrice()
	    { return (price); }
	
	public String toString() {
		return("Model Name:"+getName()+" "+"Year:"+getYear()+" "+"Manufacturer:"+getManufacturer()+" "+"Price:"+getPrice());
	}
	
	
}

