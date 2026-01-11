const heading = React.createElement(
  "h1",
  { id: "heading", xyz: "abc" },
  "Hello World from React!"
); // this is React element, which is JS object (heading) is not HTML code

console.log(heading);

const root = ReactDOM.createRoot(document.getElementById("root"));
// root.render(heading); // this will convert React element to HTML code and show on the screen

/**
 *
 * nested React element
 * <div>
 *  <div>
 *      <h1>I'm h1 tag.</h1>
 *  </div>
 * </div>
 *
 */
const parent = React.createElement(
  "div",
  {},
  React.createElement("div", {}, React.createElement("h1", {}, "I'm h1 tag."))
);
root.render(parent);

/**
 *
 * nested React element with siblings
 * <div>
 *  <div>
 *      <h1>I'm h1 tag.</h1>
 *      <h2>I'm h2 tag.</h2>
 *      <p>I'm paragraph tag.</p>
 *  </div>
 * </div>
 *
 */
const parentWithSiblings = React.createElement(
  "div",
  {},
  React.createElement("div", {}, [
    React.createElement("h1", {}, "I'm h1 tag."),
    React.createElement("h2", {}, "I'm h2 tag."),
    React.createElement("p", {}, "I'm paragraph tag."),
  ])
);
// root.render(parentWithSiblings);

/**
 *
 * nested React element with siblings more complex
 * <div>
 *  <div>
 *      <h1>I'm h1 tag.</h1>
 *      <h2>I'm h2 tag.</h2>
 *      <p>I'm paragraph tag.</p>
 *  </div>
 *  <div>
 *      <h1>I'm h1 tag.</h1>
 *      <h2>I'm h2 tag.</h2>
 *      <p>I'm paragraph tag.</p>
 *  </div>
 * </div>
 *
 */
const complexNestedElement = React.createElement("div", {}, [
  React.createElement("div", {}, [
    React.createElement("h1", {}, "I'm h1 tag."),
    React.createElement("h2", {}, "I'm h2 tag."),
    React.createElement("p", {}, "I'm paragraph tag."),
  ]),
  React.createElement("div", {}, [
    React.createElement("h1", {}, "I'm h1 tag."),
    React.createElement("h2", {}, "I'm h2 tag."),
    React.createElement("p", {}, "I'm paragraph tag."),
  ]),
]);
// root.render(complexNestedElement);
// this above code is hard to read and maintain that's why JSX is introduced
// we are not use React.createElement way to create React elements we are going to use JSX
