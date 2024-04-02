package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();
		
		shapes.add(new Rectangle(3.0, 2.0));
		shapes.add(new Circle(2.0));
		
		List<Circle> circles = new ArrayList<>();
		circles.add(new Circle(2.0));
		circles.add(new Circle(3.0));
		
		System.out.println("Total area = " + totalArea(shapes));
		
	}
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0;
		
		for(Shape s : list) {
			sum += s.area();
		}
		
		return sum;
	}
}
