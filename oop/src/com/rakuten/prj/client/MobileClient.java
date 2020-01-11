package com.rakuten.prj.client;

import com.rakuten.prj.dao.*;
import com.rakuten.prj.entity.Mobile;

public class MobileClient {
	public static void main(String[] args)
	{
		Mobile m=new Mobile();
		MobileDao mobileDao=new MobileDaoMySQLImpl();
		mobileDao.addMobile(m);
	}
}
/*Flyable f=new Flyable() {
	public void fly()
	{
		System.out.print("Jump");
	}
}*/
//functional interface - only 1 method

