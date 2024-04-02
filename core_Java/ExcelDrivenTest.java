package core_Java;

import java.io.IOException;
import java.util.ArrayList;

public class ExcelDrivenTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Datadriven_from_excel data = new Datadriven_from_excel();
		
		ArrayList<String> d = data.getData("Full price product");
		
		System.out.println(d.get(0));
		System.out.println(d.get(1));
		System.out.println(d.get(2));
		System.out.println(d.get(3));


	}

}
