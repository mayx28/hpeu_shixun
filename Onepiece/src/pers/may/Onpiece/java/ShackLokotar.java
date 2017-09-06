package pers.may.Onpiece.java;

import java.util.Random;

//沙克洛克达尔
public class ShackLokotar extends Opponent {
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
	 * 沙克洛克达尔的自我介绍
	 */
	public void selfIntroduction() {
		System.out.println("我是沙克洛克达尔，想要保护的东西就要拼命守住！！！");
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
		String skill[] = { "沙漠向日葵", "侵蚀轮回", "地表干裂" };
		int number = random.nextInt(skill.length);
		if ("沙漠向日葵".equals(skill[number])) {
			setAttack(20);
		} else if ("侵蚀轮回".equals(skill[number])) {
			setAttack(25);
		} else {
			setAttack(30);
		}
		System.out.println("对手：哈哈哈哈，不自量力，尝尝我" + skill[number] + "的厉害~~~" + "(攻击力：" + getAttack() + ")");
	}
}
