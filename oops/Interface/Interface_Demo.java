package com.java.oops.Interface;

interface Drawable {  
void draw();  
}  
 
class Rectangle implements Drawable { 
	
public void draw() {
	System.out.println("drawing rectangle");
	}  
}  

class Circle implements Drawable {  
public void draw(){
	System.out.println("drawing circle");
	}  
}  

class Interface_Demo {  
public static void main(String args[]){  
Drawable d=new Circle();
d.draw();  

Drawable d2 = new Rectangle();
d2.draw();
}} 
