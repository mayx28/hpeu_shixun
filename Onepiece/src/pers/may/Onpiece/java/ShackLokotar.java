package pers.may.Onpiece.java;

import java.util.Random;

//ɳ����˴��
public class ShackLokotar extends Opponent {
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
	 * ɳ����˴�������ҽ���
	 */
	public void selfIntroduction() {
		System.out.println("����ɳ����˴������Ҫ�����Ķ�����Ҫƴ����ס������");
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
		String skill[] = { "ɳĮ���տ�", "��ʴ�ֻ�", "�ر����" };
		int number = random.nextInt(skill.length);
		if ("ɳĮ���տ�".equals(skill[number])) {
			setAttack(20);
		} else if ("��ʴ�ֻ�".equals(skill[number])) {
			setAttack(25);
		} else {
			setAttack(30);
		}
		System.out.println("���֣���������������������������" + skill[number] + "������~~~" + "(��������" + getAttack() + ")");
	}
}
