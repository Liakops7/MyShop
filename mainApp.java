import java.util.*;

public class mainApp {
	
	public static void main(String args[]) {
		/* THEOFILOS THEODORIDIS,B EXAMHNO,3130068
		   HLIAS LIAKOPOULOS,B EXAMHNO,3130115
		   THEODOROS STAMATIADIS,B EXAMHNO,3130192 */
		
		//variable iintializations
		char menutype=' ';
		char menutype1=' ';
		String modeltype=" ";
		Scanner type=new Scanner(System.in);
		int productcount=0;
		String keyboardtype=" ";
		int check=0;
		String successful=" ";
		boolean again=true;
		int salecode=99; //we want salecode to start from 100(salecode+=1 in sale class)
		int ordercode=999; //we want ordercode to start from 1000(ordercode+=1 in order class)
		
		System.out.println("Welcome!!"+'\n');
		
		Hardware hardw=new Hardware(); //because of nested classes
		Peripherals periph=new Peripherals();//because of nested classes
		
		String productnames[]=new String[20]; //keeping the model names 
		ArrayList<Sale> sales=new ArrayList<Sale>(); //arraylist with Sale-type objects
		ArrayList<Order> orders=new ArrayList<Order>(); //arraylist with Order-type objects
		ArrayList<Object> Available=new ArrayList<Object>();//arraylist with products(objects)
		
		//adding to Arraylist Available the products
		Available.add(periph.new Monitor("Turbo-X TX-195CM",2012,"Turbo-X",89,"LCD",19.5,"1600x900","Composite",6));
		Available.add(periph.new Monitor("Samsung T23C350EU",2013,"Samsung",165,"LED",23,"1920x1080","HDMI",6));
		Available.add(periph.new Monitor("Samsung L525C7508",2014,"Samsung",229,"LED",24,"1920x1080","HDMI",2));
		Available.add(periph.new Keyboard("Turbo-X Silicon",2014,"Turbo-X",9.9,"wired",5));
		Available.add(periph.new Keyboard("Turbo-X Media Center",2014,"Turbo-X",29.9,"wireless",4));
		Available.add(periph.new Keyboard("Razer Black Widow",2014,"Razer",160,"wired",1));
		Available.add(periph.new Mouse("Turbo-X EGG-200",2013,"Turbo-X",7,"Optical","wireless",2));
		Available.add(periph.new Mouse("Turbo-X GM-700",2014,"Turbo-X",39.9,"Laser","wireless",1));
		Available.add(periph.new Mouse("Logitech M500",2014,"Logitech",7,"Laser","wired",0));
		Available.add(periph.new Printer("Samsung SL-M2825ND",2014,"Samsung",125,"Laser","Colored",1));
		Available.add(periph.new Printer("HP CP1025 Color",2014,"HP",119,"Laser","Colored",0));
		Available.add(periph.new Printer("HP Officejet",2014,"HP",94.9,"Inkjet","Colored",2));
		Available.add(hardw.new Motherboard("Gigabyte Z87X-D3H",2014,"Gigabyte",158,"Intel",32,4,1));
		Available.add(hardw.new Motherboard("Gigabyte B85M-HD3",2014,"Gigabyte",70,"Intel",16,2,1));
		Available.add(hardw.new Motherboard("MSI A55M-P33",2013,"MSI",49.9,"AMD",32,2,5));
		Available.add(hardw.new CPU("AMD FX-4300",2013,"AMD",99.9,3.8,4,2));
		Available.add(hardw.new CPU("Intel Core i3-4130",2013,"Intel",104.7,3.4,2,5));
		Available.add(hardw.new CPU("Intel Core i5-4440",2014,"Intel",172.9,3.1,4,5));
		Available.add(hardw.new GraphicsCard("Palit nVidia GT 630",2013,"Palit",61.5,"nVidia",2,4));
		Available.add(hardw.new GraphicsCard("Sapphire 280 X Battlefield Edition R9",2014,"Sapphire",359,"AMD",4,4));
		Available.add(hardw.new GraphicsCard("MSI N750 TF",2014,"MSI",339.6,"nVidia",4,4));
		Available.add(hardw.new RAM("Corsair XMS",2014,"Corsair",89.9,"DDR3",8,1600,2));
		Available.add(hardw.new RAM("Crucial Ballistix Sport XT",2014,"Crucial",76.9,"DDR3",4,1600,1));
		Available.add(hardw.new RAM("Adata Bulk",2013,"Adata",43,"DDR3",4,1600,5));
		Available.add(hardw.new HardDiskDrive("Western Digital Sata III",2014,"Western Digital",52,"HDD",2.5,750,3));
		Available.add(hardw.new HardDiskDrive("Adata Sata III",2014,"Adata",53,"SSD",2.5,64,25));
		Available.add(hardw.new HardDiskDrive("SanDisk Sata III Extreme II ",2014,"SanDisk",349.9,"SSD",2.5,480,1));
	
	//heres starts the loop of the programm
	while(again) {	
		System.out.println("Please type the correct number depending of the menu you want to go"+'\n');
		System.out.println("0=Available Products"+'\n'+"1=Orders"+'\n'+"2=Sales"+'\n'+"3=Exit");
			do { //keeping sure that user will type the correct number 0,1,2,3
				keyboardtype=type.nextLine();
				menutype=keyboardtype.charAt(0);
				check=Character.getNumericValue(menutype);
				if (Character.isLetter(menutype) || (check>3)) System.out.println("Type the correct number!");
				
				else if((check==0)||(check==1)||(check==2)||(check==3)) break; 
			}while((check!=0)||(check!=1)||(check!=2)||(check!=3));
		
		switch(check) { //Main Menu first switch
			case(0): 	System.out.println('\n'); //Available Products
						System.out.println("0=Hardware"+'\n'+"1=Peripherals"+'\n'+"2=Main Menu"); //Hardware or peripherals
						do { //keeping sure that user will type the correct number 0,1
							keyboardtype=type.nextLine();
							menutype1=keyboardtype.charAt(0);
							check=Character.getNumericValue(menutype);
							if (Character.isLetter(menutype) || (check>2)) System.out.println("Type the correct number!");
							else if((check==0)||(check==1)||(check==2)) break; 
							  
						}while((check!=0)||(check!=1)||(check!=2));
						
			if(check==2) break;	//back to main menu(ends the case)
					
				switch(menutype1) { //motherboard or processor or graphics card or ram or hard drive
					case('0'): System.out.println("0=Motherboard"+'\n'+"1=Processor"+'\n'+"2=Graphics Card"+'\n'+"3=RAM"+'\n'+"4=Hard Drives"+'\n'+
												  "5=Main Menu");
									do { //keeping sure that user will type the correct number 0,1,2,3,4
										keyboardtype=type.nextLine();
										menutype=keyboardtype.charAt(0);
										check=Character.getNumericValue(menutype);
										if (Character.isLetter(menutype) || (check>5)) System.out.println("Type the correct number!");
										
										else if((check==0)||(check==1)||(check==2)||(check==3)||(check==4)||(check==5)) break; 
									}while((check!=0)||(check!=1)||(check!=2)||(check!=3)||(check!=4)||check!=5);
					if(check==5) break;	//back to main menu(ends the case)			
							switch(check) { //for each one Hardware category,third switch
											case(0):
												modeltype="Motherboard";
												System.out.println("Please choose the model you want"+'\n');
												productcount=hardwprint(Available,productnames,menutype1,modeltype); 
												System.out.println("*************************************");
												successful=hardwfeautures(orders,sales,Available,productnames,productcount,modeltype,salecode,ordercode); 
												
												if(successful.equals("sale")) salecode+=1;
										        else if(successful.equals("order")) ordercode+=1;
												else {
													salecode+=1;
													ordercode+=1;
												}
											break;
										
											case(1): //processor models
												modeltype="CPU";	
												System.out.println("Please choose the model you want"+'\n');
												 productcount=hardwprint(Available,productnames,menutype1,modeltype);
												System.out.println("*************************************");
												successful=hardwfeautures(orders,sales,Available,productnames,productcount,modeltype,salecode,ordercode);  
												if(successful.equals("sale")) salecode+=1;
										        else if(successful.equals("order")) ordercode+=1;
												else {
													salecode+=1;
													ordercode+=1;
												}
											break;
											
											case(2): //graphics models
												modeltype="GraphicsCard";
												System.out.println("Please choose the model you want"+'\n');
												productcount=hardwprint(Available,productnames,menutype1,modeltype);
												System.out.println("*************************************");
												successful=hardwfeautures(orders,sales,Available,productnames,productcount,modeltype,salecode,ordercode);  
												if(successful.equals("sale")) salecode+=1;
										        else if(successful.equals("order")) ordercode+=1;
												else {
													salecode+=1;
													ordercode+=1;
												}
											break;
											
											case(3): //ram models
												modeltype="RAM";	
												System.out.println("Please choose the model you want"+'\n');
												productcount=hardwprint(Available,productnames,menutype1,modeltype);
												System.out.println("*************************************");
												successful=hardwfeautures(orders,sales,Available,productnames,productcount,modeltype,salecode,ordercode); 
												if(successful.equals("sale")) salecode+=1;
										        else if(successful.equals("order")) ordercode+=1;
												else {
													salecode+=1;
													ordercode+=1;
												}
											break;
											
											case(4): //hard drive models
												modeltype="HardDiskDrive";	
												System.out.println("Please choose the model you want"+'\n');
												productcount=hardwprint(Available,productnames,menutype1,modeltype);
												System.out.println("*************************************");
												successful=hardwfeautures(orders,sales,Available,productnames,productcount,modeltype,salecode,ordercode);  
												if(successful.equals("sale")) salecode+=1;
										        else if(successful.equals("order")) ordercode+=1;
												else {
													salecode+=1;
													ordercode+=1;
												}
											break;
									}
						
							break; //case 0
						
					case('1'): // monitors or keyboards or mouses or printers 
									System.out.println("0=Monitors"+'\n'+"1=Keyboards"+'\n'+"2=Mouse"+'\n'+"3=Printers"+'\n'+"4=Main Menu");
									do {
										keyboardtype=type.nextLine();
										menutype=keyboardtype.charAt(0);
										check=Character.getNumericValue(menutype);
										if (Character.isLetter(menutype) || (check>4)) System.out.println("Type the correct number!");
										
										else if((check==0)||(check==1)||(check==2)||(check==3)||(check==4)) break; 
									}while((check!=0)||(check!=1)||(check!=2)||(check!=3)||(check!=4));
					if(check==4) break; //back to main menu(ends the case)				
							switch(check) { //for each one,fourth switch
										
										case(0):
											modeltype="Monitor";	
											System.out.println("Please choose the model you want"+'\n');
											productcount=periphprint(Available,productnames,menutype1,modeltype);
											System.out.println("*************************************");
											successful=periphfeautures(orders,sales,Available,productnames,productcount,modeltype,salecode,ordercode); 
											if(successful.equals("sale")) salecode+=1;
										        else if(successful.equals("order")) ordercode+=1;
												else {  salecode+=1;
														ordercode+=1; }
										break;
										
										case(1): //keyboard models
											modeltype="Keyboard";
											System.out.println("Please choose the model you want"+'\n');
											productcount=periphprint(Available,productnames,menutype1,modeltype);
											System.out.println("*************************************");
											successful=periphfeautures(orders,sales,Available,productnames,productcount,modeltype,salecode,ordercode); 
											if(successful.equals("sale")) salecode+=1;
										        else if(successful.equals("order")) ordercode+=1;
												else { salecode+=1;
													   ordercode+=1; }	
										break;
										
										case(2): //mouse models
											modeltype="Mouse";
											System.out.println("Please choose the model you want"+'\n');
											productcount=periphprint(Available,productnames,menutype1,modeltype);
											System.out.println("*************************************");
											successful=periphfeautures(orders,sales,Available,productnames,productcount,modeltype,salecode,ordercode); 
											if(successful.equals("sale")) salecode+=1;
										        else if(successful.equals("order")) ordercode+=1;
												else { salecode+=1;
													   ordercode+=1; }	
										break;
										
										case(3): //printer models
											modeltype="Printer";	
											System.out.println("Please choose the model you want"+'\n');
											productcount=periphprint(Available,productnames,menutype1,modeltype);
											System.out.println("*************************************");
											successful=periphfeautures(orders,sales,Available,productnames,productcount,modeltype,salecode,ordercode); 
											if(successful.equals("sale")) salecode+=1;
										        else if(successful.equals("order")) ordercode+=1;
												else { salecode+=1;
													ordercode+=1; }
										break;
							}
					break; //case 1	
					
						
				}

			break;	//first case 0
			
			case(1): int ordercounter=0;
					if(orders.isEmpty()) System.out.println("Sorry,We haven't any orders yet"+'\n');
					
					else {
							System.out.println("*********************"+'\n'+"Please choose your order"+'\n'); //for sales
							for(Order ob: orders) {
								ordercounter+=1;
								System.out.println(ordercounter+"="+ob.getCustomerName()+" "+ob.getOrderCode()+
								" "+ob.getOrderDate()+'\n'+"*********************************"+'\n'+(ordercounter+1)+"=Main Menu"); 
							}
						do {
							keyboardtype=type.nextLine();
							menutype=keyboardtype.charAt(0);
							check=Character.getNumericValue(menutype);
								if (Character.isLetter(menutype)||(check>(ordercounter+1))||(check==0)) System.out.println("Type the correct number!");
							
								else if((check>0)&&(check<=(ordercounter+1))) break; 
						}while((check>ordercounter)||(Character.isLetter(menutype)||(check==0)));
						if(check==(ordercounter+1)) break;
						
						else System.out.println(" "+'\n'+orders.get(check-1)+" "+'\n');
					}	
			break;
			
			
			case(2):if(sales.isEmpty()) System.out.println("Sorry,We haven't sold anything yet"+'\n');
					else {
						System.out.println("*********************"+'\n'+"A catalogue of our sales"+'\n'); //for sales
						for(Sale ob: sales) {
							System.out.println(ob+" "+'\n'+"*********************************"+'\n'); }
						}
			break;
			
			case(3):  again=false;	
					  System.out.println("Good Bye!!"+'\n');
					  //for exit
				break;
		}
		
	  }
}
//here are the methods	
//hardwprint-method prints the available Hardware-products from the Available-ArrayList for each category.It returns how many models we have in this category
//The comments in hardwprint are the same for periphprint
private static int hardwprint(ArrayList<Object> available,String[] productnames,int menutype1,String modeltype) { 
			int productcount=0; //counts the models we have depends of the category we want 
			for(Object ob: available)  {
					//modeltype "locks" the category we want,so the program will print these models of this category and no from others
					if((ob instanceof Hardware.Motherboard)&&(modeltype=="Motherboard")) { 
							Hardware.Motherboard m=(Hardware.Motherboard) ob; //here "converts" ob to Hardware.Motherboard object
							productcount+=1;
							productnames[productcount-1]=m.getName(); //adding to productnames array the name of the models of this category
							System.out.println(productcount+"="+m.getName()+" "+m.getYear()+" "+m.getManufacturer()+
							" "+m.getPrice());  //prints model's name,year,manufacturer and the price before discount 
					}
					else if((ob instanceof Hardware.CPU)&&(modeltype=="CPU")) {					
								Hardware.CPU m=(Hardware.CPU) ob;
								productcount+=1;
								productnames[productcount-1]=m.getName();
								System.out.println(productcount+"="+m.getName()+" "+m.getYear()+" "+
								m.getManufacturer()+" "+m.getPrice()); 
					}
					else if((ob instanceof Hardware.GraphicsCard)&&(modeltype=="GraphicsCard")) {
								  Hardware.GraphicsCard m=(Hardware.GraphicsCard) ob;
								  productcount+=1;
								  productnames[productcount-1]=m.getName();
								  System.out.println(productcount+"="+m.getName()+" "+m.getYear()+" "+
								  m.getManufacturer()+" "+m.getPrice());
					}
					else if((ob instanceof Hardware.RAM)&&(modeltype=="RAM")) {
								  Hardware.RAM m=(Hardware.RAM) ob;
								  productcount+=1;
								  productnames[productcount-1]=m.getName();
								  
								  System.out.println(productcount+"="+m.getName()+" "+m.getYear()+" "+
								  m.getManufacturer()+" "+m.getPrice());
				    }
					else if((ob instanceof Hardware.HardDiskDrive)&&(modeltype=="HardDiskDrive")) {
								  Hardware.HardDiskDrive m=(Hardware.HardDiskDrive) ob;
								 productcount+=1;								 
								  productnames[productcount-1]=m.getName();
								  
								  System.out.println(productcount+"="+m.getName()+" "+m.getYear()+" "+
								  m.getManufacturer()+" "+m.getPrice());
								  
					}	    
			}
	return productcount;
}
//periphprint prints the available peripherals-products from the Available-ArrayList for each category
//In each line of the periphprint the comments are same for the hardwprint
private static int periphprint(ArrayList<Object> available,String[] productnames,int menutype1,String modeltype) {				
			int productcount=0; //counts the models we have depends of the category we want
				for(Object ob: available)  {	
					if((ob instanceof Peripherals.Monitor)&&(modeltype=="Monitor")) {
									Peripherals.Monitor m=(Peripherals.Monitor) ob;
										productcount+=1;	
										productnames[productcount-1]=m.getName();
										System.out.println(productcount+"="+m.getName()+" "+m.getYear()+" "+
										m.getManufacturer()+" "+m.getPrice());
					}
					else if((ob instanceof Peripherals.Keyboard)&&(modeltype=="Keyboard")) {
									Peripherals.Keyboard m=(Peripherals.Keyboard) ob;
									productcount+=1;
									productnames[productcount-1]=m.getName();
									System.out.println(productcount+"="+m.getName()+" "+m.getYear()+" "+
									m.getManufacturer()+" "+m.getPrice());
					}
					if((ob instanceof Peripherals.Mouse)&&(modeltype=="Mouse"))  {
									Peripherals.Mouse m=(Peripherals.Mouse) ob;
									productcount+=1;
									productnames[productcount-1]=m.getName();
									System.out.println(productcount+"="+m.getName()+" "+m.getYear()+" "+
									m.getManufacturer()+" "+m.getPrice());
					}
					else if((ob instanceof Peripherals.Printer)&&(modeltype=="Printer")) { 
									Peripherals.Printer m=(Peripherals.Printer) ob;
									productcount+=1;
									productnames[productcount-1]=m.getName();
									System.out.println(productcount+"="+m.getName()+" "+m.getYear()+" "+
									m.getManufacturer()+" "+m.getPrice());
				    }	
					
				}
	return productcount;
}	

//hardwfeautures-method helps to print the feautures of the model we want.In this method we call and orderandsale method
private static String hardwfeautures(ArrayList<Order> orders,ArrayList<Sale> sales,ArrayList<Object> available,
							String[] productnames,int productcount,String modeltype,int salecode,int ordercode) {
		
		Scanner type=new Scanner(System.in);
		boolean exitbuy=false;
		int check=0;
		char menutype=' ';
		String successful=" ";
		
		do { //to keep sure that the user will type the correct number between 1 and the number of products(product count)
			String keyboardtype=type.nextLine();
			 menutype=keyboardtype.charAt(0);
			 check=Character.getNumericValue(menutype);
		   if (Character.isLetter(menutype)||(check>productcount)||(check==0)) System.out.println("Type the correct number!");
		   
		   else if((check>0)&&(check<=productcount)) break; 
		}while((check>productcount)||(Character.isLetter(menutype)||(check==0)));
		
		for(Object ob: available)  {
			if(ob instanceof Hardware.Motherboard) {
				Hardware.Motherboard m=(Hardware.Motherboard) ob; //eplanation in line 286
				for(int i=0;  i<=available.size();  i++) { //search in Available ArrayList for the product we want.
					//if the name of this element(product) is the same with the name of the element in the productnames,print its feauture
						if(m.getName().equals(productnames[check-1])) { 
								System.out.println(m);
								exitbuy=true;
								//we call orderandsale which return a String,"sale","order","both" depends of which of these happened
								successful=orderandsale(m.getName(),m.getPrice(),m.getStock(),orders,sales,modeltype,salecode,ordercode);
								
								if(successful.equals("sale")) m.DecreaseStock(); //if we sold a model,decreases it's stock
						}
				break;
				}
			}
//same comments on the others	
			else if(ob instanceof Hardware.CPU) {
				Hardware.CPU m=(Hardware.CPU) ob;
				for(int i=0;  i<=available.size();  i++) {
							if(m.getName().equals(productnames[check-1])) {
								System.out.println(m);
								exitbuy=true;
								successful=orderandsale(m.getName(),m.getPrice(),m.getStock(),orders,sales,modeltype,salecode,ordercode);
								
								if(successful.equals("sale")) m.DecreaseStock();
							}
				break;
				}
			}
			
		
			else if(ob instanceof Hardware.GraphicsCard) {
					Hardware.GraphicsCard m=(Hardware.GraphicsCard) ob;
					for(int i=0;  i<=available.size();  i++) {
						if(m.getName().equals(productnames[check-1])) {
							System.out.println(m);
								exitbuy=true;
								successful=orderandsale(m.getName(),m.getPrice(),m.getStock(),orders,sales,modeltype,salecode,ordercode);
								
								if(successful.equals("sale")) m.DecreaseStock();
						}
				    break;
					}
			}
			
			else if(ob instanceof Hardware.RAM) {
					Hardware.RAM m=(Hardware.RAM) ob;
					for(int i=0;  i<=available.size();  i++) {
						if(m.getName().equals(productnames[check-1])) {
							System.out.println(m);
								exitbuy=true;
								successful=orderandsale(m.getName(),m.getPrice(),m.getStock(),orders,sales,modeltype,salecode,ordercode);
								
								if(successful.equals("sale")) m.DecreaseStock();
						}
				    break;
					}
			}
			else if(ob instanceof Hardware.HardDiskDrive) {
					Hardware.HardDiskDrive m=(Hardware.HardDiskDrive) ob;
					for(int i=0;  i<=available.size();  i++) {
						if(m.getName().equals(productnames[check-1])) {
							System.out.println(m);
								exitbuy=true;
								successful=orderandsale(m.getName(),m.getPrice(),m.getStock(),orders,sales,modeltype,salecode,ordercode);
								
								if(successful.equals("sale")) m.DecreaseStock();
						}
				    break;
					}
			}
		
			if(exitbuy==true) break;	//if one "if" happens break the loop and dont do it again										
		}
		return successful; //returns the successful variable on the hardwfeautures-method call.The first call is at line 102 
	}	

//periphfeautures-method helps to print the feautures of the model we want.In this method we call and orderandsale method
//In each line of the periphfeautures,the comments are the same with hardwfeautures comments
private static String periphfeautures(ArrayList<Order> orders,ArrayList<Sale> sales,ArrayList<Object> available,String[] productnames,
										int productcount,String modeltype,int salecode,int ordercode) {
		boolean exitbuy=false;
		Scanner type=new Scanner(System.in);
		int check=0;
		char menutype=' ';
		String successful=" ";
		
		do {
			String keyboardtype=type.nextLine();
			 menutype=keyboardtype.charAt(0);
			check=Character.getNumericValue(menutype);
			if (Character.isLetter(menutype)||(check>productcount)||(check==0)) System.out.println("Type the correct number!");
		  
			else if((check>0)&&(check<=productcount)) break; 
		}while((check>productcount)||(Character.isLetter(menutype)||(check==0)));
		
		for(Object ob: available)  {
			if(ob instanceof Peripherals.Monitor) {
				Peripherals.Monitor m=(Peripherals.Monitor) ob;
				for(int i=0;  i<=available.size();  i++) {
						if(m.getName().equals(productnames[check-1])) {
								System.out.println(m);
								exitbuy=true;
								successful=orderandsale(m.getName(),m.getPrice(),m.getStock(),orders,sales,modeltype,salecode,ordercode);
								
								if(successful.equals("sale")) m.DecreaseStock();
						}
				break;
				}
			}
			else if(ob instanceof Peripherals.Keyboard) {
				Peripherals.Keyboard m=(Peripherals.Keyboard) ob;
				for(int i=0;  i<=available.size();  i++) {
						if(m.getName().equals(productnames[check-1])) {
								System.out.println(m);
								exitbuy=true;
								successful=orderandsale(m.getName(),m.getPrice(),m.getStock(),orders,sales,modeltype,salecode,ordercode);
								
								if(successful.equals("sale")) m.DecreaseStock();
						}
				break;
				}
			}
		
			else if(ob instanceof Peripherals.Mouse) {
				Peripherals.Mouse m=(Peripherals.Mouse) ob;
				for(int i=0;  i<=available.size();  i++) {
						if(m.getName().equals(productnames[check-1])) {
								System.out.println(m);
								exitbuy=true;
								successful=orderandsale(m.getName(),m.getPrice(),m.getStock(),orders,sales,modeltype,salecode,ordercode);
								
								if(successful.equals("sale")) m.DecreaseStock();
						}
				break;
				}
			}
		
			else if(ob instanceof Peripherals.Printer) {
				Peripherals.Printer m=(Peripherals.Printer) ob;
				for(int i=0;  i<=available.size();  i++) {
						if(m.getName().equals(productnames[check-1])) {
								System.out.println(m);
								exitbuy=true;
								successful=orderandsale(m.getName(),m.getPrice(),m.getStock(),orders,sales,modeltype,salecode,ordercode);
								
								if(successful.equals("sale")) m.DecreaseStock();
						}
				break;
				}
			}
		}
		return successful;
	}


//orderandsale-method helps to sale or order a product.We call it from hardwfeautures-method or periphfeautures-method
private static String orderandsale(String modelname,double price,int modelstock,ArrayList<Order> orders,ArrayList<Sale> sales,String modeltype,int salecode,int ordercode) {
		Scanner type=new Scanner(System.in);
		//the method returns salesuccess or ordersuccess or both,so we can control the sale and the ordercode.
		String salesuccess=" ";
		String ordersuccess=" ";
		String bothsuccess=" "; //if the order is ready,an order and a sale will happen
		String name=" ";
		String telephone=" ";
		String date=" ";
		String orderdate=" ";
		String arrivaldate="-";
		char menutype=' ';

		if(modelstock>0) { //checking if we have models
				System.out.println("Do you want to buy it?Please type Y or N");
						String keyboardtype=type.nextLine();
						menutype=keyboardtype.charAt(0);
						
						if(menutype=='Y' || menutype=='y') { //user types his name,telephone and the date of the sale
							System.out.println("Please type your name,telephone,date of the sale");
							System.out.print("Name:");
							name=type.nextLine();
							System.out.print("Telephone:");
							telephone=type.nextLine();
							System.out.print("Date:");
							date=type.nextLine();
							System.out.println(" ");
								//the if statement here help us to configure if we want the Hardware discount or the Peripherals discount
								if(modeltype=="Motherboard"||modeltype=="GraphicsCard"||modeltype=="CPU"||modeltype=="RAM"||
									modeltype=="HardDiskDrive") {
									//creates a sale-object,add it to sales Arraylist,print sale feautures
									Sale sale=new Sale(modelname,name,telephone,date,Sale.HardwareCost(price),salecode);
									sales.add(sale);
									System.out.println(sale+" "+'\n'+"************************************");
									salesuccess="sale";
								}
								else  {
									//creates a sale-object,add it to sales Arraylist,print sale feautures
									Sale sale=new Sale(modelname,name,telephone,date,Sale.PeripheralsCost(price),salecode);
									sales.add(sale);
									System.out.println(sale+" "+'\n'+"************************************");
									salesuccess="sale";
								}
						}
		}			
		else {
		//creating orderstatus array and Random-object help us to automatically select one element of this,"waiting" or "Ready",for the order of the product
			String[] orderstatus={"Waiting","Ready"};
			Random randomstatus=new Random();
			int choice = randomstatus.nextInt(orderstatus.length); //choice will choose one integer randomly,0 or 1(index of the orderstatus array)
			
			System.out.println("There are no other stock models,but you can order it.Do you want to order this"+'\n'+"model?");
			
			String keyboardtype=type.nextLine();
			menutype=keyboardtype.charAt(0);
				if(menutype=='Y' || menutype=='y') { //user types his name,telephone,the date of the order
							System.out.println("Please type your name,telephone,date of the order");
							System.out.print("Name:");
							name=type.nextLine();
							System.out.print("Telephone:");
						    telephone=type.nextLine();
							System.out.print("Date:");
							orderdate=type.nextLine();
							System.out.println('\n');
					
					date="Today"; //if the orderstatus is ready,it will prints that the orderdate is today and arrival date: -
					arrivaldate="20/5/2014"; 
					
					if(orderstatus[choice]=="Ready") { //from the random choice of randomstatus.nextInt
							//same comments with line 567(for the if statement)
							if(modeltype=="Motherboard"||modeltype=="GraphicsCard"||modeltype=="CPU"||modeltype=="RAM"||modeltype=="HardDiskDrive"){
								//create an Order-object,add it to orders ArrayList,print order feautures
								Order order=new Order(modelname,name,telephone,date,"-",orderstatus[choice],Sale.HardwareCost(price),ordercode);
								orders.add(order);
								System.out.println(order+" "+'\n'+"************************************");
								ordersuccess="order";
								//we make a sale object here,because the order is ready so we buy the product
								Sale sale=new Sale(modelname,name,telephone,date,Sale.HardwareCost(price),salecode);
										sales.add(sale);
										System.out.println(sale+" "+'\n'+"************************************");
										bothsuccess="both";
							}
							else {
								Order order=new Order(modelname,name,telephone,date,"-",orderstatus[choice],Sale.PeripheralsCost(price),ordercode);
								orders.add(order);
								System.out.println(order+" "+'\n'+"************************************");
								ordersuccess="order";
								
								Sale sale=new Sale(modelname,name,telephone,orderdate,Sale.PeripheralsCost(price),salecode);
									sales.add(sale);
									System.out.println(sale+" "+'\n'+"************************************");
									bothsuccess="both";
							}
					}
					else { 		
						if(modeltype=="Motherboard"||modeltype=="GraphicsCard"||modeltype=="CPU"||modeltype=="RAM"||modeltype=="HardDiskDrive") {
								Order order=new Order(modelname,name,telephone,orderdate,arrivaldate,orderstatus[choice],Sale.HardwareCost(price),ordercode);
								orders.add(order);
								System.out.println(order+" "+'\n'+"************************************");
						}
						else {
								Order order=new Order(modelname,name,telephone,orderdate,arrivaldate,orderstatus[choice],Sale.PeripheralsCost(price),ordercode);
								orders.add(order);
								System.out.println(order+" "+'\n'+"************************************");
								ordersuccess="order";
						}
						System.out.println('\n'+"Your product will arrive at:"+" "+arrivaldate+" "+"Thank you!!");
					}							
				}
	}
		if((ordersuccess.equals(" "))&&(salesuccess.equals("sale"))) return salesuccess; //if we have sold a product(not from an order) return the salesuccess
		else if ((salesuccess.equals(" "))&&(ordersuccess.equals("order"))) return ordersuccess; //if we have ordered a product and the order is not ready,return ordersuccess
		else return bothsuccess; //if we have ordered an object and the order is ready it means we sold it,so return bothsuccess
	}
}							
								
					
			
		
		
	
	


	