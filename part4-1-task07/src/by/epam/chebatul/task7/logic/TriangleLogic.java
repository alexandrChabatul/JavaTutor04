package by.epam.chebatul.task7.logic;

import by.epam.chebatul.task7.entity.Triangle;

public class TriangleLogic {

	public double findPerimetr(Triangle triangle) {
		double firstSide = Math.sqrt((Math.pow(triangle.getA().getY() - triangle.getB().getY(), 2))
				+ (Math.pow(triangle.getA().getX() - triangle.getB().getX(), 2)));
		double secondSide = Math.sqrt((Math.pow(triangle.getA().getY() - triangle.getC().getY(), 2))
				+ (Math.pow(triangle.getA().getX() - triangle.getC().getX(), 2)));
		double thirdSide = Math.sqrt((Math.pow(triangle.getC().getY() - triangle.getB().getY(), 2))
				+ (Math.pow(triangle.getC().getX() - triangle.getB().getX(), 2)));
		return firstSide + secondSide + thirdSide;
	}
	
	public double findArea(Triangle triangle) {
		double halfPerimetr = findPerimetr(triangle) / 2;
		double first = Math.sqrt((Math.pow(triangle.getA().getY() - triangle.getB().getY(), 2))
				+ (Math.pow(triangle.getA().getX() - triangle.getB().getX(), 2)));
		double second = Math.sqrt((Math.pow(triangle.getA().getY() - triangle.getC().getY(), 2))
				+ (Math.pow(triangle.getA().getX() - triangle.getC().getX(), 2)));
		double third = Math.sqrt((Math.pow(triangle.getC().getY() - triangle.getB().getY(), 2))
				+ (Math.pow(triangle.getC().getX() - triangle.getB().getX(), 2)));
		return Math.sqrt(halfPerimetr * (halfPerimetr - first) * (halfPerimetr - second) * (halfPerimetr - third));
	}
	
}
