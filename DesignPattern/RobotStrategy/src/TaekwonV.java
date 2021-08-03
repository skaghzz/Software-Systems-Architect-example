
public class TaekwonV extends Robot {
	public TaekwonV(String name) {
		super(name);
	    setAttackBehavior(new MissileAttack());
	    setMoveBehavior(new WalkMove());
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