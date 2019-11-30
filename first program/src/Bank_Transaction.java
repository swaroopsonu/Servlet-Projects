import java.util.*;
public class Bank_Transaction {

	public static void main(String[] args) {
		
			Balance b= new Balance();
			Withdrawl w= new Withdrawl(b);
			Deposit d=new Deposit(b);
			w.wDraw(100);
			d.dep(1200);
			}
	}
class Balance
{
 double bal=200;
 void disbal()
 {
System.out.println("bal amt:"+bal);
}
 }
class Withdrawl
{
 Balance x;
 Withdrawl(Balance y)
{
 x=y;
}
 void wDraw(int amt)
{
if(amt<x.bal)
{
System.out.println("amt withdrawn:"+amt);
x.bal=x.bal-amt;
x.disbal();
System.out.println("transaction completed");
}
else
{
System.out.println("iNsufficient fund");
}
}
}
class Deposit
{
 Balance x;
 Deposit(Balance y)
{
 x=y;
}
void dep(int amt)
{
x.bal=x.bal+amt;
x.disbal();
System.out.println("Deposition Completed");
}
}
