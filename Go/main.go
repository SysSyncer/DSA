package main

import "fmt"

func foo() (returnValue string) {
	returnValue = "returnedBeforeRETURN"
	return "returned"
}

func main() {
	fmt.Println(foo())
}
