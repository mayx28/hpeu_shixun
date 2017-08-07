package inherit;

public class Human extends Monkey{
	
public void speak(){
	super.speak();
	System.out.println("小样！不错嘛~会说话了~~~");
}
public void think(){
	System.out.println("不错嘛，会思考了~~");
}
}
