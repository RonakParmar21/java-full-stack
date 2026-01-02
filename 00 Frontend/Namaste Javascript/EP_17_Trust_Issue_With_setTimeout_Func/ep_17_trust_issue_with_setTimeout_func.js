console.log("start");

setTimeout(() => {
    console.log("callback");
}, 0);

console.log("end");

// millions of lines of code

let startDate = new Date().getTime();
let endDate = startDate;
while(endDate < startDate + 7000) {
    endDate = new Date().getTime();
}

console.log("while loop ended");