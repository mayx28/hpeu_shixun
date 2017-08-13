package pers.may.Onpiece.java;

import java.util.Random;

public class Opponent {
	private int hp = 80;// 初始化能量值
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
	 * 马歇尔.D.帝奇的自我介绍
	 */
	public void selfIntroduction() {
		System.out.println("我是马歇尔.D.帝奇，梦想是成为海贼王，从今以后就是我的时代~~~");
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
		String skill[] = { "暗水", "解放", "暗穴道" };
		int number = random.nextInt(skill.length);
		if ("暗水".equals(skill[number])) {
			setAttack(15);
		} else if ("解放".equals(skill[number])) {
			setAttack(20);
		} else {
			setAttack(25);
		}
		System.out.println("对手：哼，天真至极的小屁孩，让你试试我" + skill[number] + "的厉害~~~" + "(攻击力：" + getAttack() + ")");
	}
}
