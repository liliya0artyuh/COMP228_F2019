package multithreading_0;

import java.security.SecureRandom;

public class PrintTask implements Runnable {
	
   private final static SecureRandom generator = new SecureRandom();
   private final int sleepTime; // random sleep time for thread
   private final String taskName; // name of task
    
   // constructor
   public PrintTask(String taskName)
   {
      this.taskName = taskName;
        
      // pick random sleep time between 0 and 5 seconds
      sleepTime = generator.nextInt(5000); // milliseconds
   }

   // method run contains the code that a thread will execute
  @Override
   public void run() 
   {
      try // put thread to sleep for sleepTime amount of time 
      {
    	  
    	  for(int x=0; x < 1000000;x++) {
    		  System.out.println("the x = " + x);
    	  }
    	  
         System.out.printf("%s going to sleep for %d milliseconds.%n", 
            taskName, sleepTime);
         Thread.sleep(sleepTime); // put thread to sleep
      }       
      catch (InterruptedException exception)
      {
         exception.printStackTrace();
         Thread.currentThread().interrupt(); // re-interrupt the thread
      } 
        
      // print task name
      System.out.printf("%s done sleeping%n", taskName); 
   } 


} // end class PrintTask
