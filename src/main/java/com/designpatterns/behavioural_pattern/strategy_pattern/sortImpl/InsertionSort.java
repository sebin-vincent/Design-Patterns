package com.designpatterns.behavioural_pattern.strategy_pattern.sortImpl;

import com.designpatterns.behavioural_pattern.strategy_pattern.Sortable;
import java.util.LinkedList;
import java.util.List;

public class InsertionSort implements Sortable {
		
		@Override
		public List<Integer> sort(List<Integer> unSortedList) {
				
				//TODO:- implement insertion sort algorithm
				
				List<Integer> sortedList=new LinkedList<>(unSortedList);
				
				return sortedList;
		}
}
