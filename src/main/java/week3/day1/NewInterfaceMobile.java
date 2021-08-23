package week3.day1;


// After getting the Interface methods in the class ImpSetInterface I have put some sys out.
// Here I'm going to pull in the Old class and create and object for it and get the output.

public class NewInterfaceMobile {


	public static void main(String[] args) {
		
		SetInterface obj = new ImpSetInterface();
		
		obj.Cbrowser("Chrome");
		obj.enterValue("username", "demosalesmanager");
		
	
	}

}
