package multithreading_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Driver {
		   public static void main(String[] args)
		   {
		      // create and name each runnable
		      PrintTask task1 = new PrintTask("task1");
		      PrintTask task2 = new PrintTask("task2");
		      PrintTask task3 = new PrintTask("task3");
		        
		      System.out.println("Starting Executor");

		      // create ExecutorService to manage threads
		      ExecutorService executorService = Executors.newCachedThreadPool();

		      // start the three PrintTasks
		      executorService.execute(task1); // start task1	
		      executorService.execute(task2); // start task2
		      executorService.execute(task3); // start task3

		      // shut down ExecutorService--it decides when to shut down threads
		      executorService.shutdown(); 

		      System.out.printf("Tasks started, main thread ends.%n%n");
		      
		      try{
		          // wait 1 minute for both writers to finish executing
		          boolean tasksEnded = 
		             executorService.awaitTermination(1, TimeUnit.MINUTES);

		          if (tasksEnded)
		          {
		             System.out.printf("%nContents of SimpleArray:%n");
		          }else {
		             System.out.println(
		                "Timed out while waiting for tasks to finish.");
		          }
		       } 
		       catch (InterruptedException ex)
		       {
		          ex.printStackTrace();
		       } 
		   } 
		} // end class TaskExecutor