package com.xzl.model;

public class Cinema {
	Movie movies[] = new Movie[50];
	Room rooms[] = new Room[6];

	public Cinema() {
		initCinema();
	}

	/**
	 * 初始化电影院数据
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
	 * 添加新电影
	 */
	public void addMovie() {
		System.out.println("请输入电影名称：");
		String name = Input.scanner.next();
		System.out.println("请输入电影类型：");
		String type = Input.scanner.next();
		System.out.println("请输入电影主演：");
		String leadingRole = Input.scanner.next();
		System.out.println("请输入电影价格：");
		String price = Input.scanner.next();

		Movie movie = new Movie();
		movie.setName(name);
		movie.setType(type);
		movie.setLeadingRole(leadingRole);
		movie.setPrice(Integer.valueOf(price));

		for (int i = 0; i < movies.length; i++) {
			// 如果当前数组里面的值为空，则把添加的电影赋值进去
			if (movies[i] == null) {
				movies[i] = movie;
				break;
			}
		}

	}

	/**
	 * 查询所有电影
	 */
	public void searchMovie() {
		for (int i = 0; i < movies.length; i++) {
			Movie movie = movies[i];
			// 防止空指针
			if (movie != null) {
				movie.showMovie();
			}
		}
	}

	/**
	 * 根据电影名称查看电影
	 */
	public Movie searchMovieByName(String name) {
		for (int i = 0; i < movies.length; i++) {
			Movie movie = movies[i];
			if (movie != null && movie.getName().equals(name)) {
				return movie;
			}
		}
		System.out.println("暂时没有该电影哦~~~");
		return null;
	}

	/**
	 * 设置放映室播放影片
	 */
	public void showMovie() {

		System.out.println("开始设置放映室放映的电影...");
		System.out.println("-----------------------------------------------------------");
		System.out.println("请选择放映室");
		// 初始化放映室编号
		for (int i = 0; i < rooms.length; i++) {
			Room room = new Room();
			String roomNumber = room.getRoomNumber();
			roomNumber = String.valueOf(i + 1);
			System.out.print("【" + roomNumber + "】\t");
			if ((i + 1) % 3 == 0) {// 控制一排只有3个位置
				System.out.println();
			}
		}

		System.out.println("请输入放映室编号");
		String roomNumber = Input.scanner.next();
		System.out.println("请输入电影名称");
		String name = Input.scanner.next();
		System.out.println("请输入放映时间");
		String time = Input.scanner.next();

		// 得到放映室
		Room room = rooms[Integer.valueOf(roomNumber) - 1];
		Movie movie = searchMovieByName(name);
		if (movie == null) {
			System.out.println("放映电影设置失败");
			return;
		}
		room.setTime(time);
		room.setMovie(movie);
	}

	/**
	 * 统计放映室信息
	 */
	public void statistaicRoomInfo() {
		for (int i = 0; i < rooms.length; i++) {
			Room room = rooms[i];
			// 先判断是否设置了播放的电影，没有设置则不打印
			if (room.getMovie() != null) {
				rooms[i].showRoom();
			}
		}

	}

	/**
	 * 卖票
	 */
	public void sell() {
		// 打印电影院放映信息
		System.out.println("放映信息如下");
		statistaicRoomInfo();
		System.out.println("请选择要观看的放映室编号：");
		String RoomNo = Input.scanner.next();

		// 根据放映室编号得到放映室
		Room room = rooms[Integer.valueOf(RoomNo) - 1];

		// 打印座位信息
		room.showSeat();
		System.out.println("请选择座位：");
		String seatNo = Input.scanner.next();

		room.resetSeat(Integer.valueOf(seatNo));
		System.out.println("购票成功~~~");
		System.out.println("正在打印小票信息...");
		System.out.println("-----------------------------------------------------------");
		System.out.println("电影名称：" + room.getMovie().getName());
		System.out.println("价格：" + room.getMovie().getPrice());
		System.out.println("放映室编号：" + room.getRoomNumber() + "  座位号：" + seatNo);
		System.out.println("播放时间：" + room.getTime());
	}
}
