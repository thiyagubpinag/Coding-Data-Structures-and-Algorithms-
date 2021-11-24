package com.archieves;

import java.util.Map;

class MapHelper3 implements Runnable {
	Map<String, Integer> map;

	public MapHelper3(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "MapHelper1").start();
	}

	public void run() {
		map.put("Three", 3);
		try {
			System.out.println("MapHelper1 sleeping");
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
