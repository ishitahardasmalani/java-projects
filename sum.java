static void sum(int mat[][], int r, int c)
{
 int i,j;
 int usum=0;
 int lsum=0;
 for(i=0;i<r;i++)
 {
	 for(j=0;j<c;j++)
	 {
		 if(i<=j)
			 usum=usum+mat[i][j];
	 }
 }
 
}