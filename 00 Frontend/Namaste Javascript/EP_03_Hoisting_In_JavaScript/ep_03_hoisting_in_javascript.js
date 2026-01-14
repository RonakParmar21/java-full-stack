/**
 * Hoisting in JavaScript
 * Hoisting means variables and functions can be used before they are declared.
 */

/****** PROGRAM 1 ******/
// getName();
// console.log(x);
// var x = 7;
// function getName() {
//     console.log("Namste JavaScript");
// }
// Output :-
// Namste JavaScript
// undefined

/****** PROGRAM 2 ******/
// getName();
// console.log(x);

// function getName() {
//     console.log("Namste JavaScript");
// }
// Output :-
// Namste JavaScript
// ReferenceError: x is not defined

/****** PROGRAM 3 ******/
// var x = 7;
// function getName() {    
//     console.log("Namste JavaScript");
// }
// console.log(getName);
// Output :-
// ƒ getName() {    
//     console.log("Namste JavaScript");
// }

/****** PROGRAM 4 ******/
// console.log(getName);
// function getName() {    
//     console.log("Namste JavaScript");
// }
// Output :-
// ƒ getName() {    
//     console.log("Namste JavaScript");
// }

/****** PROGRAM 5 ******/
getName();
console.log(x);
console.log(getName);
var x = 7;
var getName = () => {    
    console.log("Namste JavaScript");
}
// Output :-
// TypeError: getName is not a function

/**
 * What is hoisting?
 * Hoisting is a JavaScript mechanism where variables and function declarations are moved to the top of their scope before code execution.
 * This means that you can use variables and functions before they are declared in the code.
 * However, only the declarations are hoisted, not the initializations.
 * 
 * Function Declarations vs Function Expressions:
 * Function Declarations are hoisted completely, meaning you can call them before they are defined in the code.
 * Function Expressions (including arrow functions) are not hoisted in the same way. If you try to call a function expression before it is defined, you'll get a TypeError.
 */