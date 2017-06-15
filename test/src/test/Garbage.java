package test;

import java.io.File;
import java.util.UUID;

public class Garbage {
//jsdgfjgj
	   static File folder;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tested");
		System.out.println("Tested1");
		
		folder = new File(UUID.randomUUID().toString());
		folder.mkdir();
		System.out.println(folder.getAbsolutePath());
	
 
		

		
		
	}

}
