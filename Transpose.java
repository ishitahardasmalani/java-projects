import java.util.Scanner;

public class Square
{ 
  void square(int m,int n){
  System.out.println("Square Matrix: " + (m==n));
 }
  int sum(int[][] a)
  { 
    int sum=0; 
    for (int i = 0; i < a.length; i++) 
    { 
      for (int j = 0; j < a.length; j++) 
      { 
        if (i==j)
        { 
          sum=sum+a[i][j]; 
        }
      }
   }
     return sum; 
  }
public static void main(String[] args) 
 { 
  Scanner sc= new Scanner(System.in);
  Square s=new Square(); 
  int m,n; 
  System.out.println("Enter the rows and column"); 
   m= sc.nextInt(); 
   n=sc.nextInt(); 
   s.square(m, n);
   if (m==n) 
   { 
     int[][] a = new int[m][n];
     System.out.println("Enter the elements");
     for (int i = 0; i < m; i++) 
	 { 
      for (int j = 0; j < n; j++) 
	  {
        a[i][j]=sc.nextInt(); 
      }
     } 
       System.out.println("The sum of diagonal elements is " + s.sum(a)); 
    }
 }
}
