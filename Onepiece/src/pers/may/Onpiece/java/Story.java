package pers.may.Onpiece.java;

public class Story {
	// ʵ������������
	Luffy luffy = new Luffy();
	Opponent opponent = new Opponent();

	/**
	 * ���µĿ�ʼ
	 */
	public void start() {
		System.out.println("��һ���ˣ���ӵ��������һ�вƸ���������Ȩ���������Ǻ������������.D.�޽�");
		System.out.println("��˵�е�OnePiece�ͱ������ΰ��ĺ���...");
		System.out.println("������֮ǰ˵��һ�仰����ʹȫ������˽���󺣡�����Ҫ�ҵĲƸ��𣿿��Եģ��Ұ�һ�ж������������ȥ�Ұ�...");
		System.out.println("���ǣ�����ʱ����ʼ�ˡ���");
		System.out.println("-----------------------------------------------------------------------------------------");
	}

	/**
	 * ��һ��ս�� ��1.ÿ��ѭ������������ܲ���ü��ܵĹ������������Ե�����ֵ��ȥ�Է���ɵĹ������� 2.����������ֵС�ڻ����0ʱս��������
	 */
	public void firstBattle() {
		// �������ҽ��ܵķ���
		luffy.selfIntroduction();
		opponent.selfIntroduction();
		// ���ù����ķ���
		while (true) {
			luffy.attack();
			opponent.setHp(luffy.getAttack());
			// ·�ɹ�������ֻ�ʣ�µ�����
			System.out.println("��������ֵ��" + opponent.getHp());
			if (opponent.getHp() <= 0) {
				break;
			}
			opponent.attack();
			luffy.setHp(opponent.getAttack());
			// ���ֹ�����·�ɻ�ʣ�µ�����
			System.out.println("·������ֵ��" + luffy.getHp());

		}
		// ��ӡ���
		System.out.println("·�ɻ����ʤ��~~~��Ъ��.D.����ֻ�û�ȥѰ��Ԯ��...");
		System.out.println("-----------------------------------------------------------------------------------------");
	}

	/**
	 * �ڶ���ս��
	 */
	public void secondtBattle() {
		// ʵ�����¶���
		opponent = new BartholomewKuma();
		luffy = new Luffy();

		luffy.selfIntroduction();
		opponent.selfIntroduction();
		while (true) {
			luffy.attack();
			opponent.setHp(luffy.getAttack());
			// ·�ɹ�������ֻ�ʣ�µ�����
			System.out.println("��������ֵ��" + opponent.getHp());
			if (opponent.getHp() <= 0) {
				break;
			}
			opponent.attack();
			luffy.setHp(opponent.getAttack());
			// ���ֹ�����·�ɻ�ʣ�µ�����
			System.out.println("·������ֵ��" + luffy.getHp());

		}
		System.out.println("·����һ�λ����ʤ������������.�ܺܲ����ģ����Ǳ�ȥѰ����������æ...");
		System.out.println("-----------------------------------------------------------------------------------------");
	}

	/**
	 * ������ս��
	 */
	public void thirdBattle() {
		// ʵ�����¶���
		opponent = new ShackLokotar();
		luffy = new Luffy();

		luffy.selfIntroduction();
		opponent.selfIntroduction();

		while (true) {
			luffy.attack();
			opponent.setHp(luffy.getAttack());
			// ·�ɹ�������ֻ�ʣ�µ�����
			System.out.println("��������ֵ��" + opponent.getHp());
			if (opponent.getHp() <= 0) {
				break;
			}
			opponent.attack();
			luffy.setHp(opponent.getAttack());
			// ���ֹ�����·�ɻ�ʣ�µ�����
			System.out.println("·������ֵ��" + luffy.getHp());

		}
		System.out.println("��Ȼɳ����˴������������·�ɣ��������տ������Լ�...");
		System.out.println("-----------------------------------------------------------------------------------------");
	}

	/**
	 * ����
	 */
	public void result() {
		System.out.println("��Ъ��.D.���桢��������.�ܡ�ɳ����˴����·�ɵİ����£��ҵ����Լ��ļ�ֵ���ڣ�����äĿ��׷���Ϊ����������...");
		System.out.println("�ڳ�Ϊ�������ĺ���·�ϣ�·�������˺ܶ���ˣ��������Լ����������������������һ���м����С���...");
		System.out.println("�����ǵİ����£�����˵��ˣ���Ϊ��������ʵ�ĺ�����~~~");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("ps:������ȡ���Զ�������������");

	}
}
