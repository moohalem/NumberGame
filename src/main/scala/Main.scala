import scala.util.Random
import scala.io.StdIn

def randomGenerator(max: Int): Int = {
  val rng = new Random()
  val n = rng.nextInt(1+(max))
  n
}

@main def hello(): Unit =
  val max = 10
  val run = 1
  
  while(run == 1){
    val random = randomGenerator(max)

    println("Welcome to the guessing game!")
    
    println(s"Please input your number (1 - $max)")
    val userGuess = StdIn.readInt()
    
    if (userGuess != random){
      println(s"I'm sorry your guess' is not correct. The correct answer is $random")
    } else {
      println("Yes! Your guess' is correct!")
    }
    val userTry = StdIn.readLine("Do you want to try again? Y/n")
    if (userTry == "n") {
      return
    }
  }
