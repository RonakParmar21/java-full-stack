const cart = ["shoes", "pants", "kurta"];

/******* BEFORE USE OF PROMISE *******/
/*
createOrder(cart, function(orderId) {
    proceedToPayment(orderId);
});
*/
// in this code we are pass function to createOrder api as callback and we are blindly trusting that createOrder api will call this callback function after creating order

// in this code problem is that createOrder function is asynchronous
// so proceedToPayment function is called before createOrder function is completed
// to solve this problem we use Promise
// in this code also problem is inversion of control
// because we are passing proceedToPayment function as callback to createOrder function
// so createOrder function has control over when to call proceedToPayment function
// to solve this problem we use Promise

/******* AFTER USE OF PROMISE *******/
/*
const promiseObject = createOrder(cart);
promiseObject.then(function(orderId) {
    proceedToPayment(orderId);
});
*/
// in this case we are attaching callback function to promiseObject using then() method
// so we are not passing callback function to createOrder function
// so createOrder function has no control over when to call proceedToPayment function
// so inversion of control problem is solved
// in this code control of our code is with us
// we are deciding what to do after createOrder function is completed.
// this is gurranteed by promiseObject to call this callback function after createOrder function is completed.

// callback vs promise
// callback is a function that is passed as an argument to another function
// promise is an object that represents the eventual completion (or failure) of an asynchronous operation and its resulting value
// promise is used to handle asynchronous operations in a more elegant way than callbacks
// promise avoids inversion of control problem
// promise has three states: pending, fulfilled, rejected
// promise can be chained using then() method
// promise can be created using Promise constructor

/******* PROMISE OBJECT IN BROWSER *******/
// fetch()
// fetch() method returns a promise object
// it is api which is given by browser to make network requests
// it is used to make http requests
// it is used to fetch resources from server
// it is used to make ajax requests
// it is used to make api calls

const GITHUB_API = "https://api.github.com/users/RonakParmar21";

const userPromise = fetch(GITHUB_API);
console.log(userPromise); // Promise {<pending>}
// initially promise is in pending state
// when the response is received from server, promise is either fulfilled or rejected
// if response is received successfully, promise is fulfilled
// if there is an error in receiving response, promise is rejected
// to handle fulfilled and rejected states of promise, we use then() and catch() methods

userPromise
  .then(function (response) {
    console.log("Inside first then");
    console.log(response);
    // response is an object of Response class
    // to get the actual data from response, we need to call json() method on response object
    return response.json(); // this also returns a promise
  })
  .then(function (userData) {
    console.log("Inside second then");
    console.log(userData);
    // userData is the actual data received from server
  })
  .catch(function (error) {
    console.log("Inside catch");
    console.log(error); // TypeError: Failed to fetch
  });

/******* PROMISE CHAINING *******/
createOrder(cart)
  .then(function (orderId) {
    return proceedtoPayment(orderId);
  })
  .then(function (pyamentInfo) {
    return showOrderSummary(pyamentInfo);
  })
  .then(function (pyamentInfo) {
    return updateWalletBalance(pyamentInfo);
  });

// same code using arrow functions
createOrder(cart)
  .then((orderId) => proceedtoPayment(orderId))
  .then((pyamentInfo) => showOrderSummary(pyamentInfo))
  .then((pyamentInfo) => updateWalletBalance(pyamentInfo));