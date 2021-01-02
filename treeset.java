//Program to illustrate the use of TreeSEt
import java.util.*;
class TreeTest
{
	public static void main(String arg[])
		{
			TreeSet<String> tree=new TreeSet<String>();
			tree.add("amit");
			tree.add("suresh");
			tree.add("mohan");
			tree.add("rahul");
			tree.add("jagdeep");
		Iterator<String> itr=tree.iterator()	;
		while(itr.hasNext())
		{
			String str=itr.next();
			System.out.println(str);
		}
	}
}