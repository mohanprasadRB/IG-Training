package com.java.oops.Interface;

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
  
class Static_Method{  
	
	public static void main(int args) {
		int i=args;
		System.out.println(i);
	}
public static void main(String args[]){  
//Draw1 d=new Rectangle();  
//d.draw();  
	int i=3;
System.out.println("Cube of the Number "+i+"\t"+Draw1.cube(3));  


Static_Method.main(100);
}} 
