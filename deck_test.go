package main

import (
	"os"
	"testing"
)

func TestNewDeck(t *testing.T) {
	deck := newDeck()
	if len(deck) != 12 {
		t.Errorf("Expected deck length of 12, but got %v", len(deck))
	}
}

func TestSaveToDeckAndNewDeckFromFile(t *testing.T) {
	os.Remove("_decktesting")

	deck := newDeck()
	deck.saveToFile("_decktesting")

	loadedDeck := newDeckFromFile("_decktesting")

	if len(loadedDeck) != 12 {
		t.Errorf("Expected deck length of 12, but got %v", len(loadedDeck))
	}

	os.Remove("_decktesting")
}
