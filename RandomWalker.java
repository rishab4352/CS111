public class RandomWalker{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        System.out.println("("+ x +","+ y +")");
        for(int i=0;i<a;i++){
            double b = Math.random();
            if (b <= 0.25){
                x=x-1;
            }
            else if (b<= 0.5){
                x=x+1;
            }
            else if (b<= 0.75){
                y=y-1;
            }
            else if (b<=1.0){
                y=y+1;
            }
            System.out.println("("+ x + ","+ y + ")");
        }
        double d= Math.pow(0-x,2);
        double e= Math.pow(0-y,2);
        double f = Math.sqrt(d+e);
        System.out.println("Squared Distance ="+f);
    }
}