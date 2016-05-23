package com.iotekclass.ht.test;
import com.iotekclass.ht.beans.Student;
public class StudentTest {
  public static void main(String[] args) {
		// 创建Student对象,调用set方法来给学员的属性赋值
		










		// 调用自我介绍的方法
		introduction(student);
	}
	
	/**
	 * 自我介绍的方法
	 */
	public static void introduction(Student student) {
		System.out.println("Student [sid=" + student.getSid() + ", sno=" + student.getSno() + ", sname="
				+ student.getSname() + ", sex=" + student.getSex() + ", sdate=" + student.getSdate() + ", stel="
				+ student.getStel() + ", sadd=" + student.getSadd() + "]");
	}
}
