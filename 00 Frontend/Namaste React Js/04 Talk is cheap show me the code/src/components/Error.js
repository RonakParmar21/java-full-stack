import { useRouteError } from "react-router-dom";
import Header from "./Header";

const Error = () => {
    const err = useRouteError();
    console.log(err);
    return (
        <div>
            <h1>OPPS!!!</h1>
            <h2>Something went wrong.</h2>
            <h3>Error code is : {err.status}</h3>
            <h3>Error status : {err.statusText}</h3>
            <h3>Error data : {err.data}</h3>
        </div>
    );
}

export default Error;