public class Puppy {
	int puppyAge;
	public Puppy(String name) {
		//这个构造器仅有一个参数
		System.out.println("Passed Name is :" + name);
	}
	public void setAge (int age) {
		puppyAge = age;
	}
	public int getAge () {
		System.out.println("Puppy's age is :" + puppyAge);
		return puppyAge;
	}
	public static void main(String [] args){
		//下面的语句将创建一个Puppy对象
		Puppy myPuppy = new Puppy("Tommy");
		//通过方法设定age
		myPuppy.setAge(2);
		int a =	myPuppy.getAge();
		System.out.println("----------------");
		System.out.println("Variable value :" + a);
	}
}
