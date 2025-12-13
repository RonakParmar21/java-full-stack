// function statement OR function declaration
// this way to create function is called function statement

// Difference between function statement vs function expression
// major defference is hoisting.
// because in case of function statement memory assign to funciton a so when call function a before declaration it will work same.
// in case of funciton statement memory assign to variable b. so when call function b before declaration it will not work same. so is it not found and give type error.

a(); // A called
b(); // type error : b is not a function

function a() {
    console.log("A called");
}
// a(); // A called.

// function expression
var b = function() {
    console.log("B called");
}
// b(); // B called.


// anonymous function

// named function expression

// difference between parameters and arguments

// first class function

// arrow function