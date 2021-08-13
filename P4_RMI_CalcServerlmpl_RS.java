import java.rmi.*; 
import java.rmi.server.*; 
public class P4_RMI_CalcServerlmpl_RS extends UnicastRemoteObject implements P4_RMI_CalcServerlntf_RS
{
public P4_RMI_CalcServerlmpl_RS() throws RemoteException {
}
public int add (int a,int b) throws RemoteException
{
return a+b;
}
public int subtract(int a,int b) throws RemoteException
{
return a-b;
}
public int multiply(int a,int b) throws RemoteException
{
return a*b;
}
public int divide(int a,int b) throws RemoteException
{
return a/b;
}
} //class ends
