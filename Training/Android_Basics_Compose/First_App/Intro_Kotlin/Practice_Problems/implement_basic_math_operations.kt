/*In this exercise, you write a program that performs basic math operations and prints the output.

Step 1
This main() function contains one compile error:


fun main() {
    val firstNumber = 10
    val secondNumber = 5
    
    println("$firstNumber + $secondNumber = $result")
}
Can you fix the error so that the program prints this output?
 */

 /*
 Step 2
The code works, but the logic for adding two numbers is located within the result variable, making your code less flexible to reuse. Instead, you can extract the addition operation into an add() function so that the code is reusable. To do this, update your code with the code listed below. Notice that the code now introduces a new val called thirdNumber and prints the result of this new variable with firstNumber.


fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

//
Can you define the add() function so that the program prints this output?

10 + 5 = 15
10 + 8 = 18
 */

 /*Step 3
Now you have a reusable function to add two numbers.

Can you implement the subtract() function the same way you implemented the add() function? 
Modify the main() function as well to use the subtract() function so you can verify that it works as expected. 
*/

 fun main () {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    add(firstNumber, secondNumber)
    add(firstNumber, thirdNumber)


    subtract(firstNumber, secondNumber)
    subtract(firstNumber, thirdNumber)

}

 fun add (numberA : Int , numberB : Int) : Int {
    var result = numberA + numberB
    println("$numberA + $numberB = $result")
    return result
 }

 fun subtract (numberA : Int , numberB : Int) : Int {
    var result = numberA - numberB
    println("$numberA - $numberB = $result")
    return result
 }
