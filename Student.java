package com.atguigu.object;

//声明Student类
class Student{
	//初始化类属性	
	int number;
	int state;
	int score;
	//类方法
	public int randomNumber(int a, int b){
		/**
		 * 返回一个a~b中的随机整数
		 * @param: a,b 随机数以a开头 b结尾
		 * @result:一个a~b以内的随机整数
		 * 包含a 包含b
		 */
		int result = (int) (Math.random() *(b-a+1)+a);
		return result;		
	}
	
	public void mkRandomTeam(Student[] teamMate){
		for(int i=0; i<teamMate.length; i++){
			//依次实例化每一个学生对象
			teamMate[i] = new Student();
			//随机取学号
			teamMate[i].number = teamMate[i].randomNumber(1, 50);
			//随机取年级
			teamMate[i].state = teamMate[i].randomNumber(1, 6);
			//随机取分数
			teamMate[i].score = teamMate[i].randomNumber(60, 100);
			
		}
	}
	
	public void printLine(){
		System.out.println("***************************************");	
	}
	
	public void searchState(Student[] teamMate, int state){
		for(int i=0; i<teamMate.length; i++){
			//打印所有3年级的学生信息
			if(teamMate[i].state == state){
				teamMate[i].Info();
			}
		}
	}
	
	public void sortBubbleScore(Student[] teamMate){
		for(int i=0; i<teamMate.length-1; i++){
			for(int j=0; j<teamMate.length-1-i; j++){
				if(teamMate[j].score > teamMate[j+1].score){
					Student temp = teamMate[j];
					teamMate[j] = teamMate[j+1];
					teamMate[j+1] = temp;
				}
			}
		}
	}
	
	public void forPrint(Student[] teamMate){
		for(int i=0; i<teamMate.length; i++){
			//打印所有学生信息				
			teamMate[i].Info();
		}		
	}
	
	public void Info(){
		//打印单个学生的信息
		System.out.println("学号为：" + number + ",年级是：" + state + ",分数是：" + score);
	}
	
}
