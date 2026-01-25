import React from "react";
import ReactDOM from "react-dom/client";

// React.createElement => Object => HTMLElement(render)
// const heading =  React.createElement(
//   "h1",
//   {id : "heading"},
//   "Namaste React"
// );
// console.log(heading);

// JSX => Babel transpiles it to React.createElement => ReactElement - JS Object => HTMLElement(render).
const heading = (
  <h1 id="heading" tabIndex={"5"}>
    Namaste React using JSX.
  </h1>
);
// console.log(jsxHeading);

// REACT COMPONENTS :-
// Classbased component
// Functional component - new way it is just js function
// const HeadingComponent = () => {
//   return <h1>Namaste React Functional Components.</h1>
// };

const Title = () => {
  return <h1>Namaste React JS Title.</h1>;
};
const elem = <span>This is react element.</span>
const number = 1000;

const HeadingComponent = () => (
  <div className="container">
    <Title />
    <Title></Title>
    {Title()}
    <h2>{number + 1}</h2>
    {elem}
    <h1 className="header">Namaste React Functional Components.</h1>
  </div>
);

const root = ReactDOM.createRoot(document.getElementById("root"));
// root.render(heading);
root.render(<HeadingComponent />);
