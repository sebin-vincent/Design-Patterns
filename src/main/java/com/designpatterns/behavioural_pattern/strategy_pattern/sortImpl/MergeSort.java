package com.designpatterns.behavioural_pattern.strategy_pattern.sortImpl;

import com.designpatterns.behavioural_pattern.strategy_pattern.Sortable;
import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sortable {
		
		@Override
		public List<Integer> sort(List<Integer> unSortedList) {
				
				//TODO:- implement Merge sort algorithm
				
				List<Integer> sortedList=new ArrayList<>(unSortedList);
				
				return sortedList;
		}
}
