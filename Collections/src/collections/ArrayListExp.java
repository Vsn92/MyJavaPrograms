package collections;

import java.util.ArrayList;


public class ArrayListExp {
//adding to git
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> temp= new ArrayList<String>();
		temp.add("a");
		temp.add("b");
		temp.add("c");
		System.out.println(temp.size());
		ArrayList<String> al=new ArrayList<String>();  
		  al.add("a");  
		  al.add("e");  
		  al.add("f");  
		  al.add("c");  
		
//		ArrayList<String> a1=new ArrayList<String>(al);
		
//		Iterator i=temp.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
//		temp.addAll(1, al);
		//temp.add(1, "x");
//		String[] a=temp.toArray(new String[0]);
		//temp.removeAll(al);  
//		  temp.retainAll(al);
//		System.out.println(temp.size());
//		temp.trimToSize();
//		System.out.println(temp.size());
		System.out.println((temp.contains("darlo")));  
//		for(String x:temp)
//		{
//			System.out.println(x);
//		}
		
	}

}
