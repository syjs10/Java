import java.util.Scanner;
public class ArrayDemo1
{
	public static void main (String [] args) {
		//先声明后再创建
		int [] array = new int [3];
		System.out.println(array[0]);
		System.out.println(array.length);
		//对数组中的元素进行赋值
		array[0] = 1;
		array[2] = 3;	
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		//用for循环进行遍历
		Scanner	input = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
