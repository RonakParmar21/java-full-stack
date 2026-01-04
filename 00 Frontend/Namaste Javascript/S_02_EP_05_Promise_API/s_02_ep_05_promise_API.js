/*
PROMISE API 
1. promise.all() :- It takes an array of promises and returns a single promise that resolves when all of the promises in the array have resolved or rejects if any of the promises in the array reject.
2. promise.allSettled() :- It takes an array of promises and returns a single promise that resolves when all of the promises in the array have settled, regardless of whether they resolved or rejected.
3. promise.race() :- It takes an array of promises and returns a single promise that resolves or rejects as soon as one of the promises in the array resolves or rejects.
4. promise.any() :- It takes an array of promises and returns a single promise that resolves as soon as any of the promises in the array resolve. If all of the promises reject, it returns a promise that rejects with an AggregateError.
*/

const p1 = new Promise((resolve, reject) => {
  //setTimeout(() => resolve("p1 success"), 3000);
  setTimeout(() => {
    reject("p1 failed");
  }, 3000);
});

const p2 = new Promise((resolve, reject) => {
  setTimeout(() => resolve("p2 success"), 1000);
  //setTimeout(() => reject("p2 failed"), 1000);
});

const p3 = new Promise((resolve, reject) => {
  //setTimeout(() => resolve("p3 success"), 2000);
  setTimeout(() => reject("p3 failed"), 2000);
});

Promise.all([p1, p2, p3])
  .then((res) => console.log(res))
  .catch((err) => console.log(err));

Promise.allSettled([p1, p2, p3])
  .then((res) => console.log(res))
  .catch((err) => console.log(err));

Promise.race([p1, p2, p3])
  .then((res) => console.log(res))
  .catch((err) => console.log(err));

Promise.any([p1, p2, p3])
  .then((res) => console.log(res))
  .catch((err) => console.log(err));


// what is aggregate error :- 