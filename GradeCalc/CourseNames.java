/*
 * CourseNames.java
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


public class CourseNames {
	
	public static int courseNames(int nCourses){
	
		String[] courseName = new String[nCourses];
		int double[][] catWeighting = new double[nCourses][4];
		
		for(int i = 0; i < nCourses; i++){
						 
			System.out.println("Please enter the name of course " + i);
			courseName[i] = scan.nextLine();  //Store course names in 1D array
		
			for(int k = 0; k < 4; k++){
			System.out.println("Please enter the percent weighting of category " + k);
			catWeighting[i][k] = scan.nextdouble();    //Store category weightings for each course in 2D array
				
		}
	}
	 
}
