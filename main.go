package main

import "fmt"

func main() {
	newCards := newDeckFromFile("my_cards")

	newCards.shuffle();
	fmt.Println(newCards)
}
