package gameDemo;

import java.util.Scanner;

public class Player {
	Scanner scanner = new Scanner(System.in);
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

	public Player() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * ��ҳ�ȭ
	 * 
	 * @param i
	 * @return
	 */
	public String punch(String i) {
		if ("1".equals(i)) {
			System.out.println("�������~~~");
			return "����";
		} else if ("2".equals(i)) {
			System.out.println("���ʯͷ~~~");
			return "ʯͷ";
		} else if ("3".equals(i)) {
			System.out.println("�����~~~");
			return "��";
		} else {
			System.out.println("�����~~~");
			return "��";
		}
	}

}
