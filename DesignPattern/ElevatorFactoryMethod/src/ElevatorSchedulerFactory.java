import java.util.Calendar;

public class ElevatorSchedulerFactory{
   public static ElevatorScheduler getElevatorScheduler(){
      ElevatorScheduler scheduler;
      int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
      if (hour < 12) // 오전에는 ResponseTimeScheduler를 이용함
         scheduler = new ResponseTimeScheduler();
      else // 오후에는 ThroughtputScheduler를 이용함
         scheduler = new ThroughputScheduler();
      return scheduler;
   }
}
