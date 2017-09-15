package game_logic;

import java.util.HashMap;
import java.util.Random;

import player.Enemy;

public class EnemyController {
	
	public static HashMap<Integer, Enemy> createEnemies() {
		
		int numEnemies = new Random().nextInt(5);
		System.out.println("Function called : " + numEnemies);
		HashMap<Integer, Enemy> enemyMap = new HashMap<Integer, Enemy>();
		for(int i = 1 ; i <= numEnemies ; i++) {
			enemyMap.put(i, new Enemy("Enemy " + i));
		}
		return enemyMap;
	}
}
