package main

import "fmt"

type colourMAP map[string]string

func main() {
	colors :=colourMAP{
		"red":   "#ff0000",
		"white": "#ff1111",
		"blue":  "#ff2222",
	}

	colors.mapPrint()
}

func (m colourMAP) mapPrint() {
    for key, items := range m {
        fmt.Println(key, items)
    }
}
