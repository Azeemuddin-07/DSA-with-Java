package JavaFrameworkCollection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Collection -> List -> interface

        // Arraylist is a concrete class so i can create the object, but not able to create the object of List or Collection.

        // way of object creation

//        Collection<Integer> collection = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        ArrayList<Integer> arr = new ArrayList<>();

        // Common Method is following

        //Methods	 Description

        //add()     adds an element to a list
        //addAll()	 adds all elements of one list to another
        //get()	     helps to randomly access elements from lists
        //iterator() returns iterator object that can be used to sequentially access elements of lists
        //set()	      changes elements of lists
        //remove()	  removes an element from the list
        //removeAll() removes all the elements from the list
        //clear()	  removes all the elements from the list (more efficient than [removeAll() )
        //size()	  returns the length of lists
        //toArray()   converts a list into an array
        //contains()   returns true if a list contains specific element


        // ArrayList -> concrete class
        ArrayList<Integer> list = new ArrayList<>();

        // add element

        list.add(10);
        list.add(20);
        list.add(100);
        list.add(53);
        list.add(49);
        System.out.println(list);
        // remove () --> in bracket, always contains the index value.
        list.remove(0);

        //create another list
        List<Integer> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(29);

        // addAll()
        list.addAll(list2);
        System.out.println(list);

        //remove()
        list.removeAll(list2);
        System.out.println(list);

        // size
        System.out.println(list.size());

        //clear()
        System.out.println("printing size of list2 : " + list2);
        list2.remove(0);
        System.out.println(list2);

        //removeAll()
        list2.removeAll(list2);
        System.out.println(list2);

        // iterator() - i want to traverse list using iterator.
        // iterator is method to give us a stantard way to travel using the for/while loop
        Iterator<Integer> iterator = list.iterator();
        // .hasNext() is a method to find the next element. if yes return true
        while(iterator.hasNext()) {

            System.out.println("Element " + iterator.next());
        }

        // another method like get(), .set(),
        List<Integer> list3 = new ArrayList<>();
        list3.add(29);
        list3.add(22);
        list3.add(25);
        list3.add(27);
        // .get()
        System.out.println(list3.get(2));
        // .set() - means update the value
        System.out.println("before :" + list3);
        list3.set(2, 99);
        System.out.println("After ;" + list3);

        // toArray() - to convert into array
        Object[] arr = list3.toArray();
        for(Object obj : arr ) {
            System.out.println(obj);
        }

        // contains() - it return if occur then true
        System.out.println(list3.contains(99));

        // .size() - to know the size of an collection
        System.out.println(list3.size());

        // another method
        //Methods    Descriptions
        // size() - Returns the length of the arraylist.
        // sort() - Sort the arraylist elements.
        //clone() - Creates a new arraylist with the same element, size, and capacity.
        //contains() - Searches the arraylist for the specified element and returns a boolean result.
        //ensureCapacity() - Specifies the total element the arraylist can contain.
        //isEmpty0) - Checks if the arraylist is empty.
        //indexOf() - Searches a specified element in an arraylist and returns the index of the element.
        List<Integer> list4 = new ArrayList<>();
        list4.add(40);
        list4.add(41);
        list4.add(39);
        list4.add(1);
        list4.add(42);


        // method
        System.out.println(list4.isEmpty());
        // default in ascending order
        list4.sort(null);
        System.out.println(list4);


        // clone - it give us shallow copy not deep copy
        ArrayList<Integer> newlist = (ArrayList <Integer>) ((ArrayList<Integer>) list4).clone();
        System.out.println("Printing new list (Shallow copy): " + newlist);
        // ensureCapacity () method
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);
        // isEmpty
        System.out.println(newlist.isEmpty());
        // to know index
        System.out.println(newlist.indexOf(40));






    }
}
