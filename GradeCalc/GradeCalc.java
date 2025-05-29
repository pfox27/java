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
		
		//Course[] courses = {};
		//int numCourses = 0;
		System.out.println("Please enter the number of courses:");
		Scanner scan = new Scanner(System.in); //Create new Scanner object
		int numCourses = scan.nextInt();
		scan.nextLine();
		Course[] courses = new Course[numCourses];
		String cName = " ";
		double catWeightingK = 0.0;
		double catWeightingA = 0.0;
		double catWeightingC = 0.0;
		double catWeightingT = 0.0;
		double knowledgeScoreSum = 0;
		double applicationScoreSum = 0;
		double thinkingScoreSum = 0;
		double communicationScoreSum = 0;	
		double knowledgeOutOfSum = 0;
		double applicationOutOfSum = 0;
		double thinkingOutOfSum = 0;
		double communicationOutOfSum = 0;
		double[] termMark = new double[nCourses];
		String[] aName = new String[nAssess];
		double[] assessWeighting = new double[nAssess];
		double[] assessOutOfK = new double[nAssess];
		double[] assessOutOfA = new double[nAssess];
		double[] assessOutOfT = new double[nAssess];
		double[] assessOutOfC = new double[nAssess];
		double[] assessScoreK = new double[nAssess];
		double[] assessScoreA = new double[nAssess];
		double[] assessScoreT = new double[nAssess];
		double[] assessScoreC = new double[nAssess];
		
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
			int numAssess = scan.nextInt();
			
			courses[i] = new Course(cName, catWeightingK, catWeightingA, catWeightingC, catWeightingT);

				for(t = 0; u < numAssess; u++){
					System.out.println("Please enter the name of assessment " + u + ":");
					aName[u] = scan.nextLine();					
					System.out.println("Please enter the weight (10/30/50) for " + aName[u] + ":");
					aWeighting[u] = scan.nextDouble();
					System.out.println("Please enter what knowledge for " + aName[u] + "is out of:");
					assessOutOfK[u] = scan.nextDouble();
					System.out.println("Please enter the knowledge score for " + aName[u] + ":");
					assessScoreK[u] = scan.nextDouble();
					System.out.println("Please enter what application for " + aName[u] + "is out of:");
					assessOutOfA[u] = scan.nextDouble();
					System.out.println("Please enter the application score for " + aName[u] + ":");
					assessScoreA[u] = scan.nextDouble();
					System.out.println("Please enter what thinking for " + aName[u] + "is out of:");
					assessOutOfT[u] = scan.nextDouble();
					System.out.println("Please enter the thinking score for " + aName[u] + ":");
					assessScoreT[u] = scan.nextDouble();
					System.out.println("Please enter what communication for " + aName[u] + "is out of:");
					assessOutOfC[u] = scan.nextDouble();
					System.out.println("Please enter the communication score for " + aName[u] + ":");
					assessScoreC[u] = scan.nextDouble();
					knowledgeScoreSum = knowledgeScoreSum + assessScoreK[u]/assessOutOfK[u]*aWeighting[u];
					applicationScoreSum = applicationScoreSum + assessScoreA[u]/assessOutOfA[u]*aWeighting[u];
					thinkingScoreSum = thinkingScoreSum + assessScoreT[u]/assessOutOfT[u]*aWeighting[u];
					communicationScoreSum = communicationScoreSum + assessScoreC[u]/assessOutOfC[u]*aWeighting[u];
					knowledgeOutOfSum = knowledgeOutOfSum + aWeighting[u];
					applicationOutOfSum = applicationOutOfSum + aWeighting[u];
					thinkingOutOfSum = thinkingOutOfSum + aWeighting[u];
					communicationOutOfSum = communicationOutOfSum + aWeighting[u];
					termMark[i] = knowledgeScoreSum/knowledgeOutOfSum*c[i].weightK + applicationScoreSum/applicationOutOfSum*c[i].weightA + thinkingScoreSum/thinkingOutOfSum*c[i].weightC + communicationScoreSum/communicationOutOfSum*c[i].weightT;
					System.out.println("Term mark for " + c[i].name + " is:" + termMark[i]);					
					Asess[] assessments = new Assess[numAssess];
					assessments[t] = new Assess(aName[u], aWeighting[u], assessOutOfK[u], assessOutOfA[u], assessOutOfC[u], assessOutOfT[u], assessScoreK[u], assessScoreA[u], assessScoreC[u], assessScoreT[u]


		}
//	Assessments.assessments(numCourses, courses);
			
			
	}

}


