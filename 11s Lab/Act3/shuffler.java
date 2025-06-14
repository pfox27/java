/*
 * shuffler.java
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

/**
 * This class provides a convenient way to test shuffling methods.
 */
 
 import java.util.Random;
 
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 5;
	private static final int VALUE_COUNT = 26;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("\n" + AnsiColours.BRIGHT_RED + "The original deck is: " + AnsiColours.RESET);
			
		 int[] values1 = new int[VALUE_COUNT];
			for (int i = 0; i < values1.length; i++) {
				values1[i] = i;
				System.out.print(" " + values1[i]);
            }
           System.out.println(" ");
           System.out.println("\n" + AnsiColours.BRIGHT_CYAN + "Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles: " + AnsiColours.RESET); 
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("\u001B[33m  " + j + ": \u001B[0m");
			for (int k = 0; k < values1.length; k++) {
				System.out.print("\u001B[33m " + values1[k] + "\u001B[0m");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("\n" + AnsiColours.BRIGHT_RED + "The original deck is: " + AnsiColours.RESET);
		
			int[] values2 = new int[VALUE_COUNT];
			for (int i = 0; i < values2.length; i++) {
				values2[i] = i;
				System.out.print(" " + values2[i]);
            }
            
            System.out.println(" ");
            System.out.println("\n" + AnsiColours.BRIGHT_CYAN + "Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles: " + AnsiColours.RESET);
			for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("\u001B[33m  " + j + ": \u001B[0m");
			for (int k = 0; k < values2.length; k++) {
				System.out.print("\u001B[33m " + values2[k] + "\u001B[0m");
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		
		int shuffled[] = new int[values.length];
		int k = 0;
		//int[] shuffled = {null, null, null, null};
		
		for(int j = 0; j < (values.length + 1)/2; j++){
			shuffled[k] = values[j];
			k += 2;
		}
		
		k = 1;
		
		for(int m = (values.length + 1)/2; m < values.length; m++){
			shuffled[k] = values[m];
			k += 2;
		}
		
		for(int r = 0; r < values.length; r++){
			values[r] = shuffled[r];
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		
		int shuffled[] = new int[values.length];
		
		Random r = new Random();
	
		int n = 0;
		
			while(n < values.length){
					
			int r1 = r.nextInt(values.length);
				//System.out.println("The value of r1 is: " + r1);
				//System.out.println("values[" + r1 + "] is: " + values[r1]);
				if(values[r1] != -1){
					shuffled[n] = values[r1];
					//System.out.println("\u001B[36m shuffled[" + n + "] is: " + shuffled[n] + "\u001B[0m");
					values[r1] = -1;
					n++;
				}
			
			}		
		
		
		//System.out.println("\n\u001B[32m The While Loop Has Ended!!!!");
		//System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \u001B[0m");
		//System.out.println("\nShuffled deck is now: ");
			//System.out.println("\nThe shuffled deck is: \n");
			//for(int t = 0; t < values.length; t++){
				//System.out.print(" " + shuffled[t]);
			//}
			for(int y = 0; y < values.length; y++){
				values[y] = shuffled[y];
				//System.out.print(" " + shuffled[y]); 
		}
		//System.out.println("");
		}	
	}

