package com.funcpro.major1

object Maj1Ws {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //item #1
  def fib(n:Int): Int = {
  if(n==1){
  	1
  	}else if(n==2){
  		1
  	}else{
  		fib(n-1) + fib(n-2);
  	}
  	
  }                                               //> fib: (n: Int)Int
  fib(6);                                         //> res0: Int = 8
  
  //item #2
  def fizzString(fizzBuzzString:String):String = {
  		if(fizzBuzzString.startsWith("f") || fizzBuzzString.startsWith("F") && fizzBuzzString.endsWith("b") || fizzBuzzString.endsWith("B")){
  			return"FizzBuzz";
  		}else if(fizzBuzzString.endsWith("b") || fizzBuzzString.endsWith("B")){
  			return"Buzz";
  		}else if(fizzBuzzString.startsWith("f") || fizzBuzzString.startsWith("F")){
  			return "Fizz";
  		}else{
  			return fizzBuzzString;
  		}
  }                                               //> fizzString: (fizzBuzzString: String)String
    fizzString("Fizz");                           //> res1: String = Fizz
  
  //item #3
  def factorial(num:Int):Unit={
  	val numberAns =(num*(num-1)*(num-2));
  	if(num!=0){
		val numberAns =(num*(num-1)*(num-2));
		}
		println(numberAns);
  }                                               //> factorial: (num: Int)Unit
    factorial(3);                                 //> 6
  //item#4
  
}