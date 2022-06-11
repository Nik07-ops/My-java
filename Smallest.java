import java.util.*;
public class Smallest
{
    public static void main(String args[])
    {
       int array[] = {-8,2,0,5,-3,6,0,9};
       int number = Integer.MAX_VALUE;
       ArrayList al = new ArrayList();

       //Here we add all positive items into a ArrayList al
       for(int i=1;i<array.length;i++){
           if(array[i]>0){
               al.add(new Integer(array[i]));
           }
       }

       Iterator it = al.iterator();
       while(it.hasNext()){
           int n = ((Integer)it.next()).intValue();
           if(n<number){
               number = n;
            }
        }
       System.out.println("Smallest number : " + number);
    }
}