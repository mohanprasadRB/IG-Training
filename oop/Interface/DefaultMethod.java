package com.java.oop.Interface;

interface Draw{  
void draw();  
default void msg(){
	System.out.println("default method");
	}  
static int cube(int x){
	return x*x*x;
	}  
}  
class Rect implements Draw{  
public void draw(){
	System.out.println("drawing rectangle");
	}  
}  

class DefaultMethod {  
public static void main(String args[]){  
Draw d=new Rect();  
d.draw();  
d.msg();  
System.out.println(Draw.cube(5));
}}  