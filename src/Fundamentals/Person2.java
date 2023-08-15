package Fundamentals;

public class Person2 {
    // For encapsulation practices...
    
    // Attributes
    private String firstName;
    private String lastName;
    private String middleName;
    
       
        Person2(String firstName, String lastName, String middleName){
            this.firstName = firstName;
            this.lastName = lastName;
            this.middleName = middleName;
        }
        
        // Set Method
         void setFirstName(String firstName){
            this.firstName = firstName;
        } void setLastName(String lastName){
            this.lastName = lastName;
        } void setMiddleName(String middleName){
            this.middleName = middleName;
        }

        // Get Method
         String getFirstName(){
            return firstName;
        } String getLastName(){
            return lastName;
        } String getMiddleName(){
            return middleName;
        }

        
        

}

