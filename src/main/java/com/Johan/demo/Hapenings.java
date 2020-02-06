package com.Johan.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hapenings {
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world") //Keeping this because its when I finally got it in my thick head!
	public String helloWorld() {
		return "<h1 style='color:red';>Hello World</h1>";
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value="/mathbaby")	
	public double math(double first, String operator, double second)
	{
		switch(operator) { //the operators is in plain text because the operator + can get a weird result!
			case "times":
				return first * second;
			case "plus":
				return first + second;
			case "subtract":
				return first - second;
			case "divide":
				return first / second;
		}			
		return 2.0; //If anything goes wrong you get 2.0. :O because.. how often do you really calculate anything where the result is 2.0
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/addition")
	public String addition(double first, double second) {
		double sum = first + second;
		
		return "<h1 style='color:blue'>" + first + " + " + second + " = " + sum + "</h1>";
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/subtraction")
	public String subrtaction(double first, double second) {
		return "<h1>" + first + " - " + " = " + (first - second) + "</h1>";
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/square")
	public String square(double number) {
		return "<h1 style='color:green;'>" + number + "^2 = " + (number * number) + "</h1>";
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/fahrenheittocelsius")
	public String farhenheitconvert(double fahr) {
		double c = ((fahr-32)*5)/9;
		return "<h1>"+ fahr + " degrees Fahrenheit is " + c + " degrees Celsius </h1>";
	}
	
}
