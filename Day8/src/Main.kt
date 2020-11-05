import Child

fun main(){
    Child().hairColour()
    Child().eyeColour()
    println(Child().teeth)
    if(Child().teeth <12) {
        print("Where have the teeth gone")
    }
}