package string;

public class example1 {
public static void main(String[] args) {
	String org="sabhyata is a engineer";
	String rev="";
	for( int i=org.length()-1; i>=0; i--)
	{
		rev=rev+org.charAt(i);
		
	}
	System.out.println(rev);
}
}
