package org.system;

public class Desktop extends Computer {
	
	public void desktopsize() {
		
		System.out.println("Desktop size is 43 inch");
	}

	public static void main(String[] args) {
		
		Desktop obj=new Desktop();
		obj.computermodel();
		obj.desktopsize();

	}

}
