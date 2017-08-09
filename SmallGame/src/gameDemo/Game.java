package gameDemo;

import java.util.Scanner;

/**
 * 欢迎界面
 * 
 * @author May_X
 *
 */
public class Game {
	public static void welcome() {
		System.out.println("----------------welcome-----------------");
		System.out.println("##############人机互动猜拳游戏#############");
		System.out.println("-----------------------------------------");
		System.out.println("出拳规则：1:剪刀   2：石头  3：布");
		System.out.println("-----------------------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		welcome();
		// 实例化对象
		Rule rule = new Rule();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("准备好开始游戏了吗？y/n");
		String start = scanner.next();
		if ("y".equals(start)) {
			// 初始化玩家和对手
			rule.init();
			rule.setname();
			while (true) {
				System.out.println("请出拳：1.剪刀 2.石头 3.布(默认出布)");
				String option = scanner.next();
				rule.rule(option);
				rule.caculate();
				rule.result();
				// 询问是否开始下一轮
				System.out.println("是否开始下一轮？y/n");
				String key = scanner.next();
				if ("y".equals(key)) {
					continue;
				} else {
					System.out.println("退出游戏~~~~~");
					return;
				}
			}

		} else {
			System.out.println("退出游戏~~~~~");
		}

	}

}
