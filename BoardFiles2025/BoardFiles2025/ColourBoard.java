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


public class ColourBoard extends Board {
		
		//public Color GRID_COLOR_A = new Color(255, 251, 0);
		//public Color GRID_COLOR_B = new Color(119, 21, 135);
		private int Color[][];
		
			public ColourBoard(int dim1, int dim2){
			super(dim1, dim2);
			//this.grid = new Color[dim2][dim1];
			this.GRID_COLOR_A = new Color(255,251,0);
			this.GRID_COLOR_B = new Color(119,21,135);
  }
		
	}


