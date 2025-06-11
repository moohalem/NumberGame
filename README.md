# Random Number Game

A simple Scala 3 console game where you guess a randomly generated number. Your credit increases with correct guesses and decreases with incorrect ones. The game ends when your credit reaches zero or you choose to stop.

## Features

- Random number guessing between 1 and 10
- Credit system: win or lose points based on your guesses
- Option to play multiple rounds

## Getting Started

### Prerequisites

- [Scala 3](https://www.scala-lang.org/download/)
- [sbt](https://www.scala-sbt.org/download.html)

### Running the Game

Clone the repository and run:

```sh
sbt run
```

### Running Tests

To run the test suite:

```sh
sbt test
```

## Project Structure

- `src/main/scala/Main.scala` - Main game logic
- `src/test/scala/MySuite.scala` - Unit tests

## License

This project is licensed under the MIT License.