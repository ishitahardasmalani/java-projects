import java.util.*;
class Matrix
{
   int a[][];//this will just create a reference
   int m,n;
   
   //m1.readMatrix();
   public void readMatrix()
   {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter no of rows and columns:");
	 m=sc.nextInt();
	 n=sc.nextInt();
	 a=new int[m][n];
	 int i,j;
	 //this will create actual array
	 
	 System.out.println("Enter elements one by one:");
	 for(i=0;i<m;i++)
	 {
		 for(j=0;j<n;j++)
		 {
			 a[i][j]=sc.nextInt();
		 }
	 }
   }
}

//m1.dis