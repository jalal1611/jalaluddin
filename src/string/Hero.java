package string;

public class Hero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String string="we_r_heros__of__marolix";
        String newString="";
        for(int i=0;i<string.length();i++)
        {
        	if(string.charAt(i)!=' ')
        	{
        		newString+=string.charAt(i);
        		
        	}
        	else {
        		if(i+1<string.length()&&string.charAt(i+1)!=' ') {
        			newString+=string.charAt(i);
        		}
        	}
        	System.out.println(newString);
        }
	}

}
