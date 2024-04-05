package main

import (
	"fmt"
	"io"
	"net/http"
	"os"
)

func main() {
	res, err := http.Get("http://google.com")

	if(err != nil) {
		fmt.Println(err)
		os.Exit(1)
	}

	io.Copy(os.Stdout, res.Body)
}
