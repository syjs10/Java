public class Dog {
	public String brand; //品种
	public int age;//年龄

	public String toString() {
		return "这是一条"+age+"岁的"+brand;
	}
	public static void main (String [] args) {
		Dog dog = new Dog(); //构造了Dog类型的对象
		dog.brand = "中华田园犬";
		dog.age = 3;
		System.out.println(dog.toString());
	}
}
