/*Modern mobile phones have a built-in feature that tracks screen time, 
or the time you spend on your phone each day.

In this exercise, you implement a function that compares the time in minutes 
that you spent on your phone today versus the time spent yesterday. 
The function accepts two integer parameters and returns a boolean value.

The first parameter holds the number of minutes that you spent today and 
the second parameter holds the number of minutes that you spent yesterday. 
The function returns a true value if you spent more time on the phone today 
compared to yesterday. Otherwise, it returns a false value. 
*/

fun main() {
    var timeSpentToday : Int = 200
    var timeSpentYesterday : Int = 220

    println(compareTimeSpended(timeSpentToday, timeSpentYesterday))
}

fun compareTimeSpended(timeSpentToday : Int, timeSpentYesterday : Int) : Boolean {

    if (timeSpentToday > timeSpentYesterday){
        return  true}
    else {
        return false} 
}