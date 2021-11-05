// Example of String in Kotlin

fun main(args: Array<String>) {

    // Simple String declaration
    var name = "Hary!!"
    // or
    var hello: String = "Hello"
    // concating
    hello += " Kotlin String"

    println(hello)

    // creating Empty String
    var emptyStr = String()
    println(emptyStr) // print nothing

    // length
    println(hello.length) // print length : 19

    // index
    println(hello.get(9)) // print char at index 9 :

    // get subString
    println(hello.substring(3, 9)) // print subString between Start Index and End Index

    // Compare
    println(name.compareTo(hello)) // print 0 if two String equals if a<b +ve orthewise -ve value

    // Equality

    var a = "Hello"
    var b = "Hello again"
    var c = "Hello"
    var d1 = "Hel"
    var d2 = "lo"
    var d = d1 + d2

    println(a === c) // true since a and c objects point to the same String in the StringPool
    println(a == c) // true since contents are equal
    println(a === b) // false
    println(a == b) // false
    println(
            a === d
    ) // false since d is made up of two different Strings. Hence a and d point to different
    //                    set of strings
    println(a == d) // true since the contents are equal

    // Multi Line String
    var multiLineStr =
            """ This is example of
                                             multiline String
                                                              it is ok """
    println(multiLineStr)
}
