package collectionsDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String>cities=new LinkedList<>();
cities.add("London");
cities.add("Paris");
cities.add(2,"NewDelhi");
cities.add("Mumbai");

System.out.println(cities.size());
Iterator itr=cities.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
System.out.println(cities.contains("Hyderabad"));
}
}

