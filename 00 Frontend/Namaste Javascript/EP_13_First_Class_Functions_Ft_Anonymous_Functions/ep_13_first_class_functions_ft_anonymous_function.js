// function statement OR function declaration
// this way to create function is called function statement

// Difference between function statement vs function expression
// major defference is hoisting.
// because in case of function statement memory assign to funciton a so when call function a before declaration it will work same.
// in case of funciton statement memory assign to variable b. so when call function b before declaration it will not work same. so is it not found and give type error.

/*
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
*/

// anonymous function
// anonymous function is a function without a name.
// example of anonymous function
/*
var anonFunc = function () {
    console.log("This is an anonymous function");
}
anonFunc(); // This is an anonymous function
*/

// named function expression
// named function expression is a function expression with a name.
// example of named function expression
/*
var namedFunc = function funcName() {
    console.log("This is a named function expression");
    //funcName(); // This is a named function expression
}   
namedFunc(); // This is a named function expression
//funcName(); // ReferenceError: funcName is not defined
*/

// difference between parameters and arguments
// parameters are the names listed in the function definition.
// arguments are the real values passed to the function.
// example of parameters and arguments
/*
function add(x, y) { // x and y are parameters
    return x + y;
}
console.log(add(2, 3)); // 2 and 3 are arguments
*/

// first class function
var b = function(parameter1) {
    console.log(parameter1);
}

b(function () {

});

// we can also return function from another function
var c = function(parameter1) {
    return function xyz() {
        console.log("function returned from another function");
    }
};

console.log(c()); // function returned from another function

// arrow function
var d = (param1, param2) => {
    return param1 + param2;
};

console.log(d(2, 3)); // 5