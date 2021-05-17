package by.epam.chebatul.task7.main;

import by.epam.chebatul.task7.entity.Triangle;
import by.epam.chebatul.task7.helper.Point;
import by.epam.chebatul.task7.helper.TriangleException;
import by.epam.chebatul.task7.logic.TriangleLogic;

public class Main {

	public static void main(String[] args) {
		
		TriangleLogic logic = new TriangleLogic();
		
		try {
			Triangle triangle = new Triangle(new Point (1, 1), new Point (7, 2), new Point (3,3));
			System.out.println(logic.findArea(triangle));
			System.out.println(logic.findPerimetr(triangle));
		} catch (TriangleException e) {
			e.printStackTrace();
		}

	}

}