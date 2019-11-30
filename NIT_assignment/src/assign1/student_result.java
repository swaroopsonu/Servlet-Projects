package assign1;
import java.sql.*;
import java.util.*;
public class student_result {

	public static void main(String[] args) {
		try 
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter the students name");
			String sname=s.nextLine();
			System.out.println("enter the students branch");
			String sbranch=s.nextLine();
			System.out.println("enter the students address");	
			String saddr=s.nextLine();
			System.out.println("enter the students mailid");
			String mail_id=s.nextLine();
      		System.out.println("enter the students phone no.");
			String phone_no=s.nextLine();
			System.out.println("enter the roll no.");
			int rno= s.nextInt();
			System.out.println("enter the students marks in 6 subjects b/w 0 to 100 ");
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
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","19143");
	         Statement st=con.createStatement();
		   	 ResultSet rs=st.executeQuery("insert into student1 values('"+sname+"','"+sbranch+"','"+saddr+"','"+mail_id+"','"+phone_no+"',"+rno+","+totmrks+","+per+")");
		   				if(rs.next())
				{
				 System.out.println("user registered succesfully");
				}
			
	      con.close();	
		}catch(Exception e)
		{
		System.out.println(e);
		}
	}
}