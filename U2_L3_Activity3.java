/*
 * U2L3Activity3.java
 * 
 * Copyright 2024 Paul Fox <paulfox@its-air-3.lan>
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


//* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U2_L3_Activity3
{
  public static void main(String[] args)
   
  {
   Scanner myObj = new Scanner(System.in);
   System.out.println("Enter String 1:");
   String word1 = myObj.nextLine();
   System.out.println("Enter String 2:");
   String word2 = myObj.nextLine();
   String wordLower1 = word1.toLowerCase();
   String wordLower2 = word2.toLowerCase();

   System.out.println(wordLower1.compareTo(wordLower2));
   
     }
}
