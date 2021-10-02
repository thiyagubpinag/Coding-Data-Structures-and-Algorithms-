package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {

	static class Player {
		String name;
		int age;

		public Player(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Player> player = new ArrayList<Player>();

		player.add(new Player("amy", 100));
		player.add(new Player("david", 100));
		player.add(new Player("heraldo", 150));
		player.add(new Player("aakansha", 75));
		player.add(new Player("aleksa", 150));

		Collections.sort(player, (o1, o2) -> {
			// TODO Auto-generated method stub
			if (o1.age == o2.age) {
				return o1.name.compareTo(o2.name);
			}

			return o1.age < o2.age ? 1 : -1;

		});

		player.forEach(i -> {
			System.out.println(i.name + "," + i.age);
		});

	}

}
