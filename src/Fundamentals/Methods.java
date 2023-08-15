package Fundamentals;

public class Methods {
    
    
    public static void main(String[] args) {
        System.out.println("Date: 7/15/2023");
        
        //Pass the value of a method to a new array
        int []numList = summation();
        
        int sum = 0;
        for (int i = 0; i < numList.length; i++) {
            sum += numList[i]; //Add each value of an array
        }
        
        System.out.println(sum);

    }
     static int[] summation(){    
         //Assign integer value
         int []sum = {1, 2, 3, 5};
         
         //Return the value to the method
         return  sum;
    }
    
}
