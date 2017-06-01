
public class LGMotor extends Motor { // Motor를 상속 받아서 LGMotor를 구현함
	public LGMotor(Door door) {
		super(door);
	}

	private void moveLGMotor(Direction direction) {
		// LG Motor를 구동시킨다.
	}
	
   @Override
   protected void moveMotor(Direction direction) {
      // TODO Auto-generated method stub
      moveLGMotor(direction);
   }
}
