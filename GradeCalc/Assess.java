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
			this.name = n;
		}	
	
	public void setAWeight(double aW)
		{
			this.wAssess = aW;
		}
	
	public void setKOutOf(double kOut)
		{
			this.kOut = aOutOfK;
		}	
	
	public void setAOutOf(double aOut)
		{
			this.aOut = aOutOfA;
		}	
		
	public void setCOutOf(double cOut)
		{
			this.cOut = aOutOfC;
		}

	public void setTOutOf(double tOut)
		{
			this.tOut = aOutOfT;
		}	

	public void setScoreK(double kScore)
		{
			this.kScore = aScoreK;
		}
		
	public void setScoreA(double aScore)
		{
			this.aScore = aScoreA;
		}		
		
	public void setScoreC(double cScore)
		{
			this.cScore = aScoreC;
		}		
		
	public void setScoreT(double tScore)
		{
			this.tScore = aScoreT;
		}		
				
	}
	 
