import scala.util.Random
import scala.io.StdIn

def randomGenerator(max: Int): Int = {
  val rng = new Random()
  val n = rng.nextInt(1+(max))
  n
}

@main def hello(): Unit =
  var credit = 10
  val max = 10
  var run = 1

  println("WELCOME TO THE GUESSING GAME!")
  Thread.sleep(3000)

  while(run == 1){
    print("\u001b[2J\u001b[H")
    val random = randomGenerator(max)
    println("Every correct guess will be added to your credit but false guess will deduce your credit. 0 credit means you're out")
    println()
    println(s"Your credit is $credit")
    println("---------------------------------------")
    println(s"Please input your number (1 - $max)")
    val userGuess = StdIn.readInt()
    
    if (userGuess != random){
      println(s"I'm sorry your guess' is not correct. The correct answer is $random")
      credit-=1
    } else {
      println("Yes! Your guess' is correct!")
      credit+=random
    }
    if (credit==0){
      println("You're dead!")
      run = 0
    }else{
      val userTry = StdIn.readLine("Do you want to try again? Y/n")
      if (userTry == "n") {
      run = 0
      }
    }
  }
  return
