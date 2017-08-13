package pers.may.Onpiece.java;

public class Story {
	// 实例化两个对象
	Luffy luffy = new Luffy();
	Opponent opponent = new Opponent();

	/**
	 * 故事的开始
	 */
	public void start() {
		System.out.println("有一个人，他拥有世界上一切财富、声望和权利，他就是海贼王——哥尔.D.罗杰");
		System.out.println("传说中的OnePiece就被埋藏在伟大的航道...");
		System.out.println("他临死之前说过一句话，驱使全世界的人进入大海——想要我的财富吗？可以的，我把一切都放在那里，你们去找吧...");
		System.out.println("于是，大海贼时代开始了——");
		System.out.println("-----------------------------------------------------------------------------------------");
	}

	/**
	 * 第一场战斗 ：1.每次循环随机产生技能并获得技能的攻击力，将各自的能量值减去对方造成的攻击力。 2.当对手能量值小于或等于0时战斗结束。
	 */
	public void firstBattle() {
		// 调用自我介绍的方法
		luffy.selfIntroduction();
		opponent.selfIntroduction();
		// 调用攻击的方法
		while (true) {
			luffy.attack();
			opponent.setHp(luffy.getAttack());
			// 路飞攻击后对手还剩下的能量
			System.out.println("对手能量值：" + opponent.getHp());
			if (opponent.getHp() <= 0) {
				break;
			}
			opponent.attack();
			luffy.setHp(opponent.getAttack());
			// 对手攻击后路飞还剩下的能量
			System.out.println("路飞能量值：" + luffy.getHp());

		}
		// 打印结果
		System.out.println("路飞获得了胜利~~~马歇尔.D.帝奇只得回去寻找援手...");
		System.out.println("-----------------------------------------------------------------------------------------");
	}

	/**
	 * 第二场战斗
	 */
	public void secondtBattle() {
		// 实例化新对象
		opponent = new BartholomewKuma();
		luffy = new Luffy();

		luffy.selfIntroduction();
		opponent.selfIntroduction();
		while (true) {
			luffy.attack();
			opponent.setHp(luffy.getAttack());
			// 路飞攻击后对手还剩下的能量
			System.out.println("对手能量值：" + opponent.getHp());
			if (opponent.getHp() <= 0) {
				break;
			}
			opponent.attack();
			luffy.setHp(opponent.getAttack());
			// 对手攻击后路飞还剩下的能量
			System.out.println("路飞能量值：" + luffy.getHp());

		}
		System.out.println("路飞再一次获得了胜利，巴索罗米.熊很不甘心，于是便去寻找朋友来帮忙...");
		System.out.println("-----------------------------------------------------------------------------------------");
	}

	/**
	 * 第三场战斗
	 */
	public void thirdBattle() {
		// 实例化新对象
		opponent = new ShackLokotar();
		luffy = new Luffy();

		luffy.selfIntroduction();
		opponent.selfIntroduction();

		while (true) {
			luffy.attack();
			opponent.setHp(luffy.getAttack());
			// 路飞攻击后对手还剩下的能量
			System.out.println("对手能量值：" + opponent.getHp());
			if (opponent.getHp() <= 0) {
				break;
			}
			opponent.attack();
			luffy.setHp(opponent.getAttack());
			// 对手攻击后路飞还剩下的能量
			System.out.println("路飞能量值：" + luffy.getHp());

		}
		System.out.println("虽然沙克洛克达尔最后还是输给了路飞，但他最终看清了自己...");
		System.out.println("-----------------------------------------------------------------------------------------");
	}

	/**
	 * 结束
	 */
	public void result() {
		System.out.println("马歇尔.D.帝奇、巴索罗米.熊、沙克洛克达尔在路飞的帮助下，找到了自己的价值所在，不再盲目的追求成为海贼王机会...");
		System.out.println("在成为海贼王的航海路上，路飞遇到了很多敌人，但他以自己的真诚与力量吸引了与他一样有激情的小伙伴...");
		System.out.println("在他们的帮助下，打败了敌人，成为了名副其实的海贼王~~~");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("ps:本故事取材自动漫《海贼王》");

	}
}
