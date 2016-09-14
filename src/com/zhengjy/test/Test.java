package com.zhengjy.test;

public class Test {
	public static void main(String[] args) {
		String str = "<a href=\"/docs/phonePrice\" target=\"_blank\" style=\"margin-left: 0px;\">查看费率表</a>";
		
		System.out.println(str.substring(0, str.indexOf("/docs/")));
		
		String str2 = str.substring(0, str.indexOf("/docs/")) +"http://dlp.pre.duiba.com.cn/" +
				str.substring(str.indexOf("/docs/"), str.length());
		System.out.println(str2);
	}
}
