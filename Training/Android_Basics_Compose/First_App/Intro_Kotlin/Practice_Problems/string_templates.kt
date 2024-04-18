/*This program informs users about the upcoming promotional sale on a particular item. 
It has a string template, which relies on the discountPercentage variable for the percent discount 
and the item variable for the item on sale. 
However, there are compilation errors in the code. */

/*
fun main() {
    val discountPercentage: Int = 0
    val offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
} 
*/

//Can you figure out the root cause of the errors and fix them?


fun main() {
    var discountPercentage: Int
    var offer: String
    val item = "Google Chromecast"

    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}