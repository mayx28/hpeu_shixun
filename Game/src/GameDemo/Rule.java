package GameDemo;

import java.util.*;

public class Rule {
	Scanner scanner = new Scanner(System.in);
	Player player = new Player();
	Rival rival = new Rival();
	int times=0;

	/**
	 * 初始化账户
	 */
	public void init() {
		System.out.println("1:孙尚香  2：大乔  3：花木兰");
		System.out.print("请选择对手:");
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			rival.setName("孙尚香");
			break;
		case 2:
			rival.setName("大乔");
			break;
		case 3:
			rival.setName("花木兰");
			break;
		default:
			System.out.println("请换个姿势再入！！！");
			break;

		}
		System.out.print("请输入您的游戏昵称:");
		String uname = scanner.next();
		player.setName(uname);
		System.out.println(player.getName() + "\t" + "VS" + "\t" + rival.getName() + "\t对战");

	}

	public void rule(int i) {
		if (i == 1 || i == 2 || i == 3) {
			times += 1;
			int j = (int) (Math.random() * 3) + 1;// 产生一个1~3的随机数
			rival.chuquan(j);
			if (i == 1 && j == 3 || i == 2 && j == 1 || i == 3 && j == 2) {// 用户赢，分数加1
				player.setScore();
				System.out.println("恭喜你，你赢啦~~~");

			} else if (i == 3 && j == 1 || i == 1 && j == 2 || i == 2 && j == 3) {
				rival.setScore();
				System.out.println("别气馁，继续加油吧~~~");

			} else if (i == 1 && j == 1 || i == 2 && j == 2 || i == 3 && j == 3) {
				System.out.println("啥？打平啦~~~");
			} else {
				System.out.println("请换个姿势再入~~~");
			}

		} else {
			System.out.println("请换个姿势再入~~~");
		}

	}

	public void caculate() {
		System.out.println(player.getName() + "\t" + "VS" + "\t" + rival.getName());
		System.out.println("对战次数\t" + times);

	}

	public void result() {
		System.out.println("-----------------------------------------");
		System.out.println("姓名\t得分\t");
		System.out.println(player.getName() + "\t" + player.getScore());
		System.out.println(rival.getName() + "\t" + rival.getScore());

	}
}
