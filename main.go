package main

import (
	"fmt"
)

type contact struct {
	email string
	zipCode int
}

type person struct {
	firstName string
	lastName string
	contact
}

func main() {

	alex := person{
		firstName:"Alex", 
		lastName: "Anderson",
		contact: contact{
			email: "alex@test.com",
			zipCode: 8000,
		},
	}

	alex.updateName("Jimmy")
	alex.print()
}

func (p person) print(){
	fmt.Printf("%+v",p)
}

func (p *person) updateName(newFirstName string){
	p.firstName = newFirstName
}
