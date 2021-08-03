import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject{
   private List<Integer> scores = new ArrayList<Integer>(); // ������ ������
   /*
   private DataSheetView dataSheetView; // ��� ���·� ������ ����ϴ� Ŭ����

   public void setDataSheetView(DataSheetView dataSheetView) {
      this.dataSheetView = dataSheetView;
   }
*/
   public void addScore(int score) { // ���ο� ������ �߰���
      scores.add(score); // scores ��Ͽ� �־��� ������ �߰���
      notifyObservers();
      //dataSheetView.update(); // scores�� ������� �뺸��
   }

   public List<Integer> getScoreRecord() {
      return scores;
   }
}