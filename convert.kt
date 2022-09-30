//Name : Navjot Singh
//Student ID: A00264732

fun main()
{
  //var num = readln().toDouble()

  println("Enter a number: ")
  var num = readln().toDouble()//variable declaraiton
  //var value = readln()!!
  /* var result:Float = 0.0 */
  println("Enter the Unit")
  var unit = readln() // imput unit
  if(unit == "km")
  {
  num = num * 0.62
  println("The result is:" + num +  "mi")//conversion
  }
    else if (unit == "mi")
    {
    num = num * 1.61
    println("The result is:" + num +  "km")
  }
   else if (unit == "cm")
 {
   num = num * 0.39
   println("The result is:" + num  + "in")
 }
   else if (unit == "in")
   {
   num = num * 2.54
   println("The result is:" + num + "cm")
 }
else if (unit == "kg")
{
 num = num * 2.2
 println("The result is :" +num  + "lb")
 }
 else if (unit == "lb")
 {
 num = num * 0.45
 println("The result is :" + num   +"kg")
}

else if (unit == "g")
{
  num = num * 0.04
println("The result is :"  + num  + "oz")
}
 else if (unit == "oz")
 {
   num = num * 28.35
println("The result is :" + num + "g")
 }
}
