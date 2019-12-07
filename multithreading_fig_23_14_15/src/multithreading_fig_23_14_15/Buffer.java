package multithreading_fig_23_14_15;

public interface Buffer
{
   // place int value into Buffer
   public void blockingPut(int value) throws InterruptedException; 

   // obtain int value from Buffer
   public int blockingGet() throws InterruptedException; 
} // end int