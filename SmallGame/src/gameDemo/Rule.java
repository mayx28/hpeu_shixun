package gameDemo;

import java.util.Scanner;

public class Rule {
	Scanner scanner = new Scanner(System.in);
	// 实例化玩家对象和对手对象
	Player player = new Player();
	Computer computer = new Computer();
	int times = 0;

	/**
	 * 玩家选择对手
	 */
	public void init() {
		while (true) {
			System.out.println("1:孙尚香  2：大乔  3：花木兰");
			System.out.print("请选择对手:");
			String option = scanner.next();
			if ("1".equals(option)) {
				computer.setName("孙尚香");
				break;
			} else if ("2".equals(option)) {
				computer.setName("大乔");
				break;
			} else if ("3".equals(option)) {
				computer.setName("花木兰");
				break;
			} else {
				System.out.println("请按照菜单操作哦~~~~");
				continue;
			}
		}

	}

	/**
	 * 玩家设置姓名
	 */
	public void setname() {
		System.out.print("请输入您的游戏昵称：");
		String uname = scanner.next();
		player.setName(uname);
		System.out.println(player.getName() + "\t" + "VS" + "\t" + computer.getName() + "\t对战");
		System.out.println("---------------------------------------");

	}

	/**
	 * 游戏规则，玩家赢，玩家输，平局
	 * 
	 * @param i
	 */
	public void rule(String i) {
		times += 1;
		String playerOption = player.punch(i);
		String computerOption = computer.punch();
		if ("剪刀".equals(playerOption) && "布".equals(computerOption)
				|| "石头".equals(playerOption) && "剪刀".equals(computerOption)
				|| "布".equals(playerOption) && "石头".equals(computerOption)) {// 玩家赢，分数加1
			System.out.println("厉害啊，恭喜恭喜~~~");
			player.setScore();
		} else if (playerOption.equals(computerOption)) {// 打平
			System.out.println("啥？打平啦~~~");
		} else {// 对手赢，分数加1
			System.out.println("别气馁，继续加油~~~");
			computer.setScore();
		}
	}

	/**
	 * 计算对战次数
	 */
	public void caculate() {
		System.out.println("-----------------------------------------");
		System.out.println(player.getName() + "\t" + "VS" + "\t" + computer.getName());
		System.out.println("对战次数\t" + times);

	}

	/**
	 * 最后的结果
	 */
	public void result() {
		System.out.println("-----------------------------------------");
		System.out.println("姓名\t得分\t");
		System.out.println(player.getName() + "\t" + player.getScore());
		System.out.println(computer.getName() + "\t" + computer.getScore());

	}

}
