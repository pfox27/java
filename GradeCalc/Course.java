/*
 * Course.java
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


public class Course {
	
	String name = " ";
	double weightK = 0;
	double weightA = 0;
	double weightC = 0;
	double weightT = 0;
	
	public int course(String courseName, catWeightK, catWeightA, catWeightC, catWeightT){
	
		setName(courseName);
		setWeightK(catWeightK);
		setWeightA(catWeightA);
		setWeightC(catWeightC);
		setWeightT(catWeightT);
			
		}
		
	public void setName(String n)
		{
			name = n;
		}	
	
	public void setWeightK(double wK)
		{
			weightK = wK;
		}
	
	public void setWeightA(double wA)
		{
			weightA = wA;
		}	
	
	public void setWeightC(double wC)
		{
			weightC = wC;
		}	
		
	public void setWeightT(double wT)
		{
			weightT = wT;
		}		
	}
	 

