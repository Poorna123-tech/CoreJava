package lambdaEx;
//convert into lambda expression
//System.out.println("Hello"); --- body of lambda expression 
/*  since there is modifiers, no name, no return type */
//Eg-1: () ->  System.out.println("Hello");  //Since there is single statement{} braces are not needed.

/*Eg-2: 
 * Compiler can guess the type automatically/explicitly, So no need to add Datatypes of parameters.
 * 	( a ,  b) -> System.out.println(a+b); */
/*Eg-3
 * Without {}, if we want to return anything then "return" is no need to specify, Compiler can guess explicitly.
 * If we want to reurn using "return " mention inside the curly{}--> (a) -> {return  a*a;}
 * If single parameter is present inside the parenthesis then () is optional-->a ->  a*a;
 */
