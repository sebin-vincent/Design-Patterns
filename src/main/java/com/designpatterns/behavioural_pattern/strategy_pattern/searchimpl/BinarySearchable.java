package com.designpatterns.behavioural_pattern.strategy_pattern.searchimpl;


import com.designpatterns.behavioural_pattern.strategy_pattern.Searchable;
import com.designpatterns.behavioural_pattern.strategy_pattern.Sortable;
import com.designpatterns.behavioural_pattern.strategy_pattern.sortImpl.InsertionSort;
import com.designpatterns.behavioural_pattern.strategy_pattern.sortImpl.MergeSort;
import com.designpatterns.behavioural_pattern.strategy_pattern.sortImpl.QuickSort;
import java.util.LinkedList;
import java.util.List;

public class BinarySearchable implements Searchable {
		
		private Sortable sortable;
		
		@Override
		public Integer search(List<Integer> list,Integer n) {
				
				applySortingConditions(list);
				List<Integer> sortedList=sortable.sort(list);
				
				//TODO:-apply binary search
				
				return n;
		}
		
		// This is tight coupling. This needs to be changed
		protected void applySortingConditions(List<Integer> list){
				if(list instanceof LinkedList){
						// Use insertion sort
						this.sortable=new InsertionSort();
				}
				else if (list.size()>=1000000){
						this.sortable=new QuickSort();
				}
				else{
						this.sortable=new MergeSort();
				}
		}
		
}
