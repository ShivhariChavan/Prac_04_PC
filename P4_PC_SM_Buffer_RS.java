public interface P4_PC_SM_Buffer_RS
{
// producer call this method
public void insert (String item);
// consumers call this method
public String remove();
} // interface ends