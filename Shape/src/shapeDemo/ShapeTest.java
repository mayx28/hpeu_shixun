package shapeDemo;
import java.util.*;

public class ShapeTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Shape shape=new Shape();
		while(true){
			System.out.println("*********************");
			System.out.println("1.圆形；2.长方形");
			System.out.println("请选择操作~~~");
			String option=scanner.nextLine();
			if("1".equals(option)){
				shape=new Circle();
				shape.girth();
				shape.area();
			}
			else if("2".equals(option)){
				shape=new Rectancle();
				shape.girth();
				shape.area();
			}
			else{
				System.out.println("错误操作！！！");
			}
			
		}

	}

}
