println("Using println to say \"Hello world\"")
println("hello world");

println("multiplying numbers : 5*7")
println(5*7)

println("saving into variables : var res = 5*7")
var res = 5 * 7

println("printing : 2 * res")
println(2 * res)

val x: Int = 5
println("printing a val that is initialized to 5")
println(x)

var y: String = "42"
println("converting string to int and printing")
println(y.toInt)

println("python like string manupulation")
println("Na "*16 + "Batman!")

println("This should print 2.5 if float division is default")
println(5/2)
println("Apparently not... when will we get this right?")


var approx = 355/113.0
println(s"Value of pi is about $approx")

println("Lets learn some regular expressions")
println("What a day, oh what a day indeed" matches ".* indeed")

println("milk, tea, muck" replaceAll ("m[^ ]+k", "coffee"))

println("milk, tea, muck" replaceFirst ("m[^ ]+k", "coffee"))		


