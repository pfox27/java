/*
 * Assessments.java
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

public class Assessments{
	
	public static void assessments (int nCourses, int nCategories) {
		
		double knowledgeScoreSum = 0;
		double applicationScoreSum = 0;
		double thinkingScoreSum = 0;
		double communicationScoreSum = 0;	
		double knowledgeOutOfSum = 0;
		double applicationOutOfSum = 0;
		double thinkingOutOfSum = 0;
		double communicationOutOfSum = 0;
		double[] termMark = new double[nCourses];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < nCourses; i++){
			System.out.println("Please enter the number of assessments for course " + i);
			int nAssess = scan.nextInt();
			String[] assessmentName = new String[nAssess];
			double[] assessWeightingK = new double[nAssess];
			double[] assessWeightingA = new double[nAssess];
			double[] assessWeightingT = new double[nAssess];
			double[] assessWeightingC = new double[nAssess];
			double[] assessOutOfK = new double[nAssess];
			double[] assessOutOfA = new double[nAssess];
			double[] assessOutOfT = new double[nAssess];
			double[] assessOutOfC = new double[nAssess];
			double[] assessScoreK = new double[nAssess];
			double[] assessScoreA = new double[nAssess];
			double[] assessScoreT = new double[nAssess];
			double[] assessScoreC = new double[nAssess];
			
			for(int u = 0; u < nAssess; u++){
				System.out.println("Please enter the name of assessment " + i + ":");
				assessmentName[u] = scan.nextLine();
				System.out.println("Please enter the percent weighting of the knowledge category for " + assessmentName[u] + ":");
				assessWeightingK[u] = scan.nextDouble();
				System.out.println("Please enter the percent weighting of the application category for " + assessmentName[u] + ":");
				assessWeightingA[u] = scan.nextDouble();
				System.out.println("Please enter the percent weighting of the thinking category for " + assessmentName[u] + ":");
				assessWeightingT[u] = scan.nextDouble();
				System.out.println("Please enter the percent weighting of the communication category for " + assessmentName[u] + ":");
				assessWeightingC[u] = scan.nextDouble();
				System.out.println("Please enter what knowledge for " + assessmentName[u] + "is out of:");
				assessOutOfK[u] = scan.nextDouble();
				System.out.println("Please enter the knowledge score for " + assessmentName[u] + ":");
				assessScoreK[u] = scan.nextDouble();
				System.out.println("Please enter what application for " + assessmentName[u] + "is out of:");
				assessOutOfA[u] = scan.nextDouble();
				System.out.println("Please enter the application score for " + assessmentName[u] + ":");
				assessScoreA[u] = scan.nextDouble();
				System.out.println("Please enter what thinking for " + assessmentName[u] + "is out of:");
				assessOutOfT[u] = scan.nextDouble();
				System.out.println("Please enter the thinking score for " + assessmentName[u] + ":");
				assessScoreT[u] = scan.nextDouble();
				System.out.println("Please enter what communication for " + assessmentName[u] + "is out of:");
				assessOutOfC[u] = scan.nextDouble();
				System.out.println("Please enter the communication score for " + assessmentName[u] + ":");
				assessScoreC[u] = scan.nextDouble();
				knowledgeScoreSum = knowledgeScoreSum + assessScoreK[u];
				applicationScoreSum = applicationScoreSum + assessScoreA[u];
				thinkingScoreSum = thinkingScoreSum + assessScoreT[u];
				communicationScoreSum = communicationScoreSum + assessScoreC[u];
				knowledgeOutOfSum = knowledgeOutOfSum + assessOutOfK[u];
				applicationOutOfSum = applicationOutOfSum + assessOutOfA[u];
				thinkingOutOfSum = thinkingOutOfSum + assessOutOfT[u];
				communicationOutOfSum = communicationOutOfSum + assessOutOfC[u];
						
				
		}
		termMark[i] = knowledgeScoreSum/knowledgeOutOfSum*catWeighting[0] + applicationScoreSum/applicationOutOfSum*catWeighting[1] + thinkingScoreSum/thinkingOutOfSum*catWeighting[2] + communicationScoreSum/communicationOutOfSum*catWeighting[3];
		System.out.println("Term mark for " + courseName[i] + " is:" + termMark[i]);
	}
	
}
}
