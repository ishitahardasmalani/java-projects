import java.util.Scanner;
class Percentage
{
    public static void main(String[] args)
   {
       int count, i;
       float total = 0, percentage;
       Scanner console = new Scanner(System.in);
       System.out.println("Enter Number of Subject");
       count = console.nextInt();
       System.out.println("Enter Marks of " + count + " Subject");
          for (i = 0; i < count; i++)
           {
             total = total + console.nextInt();
           }
        System.out.println("Total Marks : " + total);
          percentage = (total / (count * 100)) * 100;
             switch ((int) percentage / 10)
			 {
               case 9:
                 System.out.println("Grade : A");
                 break;
               case 8:
                 System.out.println("Grade : B");
                 break;
                case 7:
                 System.out.println("Grade : C");
                break;
                case 6:
                 System.out.println("Grade : D");
                break;
                default:
                 System.out.println("Grade : F");
                break;
            }
    }
}