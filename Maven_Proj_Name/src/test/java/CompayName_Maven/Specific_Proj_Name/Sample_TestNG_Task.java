package CompayName_Maven.Specific_Proj_Name;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample_TestNG_Task {
	
	
	@BeforeTest
	private void ear_buds() {
		System.out.println("Air Buds Pro");
	}
	 
	
	@Test
	private void search_laptop() {
		System.out.println("Searching Laptop");
	}
	@Test
	private void search_mobile() {
		System.out.println("Searching Mobile");
	}
	@Test
	private void search_headphone() {
		System.out.println("Searching Headphone");
	}

}
