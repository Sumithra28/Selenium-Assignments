package org.system;

public class Desktop extends Computer{
	
	public void desktopSize(int a) {
		System.out.println("Size of the desktop is:"+a);

	}

	public static void main(String[] args) {
		
		Desktop dk = new Desktop();
		dk.computerModel();
		dk.desktopSize(64);

	}

}
