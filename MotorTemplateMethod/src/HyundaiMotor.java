
public class HyundaiMotor extends Motor { // Motor�� ��� �޾Ƽ� HyundaiMotor�� ������
	public HyundaiMotor(Door door) {
		super(door);
	}

	private void moveHyundaiMotor(Direction direction) {
	   // Hyundai Motor�� ������Ų��.
	}

   @Override
   protected void moveMotor(Direction direction) {
      // TODO Auto-generated method stub
      moveHyundaiMotor(direction);
   }
}
