package pers.may.Onpiece.java;

import java.util.Random;

public class Opponent {
	private int hp = 80;// ��ʼ������ֵ
	private int attack;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp -= hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	/**
	 * ��Ъ��.D.��������ҽ���
	 */
	public void selfIntroduction() {
		System.out.println("������Ъ��.D.���棬�����ǳ�Ϊ���������ӽ��Ժ�����ҵ�ʱ��~~~");
		System.out
				.println("------------------------------------------------------------------------------------------");
	}

	/**
	 * �����������ü���
	 * 
	 * @return
	 */
	public void attack() {
		Random random = new Random();
		String skill[] = { "��ˮ", "���", "��Ѩ��" };
		int number = random.nextInt(skill.length);
		if ("��ˮ".equals(skill[number])) {
			setAttack(15);
		} else if ("���".equals(skill[number])) {
			setAttack(20);
		} else {
			setAttack(25);
		}
		System.out.println("���֣��ߣ�����������Сƨ��������������" + skill[number] + "������~~~" + "(��������" + getAttack() + ")");
	}
}
