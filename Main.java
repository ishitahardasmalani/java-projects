import add.Add;
import subtract.Sub;
import multiply.Mul;
import divide.Div;

class Main
{
   public static void main(String args[])
   {
     Add ad=new Add();
	 Sub sb=new Sub();
	 Mul ml=new Mul();
	 Div di=new Div();
	 
	 ad.add(a:4, b:2);
	 sb.sub(a:4, b:2);
	 ml.mul(a:4, b:2);
	 di.div(a:4, b:2);
   }
}