package GameDemo;

import java.util.*;

public class Rule {
	Scanner scanner = new Scanner(System.in);
	Player player = new Player();
	Rival rival = new Rival();
	int times=0;

	/**
	 * ��ʼ���˻�
	 */
	public void init() {
		System.out.println("1:������  2������  3����ľ��");
		System.out.print("��ѡ�����:");
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			rival.setName("������");
			break;
		case 2:
			rival.setName("����");
			break;
		case 3:
			rival.setName("��ľ��");
			break;
		default:
			System.out.println("�뻻���������룡����");
			break;

		}
		System.out.print("������������Ϸ�ǳ�:");
		String uname = scanner.next();
		player.setName(uname);
		System.out.println(player.getName() + "\t" + "VS" + "\t" + rival.getName() + "\t��ս");

	}

	public void rule(int i) {
		if (i == 1 || i == 2 || i == 3) {
			times += 1;
			int j = (int) (Math.random() * 3) + 1;// ����һ��1~3�������
			rival.chuquan(j);
			if (i == 1 && j == 3 || i == 2 && j == 1 || i == 3 && j == 2) {// �û�Ӯ��������1
				player.setScore();
				System.out.println("��ϲ�㣬��Ӯ��~~~");

			} else if (i == 3 && j == 1 || i == 1 && j == 2 || i == 2 && j == 3) {
				rival.setScore();
				System.out.println("�����٣��������Ͱ�~~~");

			} else if (i == 1 && j == 1 || i == 2 && j == 2 || i == 3 && j == 3) {
				System.out.println("ɶ����ƽ��~~~");
			} else {
				System.out.println("�뻻����������~~~");
			}

		} else {
			System.out.println("�뻻����������~~~");
		}

	}

	public void caculate() {
		System.out.println(player.getName() + "\t" + "VS" + "\t" + rival.getName());
		System.out.println("��ս����\t" + times);

	}

	public void result() {
		System.out.println("-----------------------------------------");
		System.out.println("����\t�÷�\t");
		System.out.println(player.getName() + "\t" + player.getScore());
		System.out.println(rival.getName() + "\t" + rival.getScore());

	}
}
