
public class HyundaiMotor extends Motor { // Motor를 상속 받아서 HyundaiMotor를 구현함
	public HyundaiMotor(Door door) {
		super(door);
	}

	private void moveHyundaiMotor(Direction direction) {
	   // Hyundai Motor를 구동시킨다.
	}

   @Override
   protected void moveMotor(Direction direction) {
      // TODO Auto-generated method stub
      moveHyundaiMotor(direction);
   }
}
