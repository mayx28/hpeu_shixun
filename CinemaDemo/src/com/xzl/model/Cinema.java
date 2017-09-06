package com.xzl.model;

public class Cinema {
	Movie movies[] = new Movie[50];
	Room rooms[] = new Room[6];

	public Cinema() {
		initCinema();
	}

	/**
	 * ��ʼ����ӰԺ����
	 */
	public void initCinema() {
		for (int i = 0; i < rooms.length; i++) {
			Room room = new Room();
			room.initSeat();
			room.setRoomNumber(String.valueOf(i + 1));
			rooms[i] = room;
		}
	}

	/**
	 * ����µ�Ӱ
	 */
	public void addMovie() {
		System.out.println("�������Ӱ���ƣ�");
		String name = Input.scanner.next();
		System.out.println("�������Ӱ���ͣ�");
		String type = Input.scanner.next();
		System.out.println("�������Ӱ���ݣ�");
		String leadingRole = Input.scanner.next();
		System.out.println("�������Ӱ�۸�");
		String price = Input.scanner.next();

		Movie movie = new Movie();
		movie.setName(name);
		movie.setType(type);
		movie.setLeadingRole(leadingRole);
		movie.setPrice(Integer.valueOf(price));

		for (int i = 0; i < movies.length; i++) {
			// �����ǰ���������ֵΪ�գ������ӵĵ�Ӱ��ֵ��ȥ
			if (movies[i] == null) {
				movies[i] = movie;
				break;
			}
		}

	}

	/**
	 * ��ѯ���е�Ӱ
	 */
	public void searchMovie() {
		for (int i = 0; i < movies.length; i++) {
			Movie movie = movies[i];
			// ��ֹ��ָ��
			if (movie != null) {
				movie.showMovie();
			}
		}
	}

	/**
	 * ���ݵ�Ӱ���Ʋ鿴��Ӱ
	 */
	public Movie searchMovieByName(String name) {
		for (int i = 0; i < movies.length; i++) {
			Movie movie = movies[i];
			if (movie != null && movie.getName().equals(name)) {
				return movie;
			}
		}
		System.out.println("��ʱû�иõ�ӰŶ~~~");
		return null;
	}

	/**
	 * ���÷�ӳ�Ҳ���ӰƬ
	 */
	public void showMovie() {

		System.out.println("��ʼ���÷�ӳ�ҷ�ӳ�ĵ�Ӱ...");
		System.out.println("-----------------------------------------------------------");
		System.out.println("��ѡ���ӳ��");
		// ��ʼ����ӳ�ұ��
		for (int i = 0; i < rooms.length; i++) {
			Room room = new Room();
			String roomNumber = room.getRoomNumber();
			roomNumber = String.valueOf(i + 1);
			System.out.print("��" + roomNumber + "��\t");
			if ((i + 1) % 3 == 0) {// ����һ��ֻ��3��λ��
				System.out.println();
			}
		}

		System.out.println("�������ӳ�ұ��");
		String roomNumber = Input.scanner.next();
		System.out.println("�������Ӱ����");
		String name = Input.scanner.next();
		System.out.println("�������ӳʱ��");
		String time = Input.scanner.next();

		// �õ���ӳ��
		Room room = rooms[Integer.valueOf(roomNumber) - 1];
		Movie movie = searchMovieByName(name);
		if (movie == null) {
			System.out.println("��ӳ��Ӱ����ʧ��");
			return;
		}
		room.setTime(time);
		room.setMovie(movie);
	}

	/**
	 * ͳ�Ʒ�ӳ����Ϣ
	 */
	public void statistaicRoomInfo() {
		for (int i = 0; i < rooms.length; i++) {
			Room room = rooms[i];
			// ���ж��Ƿ������˲��ŵĵ�Ӱ��û�������򲻴�ӡ
			if (room.getMovie() != null) {
				rooms[i].showRoom();
			}
		}

	}

	/**
	 * ��Ʊ
	 */
	public void sell() {
		// ��ӡ��ӰԺ��ӳ��Ϣ
		System.out.println("��ӳ��Ϣ����");
		statistaicRoomInfo();
		System.out.println("��ѡ��Ҫ�ۿ��ķ�ӳ�ұ�ţ�");
		String RoomNo = Input.scanner.next();

		// ���ݷ�ӳ�ұ�ŵõ���ӳ��
		Room room = rooms[Integer.valueOf(RoomNo) - 1];

		// ��ӡ��λ��Ϣ
		room.showSeat();
		System.out.println("��ѡ����λ��");
		String seatNo = Input.scanner.next();

		room.resetSeat(Integer.valueOf(seatNo));
		System.out.println("��Ʊ�ɹ�~~~");
		System.out.println("���ڴ�ӡСƱ��Ϣ...");
		System.out.println("-----------------------------------------------------------");
		System.out.println("��Ӱ���ƣ�" + room.getMovie().getName());
		System.out.println("�۸�" + room.getMovie().getPrice());
		System.out.println("��ӳ�ұ�ţ�" + room.getRoomNumber() + "  ��λ�ţ�" + seatNo);
		System.out.println("����ʱ�䣺" + room.getTime());
	}
}
