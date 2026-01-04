const cart = ["shoes", "pants", "kurta"];

const promise = createOrder(cart); // orderId
console.log(promise);

promise
  .then(function (orderId) {
    console.log(orderId);
    return orderId;
  })
  .then(function (orderId) {
    return proceedToPayment(orderId);
  })
  .then(function (paymentInfo) {
    console.log(paymentInfo);
  })
  .catch(function (err) {
    console.log("Error message received from promise:", err.message);
  });

// do not write then after catch because it will be executed anyway

// producer of promise
function createOrder(cart) {
  const pr = new Promise(function (resolve, reject) {
    if (!validateCart(cart)) {
      const err = new Error("Cart is not valid");
      reject(err);
    }
    // logic to create order
    const orderId = "12345";
    if (orderId) {
      setTimeout(() => {
        resolve(orderId);
        console.log(promise);
      }, 5000);
    }
  });
  return pr;
}

function validateCart(cart) {
  // logic to validate cart
  return true; // true means cart is valid
  //return false; // false means cart is not valid
}

function proceedToPayment(orderId) {
  // logic to proceed to payment
  return new Promise(function (resolve, reject) {
    console.log("Payment Successfull for : ", orderId);
    resolve(true);
  });
}
