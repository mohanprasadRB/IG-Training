package com.java.oops.polymorphism.Dynamic;

	   class Shape {
	 
	   private String color;
	   
	 
	   public Shape (String color) {
	      this.color = color;
	   }

	 
	   @Override
	   public String toString() {
	      return "Shape[color=" + color + "]";
	   }
	   
	 
	   public double getArea() {
	      // We have a problem here!
	      // We need to return some value to compile the program.
	      System.err.println("Shape unknown! Cannot compute area!");
	      return 0;
	   }
	}
	   
	   
	   class Rectangle extends Shape {
		    
		   private int length, width;
		   
		   
		   public Rectangle(String color, int length, int width) {
		      super(color);
		      this.length = length;
		      this.width = width;
		   }

		  
		   @Override
		   public String toString() {
		      return "Rectangle[length=" + length + ",width=" + width + "," + super.toString() + "]";
		   }
		   
		  
		   @Override
		   public double getArea() {
		      return length*width;
		   }
		}
	   
	   class Triangle extends Shape {
		   
		   private int base, height;
		   
		 
		   public Triangle(String color, int base, int height) {
		      super(color);
		      this.base = base;
		      this.height = height;
		   }
		   
		 
		   @Override
		   public String toString() {
		      return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
		   }
		   
 		   @Override
		   public double getArea() {
		      return 0.5*base*height;
		   }
		}
	   
public class RuntimeDemo2 {
	
	 public static void main(String[] args) {
	      Shape s1 = new Rectangle("red", 4, 5);  
	      System.out.println(s1);  
	    
	      System.out.println("Area is " + s1.getArea());  

	      Shape s2 = new Triangle("blue", 4, 5);  
	      System.out.println(s2);  
	  
	      System.out.println("Area is " + s2.getArea());  

}
}
