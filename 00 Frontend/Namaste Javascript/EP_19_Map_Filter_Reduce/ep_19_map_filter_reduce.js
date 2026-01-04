const arr = [5, 1, 3, 2, 6];

/*********************** MAP ***********************/
// Map: Create a new array with each element squared
function double(x) {
  return x * 2;
}

function triple(x) {
  return x * 3;
}

function binary(x) {
  return x.toString(2);
}

const doubleOutput = arr.map(double);
const tripleOutput = arr.map(triple);
const binaryOutput = arr.map(binary);

console.log(doubleOutput); // [10, 2, 6, 4, 12]
console.log(tripleOutput); // [15, 3, 9, 6, 18]
console.log(binaryOutput); // ['101', '1', '11', '10', '110']

// also posible with arrow functions
const doubleOutputArrow = arr.map((x) => x * 2);
const tripleOutputArrow = arr.map((x) => x * 3);
const binaryOutputArrow = arr.map((x) => x.toString(2));

console.log(doubleOutputArrow); // [10, 2, 6, 4, 12]
console.log(tripleOutputArrow); // [15, 3, 9, 6, 18]
console.log(binaryOutputArrow); // ['101', '1', '11', '10', '110']

// we can write function code inside map too
console.log("--- Inline Functions ---");
const doubleOutputInline = arr.map(function (x) {
  return x * 2;
});
console.log(doubleOutputInline); // [10, 2, 6, 4, 12]

const tripleOutputInline = arr.map(function (x) {
  return x * 3;
});
console.log(tripleOutputInline); // [15, 3, 9, 6, 18]

const binaryOutputInline = arr.map(function (x) {
  return x.toString(2);
});
console.log(binaryOutputInline); // ['101', '1', '11', '10', '110']

/*********************** FILTER ***********************/
console.log("--- Filter Example ---");
// Filter: Create a new array with elements that are greater than 3
function isOdd(x) {
  return x % 2 !== 0;
}

const outputIsOdd = arr.filter(isOdd);
console.log(outputIsOdd); // [5, 1, 3]

// is even
const outputIsEven = arr.filter((x) => x % 2 === 0);
console.log(outputIsEven); // [2, 6]

// is greater than 4
const outputGreaterThan4 = arr.filter(function (x) {
  return x > 4;
});
console.log(outputGreaterThan4); // [5, 6]

/*********************** REDUCE ***********************/
console.log("--- Reduce Example ---");
// Reduce: Sum all elements in the array
// without use of reduce function
function findSum(arr) {
  let sum = 0;
  for (let i = 0; i < arr.length; i++) {
    sum += arr[i];
  }
  return sum;
}
console.log(findSum(arr)); // 17

// using reduce function
const outputReduceSum = arr.reduce(function (acc, curr) {
  return (acc += curr);
}, 0);
console.log(outputReduceSum); // 17

// using arrow function
const outputReduceSumArrow = arr.reduce((acc, curr) => acc + curr, 0);
console.log(outputReduceSumArrow); // 17

// finding max value without reduce
function findMax(arr) {
  let max = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] > max) {
      max = arr[i];
    }
  }
  return max;
}
console.log(findMax(arr)); // 6

// finding max value using reduce
const outputReduceMax = arr.reduce((acc, curr) => {
  if (curr > acc) {
    return curr;
  } else {
    return acc;
  }
}, arr[0]);
console.log(outputReduceMax); // 6

/*********************** ADVANCED EXAMPLE OF MAP ***********************/
const users = [
    { firstName: "Ronak", lastName: "Parmar", age: 23 },
    { firstName: "Akshar", lastName: "Patel", age: 25 },
    { firstName: "John", lastName: "Doe", age: 21 },
    { firstName: "Jane", lastName: "Smith", age: 22 },
    { firstName: "Emily", lastName: "Johnson", age: 22 },
]

const fullNamesOutput = users.map(x => x.firstName + " " + x.lastName);
console.log(fullNamesOutput); 
// ['Ronak Parmar', 'Akshar Patel', 'John Doe', 'Jane Smith', 'Emily Johnson']

/*********************** ADVANCED EXAMPLE OF FILTER ***********************/
// find out first name of all user which age is less than 23
const firstNamesAbove22 = users.filter(x => x.age < 23).map(x => x.firstName);
console.log(firstNamesAbove22); 
// ['John', 'Jane', 'Emily']

/*********************** ADVANCED EXAMPLE OF REDUCE ***********************/
// {age of(perticular number) howmany people are there in users array }
// ex : age 23 => 1, age 25 => 1, age 21 => 1, age 22 => 2
const ageCountOutput = users.reduce((acc, curr) => {
    if(acc[curr.age]) {
        acc[curr.age] += 1;
    } else {
        acc[curr.age] = 1;
    }
    return acc;
}, {});
console.log(ageCountOutput);

// find out first name of all user which age is less than 23 using reduce
const firstNamesAbove22Reduce = users.reduce((acc, curr) => {
    if(curr.age < 23) {
        acc.push(curr.firstName);
        return acc;
    } else {
        return acc; 
    }
}, []);
console.log(firstNamesAbove22Reduce);