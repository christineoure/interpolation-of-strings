fun main(){
    name()
    greet()
    length()
    command()
}
//write a function that is composed of 1st 3rd and 4th charactters
fun name(){
    var name = "Akirachix"
    var x = name[1].toString()+name[3]+name[4]
    println(x)
}//writing a function that takes in two parameters and returns a string with a structure
//Hi my name is x and I am y yearas old

fun greet(){
    var info="Hi my name is Oure"
    var text="and I am 21 years"
    var stmt=info+" "+text
    println(stmt)
}
//writing a function that takes in a string and returns its length

fun length(){
    var opt = "I love dancing"
    println(opt.length)
}
//writing a command that takes my name and prints out that's me

fun command(){
    var name ="Oure"
    if(name.equals("Oure")){
        println("Thats me!")
    }else{
        println("I dont know who that is")
    }
}