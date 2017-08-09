package gameDemo;

import java.util.Scanner;

public class Rule {
	Scanner scanner = new Scanner(System.in);
	// ʵ������Ҷ���Ͷ��ֶ���
	Player player = new Player();
	Computer computer = new Computer();
	int times = 0;

	/**
	 * ���ѡ�����
	 */
	public void init() {
		while (true) {
			System.out.println("1:������  2������  3����ľ��");
			System.out.print("��ѡ�����:");
			String option = scanner.next();
			if ("1".equals(option)) {
				computer.setName("������");
				break;
			} else if ("2".equals(option)) {
				computer.setName("����");
				break;
			} else if ("3".equals(option)) {
				computer.setName("��ľ��");
				break;
			} else {
				System.out.println("�밴�ղ˵�����Ŷ~~~~");
				continue;
			}
		}

	}

	/**
	 * �����������
	 */
	public void setname() {
		System.out.print("������������Ϸ�ǳƣ�");
		String uname = scanner.next();
		player.setName(uname);
		System.out.println(player.getName() + "\t" + "VS" + "\t" + computer.getName() + "\t��ս");
		System.out.println("---------------------------------------");

	}

	/**
	 * ��Ϸ�������Ӯ������䣬ƽ��
	 * 
	 * @param i
	 */
	public void rule(String i) {
		times += 1;
		String playerOption = player.punch(i);
		String computerOption = computer.punch();
		if ("����".equals(playerOption) && "��".equals(computerOption)
				|| "ʯͷ".equals(playerOption) && "����".equals(computerOption)
				|| "��".equals(playerOption) && "ʯͷ".equals(computerOption)) {// ���Ӯ��������1
			System.out.println("����������ϲ��ϲ~~~");
			player.setScore();
		} else if (playerOption.equals(computerOption)) {// ��ƽ
			System.out.println("ɶ����ƽ��~~~");
		} else {// ����Ӯ��������1
			System.out.println("�����٣���������~~~");
			computer.setScore();
		}
	}

	/**
	 * �����ս����
	 */
	public void caculate() {
		System.out.println("-----------------------------------------");
		System.out.println(player.getName() + "\t" + "VS" + "\t" + computer.getName());
		System.out.println("��ս����\t" + times);

	}

	/**
	 * ���Ľ��
	 */
	public void result() {
		System.out.println("-----------------------------------------");
		System.out.println("����\t�÷�\t");
		System.out.println(player.getName() + "\t" + player.getScore());
		System.out.println(computer.getName() + "\t" + computer.getScore());

	}

}
