# Strategy Pattern

## Definition
The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently of clients that use it.

## UseCase
We know that **Binary-search** is the one of the best algorithm for searching with an average time complexity
of O(logN) For search operation. In order to do the search operation we need the elements to be in sorted order.
So the actual time complexity of BinarySearch = Time complexity of Search + Time Complexity for sort. But in real world
applications this sorting is only one time pain. In other words we can search many as we need, by sorting the
elements once. Due to this, the pain of sorting is adjustable ; but still it counts. We need to use the fastest
available algorithm for sorting for this purpose. If you search through google, you will find that the fastest known
algorithm to the date is QuickSort (* Given conditions applied). So your caught the '*' in previous statement. Studies 
show that the size of list of elements which needs to be sorted also have a role in deciding the best algorithm for
sorting. Which means if list has got a size of 1 Million records Quicksort will be the most efficient one. If
list size is less than 1 Lakh some other algorithm say MergeSort will be the best. The efficiency of sorting
algorithm also depends on the datastructures that holds the records. If it is a LinkedList, **InsertionSort** will be
the best one. So in essence we can decide which algorithm to use for sorting, only after knowing the size and
structure of record list in the runtime. This is the place where Strategy Pattern come to helps us.
            
       