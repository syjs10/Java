package com.iotekclass.ht.beans;

public class Student {
	/* 修改属性权限 */int sid;// 编号
	/* 修改属性权限 */String sno;// 学号
	/* 修改属性权限 */String sname;// 姓名
	/* 修改属性权限 */String sex;// 性别
	/* 修改属性权限 */String sdate;// 出生日期
	/* 修改属性权限 */String stel;// 电话
	/* 修改属性权限 */String sadd;// 地址

	/* 添加无参数的构造方法 */
	public Student() {
		super();
	}
	/* 添加带参数的构造方法 */
	public Student(int sid, String sno, String sname, String sex, String sdate,
			String stel, String sadd) {
		super();
		this.sid = sid;
		this.sno = sno;
		this.sname = sname;
		this.sex = sex;
		this.sdate = sdate;
		this.stel = stel;
		this.sadd = sadd;
	}
	/* 添加属性的get,set方法 */
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	public String getStel() {
		return stel;
	}

	public void setStel(String stel) {
		this.stel = stel;
	}

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	
}

}