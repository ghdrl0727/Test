package �߻�Ŭ����_����;

public abstract class PlayerLevel {

	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void showLevelMessage();

	public void go(int count) {
		run();
		jump();
		turn();
	}
}
