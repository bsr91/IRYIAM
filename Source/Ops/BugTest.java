package Ops;

import java.io.*;
import java.util.ArrayList;

public class BugTest {
	public static void main(String[] args0) throws IOException{
		BufferedReader c=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("A1");
		String a1=c.readLine();
		System.out.println("A2");
		String a2=c.readLine();
		System.out.println("A3");
		String a3=c.readLine();
		
		ArrayList<String> a=new ArrayList<String>();
		a.add(a1);
		a.add(a2);
		a.add(a3);
		Reference r=new Reference(a);
		
		System.out.println("Sorting...");
		r.createAuthorString();
		ArrayList<String> alist=r.getAuthors();
		for(String au:alist){
			System.out.println(au+" - "+alist.indexOf(au));
		}
		System.out.println("DONE");
		System.out.println(r.getAuthorString());
		}
}
