package jUnit4Class;

import java.lang.reflect.Modifier;

public final class SortBubble {

	public static void bubbleSort(int[] arr) { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) { 
            for (int j = 0; j < n-i-1; j++) { 
                if (arr[j] > arr[j+1]) { 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                }
            }
        }
    } 
	
	public static void main(String[] args) {

		int a = 9;
		
//		assert a == 10 : "a is not 10";
		
		Class<?> clazz = SortBubble.class;
		System.out.println(Modifier.isInterface(clazz.getModifiers()));
		
	}

}
