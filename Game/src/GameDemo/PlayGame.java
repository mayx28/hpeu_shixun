package GameDemo;

import java.util.*;

public class PlayGame {
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
		Player player = new Player();
		Rule rule = new Rule();
		Scanner scanner = new Scanner(System.in);
		System.out.println("准备好开始游戏了吗？y/n");
		String start = scanner.nextLine();
		rule.init();
		if ("y".equals(start)) {
			while (true) {
				System.out.println("请出拳：1.剪刀 2.石头 3.布");
				int option = scanner.nextInt();
				player.chuquan(option);
				rule.rule(option);
				rule.caculate();
				rule.result();
				System.out.println("是否开始下一轮？y/n");
				String key = scanner.next();
				if ("y".equals(key)) {
					continue;
				} else {
					System.out.println("退出游戏~~~~~");
					return;
				}
			}

		}
	}
}
