
public class LGMotor extends Motor { // Motor�� ��� �޾Ƽ� LGMotor�� ������
	public LGMotor(Door door) {
		super(door);
	}

	private void moveLGMotor(Direction direction) {
		// LG Motor�� ������Ų��.
	}
	
   @Override
   protected void moveMotor(Direction direction) {
      // TODO Auto-generated method stub
      moveLGMotor(direction);
   }
}
