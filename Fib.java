public class Fib{
    public static int fib(int n){
        if (n==0 || n==1)
            return 1 ;
        int result= fib(n-1)+fib(n-2);
        return result;
    }
    public static int fibIter(int n){
        int [] arr = new int [n+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i =2; i <= n; i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    public static void main(String[]args){
        int n = Integer.parseInt(args[0]);
        int result=fib(n);
        System.out.println (result);
    }
}