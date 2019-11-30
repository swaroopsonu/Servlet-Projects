import java.util.*;
public class mainclass1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 System.out.println("enter the roll no.");
		 int rno= s.nextInt();
		 System.out.println("enter the student name");
		 String sname = s.next();
		 System.out.println("enter the student branch");
		 String sbranch = s.next();
		 System.out.println("enter the 6 subject marks between 0 to 100 ");
		 int ss = s.nextInt();
		 int sc = s.nextInt();
		 int m = s.nextInt();
		 int g = s.nextInt();
		 int o = s.nextInt(); 
		 int h = s.nextInt();
		 int totmrks= ss+sc+m+g+o+h;
		 float per= (float)((totmrks/600.0F)*100.0F); 
		 if(per>=70.0F && per<=100.0F)
		{
		 System.out.println("the result is distinction");
		}
		 else if(per>=60.0F && per<=70.0F)
		{
		 System.out.println("the result is first class");
		}
		else if(per>=50.0F && per<=60.0F)
		{
		 System.out.println("the result is second class");
		}
		else if(per>=35.0F && per<=50.0F)
		{
		System.out.println("the result is third class");
		}
		else
		{
		 System.out.println("the result is fail");
		}
		System.out.println(" the roll no :"+rno);
		System.out.println("the student name :"+sname);
		System.out.println("the total marks :"+totmrks);
		System.out.println(" the percentage :"+per);
	}
}
