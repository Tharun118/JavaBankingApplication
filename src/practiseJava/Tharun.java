package practiseJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Tharun
{
	public static void main(String[]args) throws ClassNotFoundException
	{
		List<String> objList = new ArrayList<String>();//TODO: Find out how to sort number in string type
		objList.add("a");
		objList.add("w");
		objList.add("r");
		objList.add("z");
		Collections.sort(objList);
		System.out.println("---After Sort----?"+objList);
		
		People objPeople= new People();
		
		Class.forName("practiseJava.People");
	}
}
