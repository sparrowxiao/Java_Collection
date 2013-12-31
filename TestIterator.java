import java.util.*;
import java.lang.System;

public class TestIterator
{
	public static void main(String[] args)
	{
		//test HashSet
		Collection obj_set = new HashSet();
		obj_set.add("element1");
		obj_set.add("element2");
		obj_set.add("element3");

		//Iterator it =  obj_set.iterator();//1

		//while(it.hasNext()) // 1.using while we have to use iterator
		
		for (Object obj: obj_set)//2 using for loop get the object in collection
		{
			//String book = (String)it.next();//1
			String book  = (String)obj;//2
			System.out.println(book);
			if (book.equals("element1"))
			{
				//it.remove();//1
				obj_set.remove(book);//2
			}
		
			book = "test string";
		}

		System.out.println("current Set status:"+obj_set);
	}
}
