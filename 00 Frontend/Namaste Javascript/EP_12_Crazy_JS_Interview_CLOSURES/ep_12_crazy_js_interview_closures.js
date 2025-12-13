// EP_12_Crazy_JS_Interview_CLOSURES/ep_12_crazy_js_interview_closures.js
// Example demonstrating closures in JavaScript
// A closure is created when an inner function has access to variables from an outer function's scope, even after the outer function has executed.
// In this example, the inner function 'inner' has access to the variable 'a' from the outer function 'outer'.
// When we call 'inner' inside 'outer', it can still access and print the value of 'a'.
// When we call 'outer', it invokes 'inner', which logs the value of 'a' to the console.
// The output of this code will be:
// 10
// This demonstrates how closures allow inner functions to retain access to their outer function's scope.

/*
function outer() {
    var a = 10;
    function inner() {
        console.log(a);
    }
    inner();
}
outer();
*/
// --------

// another example demonstrating closures
// In this example, the outer function 'outer' returns the inner function 'inner'.
// When we call 'outer', it returns 'inner', which is then immediately invoked with '()'.
// The inner function still has access to the variable 'a' from the outer function's scope, even though 'outer' has finished executing.
// The output of this code will also be:
// 10
// This further illustrates how closures work in JavaScript.
// When 'inner' is called outside of 'outer', it still retains access to 'a' due to the closure.
// This is a powerful feature of JavaScript that allows functions to have private variables and maintain state.

/*
function outer() {
    var a = 10;
    function inner() {
        console.log(a);
    }
    return inner;
}
    outer()();
*/

// --------
// another example demonstrating closures
// In this example, we store the returned inner function in a variable 'close'.
// When we call 'close()', it invokes the inner function, which still has access to the variable 'a' from the outer function's scope.
// The output of this code will again be:
// 10
// This shows that the inner function retains access to its lexical scope even when it's executed outside of its original context.
// This is the essence of closures in JavaScript.
/*
function outer() {
    function inner() {
        console.log(a);
    }
    var a = 10;
    return inner;
}
var close = outer();
close();
*/
// --------
// another example demonstrating closures with parameters
// In this example, the outer function 'outer' takes a parameter 'a'.
// The inner function 'inner' logs the value of 'a' to the console.
// When we call 'outer(100)', it returns 'inner', which is then invoked with '()'.
// The inner function still has access to the parameter 'a' from the outer function's scope.
// The output of this code will be:
// 100
/*
function outer(a) {
    function inner() {  
        console.log(a);
    }
    return inner;
}
var close = outer(100);
close();
*/
// --------
// another example demonstrating closures with multiple invocations
// In this example, we call 'outer' multiple times with different arguments (10, 100, 1000).
// Each time, it returns a new instance of the inner function 'inner' that retains access to its own 'a' value.
// When we invoke each returned function, it logs the respective value of 'a' to the console.
/*
function outer(a) {
    function inner() {
        console.log(a);
    }
    return inner;
}
var close1 = outer(10);
var close2 = outer(100);
var close3 = outer(1000);
close1(); // Output: 10
close2();       
close3(); // Output: 1000
*/
// --------
// another example demonstrating closures with multiple invocations in a concise way    
// The output of this code will be:
// 10
// 100
// 1000
// This demonstrates that each invocation of 'outer' creates a new closure with its own lexical environment, allowing the inner function to access the correct 'a' value.


// --------
// if I change var with let it still forms a closure.
/*
function outer() {
    function inner() {
        console.log(a);
    }
    let a = 100;
    return inner;
}
var close = outer();
close();
*/

// --------
// another example demonstrating closures with multiple parameters
// The output of this code will be:
// 100 hello world
// This shows that the inner function can access both the parameter 'b' and the variable 'a' from the outer function's scope.
// This further illustrates the concept of closures in JavaScript.
// When 'close' is invoked, it logs both 'a' and 'b' to the console, demonstrating that closures can capture multiple variables from their lexical scope.
// This is a powerful feature that allows functions to maintain access to their surrounding context even when executed outside of it.
// This is especially useful in scenarios like callbacks, event handlers, and functional programming patterns.
/*
function outer(b) {
    function inner() {
        console.log(a, b);
    }
    let a = 100;
    return inner;
}
var close = outer("hello world");
close();
*/

// --------

// another example demonstrating closures with nested functions and multiple parameters
// The inner function 'inner' has access to variables 'a', 'b', and 'c' from its outer scopes.
// When we call 'outest()', it returns the 'outer' function, which is then immediately invoked with the argument "hello world". 
// This returns the 'inner' function, which is stored in 'close'.
// Finally, when we call 'close()', it logs the values of 'a', 'b', and 'c' to the console.
// The output of this code will be:
// 100 hello world 1000
/*
function outest() {
    function outer(b) {
        function inner() {
            console.log(a, b, c);
        }
        let a = 100;
        return inner;
    }
    let c = 1000;
    return outer;
}
var close = outest()("hello world");
close();
*/
// The output of this code will be:     
// 100 hello world 1000

// --------
console.log("Namaste Javascript");
