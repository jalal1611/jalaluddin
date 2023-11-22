package string;

public class Revstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String p="I am the KING";
        String[]sp=p.split(" ");//here split multiple parts where space occurs
        String rev="";
        for(String w:sp)
        {
        	String   reverse ="";
        	for(int i=w.length()-1;i>=0;i--)
        	{
        		reverse=reverse+w.charAt(i);
        		
        	}
        	rev = rev+reverse+"";
        	
        }
        System.out.println(rev);
        
	}
	

}
