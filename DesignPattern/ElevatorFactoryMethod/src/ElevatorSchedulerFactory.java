import java.util.Calendar;

public class ElevatorSchedulerFactory{
   public static ElevatorScheduler getElevatorScheduler(){
      ElevatorScheduler scheduler;
      int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
      if (hour < 12) // �������� ResponseTimeScheduler�� �̿���
         scheduler = new ResponseTimeScheduler();
      else // ���Ŀ��� ThroughtputScheduler�� �̿���
         scheduler = new ThroughputScheduler();
      return scheduler;
   }
}
