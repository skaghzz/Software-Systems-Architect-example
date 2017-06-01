
public abstract class Robot {
	private String name;
	private AttackBehavior attackBehavior;
	private MoveBehavior moveBehavior;
	
	public Robot(String name) {
		this.name = name;
	}
   
   abstract public void attack();
   abstract public void move();
   
   public String getName() {
      return name;
   }

   protected AttackBehavior getAttackBehavior() {
      return attackBehavior;
   }

   protected void setAttackBehavior(AttackBehavior attackBehavior) {
      this.attackBehavior = attackBehavior;
   }

   protected MoveBehavior getMoveBehavior() {
      return moveBehavior;
   }

   protected void setMoveBehavior(MoveBehavior moveBehavior) {
      this.moveBehavior = moveBehavior;
   }
}
