import java.util.*;
public class factorialnew {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,n,fact=1;
		n=sc.nextInt();
		for(i=n;i>=1;i--){
			fact=fact*i;
		}
	    System.out.println(fact);
	}

}
