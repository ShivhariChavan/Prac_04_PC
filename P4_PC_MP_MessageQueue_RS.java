import java.util.Vector;
public class P4_PC_MP_MessageQueue_RS<E> implements P4_PC_MP_Channel_RS<E>
{
private Vector<E> queue;
public P4_PC_MP_MessageQueue_RS()
{queue = new Vector<E>();
}
//this implement or non blocking send
public void send ( E item)
{
 queue.addElement(item);
}// send() ends
// this implements a non blocking receive
public E receive() {
if (queue.size() ==0)
return null;
else
return queue.remove(0);
} // receive() ends
} // class ends