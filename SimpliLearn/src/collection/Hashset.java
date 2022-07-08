package collection;
import java.util.HashSet;
public class Hashset {


	  public static void main(String[] args) {
		  HashSet<Integer> in = new HashSet<Integer>();
		  
		in.add(1);
		  in.add(2);
		  
	    HashSet<String> hs = new HashSet<String>();
	    hs.add("d");
	    hs.add("c");
	    hs.add("b");
	    hs.add("a");
	    hs.add("c");
	    
	    HashSet<Boolean> bs = new HashSet<Boolean>();
	   bs.add(null);
	   
	  
	    System.out.println("Hashset is " + in+hs+bs);
	    System.out.println("Hashset is " + hs);
	    System.out.println("get class  " + hs.getClass());
	    System.out.println("Hashset is " + bs);
	   
	  }
	}
