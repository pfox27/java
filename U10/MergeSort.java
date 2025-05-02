/*
 * MergeSort.java
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


/*
 * Unit 10 - Lesson 4 - Merge Sort
 */

import java.util.Arrays;

class MergeSort 
{
  public static int steps = 0;
  public static int recursiveCall = 0;

  public static void mergeSort(int[] elements) 
  {
    int n = elements.length;
    int[] temp = new int[n];

    steps++;
    System.out.println(steps + ": original call.");

    splitter(elements, 0, n - 1, temp);
  }

  private static void splitter(int[] elements, int from, int to, int[] temp) 
  {
    if (from < to) 
    {
      int middle = (from + to) / 2;

      steps++;
      recursiveCall++;
      System.out.println(steps + ": lower half - Recursive " + recursiveCall);
      splitter(elements, from, middle, temp);

      steps++;
      System.out.println(steps + ": upper half - Recursive " + recursiveCall);
      splitter(elements, middle + 1, to, temp);

      steps++;
      System.out.println(steps + ": trigger merge - Finish Recursion " + recursiveCall);
      merge(elements, from, middle, to, temp);
    }
  }

  private static void merge(int[] elements, int from, int mid, int to, int[] temp) 
  {

    int i = from;
    int j = mid + 1;
    int k = from;

    while (i <= mid && j <= to) 
    {
      if (elements[i] < elements[j]) 
      {
        temp[k] = elements[i];
        i++;
      } 
      else 
      {
        temp[k] = elements[j];
        j++;
      }
      k++;
    }

    while (i <= mid) 
    {
      temp[k] = elements[i];
      i++;
      k++;

    }

    while (j <= to) 
    {
      temp[k] = elements[j];
      j++;
      k++;
    }

    for (k = from; k <= to; k++) 
    {
      elements[k] = temp[k];
    }
    System.out.println(Arrays.toString(temp));
    recursiveCall--;
  }

  public static void main(String[] args) 
  {
    int[] arr1 = {38, 27, 43, 3, 9, 82, 10};
    System.out.println(Arrays.toString(arr1));
    mergeSort(arr1);
    System.out.println(Arrays.toString(arr1));
  }
}
