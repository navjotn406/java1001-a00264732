//Name : Navjot Singh
//Student ID: A00264732

fun main()
{
  var num = readln().toDouble()

  println("Enter a number: ")
  /* var result:Float = 0.0 */
  println("Enter the Unit")
  var unit = readln()
  if(unit == "km")
  {
  num = num * 0.62
  println("The result is:" + num + "mi")

  } else if (unit == "mi"){
    num = num * 1.61
  }

}
