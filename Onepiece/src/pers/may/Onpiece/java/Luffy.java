package pers.may.Onpiece.java;

import java.util.Random;

public class Luffy {
	private int hp = 120;// 初始化能量值
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
	 * 路飞的自我介绍
	 */
	public void selfIntroduction() {
		System.out.println("我是路飞，我可是要成为海贼王的男人啊~~~");
	}

	/**
	 * 攻击，随机获得技能
	 * 
	 * @return
	 */
	public void attack() {
		Random random = new Random();
		String skill[] = { "橡胶手枪", "橡胶Jet机关枪", "橡胶巨人火箭炮" };
		int number = random.nextInt(skill.length);
		if ("橡胶手枪".equals(skill[number])) {
			setAttack(20);
		} else if ("橡胶Jet机关枪".equals(skill[number])) {
			setAttack(25);
		} else {
			setAttack(40);
		}
		System.out
				.println("路飞：所以，我要来...狠狠地...扁你一顿" + "," + "看我的" + skill[number] + "!!!" + "(攻击力：" + getAttack() + ")");

	}
}
