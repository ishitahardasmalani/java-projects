import java.util.Scanner;
class Array
{
  public static void main(String[] args)
 {
       int n, total = 0, high;
       Scanner s = new Scanner(System.in);
       System.out.print("Enter number of subjects: ");
        n = s.nextInt();
		
       int marks[] = new int[n];
       System.out.println("Enter marks out of 100: ");
       for(int i = 0; i < n; i++)
      {
       marks[i] = s.nextInt();
       total = total +marks[i];
      }

      high=marks[0];
      for (int i = 0; i < n; i ++)
     {
        if(high<marks[i])
        high=marks[i];
     }
       System.out.println("Total marks are: "+total);
       System.out.println("highest marks is: "+high);
   }
}