package com.funcpro.major1

object Maj1Ws {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //item #1
  def fib(n:Int): Int = {
  
  val n1 = (n<=0);
  val n2 = (n<=1);
  
  if(n1){
  	0
  	}else if(n2){
  		0
  	}else{
  		fib(n-1) + fib(n-2);
  	}
  	
  }                                               //> fib: (n: Int)Int
  fib(6);                                         //> res0: Int = 0
  
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