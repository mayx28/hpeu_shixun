package pers.may.Onpiece.java;

import java.util.Random;

public class Luffy {
	private int hp = 120;// ��ʼ������ֵ
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
	 * ·�ɵ����ҽ���
	 */
	public void selfIntroduction() {
		System.out.println("����·�ɣ��ҿ���Ҫ��Ϊ�����������˰�~~~");
	}

	/**
	 * �����������ü���
	 * 
	 * @return
	 */
	public void attack() {
		Random random = new Random();
		String skill[] = { "����ǹ", "��Jet����ǹ", "�𽺾��˻����" };
		int number = random.nextInt(skill.length);
		if ("����ǹ".equals(skill[number])) {
			setAttack(20);
		} else if ("��Jet����ǹ".equals(skill[number])) {
			setAttack(25);
		} else {
			setAttack(40);
		}
		System.out
				.println("·�ɣ����ԣ���Ҫ��...�ݺݵ�...����һ��" + "," + "���ҵ�" + skill[number] + "!!!" + "(��������" + getAttack() + ")");

	}
}
