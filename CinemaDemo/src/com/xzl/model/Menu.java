package com.xzl.model;

public class Menu {
	// 菜单数组
	static String movieMenu[] = { "1.新增电影", "2.查看电影", "3.放映设置", "4.影票销售", "5.退出系统" };

	/**
	 * 欢迎界面
	 */
	public static void welcome() {
		System.out.println("*****************欢迎来到雨天电影售票系统**********************");
		System.out.println("****************下雨天，电影和爆米花更配哦*********************");
	}

	/**
	 * 打印菜单
	 */
	public static void menu() {
		Cinema cinema = new Cinema();
		while (true) {
			System.out.println("-----------------------------------------------------------");
			for (String item : movieMenu) {
				System.out.println(item);
			}
			System.out.println("请选择操作：");
			String input = Input.scanner.next();
			if ("1".equals(input)) {
				cinema.addMovie();
			} else if ("2".equals(input)) {
				cinema.searchMovie();
			} else if ("3".equals(input)) {
				cinema.showMovie();
			} else if ("4".equals(input)) {
				cinema.sell();
			} else if ("5".equals(input)) {
				System.out.println("正在退出系统...");
				System.exit(0);
			} else {
				System.out.println("请按照菜单操作哦~~~");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		welcome();
		menu();
	}

}
