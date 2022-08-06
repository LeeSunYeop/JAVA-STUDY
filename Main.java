package study_class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player = new Player("ruru", 100, 12);
		
		Enemy enemy = new Enemy("Orc", 80, 5);
		
		while (player.isLive() && enemy.isLive()) {
			
			player.attack(enemy);
			
			if (!enemy.isLive()) break;
			enemy.attack(player);
		}
		
		if (player.isLive()) {
			System.out.println("player win");
		}
		else {
			System.out.println("enemy win");
		}
	}
	

}
