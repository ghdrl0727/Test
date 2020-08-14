package 추상클래스_예제;

public class SuperLevel extends PlayerLevel {

	public void run() {
		System.out.println("빠르게 달립니다.");
	}

	public void jump() {
		System.out.println("Jump 할 수 있습니다.");
	}

	public void turn() {
		System.out.println("Turn 할 수 있습니다.");
	}

	public void showLevelMessage() {
		System.out.println("*******고급자 레벨입니다.*******");
	}
}
