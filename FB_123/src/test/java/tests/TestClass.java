package tests;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

	
	public static void main(String[] args) {
		//Insertion
		//Retrieval
		//Deletion
		
		
		//Heterogeneous collection
		
		
		
		ArrayList a = new ArrayList ();
		
		a.add("Velocity");
		a.add(343);
		a.add(455.32);
		a.add('@');
		
		for(int i = 0 ; i<=a.size(); i++){
			System.out.println(a.get(i));
		}
		
		//Homogeneous collection
		
		
		
ArrayList<String> b = new ArrayList<String> ();
		
		b.add("Velocity");
		b.add("class");
		b.add("alsds");
		
		for(int i = 0 ; i<=b.size(); i++){
			System.out.println(b.get(i));
		}
		
		//UpCasting
    List<String> c = new ArrayList<String>();
		
		c.add("cow");
		c.add("dog");
		c.add("rat");
	}
	
	
}
