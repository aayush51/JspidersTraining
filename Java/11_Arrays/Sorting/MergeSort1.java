package Sorting;
import java.util.*;
public class MergeSort1 {
	
	public static void merge(int[] ar , int start , int mid , int end)
	{
		int[] ans = new int[ar.length];
		int i = start , j = mid+1 , k = start ;
		while(i<=mid && j<=end)
		{
			if(ar[i]<ar[j]) 
			{
				ans[k++]=ar[i++];
			}
			else
			{
				ans[k++]=ar[j++];
			}
		}
		while(i<=mid)
		{
			ans[k++]=ar[i++];
		}
		while(j<=end)
		{
			ans[k++]=ar[j++];
		}
		for(int m=start; m<=end; m++)
		{
			ar[m]=ans[m];
		}
	}
	public static void mergeSort(int[] ar , int start , int end)
	{
		if(start<end)
		{
			int mid = (start+end)/2;
			mergeSort(ar , start , mid);
			mergeSort(ar , mid+1 ,end);
			merge(ar , start , mid , end);
		}
	}
	public static void main(String[] args) {
		int[] a = {234,221,199,175,143,78,21,15,12,7,3,2};
		mergeSort(a , 0 , a.length-1);
		System.out.println(Arrays.toString(a));
		
	}
}
