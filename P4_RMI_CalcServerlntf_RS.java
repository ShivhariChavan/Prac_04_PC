import java.rmi.*; 
public interface P4_RMI_CalcServerlntf_RS extends Remote
{
int add(int a,int b) throws RemoteException; 
int subtract(int a,int b) throws RemoteException; 
int multiply(int a,int b) throws RemoteException; 
int divide(int a,int b) throws RemoteException;
} //interface ends