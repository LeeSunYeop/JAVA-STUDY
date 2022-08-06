package study_class;

public class Enemy {
	 	String name;
		int hp;
		int atk;
		
		public Enemy(String name, int hp, int atk) {
			this.name = name;
			this.hp = hp;
			this.atk = atk;
		}
		
		 void attack(Player player) {
			
			System.out.println("Enemy Attack!");
		
			int playHp = player.getHp();
			playHp -= this.atk;
			player.setHp(playHp);
			
			System.out.println("player hp : " + player.getHp());
		}
		
		 boolean isLive() {
			if (this.hp <= 0) {
				return false;
			}
			else {
				return true;
			}
		}
	}