package interfaceDemo;

public interface Vehicle {
	/**
	 * 启动
	 */
	void start();

	/**
	 * 停止
	 */
	void stop();

	/**
	 * 加速
	 */
	void speedUp(int speed);

	/**
	 * 返回当前车速
	 */
	int getSpeed();
}
