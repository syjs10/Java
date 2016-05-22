import java.util.Scanner;
public class LinerSearch {
	public static void main (String [] args) {
		int []array = {10, 100, 80, 50, 70, 60, 90};
		System.out.println("number:");
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		int index = -1;
		for (int i = 0; i < array.length ; i++){
			if (array[i] == number) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			System.out.println("第" + index + "个数");
		} else {
			System.out.println("不存在");
		}
		
	}
}
