public class P4_PC_SM_Bufferlmpl_RS implements P4_PC_SM_Buffer_RS
{
private static final int BUFFER_SIZE= 5;
private String[] elements;
private int in, out, count;
public P4_PC_SM_Bufferlmpl_RS() //constructor initialising the variables to initial value
{
count = 0;
in = 0;
out = 0;
elements= new String[BUFFER_SIZE];
}// Constructor ends
// producers call this method
public void insert(String item)
{
while (count== BUFFER_SIZE)
;// do nothing as there is no free space
// add an item to the buffer
elements[in] =item;
in = (in+ 1) % BUFFER_SIZE;
++count;
System.out.println ("item produced"+ item + "at position" + in + "having total items "+ count);
}// insert() ends
//Consumers call this method
public String remove()
{
String item;
while( count ==0)
;// do nothing as there is nothing to consume
// remove an item from the buffer
item= elements[out];
out= (out + 1) % BUFFER_SIZE; --count;
System.out.println(" item consumed:" + item + "from position"+ out + "remaining total items" +count);
return item;
} // remove ends
} // class ends