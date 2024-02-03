import java.io.*;
class Admission
{
    public static void main (String h[]) throws Exception
   {
     InputStreamReader isr = new InputStreamReader (System.in);
     BufferedReader br = new BufferedReader (isr);
      System.out.println("Physics Marks:");
      int physics = Integer.parseInt(br.readLine());
	  
      System.out.println("Math Marks:");
      int math = Integer.parseInt(br.readLine());
	  
      System.out.println("Chemistry Marks:");
      int chemistry = Integer.parseInt(br.readLine());
	  
      int total = math+physics+chemistry;
       if((math>=60)&&(physics>=50)&&(chemistry>=40)&&(total>=200))
         System.out.println("Student is eligible");
      else
         System.out.println("Student is not eligible");
    }
}