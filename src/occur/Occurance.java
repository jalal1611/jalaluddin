package occur;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "Java programming Java oops";
        s.length(); // total length
        int totalcount = s.length(); //total length s
        int totalcount_afterRemove = s.replace("a","").length(); // total length after removing a
        int count = totalcount -totalcount_afterRemove;
        System.out.println("Number occurances of a is:"+count);
	
        
	}

}
