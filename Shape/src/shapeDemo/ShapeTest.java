package shapeDemo;
import java.util.*;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Shape shape=new Shape();
		while(true){
			System.out.println("*********************");
			System.out.println("1.Բ�Σ�2.������");
			System.out.println("��ѡ�����~~~");
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
				System.out.println("�������������");
			}
			
		}

	}

}
