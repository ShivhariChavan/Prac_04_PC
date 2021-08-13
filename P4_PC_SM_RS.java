public class P4_PC_SM_RS
{
public static void main(String[] args) {
P4_PC_SM_Bufferlmpl_RS bufobj = new P4_PC_SM_Bufferlmpl_RS();
System.out.println("\n==========PRODUCER producing the ITEMS ==========\n");
bufobj.insert("Name : Rushikesh Suryavansi");
bufobj.insert("CHMCS : Batch - B1");
bufobj.insert("PRN :2020016400788591 ");
bufobj.insert("USCSP301 - USCS303 : OS Practical -P4");

System.out.println("\n=========CONSUMER consuming the ITEMS ==========\n");
String element = bufobj.remove();
System.out.println(element);
System.out.println(bufobj.remove());
System.out.println(bufobj.remove());
System.out.println(bufobj.remove());
} //main ends
}// class ends