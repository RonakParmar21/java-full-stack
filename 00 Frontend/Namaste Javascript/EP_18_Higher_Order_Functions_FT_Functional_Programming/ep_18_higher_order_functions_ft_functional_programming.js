/*
function x() {
    console.log("Namaste")
}

function y(x) {
    x();
}

y(x)
*/

const radius = [4, 3, 1, 2];

// interview question :- calculate area of circle, circumference and diameter but this solution is not optimized because many code is repeating code so I required to make this code optimezed using higher order function or modular code. 
// for optimized code I required to make a function which can take another function as an argument and that function will perform the operation.
/* NOT OPTIMIZED CODE
const areaOfCircle = (radius) => {
    const output = [];
    for (let i = 0; i < radius.length; i++) {
        output.push(Math.PI * radius[i] * radius[i]);
    }
    return output;
}
console.log(areaOfCircle(radius));

const circumferenceOfCircle = (radius) => {
    const output = [];
    for (let i = 0; i < radius.length; i++) {
        output.push(2 * Math.PI * radius[i]);
    }
    return output;
}
console.log(circumferenceOfCircle(radius));

const calculateDiameter = (radius) => {
    const output = [];
    for (let i = 0; i < radius.length; i++) {
        output.push(2 * radius[i]);
    }
    return output;
}
console.log(calculateDiameter(radius));
*/

// OPTIMIZED CODE USING HIGHER ORDER FUNCTION
const area = (radius) => {
    return Math.PI * radius * radius;
}

const circumference = (radius) => {
    return 2 * Math.PI * radius;
}

const diameter = (radius) => {
    return 2 * radius;
}

const calculate = (radius, logic) => {
    const output = [];
    for (let i = 0; i < radius.length; i++) {
        output.push(logic(radius[i]));
    }
    return output;
}

console.log(calculate(radius, area));
console.log(calculate(radius, circumference));  
console.log(calculate(radius, diameter)); 

console.log("********** Using Map Function **********");
// USING MAP FUNCTION WHICH IS INBUILT HIGHER ORDER FUNCTION
// MAP FUNCTION TAKES A FUNCTION AS AN ARGUMENT AND APPLIES THAT FUNCTION TO EACH ELEMENT OF THE ARRAY AND RETURNS A NEW ARRAY.
// SO HERE WE ARE PASSING area, circumference, diameter FUNCTIONS AS ARGUMENTS TO THE MAP FUNCTION.
// THIS IS MORE OPTIMIZED AND CLEANER CODE.
// SYNTAX: array.map(function(currentValue, index, arr), thisValue)
// HERE WE ARE USING ONLY CURRENTVALUE PARAMETER WHICH IS THE CURRENT ELEMENT BEING PROCESSED IN THE ARRAY.
// THE MAP FUNCTION RETURNS A NEW ARRAY WITH THE RESULTS OF CALLING A PROVIDED FUNCTION ON EVERY ELEMENT IN THE CALLING ARRAY.
console.log(radius.map(area));
console.log(radius.map(circumference));
console.log(radius.map(diameter));

// ADDING OUR OWN HIGHER ORDER FUNCTION TO THE ARRAY PROTOTYPE
// THIS FUNCTION WILL TAKE A LOGIC FUNCTION AS AN ARGUMENT AND APPLY THAT FUNCTION TO EACH ELEMENT OF THE ARRAY.
// THIS IS JUST AN EXAMPLE TO SHOW HOW TO ADD A FUNCTION TO THE ARRAY PROTOTYPE.
// IN REAL WORLD SCENARIO, IT IS NOT RECOMMENDED TO MODIFY THE PROTOTYPE OF BUILT-IN OBJECTS.
// SO THIS IS JUST FOR EDUCATIONAL PURPOSES.
// SYNTAX: Array.prototype.yourFunctionName = function(parameters) { // your code }
console.log("********** Using Prototype Model **********");
Array.prototype.calculateLogic = function(logic) {
    const output = [];
    for (let i = 0; i < this.length; i++) {
        output.push(logic(this[i]));
    }
    return output;
}
console.log(radius.calculateLogic(area));
console.log(radius.calculateLogic(circumference));
console.log(radius.calculateLogic(diameter));   