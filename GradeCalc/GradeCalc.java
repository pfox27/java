/*
 * GradeCalc.java
 * 
 * Copyright 2025 Paul Fox <paulfox@Paul-Fox-MacBook-Air.local>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner; //Import Scanner class


	
public class GradeCalc {
	
	public static void main (String[] args) {
		
		System.out.println("Please enter the number of courses:");
		Scanner scan = new Scanner(System.in); //Create new Scanner object
		int numCourses = scan.nextInt;
		Course[] classes = new Course[numCourses];
		String cName = " ";
		double catWeightingK = 0.0;
		double catWeightingA = 0.0;
		double catWeightingC = 0.0;
		double catWeightingT = 0.0;
		
		for(int i = 0; i < numCourses; i++){
			
			System.out.println("Please enter the name of course " + i + ":");
			int catWeightingK = scan.nextLine;
			System.out.println("Please enter the weighting of the knowledge category:");
			int catWeightingK = scan.nextDouble;
			System.out.println("Please enter the weighting of the application category:");
			int catWeightingK = scan.nextDouble;
			System.out.println("Please enter the weighting of the communication category:");
			int catWeightingK = scan.nextDouble;
			System.out.println("Please enter the weighting of the thinking category:");
			int catWeightingK = scan.nextDouble;
			
			Course class1 = new Course(cName, catWeightingK, catWeightingA, catWeightingC, catWeightingT);
			  
		 
		
	}
}

