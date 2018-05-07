package com.example.littleDemo;

import com.example.tool.MD5;

public class ToolTest {
	
	public static void main(String[] args) {
		
		//MD5加密
		System.out.println(MD5.createPassword("123456")); //加密后：E10ADC3949BA59ABBE56E057F20F883E
		
		//核对密码
		System.out.println(MD5.authenticatePassword("E10ADC3949BA59ABBE56E057F20F883E", "123456")); //核对密码
	
	}

}
