package 추상클래스_예제;

public class MainBoard {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		SuperLevel aLeve2 = new SuperLevel();
		player.upgradeLevel(aLeve2);
		player.play(3);
	}

}
