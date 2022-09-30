//Name : Navjot Singh
//Student ID: A00264732
//jav1001-lab1

fun main()
{
  println("Enter a number: ")
  var num = readln().toDouble()//variable declaraiton
  println("Enter the Unit: ")
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

  else if (unit == "min")
  {
   num = num *60
   println("The result is :"  + num  + "sec")
  }

  else if (unit == "sec")
  {
   num = num /60
   println("The result is :" +num  + "min")
  }

  else if (unit == "byte")
  {
  num = num / 1000
  println("The result is :"  +num  + "kilobyte")
  }

  else if (unit == "kilobyte")
  {
  num = num * 1000
  println("The result is :" + num  + "byte")
  }
 }
