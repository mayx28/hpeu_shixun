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
	 * 初始化座位
	 */
	public void initSeat() {
		// 定义作为编号
		for (int i = 0; i < seat.length; i++) {
			seat[i] = String.valueOf(i + 1);
		}
	}

	/**
	 * 显示座位表
	 */
	public void showSeat() {
		for (int i = 0; i< seat.length; i++) {
			System.out.print("【" + seat[i] + "】\t");
			if ((i + 1) % 5 == 0) {// 控制一排只有5个位置
				System.out.println();
			}
		}
	}

	/**
	 * 设置座位状态表
	 */
	public void resetSeat(int option) {
		//减一才得到对应的数组的值
		seat[option - 1] = "无";
	}

	/**
	 * 统计剩下的位置数量
	 */
	public int leastSeat() {
		int seatNO = seat.length;
		for (int i = 0; i < seatNO; i++) {
			if ("无".equals(seat[i])) {
				seatNO--;
			}
		}
		return seatNO;
	}

	/**
	 * 显示放映室信息
	 */
	public void showRoom() {
		System.out.println("电影院放映信息如下");
		System.out.println("编号\t电影名称\t放映时间\t剩余位置");
		System.out.println(getRoomNumber() + "\t" + movie.getName() + "\t" + getTime() + "\t" + leastSeat());

	}
}
