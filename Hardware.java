//contents hardware classes(motherboard,cpu,ram,hard disk drive,graphics card
public class Hardware {
	public class Motherboard extends CommonFeautures {
		
		private String cpuType;
		private int memory;
		private  int ports;
		private int stock;
		
		//constructor
		public Motherboard(String name,int year,String manufacturer,double price,String cpuType,int memory,int ports,int stock) { //constructor
			super.setName(name);
			super.setYear(year);
			super.setManufacturer(manufacturer);
			super.setPrice(price);
			this.cpuType=cpuType;
			this.memory=memory;
			this.ports=ports;
			this.stock=stock; }
		
		//getters
		public String getCpuType() {
			return cpuType; }
		
		public int getMemory() {
			return memory; }
		
		public int getPorts() {
			return ports; }
		
		//decreases the stock
		public void DecreaseStock() {
		 if(stock>0) stock-=1;
		  else stock=0;
		}
		
		public int getStock()
		{ return stock;}
		
		public String toString() {
			return(super.toString()+'\n'+"Cpu Type:"+getCpuType()+'\n'+"Memory:"+getMemory()+"GB"+'\n'+"Number of ports"+getPorts()+'\n'+"Stock:"+ getStock());
		}
	}

public class CPU extends CommonFeautures  {
			
		private double speed;
		private int cores;
		private int stock;
			
			
			public CPU(String name,int year,String manufacturer,double price,double speed,int cores,int stock)
			{ 	super.setName(name);
				super.setYear(year);
				super.setManufacturer(manufacturer);
				super.setPrice(price);	
				this.speed=speed;
				this.cores=cores;
				this.stock=stock;
			}
			
			
			
			public double getSpeed() 
			{ return speed; }
			
			public int getCores() 
			{ return cores; }
			
			public void DecreaseStock() {
				 if(stock>0) stock-=1;
				else stock=0;
			}
			
			public int getStock()
			{ return stock;}
			
			public String toString()
			{ return(super.toString()+'\n'+"Speed:"+ getSpeed()+"GHz"+'\n'+"Number of cores"+ getCores()+'\n'+"Stock:"+ getStock()); }
	}	
public class GraphicsCard extends CommonFeautures  {
			
		private String chipset;
		private int memory;
		private int stock;
			
			
			public GraphicsCard(String name,int year,String manufacturer,double price,String chipset,int memory,int stock)
			{ super.setName(name);
				super.setYear(year);
				super.setManufacturer(manufacturer);
				super.setPrice(price);
				this.chipset=chipset;
				this.memory=memory;
				this.stock=stock; }
			
		
			
			public String getChipset()
			{ return chipset; }
			
			public int getMemory()
			{ return memory; }
			
			public void DecreaseStock() {
				if(stock>0) stock-=1;
				else stock=0;
			}
			
			public int getStock()
			{ return stock;}
			
			public String toString()
			{ return(super.toString()+'\n'+"Chipset:"+ getChipset()+'\n'+"Memory:"+ getMemory()+"GB"+'\n'+"Stock:"+ getStock());}
	}
public class RAM extends CommonFeautures {
		
	private String ramtype;
	private int capacity;
	private int speed;
	private int stock;
		
		
		public RAM(String name,int year,String manufacturer,double price,String ramtype,int capacity,int speed,int stock)
		{ 	super.setName(name);
			super.setYear(year);
			super.setManufacturer(manufacturer);
			super.setPrice(price);	
			this.ramtype=ramtype;
			this.capacity=capacity;
			this.speed=speed;
			this.stock=stock; }
		
		
		
		public String getRamType()
		{ return ramtype; }
		
		public int getCapacity()
		{ return capacity; }
		
		public int getSpeed() 
		{ return speed; }
		
		public int getStock() 
		{return stock; }
		
		public void DecreaseStock() {
				 if(stock>0) stock-=1;
				else stock=0;
		}
		
		public String toString() 
		{return(super.toString()+'\n'+"Type:"+getRamType()+'\n'+"Capacity:"+ getCapacity()+"GB"+'\n'+"Speed:"+getSpeed()+"MHz"+'\n'+"Stock:" +getStock());
		}
	}
public class HardDiskDrive extends CommonFeautures {
			
		private String harddrivetype;
		private double harddrivelength;
		private int capacity;
		private int stock;
		
			
			public HardDiskDrive(String name,int year,String manufacturer,double price,String harddrivetype,double harddrivelength,int capacity,int stock) 
			{ 	super.setName(name);
				super.setYear(year);
				super.setManufacturer(manufacturer);
				super.setPrice(price);
				this.harddrivetype=harddrivetype;
				this.harddrivelength=harddrivelength;
				this.capacity=capacity;
				this.stock=stock; }
			
			
			
			public String getDriveType() 
			{ return harddrivetype; }
			
			public double getDriveLength() 
			{ return harddrivelength; }
			
			public int getCapacity() 
			{ return capacity; }
			
			public int getStock() 
			{ return stock; }
			
			public void DecreaseStock() {
				 if(stock>0) stock-=1;
				else stock=0;
			}
			
			public String toString() 
			{ return(super.toString()+'\n'+"Type:"+getDriveType()+'\n'+"Length:"+ getDriveLength()+"inches"+'\n'+"Capacity:"+getCapacity()+"GB"+'\n'+"Stock"+ getStock()); }
			
	}
}