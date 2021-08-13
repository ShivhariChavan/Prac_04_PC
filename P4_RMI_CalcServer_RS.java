import java.net.*; 
import java.rmi.*; 
public class P4_RMI_CalcServer_RS
{ public static void main(String args[])
{
try
{
P4_RMI_CalcServerlmpl_RS csi = new P4_RMI_CalcServerlmpl_RS();
Naming.rebind("CSB2",csi);
} // try ends
catch(Exception e)
{ System.out.println("Exception:" + e);
} // catch ends
} //main ends
} // class ends
