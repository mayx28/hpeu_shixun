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
			System.out.println("你出剪刀~");
			break;
		case 2:
			System.out.println("你出石头~");
			break;
		case 3:
			System.out.println("你出布~");
			break;
		default:
			System.out.println("请换个姿势再入！！！");
			break;

		}

	}

}
