
public class Atom extends Robot {
	public Atom(String name) {
		super(name);
		setAttackBehavior(new PunchAttack());
		setMoveBehavior(new FlyMove());
	}

   @Override
   public void attack() {
      getAttackBehavior().attack();
   }

   @Override
   public void move() {
      getMoveBehavior().move();
   }
}