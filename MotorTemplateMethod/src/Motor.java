
public abstract class Motor { // HyundaiMotor와 LGMotor에 공통적인 기능을 구현하는 클래스
	protected Door door;
	private MotorStatus motorStatus;

	public Motor(Door door) {
		this.door = door;
		motorStatus = MotorStatus.STOPPED;
	}

	public MotorStatus getMotorStatus() {
		return motorStatus;
	}

	protected void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}
	
	public void move(Direction direction) {
	     MotorStatus motorStatus = getMotorStatus();
	      if (motorStatus == MotorStatus.MOVING)
	         return;

	      DoorStatus doorStatus = door.getDoorStatus();
	      if (doorStatus == DoorStatus.OPENED)
	         door.close();

	      moveMotor(direction); // move 메서드는 이 문장을 제외하면 LGMotor와 동일

	      setMotorStatus(MotorStatus.MOVING);
   }
	
	protected abstract void moveMotor(Direction direction);
}
