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
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class
	
public class GradeCalc {
	
	public static void main (String[] args) {
		
		//Course[] courses = {};
		//int numCourses = 0;
		System.out.println("Please enter the number of courses:");
		Scanner scan = new Scanner(System.in); //Create new Scanner object
		int numCourses = scan.nextInt();
		scan.nextLine();
		Course[] c = new Course[numCourses];

		String cName = " ";
		double catWeightingK = 0.0;
		double catWeightingA = 0.0;
		double catWeightingC = 0.0;
		double catWeightingT = 0.0;
		double knowScoreSum = 0;
		double appScoreSum = 0;
		double thinkScoreSum = 0;
		double commScoreSum = 0;	
		double knowOutOfSum = 0;
		double appOutOfSum = 0;
		double thinkOutOfSum = 0;
		double commOutOfSum = 0;
		double[] termMark = new double[numCourses];
		
		
		for(int i = 0; i < numCourses; i++){
			
			System.out.println("Please enter the name of course " + i + ":");
			cName = scan.nextLine();
			System.out.println("Please enter the weighting of the knowledge category:");
			catWeightingK = scan.nextDouble();
			System.out.println("Please enter the weighting of the application category:");
			catWeightingA = scan.nextDouble();
			System.out.println("Please enter the weighting of the communication category:");
			catWeightingC = scan.nextDouble();
			System.out.println("Please enter the weighting of the thinking category:");
			catWeightingT = scan.nextDouble();
			scan.nextLine();
			System.out.println("Please enter the number of assessments in " + cName + ":");
			int nAssess = scan.nextInt();
			scan.nextLine();
			String[] aName = new String[nAssess];
			double[] aWeighting = new double[nAssess];
			double[] assessOutOfK = new double[nAssess];
			double[] assessOutOfA = new double[nAssess];
			double[] assessOutOfT = new double[nAssess];
			double[] assessOutOfC = new double[nAssess];
			double[] assessScoreK = new double[nAssess];
			double[] assessScoreA = new double[nAssess];
			double[] assessScoreT = new double[nAssess];
			double[] assessScoreC = new double[nAssess];

			c[i] = new Course(cName, catWeightingK, catWeightingA, catWeightingC, catWeightingT);

				
				Assess[] a = new Assess[nAssess];

				for(int u = 0; u < nAssess; u++){
					System.out.println("Please enter the name of assessment " + u + ":");
					aName[u] = scan.nextLine();
					//String tmp = scan.nextLine();	
					System.out.println("The name of the assessment is: " + aName[u]);
					//String tmp = scan.nextLine();
					//aName[u] = scan.nextLine();				
					System.out.println("Please enter the weight (10/30/50) for " + aName[u] + ":");
					aWeighting[u] = scan.nextDouble();
					System.out.println("Please enter what knowledge for " + aName[u] + " is out of:");
					assessOutOfK[u] = scan.nextDouble();
					//System.out.println(ANSIColors.BRIGHT_MAGENTA + " The assessOutOfK value is now: " + assessOutOfK[u] + ANSIColors.RESET);  //flag to check input
					
					System.out.println("Please enter the knowledge score for " + aName[u] + ":");
					assessScoreK[u] = scan.nextDouble();
					System.out.println("Please enter what application for " + aName[u] + " is out of:");
					assessOutOfA[u] = scan.nextDouble();
					System.out.println("Please enter the application score for " + aName[u] + ":");
					assessScoreA[u] = scan.nextDouble();
					System.out.println("Please enter what thinking for " + aName[u] + " is out of:");
					assessOutOfT[u] = scan.nextDouble();
					System.out.println("Please enter the thinking score for " + aName[u] + ":");
					assessScoreT[u] = scan.nextDouble();
					System.out.println("Please enter what communication for " + aName[u] + " is out of:");
					assessOutOfC[u] = scan.nextDouble();
					System.out.println("Please enter the communication score for " + aName[u] + ":");
					assessScoreC[u] = scan.nextDouble();
					scan.nextLine();
									
					a[u] = new Assess(aName[u], aWeighting[u], assessOutOfK[u], assessOutOfA[u], assessOutOfC[u], assessOutOfT[u], assessScoreK[u], assessScoreA[u], assessScoreC[u], assessScoreT[u]);

					System.out.println("Assess " + u + " attributes are: " + a[u]);

					knowScoreSum = knowScoreSum + a[u].kScore/a[u].kOut*a[u].wAssess;
					appScoreSum = appScoreSum + a[u].aScore/a[u].aOut*a[u].wAssess;
					commScoreSum = commScoreSum + a[u].cScore/a[u].cOut*a[u].wAssess;
					thinkScoreSum = thinkScoreSum + a[u].tScore/a[u].tOut*a[u].wAssess;
					knowOutOfSum = knowOutOfSum + aWeighting[u];
					appOutOfSum = appOutOfSum + aWeighting[u];
					thinkOutOfSum = thinkOutOfSum + aWeighting[u];
					commOutOfSum = commOutOfSum + aWeighting[u];

				}
//	Assessments.assessments(numCourses, courses);
				
				System.out.println("knowScoreSum is: " + knowScoreSum);
				System.out.println("appScoreSum is: " + appScoreSum);
				System.out.println("commScoreSum is: " + commScoreSum);
				System.out.println("thinkScoreSum is: " + thinkScoreSum);
				
				double knowFinal = knowScoreSum/knowOutOfSum*c[i].weightK;
				double appFinal = appScoreSum/appOutOfSum*c[i].weightA;
				double commFinal = commScoreSum/commOutOfSum*c[i].weightA;
				double thinkFinal = thinkScoreSum/thinkOutOfSum*c[i].weightA;
				
				System.out.println("The final score for knowledge is: " + knowFinal);
				System.out.println("The final score for application is: " + appFinal);
				System.out.println("The final score for communications is: " + commFinal);
				System.out.println("The final score for thinking is: " + thinkFinal);
				
				termMark[i] = knowScoreSum/knowOutOfSum*c[i].weightK + appScoreSum/appOutOfSum*c[i].weightA + thinkScoreSum/thinkOutOfSum*c[i].weightT + commScoreSum/commOutOfSum*c[i].weightC;
				System.out.println("Term mark (/70) for " + c[i].name + " is:" + termMark[i]);
				
				try {
					File myObj = new File("filename.txt");
					if (myObj.createNewFile()) {
						System.out.println("File created: " + myObj.getName());
					} 
					else {
						System.out.println("File already exists.");
					}
				} 
				
				catch (IOException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				}
				
				try {
					FileWriter myWriter = new FileWriter("filename.txt");
					myWriter.write("Files in Java might be tricky, but it is fun enough!");
					myWriter.close();
					System.out.println("Successfully wrote to the file.");
				} 
				catch (IOException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				}
				
			}

		}

}
