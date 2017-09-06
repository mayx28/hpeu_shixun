package pers.may.Onpiece.java;

import java.util.Random;

//巴索罗米.熊
public class BartholomewKuma extends Opponent {
	private int hp = 100;// 初始化能量值
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
	 * 巴索罗米.熊的自我介绍
	 */
	public void selfIntroduction() {
		System.out.println("我是巴索罗米.熊，要旅行的话，你想去哪里？");
		System.out
				.println("------------------------------------------------------------------------------------------");
	}

	/**
	 * 攻击，随机获得技能
	 * 
	 * @return
	 */
	public void attack() {
		Random random = new Random();
		String skill[] = { "压力炮", "阴愈伤弹", "熊掌冲击" };
		int number = random.nextInt(skill.length);
		if ("压力炮".equals(skill[number])) {
			setAttack(10);
		} else if ("阴愈伤弹".equals(skill[number])) {
			setAttack(20);
		} else {
			setAttack(25);
		}
		System.out.println("对手：不知死活，来尝尝我" + skill[number] + "的厉害~~~" + "(攻击力：" + getAttack() + ")");

	}
}
