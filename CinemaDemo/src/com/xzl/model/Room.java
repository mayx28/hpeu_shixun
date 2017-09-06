package com.xzl.model;

public class Room {
	private String roomNumber;
	private Movie movie;
	private String time;
	private String seat[] = new String[25];

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String[] getSeat() {
		return seat;
	}

	public void setSeat(String[] seat) {
		this.seat = seat;
	}

	/**
	 * ��ʼ����λ
	 */
	public void initSeat() {
		// ������Ϊ���
		for (int i = 0; i < seat.length; i++) {
			seat[i] = String.valueOf(i + 1);
		}
	}

	/**
	 * ��ʾ��λ��
	 */
	public void showSeat() {
		for (int i = 0; i< seat.length; i++) {
			System.out.print("��" + seat[i] + "��\t");
			if ((i + 1) % 5 == 0) {// ����һ��ֻ��5��λ��
				System.out.println();
			}
		}
	}

	/**
	 * ������λ״̬��
	 */
	public void resetSeat(int option) {
		//��һ�ŵõ���Ӧ�������ֵ
		seat[option - 1] = "��";
	}

	/**
	 * ͳ��ʣ�µ�λ������
	 */
	public int leastSeat() {
		int seatNO = seat.length;
		for (int i = 0; i < seatNO; i++) {
			if ("��".equals(seat[i])) {
				seatNO--;
			}
		}
		return seatNO;
	}

	/**
	 * ��ʾ��ӳ����Ϣ
	 */
	public void showRoom() {
		System.out.println("��ӰԺ��ӳ��Ϣ����");
		System.out.println("���\t��Ӱ����\t��ӳʱ��\tʣ��λ��");
		System.out.println(getRoomNumber() + "\t" + movie.getName() + "\t" + getTime() + "\t" + leastSeat());

	}
}
