package gameDemo;

import java.util.Scanner;

/**
 * ��ӭ����
 * 
 * @author May_X
 *
 */
public class Game {
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
		// ʵ��������
		Rule rule = new Rule();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("׼���ÿ�ʼ��Ϸ����y/n");
		String start = scanner.next();
		if ("y".equals(start)) {
			// ��ʼ����ҺͶ���
			rule.init();
			rule.setname();
			while (true) {
				System.out.println("���ȭ��1.���� 2.ʯͷ 3.��(Ĭ�ϳ���)");
				String option = scanner.next();
				rule.rule(option);
				rule.caculate();
				rule.result();
				// ѯ���Ƿ�ʼ��һ��
				System.out.println("�Ƿ�ʼ��һ�֣�y/n");
				String key = scanner.next();
				if ("y".equals(key)) {
					continue;
				} else {
					System.out.println("�˳���Ϸ~~~~~");
					return;
				}
			}

		} else {
			System.out.println("�˳���Ϸ~~~~~");
		}

	}

}
