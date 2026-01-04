// callback hell
const cart = ["shoes", "pants", "kurta", "sunglasses"];

// for order I have order api 
// for payment I have payment api
// for order summary I have order summary api
// for update wallet I have update wallet api

api.createOrder(cart, function() {

    api.proceedToPayment(function() {

        api.showOrderSummary(function() {

            api.updateWallet();

        });

    }); 

});

/************************** CALLBACK HELL *************************/
// this is callback hell
// to avoid this we use promises and async await
// this is not valid for large code base and complex applications or real world applications
// because it is difficult to maintain and debug
// because it is used callback functions inside callback functions
// so to avoid this we use promises and async await

// we can not maintain this type of code.
// this structure is called pyramid of doom in programming.

/************************** INVERSION OF CONTROL *************************/
// inversion of control
// when we pass a callback function to an api or library
// then we are giving control to that api or library
// give control of our code to some other code or call back function