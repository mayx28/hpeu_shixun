package GameDemo;

import java.util.*;

public class PlayGame {
	public static void welcome() {
		System.out.println("----------------welcome-----------------");
		System.out.println("##############�˻�������ȭ��Ϸ#############");
		System.out.println("-----------------------------------------");
		System.out.println("��ȭ����1:����   2��ʯͷ  3����");
		System.out.println("-----------------------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		welcome();
		Player player = new Player();
		Rule rule = new Rule();
		Scanner scanner = new Scanner(System.in);
		System.out.println("׼���ÿ�ʼ��Ϸ����y/n");
		String start = scanner.nextLine();
		rule.init();
		if ("y".equals(start)) {
			while (true) {
				System.out.println("���ȭ��1.���� 2.ʯͷ 3.��");
				int option = scanner.nextInt();
				player.chuquan(option);
				rule.rule(option);
				rule.caculate();
				rule.result();
				System.out.println("�Ƿ�ʼ��һ�֣�y/n");
				String key = scanner.next();
				if ("y".equals(key)) {
					continue;
				} else {
					System.out.println("�˳���Ϸ~~~~~");
					return;
				}
			}

		}
	}
}
