/* this example I need to understand properly this example is about settimeout.
var a = function() {
    for (let index = 0; index < 300000; index++) {
        console.log("First Loop Index is : " + index);
    }
    
    setTimeout(() => {
        console.log("set time out");
    }, 100);

    for (let index = 0; index < 300000; index++) {
        console.log("Second Loop Index is : " + index);
    }
    
    console.log("Javascript");
    
    
}
a();
*/

// what is callback functions in javascript
/*
setTimeout(() => {
    console.log("timer");
}, 5000);
function x(y) {
    console.log("x");
    y()
}
x(function y() {
    console.log("y");
});
*/

// javascript is a synchronous and single-threaded language

// Blocking the main thread 

// power of callbacks?

// deep about event listeners

// closures demo with event listeners

// scope demo with event listeners

// garbage collection & removeEventListener
// important to remove event listeners when not needed

/*
how many times the button is clicked?
// this solution is not good because in this solution we are using global variable. 
// it can be modified from anywhere in the code. 
let count = 0;
document.getElementById("clickMe").addEventListener("click", function xyz() {
    console.log("button clicked", ++count);
});
*/

/* better solution is to use closures.
In this solution the count variable is not in the global scope. 
it is in the scope of the function.
So, it cannot be modified from anywhere in the code.
*/
// solution 1
/*
document.getElementById("clickMe").addEventListener("click", function xyz() {
    let count = 0;  
    return function() {
        console.log("button clicked", ++count);
    }
}()); 
*/

// solution 2
/*
function attachEventListener() {
    let count = 0;
    document.getElementById("clickMe").addEventListener("click", function xyz() {
        console.log("button clicked", ++count);
    });
}
attachEventListener();
*/

// now the count variable is not in the global scope.
// it is in the scope of the attachEventListener function.
// So, it cannot be modified from anywhere in the code.
// also, we can call the attachEventListener function only once to attach the event listener.
// if we call the attachEventListener function again, it will attach another event listener to the button.
// so, the count variable will be reset to 0 again.
// to avoid this, we can use a flag variable to check if the event listener is already attached or not.
let isEventListenerAttached = false;
function attachEventListenerOnce() {
    if (isEventListenerAttached) {
        return;
    }
    let count = 0;
    document.getElementById("clickMe").addEventListener("click", function xyz() {
        console.log("button clicked", ++count);
    }
    );
    isEventListenerAttached = true;
}
attachEventListenerOnce();