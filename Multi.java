import java.util.*;
class odd implements Runnable
{
public void run()
{
int i,n=15;
for(i=1;i<n;i++)
{
if(i%2!=0)
System.out.println(i+"\n");
try
{
Thread.sleep(100);
}
catch(Exception e)
{}
}
}
}
class even extends Thread
{
public void run()
{
int i,j=1,n=15;
for(i=1;i<n;i++)
{
if(i%2==0)
{
System.out.println("2*"+j+"="+i);
j++;
} try
{
Thread.sleep(100);
}
catch(Exception e)
{}
}
}
}
class Multi
{
public static void main(String h[])
{
even e= new even();
e.start();
odd od = new odd();
Thread t = new Thread(od);
t.start();
}
}
