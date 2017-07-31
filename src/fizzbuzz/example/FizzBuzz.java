package fizzbuzz.example;

public class FizzBuzz {
	public static String fizzBuzz(int num) {

		//引数が15で割り切れるならFizzBuzz
		if(num % 15==0){
			System.out.println("FizzBuzz");
			return "FizzBuzz";
		}
		else if(num % 3==0){
			System.out.println("Fizz");
			return "Fizz";
		}
		else if(num % 5==0){
			System.out.println("Buzz");
			return "Buzz";
		}
		else{
			System.out.println(num);
			String obj=String.valueOf(num);
			return obj;
		}
	}
}
