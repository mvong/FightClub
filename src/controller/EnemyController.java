package controller;

/*
 * Alex Man, Mark Vong
 * ITP 368
 * 9/17/2017
 * Hwk 4
 */

import java.util.HashMap;
import java.util.Random;

import player.Enemy;

public class EnemyController {
	// Generate random number (0 - 5) of enemies
	public static HashMap<Integer, Enemy> createEnemies() {
		int numEnemies = new Random().nextInt(5);
		HashMap<Integer, Enemy> enemyMap = new HashMap<Integer, Enemy>();
		for(int i = 1 ; i <= numEnemies ; i++) {
			enemyMap.put(i, new Enemy("Enemy " + i));
		}
		return enemyMap;
	}
}
