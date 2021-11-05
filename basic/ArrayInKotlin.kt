//Array in Kotlin is not a native datastructure, It is a class named Array. We can say Array collection class

fun main(args: Array<String>) {

//kotlin Array declartion

val fruitsName = arrayOf("Mango", "Apple", "Banana","Kiwi")  //Compiler infer array type as String

val fruits = arrayOf<String>("Mango", "Kiwi", "Apple", "Banana","Apricot"); // declared array as String

// array type Any
val mixArray = arrayOf("elements", 2, 3.5,9L, 10.5F, false)

//Accessing and modifying 
for(element in fruitsName)
println(element)
println("======================")
println(fruits.get(0))
println(fruits[0])
println("======================")
mixArray[1] = 6
mixArray.set(1,6)
println("======================")
for(ii in mixArray)
println(ii);

println("Size is ${mixArray.size}") //Size is 6

/*
Kotlin provides us utility functions to initialise arrays of primitives types. Example :

charArrayOf(), 
booleanArrayOf(), 
longArrayOf(), 
shortArrayOf(), 
byteArrayOf()  etc..

Using these functions would compile the Array classes into int[], char[], byte[] etc.
primitive type arrays boost the performance of the project.

 */
val array1 = intArrayOf(1,2,3,4)
for(kk in array1)
println(kk);

/*
Kotlin Array() Constructor : The constructor expects two parameters 
size and init
We specify a lambda expression in the init parameter.
 */

val array = Array(6) {i-> i*2} //or val array = Array(6,{i-> i*2})
for(element in array)
println(element)

val array2 = Array(6) {i-> i*0.1} // Array of Doubles
for(element in array2)
println(element)

// For Primitive type array instantiation isn’t necessary
//Allocating the size to a primitive type array will assign all the elements a default value if not instantiated otherwise
val intArray = IntArray(6)
println(intArray.contentToString()) //all elements are zero here.

// ### Converting Generic Array to primitive type, using toIntArray(), toCharArray() etc..
val arr = arrayOf(1,2,3,4)
var intArr : IntArray = arr.toIntArray()

// Few Kotlin Array inbuilt method
// 1. Reversing array
var arrayReverse = arrayOf(1,2,3,4,5)
arrayReverse = arrayReverse.reversedArray()  
//or arrayReverse.reverse()
println(arrayReverse.contentToString()) //Prints 5,4,3,2,1

//2. Sum of array
println(arrayReverse.sum()) // print 15

//3. Appending a new element in array
arrayReverse = arrayReverse.plus(6);
//or
arrayReverse = arrayReverse.plusElement(7)
println(arrayReverse.contentToString()) // print 5,4,3,2,1,6,7
//4. Fill the array with new element
arrayReverse.fill(3,3,arrayReverse.size);
println(arrayReverse.contentToString()) //print 5,4,3,3,3,3,3
//5. Append one Array with another
var arrs1 = Array(6) { i->i*3 }
arrayReverse = arrayReverse.plus(arrs1);
println(arrayReverse.contentToString())

}