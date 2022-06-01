package com.java.oop.Interface;

interface Draw1{  
void draw();  
static int cube(int x){
	return x*x*x;}  
}  
class Rect1 implements Draw1{  
public void draw(){
	System.out.println("drawing rectangle");
	}  
}  
  
class StaticMethod{  
	
	public static void main(int args) {
		int i=10;
		System.out.println(i);
	}
public static void main(String args[]){  
//Draw1 d=new Rectangle();  
//d.draw();  
	int i=3;
System.out.println("Cube of the Number "+i+"\t"+Draw1.cube(3));  


StaticMethod.main(10);
}} 
