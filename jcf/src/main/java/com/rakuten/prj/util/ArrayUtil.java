package com.rakuten.prj.util;

import java.util.Arrays;

public class ArrayUtil //hnnn iy hh
{
	private ArrayUtil() {}
	public static int getSum(int[] data) //something
	{
		int sum = 0; //something
		for (int i = 0; i < data.length; i++)
		{
			sum += data[i];
		}
		return sum;
	}
	public static int getOccurence(int[] data, int no) //bjjknkjb use it
	{
		int occur = 0; //something
		for (int i = 0; i < data.length; i++)
		{
			if (data[i] == no)
				occur++;
		}
		return occur;
	}
	public static void sort(int[] data)
	{
		Arrays.parallelSort(data);
	}
	
	public static void sort(Comparable[] items)
	{
		for (int i = 0; i < items.length; i++) 
		{
			for (int j = i+1; j < items.length; j++) 
				if (items[i].compareTo(items[j])>0) 
				{
					Comparable temp=items[i];
					items[i]=items[j];
					items[j]=temp;
				}
		}
	}
}
