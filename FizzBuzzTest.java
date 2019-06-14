public class FizzBuzzTest{
    public static void main(String[] args){
        FizzBuzz fb = new FizzBuzz();
        String result = fb.fizzBuzz(15);
        String result2 = fb.fizzBuzz(3);
        String result3 = fb.fizzBuzz(5);
        String result4 = fb.fizzBuzz(2);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}