/*
Gmail has a feature that sends a notification to the user whenever a login attempt is made on a new device.

In this exercise, you write a program that displays a message to users with this message template:
"There's a new sign-in request on operatingSystem for your Google Account emailId.

You need to implement a function that accepts an operatingSystem parameter and an emailId parameter, 
constructs a message in the given format, and returns the message.

For example, if the function was called with "Chrome OS" for the operatingSystem and "sample@gmail.com" for 
the emailId, it should return this string:

"There's a new sign-in request on Chrome OS for your Google Account sample@gmail.com."

Can you implement the displayAlertMessage() function in this program so that it prints the output displayed?

*/

fun main() {
    var operatingSystem = "ChromeOS"
    var emailId = "sample@gmail.com"


    displayAlertMessage( emailId = emailId)

    emailId = "sample2@gmail.com"
    displayAlertMessage(operatingSystem,emailId)

}

fun displayAlertMessage(operatingSystem : String = "UnknownSystem", emailId : String ) {
    println("There's a new sign-in request on $operatingSystem for your Google Account $emailId.")
}