import java.util.Collection;
import java.util.ArrayList;
import java.lang.System;

public class TestCollection
{
	public static void main(String[] args)
	{
		Collection obj_collection =  new ArrayList();
		obj_collection.add("element1");//add string object
		obj_collection.add(6);//add integer
		System.out.println("current size of collection is:"+obj_collection.size());
		obj_collection.remove(6);
		System.out.println("current size of collection is:"+obj_collection.size());
		System.out.println("current include element1:"+ obj_collection.contains("element1"));
		obj_collection.add("element2");
		System.out.println("current collection includes:"+obj_collection);
	}
}
