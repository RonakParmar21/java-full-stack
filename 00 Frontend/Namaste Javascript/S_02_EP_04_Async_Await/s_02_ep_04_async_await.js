/*
    - What is async?
    - What is await?
    - how async await works behind the scenes?
    - example of async await
    - error handling 
    - interviews 
    - async await vs promises.then.catch
*/

/*
WHAT IS ASYNC?
    - Async is a keyword used to define an asynchronous function in JavaScript.
    - An asynchronous function is a function that operates asynchronously via the event loop, allowing the program to continue running while waiting for an operation to complete.
    - When a function is declared as async, it automatically returns a Promise.
    - If the function returns a value, the Promise is resolved with that value. If the function throws an error, the Promise is rejected with that error.
    - Async functions allow the use of the await keyword, which pauses the execution of the function until a Promise is resolved or rejected.

HOW DIFFERENT FROM NORMAL FUNCTION? 
-----------------------------------
- aysnc function always returns a promise
- normal function returns value directly
- in async function we can return any value(string, number, object) but it will be wrapped in a resolved promise
- in normal function we can return any value directly
*/

const p = new Promise((resolve, reject) => {
  resolve("Promise resolved value!!");
});

async function getData() {
  // return "Hello World"; // this will be wrapped in resolved promise because it is string value (not promise) so it will wrapped in promise
  return p; // this will return without wrapped in promise because it is already a promise
}

const dataPromise = getData();
//console.log(dataPromise); // Promise { 'Hello World' }
// getData function is returning a promise which is resolved with "Hello World"

//dataPromise.then(res => console.log(res)); // Hello World

/********************** USE AWAIT WITH ASYNC ************************/
/*
- async and await combo used to handle promises more easily
- await keyword can be used only inside an async function
- it pauses the execution of async function until promise is resolved or rejected
- if promise is resolved it returns the resolved value
- if promise is rejected it throws the rejected value (error)

    - The await keyword can only be used inside an async function.
    - It pauses the execution of the async function until the Promise is resolved or rejected.
    - If the Promise is resolved, it returns the resolved value.
    - If the Promise is rejected, it throws the rejected value (error).
*/

// BEFORE ASYNC AWAIT
console.log("***********************");

function getDataBeforeAsyncAwait() {
  p.then((res) => console.log("Before async await : ", res)); // Promise resolved value!!
}
getDataBeforeAsyncAwait();

// AFTER ASYNC AWAIT
async function getDataAfterAsyncAwait() {
  const val = await p;
  console.log("After async await : ", val); // Promise resolved value!!
}
getDataAfterAsyncAwait();
// instead of .then() we can use await keyword

console.log("***********************");

// difference between use of .then() and await
// using then() code is not wait for promise to be resolved in setTimeout()
// using await code js engine will wait for promise to be resolved in setTimeout()

// what if two promises are there then both work parallelly
// if first promise take 10 sec and second take 5 sec both will take 10 sec to complete
// if first promise take 5 sec and second take 10 sec then first promise will execute after 5 sec and second after 10 sec total time will be 10 sec

const p1 = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve("Promise 1 resolved");
  }, 10000); // 5 sec
});

const p2 = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve("Promise 2 resolved");
  }, 5000); // 10 sec
});

async function handlePromise() {
  console.log("Handling promises....");

  const val1 = await p1;
  console.log("Namaste Javascript");
  console.log(val1); // Promise 1 resolved

  const val2 = await p2;
  console.log("Namaste Javascript 2");
  console.log(val2); // Promise 2 resolved
}
handlePromise();

// real world example
const API_URL = "https://api.github.com/users/RonakParmar21";
async function fetchGitHubUser() {
  try {
    const data = await fetch(API_URL);
    const jsonValue = await data.json();
    console.log(jsonValue);
  } catch (error) {
    console.log("Error occurred while fetching GitHub user:", error);
  }
  // fetch() => response.json() => json value
}
fetchGitHubUser();

// INTERVIEW QUESTIONS
/*
async is a keywork used with function 
await is used with only with async to handle promises 

*/