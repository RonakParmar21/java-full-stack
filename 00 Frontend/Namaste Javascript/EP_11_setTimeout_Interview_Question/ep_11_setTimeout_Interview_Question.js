// this code will print "Namaste Javascript" first and then after 3 seconds it will print 10.
// because setTimeout is asynchronous and the callback function is executed after the specified delay.
// So the console.log("Namaste Javascript") is executed first.
// To summarize, the output will be:
// Namaste Javascript
// 10
// after 3 seconds
/*
function x() {
    var i = 10;
    setTimeout(function () {
        console.log(i);
    }, 3000);
    console.log("Namaste Javascript");
}
*/


// --------
// print 1 to 5 with a delay of 1 second each

// this solution will print 6 five times after 1 to 5 seconds respectively.
// because by the time the callback of setTimeout is executed, the loop has already completed and i is 6.
// To fix this, we can use let instead of var to create a block-scoped variable for each iteration.
/*
function x() {
    for (var i = 1; i <= 5; i++) {
        setTimeout(() => {
            console.log(i);
        }, i * 1000);
    }
}
*/

// --------
// correct solution
// this will print 1, 2, 3, 4, 5 each after 1 second respectively.
// because let creates a new binding for each iteration of the loop.
// So each callback function has its own copy of i.
// Also, "Namaste Javascript" will be printed immediately before the numbers start printing.
// To summarize, the output will be:
// Namaste Javascript
// 1
// 2
// 3
// 4
// 5
// each number printed after its respective delay.
/*
function x() {
    for (let i = 1; i <= 5; i++) {
        setTimeout(() => {
            console.log(i);
        }, i * 1000);
    }
    console.log("Namaste Javascript");
}
*/

//--------
// another correct solution using IIFE (Immediately Invoked Function Expression)
// this will also print 1, 2, 3, 4, 5 each after 1 second respectively.
// because the IIFE creates a new scope for each iteration and captures the current value of i in j.
// So each callback function has its own copy of j.
// Also, "Namaste Javascript" will be printed immediately before the numbers start printing.
// To summarize, the output will be:
// Namaste Javascript
// 1
// 2
// 3
// 4
// 5
// each number printed after its respective delay.
/*
function x() {
    for (var i = 1; i <= 5; i++) {
        (function (j) {
            setTimeout(() => {
                console.log(j);
            }
            , j * 1000);
        })(i);
    }
    console.log("Namaste Javascript");
}
*/

// --------

// another correct solution using a helper function to create a closure
// this will also print 1, 2, 3, 4, 5 each after 1 second respectively.
// because the helper function creates a new scope for each iteration and captures the current value of i in j. 
// So each callback function has its own copy of j.
// Also, "Namaste Javascript" will be printed immediately before the numbers start printing.
// To summarize, the output will be:
// Namaste Javascript
// 1    
// 2
// 3
// 4
// 5
// each number printed after its respective delay.
function x() {
    for (var i = 1; i <= 5; i++) {
        function closure(j) {
            setTimeout(() => {
                console.log(j);
            }, j * 1000);
        }
        closure(i);
    }
    console.log("Namaste Javascript");
}

x();