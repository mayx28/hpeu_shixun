package GameDemo;

public class Player {
	String name;
	int score = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore() {
		score += 1;
	}

	public void chuquan(int k) {
		switch (k) {
		case 1:
			System.out.println("�������~");
			break;
		case 2:
			System.out.println("���ʯͷ~");
			break;
		case 3:
			System.out.println("�����~");
			break;
		default:
			System.out.println("�뻻���������룡����");
			break;

		}

	}

}
