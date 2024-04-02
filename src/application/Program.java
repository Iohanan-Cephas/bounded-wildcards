package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {
	public static void main(String[] args) {
		
		// Problem (1)
		List<Shape> shapes = new ArrayList<>();
		
		shapes.add(new Rectangle(3.0, 2.0));
		shapes.add(new Circle(2.0));
		
		List<Circle> circles = new ArrayList<>();
		circles.add(new Circle(2.0));
		circles.add(new Circle(3.0));
		
		System.out.println("Total area = " + totalArea(shapes));
		// End (1)
		
		//------------------------------------------------------
		
		// Problem (2)
		
			/*	Get/put principle - Covariance
				Wrong way:
				List<Integer> list = new ArrayList<>();
				list.add(10);
				list.add(5);
				
				List<? extends Number> list2 = list;
				
				Number x = list2.get(0);
				
				list2.add(20); -> compilation error
				
				GET - ok
				PUT - error
				(Posso obter, mas não posso inserir)
			 */
		
			/*
			 	Get/put principle - Contravariance
			 	Wrong way:
			 	
			 	List<Object> list3 = new ArrayList<>();
			 	list3.add("maria");
			 	list3.add("alex");
			 	
			 	List<? super Number> list4 = list3; -> "list4" aceita tanto Number quanto Object (super tipo de Number)
			 	
			 	list4.add(10);
			 	list4.add(3.14);
			 	
			 	Number x = list4.get(0); -> compilation error
			 	
			 	GET - error
			 	PUT - ok
			 	(Posso inserir, mas não posso obter)
			 */
		
			List<Integer> ints = Arrays.asList(1, 2, 3, 4);
			List<Double> dbls = Arrays.asList(3.14, 6.28);
			List<Object> objs = new ArrayList<Object>();
			
			copy(ints, objs);
			copy(dbls, objs);
			
			printList(ints);
			printList(dbls);
			printList(objs);
			
			//End (2)
	}
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0;
		
		for(Shape s : list) {
			sum += s.area();
		}
		
		return sum;
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> target) {
		for(Number number : source) {
			target.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
