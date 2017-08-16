package com.xzl.model;

public class Menu {
	// �˵�����
	static String movieMenu[] = { "1.������Ӱ", "2.�鿴��Ӱ", "3.��ӳ����", "4.ӰƱ����", "5.�˳�ϵͳ" };

	/**
	 * ��ӭ����
	 */
	public static void welcome() {
		System.out.println("*****************��ӭ���������Ӱ��Ʊϵͳ**********************");
		System.out.println("****************�����죬��Ӱ�ͱ��׻�����Ŷ*********************");
	}

	/**
	 * ��ӡ�˵�
	 */
	public static void menu() {
		Cinema cinema = new Cinema();
		while (true) {
			System.out.println("-----------------------------------------------------------");
			for (String item : movieMenu) {
				System.out.println(item);
			}
			System.out.println("��ѡ�������");
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
				System.out.println("�����˳�ϵͳ...");
				System.exit(0);
			} else {
				System.out.println("�밴�ղ˵�����Ŷ~~~");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		welcome();
		menu();
	}

}
