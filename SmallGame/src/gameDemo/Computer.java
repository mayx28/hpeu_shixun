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
	 * ���������ȭ
	 * 
	 * @return
	 */
	public String punch() {
		Random random = new Random();
		String role[] = { "����", "ʯͷ", "��" };
		int number = random.nextInt(role.length);// �����ȡһ����
		System.out.println("���ֳ�" + role[number] + "~~~");
		return role[number];
	}
}
