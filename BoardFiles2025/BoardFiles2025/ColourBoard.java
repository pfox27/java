/*
 * ColourBoard.java
 * 
 * Copyright 2025 Paul Fox <pfox27@ultramarine>
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

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColourBoard extends Board {
   
   //public static Color GRID_COLOR_A = new Color(255, 251, 0);
   //public static Color GRID_COLOR_B = new Color(121, 6, 158);
   
   
   
		public ColourBoard(int var1, int var2) {
			//public static Color GRID_COLOR_A = new Color(255, 251, 0);
			//public static Color GRID_COLOR_B = new Color(121, 6, 158);
			super(var1, var2);
			super.GRID_COLOR_A = new Color(255, 251, 0);
			super.GRID_COLOR_B = new Color(121, 6, 158);
			
      
   }
}



   
				
				
				
