/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author:
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {
		int n;
		int l =0;
		int a[];
		n=args.length;
		a= new int[n];
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<n;i++){
			for(int j =i+1;j<n;j++){
				if(a[i]==a[j]){
					l=1;
				}
			}
		}
		if (l==1){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
}
