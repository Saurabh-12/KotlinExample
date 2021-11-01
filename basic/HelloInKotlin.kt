//An entry point of a Kotlin application is the main function.
fun main()
{

println("Welcome Saurabh in Kotlin");
print("Hello ")
print("message \n");
println(sum(5,6))
println(sum1(11, 12))
sum2(17, 23);
sum3(8, 6)

/*
 * In Kotlin, we have two types of variables: var and val
 * Var = mutable
 * val = imutable
 * */
val a: Int = 1  // immediate assignment
val b = 2   // `Int` type is inferred
val c: Int  // Type required when no initializer is provided
c = 3       // deferred assignment

//b =6   Error : val can not reassigned


var Name: String = "Saurabh";
println("Name is $Name");

println("a: $a")
println("b : $b");
println("c: $c")

Name = "Sushant";
println("Name is $Name");

//Name = 125 Error : Type mismatch

var anyType : Any = "Kumar"
println("anyType as String: $anyType")
anyType = 3;
println("anyType as Int: $anyType")

/*
Strict null safety is part of the Kotlin type system, By default, regular types cannot be null
(can't store null references), unless they are explicitly allowed.
 */ 
//Below code throw CTE because this type does not allow null.
 //val age : Int = null // Error 
 //val Name : String = null;//Error

 // By putting question mark we can assign null, 
 //But at the time of call it will throw error if There is no Null check.
 val name: String? = null
//name.toUpperCase() // error, this reference may be null

//Checking for null in conditions
var str : String ? = "Test"
if (str != null) {
println("Null check example String:  $str")
} else {
println("String is null");
}
// ############## safe calls check ########################
var hello : String = "Hello"
println(hello.length)  // Works

var hello1 : String ? = "Hello1"
//println(hello1.length) //Error hello1 is null type so safe call check is needed
println(hello1 ?.length)// safe null check
var NullPrint:String ? = null
println("NullPrint String $NullPrint")

//Safe calls are handy when you need to keep nullability checkers over multiple variables
//var streetName : String? = address?.locality?.street?.addressLine1

// ############## Safe Casting and Elvis operator ###########################
var intString : String = "2"
var num :Int ? = intString as? Int
println("String int cast to int $num")
var array1 : Array<Any?> =  arrayOf("1","2","3")
var i : Int? = array1[0] as? Int
println(i) //prints null
var s : String? = array1[0] as? String
print(s) //prints 1
//whenever the safe call operator returns a null value, we don’t perform an action and print null instead. 
//The Elvis operator ?: allows us to set a default value instead of the null
var newString : String?  = "saurabhsharma123k.blogspot.com"
println(newString?.length) //prints 14
newString = null
println(newString?.length?:"-1") //prints -1 
// Above example code is equivalent of bellow code
if (newString != null)
{
    println("NewString $newString")

} else {
    println("-1")
}
// Another best use of elvis operator
//var streetName : String? = address?.locality?.street?.addressLine1 ?: "Street Name not found"
//Using let() : Let function executes the lamda function specified only when the reference is non-nullable as shown below
newString = " Kotlin from Android"
newString?.let { println("The string value is: $it") }
newString = null
newString?.let { println("The string value is: $it") }

//Using also : It behave same way as let but we use it to logs
var ss = "Hello"
newString = " Kotlin from Android"
newString?.let { ss = it }.also { println("Logging the value: $it") }
// Filtering out null
var array2: Array<Any?> = arrayOf("1", "2", "3", null)
var newArray = array2.filterNotNull()
println(newArray.size) //prints 3
















}

//A function with two Int parameters and Int return type
fun sum(a: Int, b: Int) : Int
{
    return a+b;
}

fun sum1(a:Int, b:Int) = a+b;

fun sum2(a:Int, b:Int):Unit{
    println("sum of $a and $b is ${a+b}");
}

fun sum3(a:Int, b:Int) {
    println("Sum of $a and $b is ${a+b}")
}
