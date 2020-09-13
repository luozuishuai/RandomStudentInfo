package com.atguigu.object;

public class StudentTest {
	public static void main(String[] args) {
		//声明10个对象在一个数组对象中
		Student[] teamMate = new Student[10];		
		//实例化工具人
		Student tool = new Student();		
		//给对象数组内所有元素随机配置学生属性
		tool.mkRandomTeam(teamMate);		
		//打印分割线
		tool.printLine();		
		//打印所有3年级的学生信息：
		tool.searchState(teamMate, 3);		
		//打印分割线
		tool.printLine();
		//冒泡排序学生分数：
		tool.sortBubbleScore(teamMate);	
		//遍历打印所有学生信息：
		tool.forPrint(teamMate);
	}
}
