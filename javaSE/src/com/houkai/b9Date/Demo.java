
package com.houkai.b9Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月-hh时mm分ss秒");
		String sd = sdf.format(d);
		System.out.println(sd);
	}
}
