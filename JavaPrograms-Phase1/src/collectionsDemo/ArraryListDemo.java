package collectionsDemo;

import java.util.ArrayList;

public class ArraryListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>cities= new ArrayList<>();
cities.add("London");
cities.add("Paris");
cities.add(2,"NewDelhi");
cities.add("Mumbai");
System.out.print(cities.size());
for(String t: cities)
{
	System.out.println(t);
}
	}

}