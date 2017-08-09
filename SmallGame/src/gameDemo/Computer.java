package gameDemo;

import java.util.Random;

public class Computer {
	private String name;
	private int score = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore() {
		score += 1;
	}

	/**
	 * 电脑随机出拳
	 * 
	 * @return
	 */
	public String punch() {
		Random random = new Random();
		String role[] = { "剪刀", "石头", "布" };
		int number = random.nextInt(role.length);// 随机获取一个数
		System.out.println("对手出" + role[number] + "~~~");
		return role[number];
	}
}
