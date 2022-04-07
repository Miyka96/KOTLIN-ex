fun main() {

  // dichiaro var e relativo val -----------
  var todaysDate: String = "04/07/2022"
  println (todaysDate)

  // dichiaro var vuota, poi assegno val---------
  var currentWeather: String
  currentWeather= "nuvoloso"
  println(currentWeather)

  // VAL (costante)----------
  val pi: Double = 3.14
 
  // concatenare------------
  val dog = "Toto"
  val state = "Kansas"
  val movie = "The Wizard of Oz"

  var concat= dog + ", I've a feeling we're not in " +
  state+" anymore. " + movie + ", 1939"
  print(concat)

  // concatenare MEGLIO ( con $)
  val plant = "orchid"
  val potSize = 6 
  val dayNum = 7 

  println("An $plant in a $potSize inch pot must be watered every $dayNum days.")


  // USER INPUT readLine()
  println("Please type your name and hit Enter.")
  val myName = readLine()
  println("Your name is $myName!")
}