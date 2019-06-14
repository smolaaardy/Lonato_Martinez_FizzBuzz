public class FizzBuzz {
    public String fizzBuzz(int number) {
    	boolean fizz = false;
    	boolean buzz = false;


        if(number % 3 == 0){
        	fizz = true;
        }
        if(number % 5 == 0){
        	buzz = true;
        }
        if(fizz == true && buzz == true){
        	System.out.println("FizzBuzz");
        	return "FizzBuzz";
        }
        else if(fizz == true){
        	System.out.println("Fizz");
        	return "Fizz";
        }
        else if(buzz == true){
        	System.out.println("Buzz");
        	return "Buzz";
        }
        else{
        	System.out.println(number);
        	return "Not divisible by 3 or 5";
        }
    }
}