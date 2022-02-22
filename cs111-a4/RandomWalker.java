/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author:Rishab Das
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {
        int random = 0;
        double distance=0.0;
        int posx = 0, posy=0;
        int nPosx = posx;
        int nPosy = posy;
        int number = Integer.parseInt(args[0]);
        int counter= 0;
        System.out.println("("+ nPosx +","+ nPosy +")");
        while(counter<number){
            random = (int)(System.currentTimeMillis()%(3*counter+11));
            random = (random %4)+1;
            if (random == 1){
                nPosx += 1;
            }
            else if (random == 2){
                nPosx=nPosx-1;
            }
            else if (random == 3){
                nPosy=nPosy+1;
            }
            else {
                nPosy=nPosy-1;
            }
            System.out.println("("+ nPosx + ","+ nPosy + ")");
            counter++;
        }
        distance = (nPosx-posx)*(nPosx-posx) + (nPosy-posy)*(nPosy-posy);
        System.out.println("Squared Distance ="+distance);
    

	
    }
}
