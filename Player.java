package study_class;

public class Player {
		
		private String name;
		private int hp;
		int atk;
		
		
		public Player(String name, int hp, int atk) {
			this.name = name;
			this.hp = hp;
			this.atk = atk;
		}
		
		public void attack(Enemy enemy) {
			System.out.println("Player Attack!");
			enemy.hp -= this.atk;
			System.out.println("Enemy hp : " + enemy.hp);
		}
		
		public boolean isLive() {
			if (hp <= 0) {
				return false;
			}
			else {
				return true;
			}
		}
		
		public int getHp() {
			return this.hp;
		}
		
		public void setHp(int hp) {
			this.hp = hp;
		}
		
		public String getName() {
			return this.name;
		}
	}