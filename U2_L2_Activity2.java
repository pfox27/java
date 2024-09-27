/*
 * U2L3Activity2.java
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

public class U2_L3_Activity2
{
  public static void main(String[] args)
  {
   
   Scanner myObj = new Scanner(System.in);
   System.out.println("Enter a string:");
   String word = myObj.nextLine();
   System.out.println("How many characters would ye like to delete from the end?");
   int n = myObj.nextInt();
   
   System.out.println(word.substring(0,word.length() - n));
   
     }
}
