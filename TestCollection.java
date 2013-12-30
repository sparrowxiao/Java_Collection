import java.util.Collection;
import java.util.ArrayList;
import java.lang.System;
import java.util.HashSet;

public class TestCollection
{
	public static void main(String[] args)
	{
		Collection obj_collection =  new ArrayList();
		obj_collection.add("element1");//add string object
		obj_collection.add(6);//add integer
		System.out.println("current size of ArrayList is:"+obj_collection.size());
		obj_collection.remove(6);
		System.out.println("current size of ArrayList is:"+obj_collection.size());
		System.out.println("current ArrayList includes element1:"+ obj_collection.contains("element1"));
		obj_collection.add("element2");
		System.out.println("Element of the ArrayList:"+obj_collection);

		//test HashSet
		Collection obj_set = new HashSet();
		obj_set.add("element1");
		obj_set.add("element2");
		System.out.println("Set contains all the elements of the ArrayList:"+obj_collection.contains(obj_set));

		obj_collection.removeAll(obj_set);
		System.out.println("Element of the ArrayList:"+obj_collection);

		obj_set.retainAll(obj_collection);
		System.out.println("Element of the HashSet:"+obj_set);


	
	
	
	}
}
