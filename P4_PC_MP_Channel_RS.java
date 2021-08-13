public interface P4_PC_MP_Channel_RS<E>
{
//send a message to the channel
public void send( E item);
// receive a message from the channel
public E receive();
} // interface ends