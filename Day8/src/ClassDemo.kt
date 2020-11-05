
var newVar : String? = null;

fun main()
{
    println(newVar)
    helloWorld("Hello My Friends")
}

fun helloWorld(msg: String)
{
    println(msg)
}

fun theBoolean(str: String) : Boolean{
    val boolean = str is String
    return boolean.also{println(boolean)}
}

