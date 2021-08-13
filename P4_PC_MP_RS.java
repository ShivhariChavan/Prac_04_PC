import java.util.Date;
public class P4_PC_MP_RS
{
public static void main (String args[])
{
// producer and consumer process
P4_PC_MP_Channel_RS<Date> mailBox = new P4_PC_MP_MessageQueue_RS<Date>();
int i=0;
do
{
Date message= new Date();
System.out.println("producer produced-"+ (i+1) + ":"+ message);
mailBox.send(message);
Date rightNow =mailBox.receive();
if (rightNow != null)
{
System.out.println("consumer consumed -" +(i+1) +":" + rightNow);
}
i++;
} while(i<10);
} // main ends
} //class ends