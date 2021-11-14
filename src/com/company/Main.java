package com.company;

public class Main
{
    public static void main(String[] args)
    {
	    int [] arr = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
	    int key = 15;

	    //sequential search
        boolean found = false;
        System.out.print ("sequential search: ");
	    for (int i = 0; i < arr.length && !found; i++)
	    {
            System.out.print (arr [i] + " ");
	        if (key == arr [i])
	            found = true;
        }
        System.out.println();

	    //binary search
        System.out.print ("binary search: ");
        found = false;
        int n = arr.length;
        int lo = 0;
	    int hi = n - 1;
        for (int i = 0; i < arr.length && !found; i++)
        {
            int mid = (lo + hi) / 2;
            System.out.print (arr [i] + " ");
            if (key == arr [mid])
                found = true;
            else if (key < arr [mid])
                hi = mid - 1;
            else
                lo = mid + 1;
        }
    }
}
