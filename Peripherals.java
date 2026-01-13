//contents peripherals classes (monitor,keyboard,mouse,printers)
public class Peripherals {
	
	public class Monitor extends CommonFeautures {
		
	private String monitortype;
	private double panelsize;
	private String resolution;
	private String ports;
	private int stock;
		
		public Monitor(String name,int year,String manufacturer,double price,String monitortype,double panelsize,String resolution,String ports,int stock)
		{ 	super.setName(name);
			super.setYear(year);
			super.setManufacturer(manufacturer);
			super.setPrice(price);
			this.monitortype=monitortype;
			this.panelsize=panelsize;
			this.resolution=resolution;
			this.ports=ports;
			this.stock=stock; }
		
		public String getMonitorType()
		{ return monitortype; }
		
		public double getPanelSize() 
		{ return panelsize; }
		
		public String getResolution() 
		{ return resolution; }
		
		public String getPorts() 
		{ return ports; }
		
		public int getStock() 
		{ return stock; }
		
		public void DecreaseStock() {
		 if(stock>0) stock-=1;
		  else stock=0;
		}
		
		public String toString() 
		 { return(super.toString()+'\n'+"Monitor Type:"+getMonitorType()+'\n'+"Panel Size:"+getPanelSize()+'\n'+"Resolution:"+getResolution()+'\n'+"Port:"+getPorts()+'\n'+"Stock:"+getStock());}
	}
	
	public class Keyboard extends CommonFeautures {
		
	private String connection;
	private int stock;
		
		public Keyboard(String name,int year,String manufacturer,double price,String connection,int stock) 
		{ 	super.setName(name);
			super.setYear(year);
			super.setManufacturer(manufacturer);
			super.setPrice(price);
			this.connection=connection;
			this.stock=stock; }
		
		public String getConnection() 
		{ return connection; }
		
		public int getStock() 
		{ return stock; }
		
		public void DecreaseStock() {
		 if(stock>0) stock-=1;
		  else stock=0;
		}

		public String toString() 
		{ return(super.toString()+'\n'+"Connection:"+getConnection()+'\n'+"Stock:"+getStock()); }
	}
	
	public class Mouse extends CommonFeautures {
		
	private String technology;
	private String connection;
	private int stock;
		
		public Mouse(String name,int year,String manufacturer,double price,String technology,String connection,int stock)
		{ 	super.setName(name);
			super.setYear(year);
			super.setManufacturer(manufacturer);
			super.setPrice(price);
			this.technology=technology;
			this.connection=connection;
			this.stock=stock; }
		
		public String getTechnology() 
		{ return technology; }
		
		public String getConnection() 
		{ return connection; }
		
		public int getStock() 
		{ return stock; }
		
		public void DecreaseStock() {
		 if(stock>0) stock-=1;
		  else stock=0;
		}
	
		public String toString() 
		{ return(super.toString()+'\n'+"Mouse Technology:"+getTechnology()+'\n'+"Connection:"+getConnection()+'\n'+"Stock:"+getStock()); }
	
	}
	 
	public class Printer extends CommonFeautures {
		
	private String technology;
	private String printtype;
	private int stock;
		
		public Printer(String name,int year,String manufacturer,double price,String technology,String printtype,int stock)
		{ 	super.setName(name);
			super.setYear(year);
			super.setManufacturer(manufacturer);
			super.setPrice(price);
			this.technology=technology;
			this.printtype=printtype;
			this.stock=stock; }
		
		public String getTechnology() 
		{ return technology; }
		
		public String getPrintType() 
		{ return printtype; }
		
		public int getStock() 
		{ return stock; }
		
		public void DecreaseStock() {
		 if(stock>0) stock-=1;
		  else stock=0;
		}

		public String toString() 
		{ return(super.toString()+'\n'+"Printer Technology:"+getTechnology()+'\n'+"Print Type:"+getPrintType()+'\n'+"Stock:"+getStock()); }
	}
}
