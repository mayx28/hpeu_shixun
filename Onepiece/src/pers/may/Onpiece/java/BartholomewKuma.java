package pers.may.Onpiece.java;

import java.util.Random;

//��������.��
public class BartholomewKuma extends Opponent {
	private int hp = 100;// ��ʼ������ֵ
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
	 * ��������.�ܵ����ҽ���
	 */
	public void selfIntroduction() {
		System.out.println("���ǰ�������.�ܣ�Ҫ���еĻ�������ȥ���");
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
		String skill[] = { "ѹ����", "�����˵�", "���Ƴ��" };
		int number = random.nextInt(skill.length);
		if ("ѹ����".equals(skill[number])) {
			setAttack(10);
		} else if ("�����˵�".equals(skill[number])) {
			setAttack(20);
		} else {
			setAttack(25);
		}
		System.out.println("���֣���֪�����������" + skill[number] + "������~~~" + "(��������" + getAttack() + ")");

	}
}
