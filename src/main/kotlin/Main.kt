fun main() {
//    Question Three
    multiples()

// Question Four
    var currentAccount =  (listOf<CurrentAccount>())
}
//Question One
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
 class StringInfo( var words: String){
     fun firstChar():StringInfo{
         for (word in words)
             var charOne =  words[0]
             return (words[0])
     }
    fun lastChar(words: StringInfo): String{
        for (word in words)
            var charlast = words[-1]
        return charlast

    }
    fun stringLength (words: String): Int{
        return words.length
    }


 }

//Question two
//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false

fun validatePassword(passwords: String){
    for (password in passwords)
        if (password >= 16){

        }



}


//Question Three
//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”
fun multiples (){
    for (num in 1..1000)
        if (num % 6 == 0 || num % 8 == 0){
            println("Bingo")
        }
    else{
        println(num)
        }
}
//Question four
//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”
 data class Account (var accountNumber: Int, var accountName: String, var balance: Double, var teller: String)

open class CurrentAccount(){
    var accountInfo= mutableListOf<Account>()
    fun deposit(balance: Double, amount:Double): Double{
        var newbalance = balance+amount
        return newbalance


    }
    fun withdraw(balance: Double, amount:Double): Double{
        var withdrew = balance - amount
        return withdrew
    }
    fun details(accountNumber: Int, accountName: String, balance: Double,  teller: String){
        println ("Account number $accountNumber with balance $balance operated by $teller")
    }
}
//Question Five
//    Create another class SavingsAccount. It has the same functions and
//    attributes as the current account except for one attribute, withdrawals: Int.
//    Withdrawals is a counter variable that is used to keep track of how many
//    withdrawals have been made from the account in a year. The only other
//    difference is that the savings account withdraw() method first checks if the
//    number of withdrawals is less than 4 for it to allow one to withdraw money
//    from the account. It also increments the withdrawals attribute after a
//    successful withdrawal (6pts)

override SavingAccount()




