package com.Session5.Assignment1;

import java.util.Scanner;

import com.sun.org.apache.regexp.internal.recompile;

public class SingleInheritance{

	/*
	 * Write a program to calculate area of rectangle and triangle using single inheritance.
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.println("********* Calculating Area of Rectangle **********");
		Rectangle  rect = new Rectangle();
		System.out.println("Area of Rectangle is: "+rect.area());
		
		System.out.println("********* Calculating Area of Triangle **********");
		Triangle  tri = new Triangle();
		System.out.println("Area of Triangle is: "+tri.area());
		
	}
}


class Area
{
	private double height;
	private double width;
	protected Scanner scan;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	
}

class Rectangle extends Area
{
	
	public Rectangle() {
		scan = new Scanner(System.in);
		System.out.println("Enter Height of  Rectangle");
		this.setHeight(scan.nextDouble());
		System.out.println("Enter Width of  Rectangle");
		this.setWidth(scan.nextDouble());
		
	}
	public double area()
	{
		return this.getHeight()*this.getWidth();
	}
}

class Triangle extends Area
{
	private double side3;
	public Triangle() {
		scan = new Scanner(System.in);
		System.out.println("Enter Length of side 1");
		this.setHeight(scan.nextDouble());
		System.out.println("Enter Length of side 2");
		this.setWidth(scan.nextDouble());		
		System.out.println("Enter Length of side 3");
		this.setSide3(scan.nextDouble());
		
	}
	
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	
	public double area()
	{
		double p = (this.getHeight()+this.getWidth()+this.getSide3())/2;
		return Math.pow(p*(p-this.getHeight())*(p-this.getWidth())*(p-this.getSide3()), 0.5);
	}
	
	
	
	
}