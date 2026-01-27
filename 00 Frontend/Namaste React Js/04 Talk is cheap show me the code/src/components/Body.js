import FoodCard from "./FoodCard";
import resObj from "../utils/mockData";

import { useState } from "react";

const Body = () => {

  // local state variable - super powerfull variable
  // hook is a just js function given by react
  const [noOfRestaurant, setNoOfRestaurant] = useState(resObj);

  // normal JS variable 
  // let noOfRestaurant = resObj;

  return (
    <>
      <div className="filter">
        <button
          className="filter-btn"
          onClick={() => {
            const filteredRestaurant = resObj.filter((res) => res.info.avgRating > 4.5);
            setNoOfRestaurant(filteredRestaurant);
          }}
        >
          Top Rated Restaurants
        </button>
      </div>
      <div className="rest-container">
        {noOfRestaurant.map((res) => (
          <FoodCard key={res.info.id} resData={res} />
        ))}
      </div>
    </>
  );
};

export default Body;
