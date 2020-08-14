package 추상클래스_예제;

public class AdvancedLevel extends PlayerLevel{
	
	public void run() {
		System.out.println("달립니다.");
	}

	public void jump() {
		System.out.println("Jump 할 수 있습니다.");
	}

	public void turn() {
		System.out.println("Turn 할 줄 모르지롱.");
	}

	public void showLevelMessage() {
		System.out.println("*******중급자 레벨입니다.*******");
	}
}
