console.log("start");
setTimeout(() => {
    console.log("callback");
}, 5000);
console.log("end");


console.log("start");
setTimeout(() => {
    console.log("CB Set Timeout");
}, 5000);

fetch('https://jsonplaceholder.typicode.com/posts/1')
    .then(() => {
        console.log("CB Fetch");
    })
console.log("end");

