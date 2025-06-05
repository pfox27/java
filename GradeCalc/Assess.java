/*
 * Assess.java
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

public class Assess {
	
	String name = " ";
	double wAssess = 0;
	double aOutOfK = 0;
	double aOutOfA = 0;
	double aOutOfC = 0;
	double aOutOfT = 0;
	double aScoreK = 0;
	double aScoreA = 0;
	double aScoreC = 0;
	double aScoreT = 0;
	double wEval = 0;
	double kOut = 0;
	double aOut = 0;
	double cOut = 0;
	double tOut = 0;
	double kScore = 0;
	double aScore = 0;
	double cScore = 0;
	double tScore = 0;
		
	
	public Assess(String n, double aW, double aOutOfK, double aOutOfA, double aOutOfC, double aOutOfT, double aScoreK, double aScoreA, double aScoreC, double aScoreT){
	
		setName(n);
		setAWeight(aW);
		System.out.println(ANSIColors.BRIGHT_GREEN + " The aOutOfK value is now: " + aOutOfK + ANSIColors.RESET);  //flag to check input
		setKOutOf(aOutOfK);
		setAOutOf(aOutOfA);
		setCOutOf(aOutOfC);
		setTOutOf(aOutOfT);
		setScoreK(aScoreK);
		setScoreA(aScoreA);
		setScoreC(aScoreC);
		setScoreT(aScoreT);
		}
		
	public void setName(String n)
		{
			name = n;
		}	
	
	public void setAWeight(double aW)
		{
			wAssess = aW;
		}
	
	public void setKOutOf(double aOutOfK)
		{
			kOut = aOutOfK;
			System.out.println(ANSIColors.BRIGHT_CYAN + " The kOut value is now: " + kOut + ANSIColors.RESET);  //flag to check input
		}	
	
	public void setAOutOf(double aOutOfA)
		{
			aOut = aOutOfA;
		}	
		
	public void setCOutOf(double aOutOfC)
		{
			cOut = aOutOfC;
		}

	public void setTOutOf(double aOutOfT)
		{
			tOut = aOutOfT;
		}	

	public void setScoreK(double aScoreK)
		{
			kScore = aScoreK;
		}
		
	public void setScoreA(double aScoreA)
		{
			aScore = aScoreA;
		}		
		
	public void setScoreC(double aScoreC)
		{
			cScore = aScoreC;
		}		
		
	public void setScoreT(double aScoreT)
		{
			tScore = aScoreT;
		}
		
	public String toString()
  {
    return  "Assessment Name: " + this.name + " Assessment weight: " + this.wAssess + " kOut: " + this.kOut + " aOut: " + this.aOut + " cOut: " + this.cOut + " tOut: " + this.tOut + " kScore: " + this.kScore + " aScore: " + this.aScore + " cScore: " + this.cScore + " tScore: " + this.tScore;
  }		
				
	}
	 
