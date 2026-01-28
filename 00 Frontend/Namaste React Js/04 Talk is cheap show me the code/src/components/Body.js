import FoodCard from "./FoodCard";
import resObj from "../utils/mockData";

import { useState, useEffect } from "react";

const Body = () => {
  // local state variable - super powerfull variable
  // hook is a just js function given by react
  // const [noOfRestaurant, setNoOfRestaurant] = useState
  // ([]);
  const [listOfRestaurants, setListOfRestraunt] = useState([]);

  useEffect(() => {
    fetchData();
  }, []);

  const fetchData = async () => {
    const data = await fetch(
      "https://www.swiggy.com/dapi/restaurants/list/v5?lat=12.9351929&lng=77.62448069999999&page_type=DESKTOP_WEB_LISTING"
    );

    const json = await data.json();

    // Optional Chaining
    setListOfRestraunt(
      json?.data?.cards[2]?.card?.card?.gridElements?.infoWithStyle?.restaurants
    );
    // setFilteredRestaurant(
    //   json?.data?.cards[2]?.card?.card?.gridElements?.infoWithStyle?.restaurants
    // );
  };

  // normal JS variable
  // let noOfRestaurant = resObj;
  console.log("test")

  return (
    <>
      <div className="filter">
        <button
          className="filter-btn"
          onClick={() => {
            const filteredRestaurant = resObj.filter(
              (res) => res.info.avgRating > 4.5,
            );
            setNoOfRestaurant(filteredRestaurant);
          }}
        >
          Top Rated Restaurants
        </button>
      </div>
      <div className="rest-container">
        {listOfRestaurants.map((res) => (
          <FoodCard key={res.info.id} resData={res} />
        ))}
      </div>
    </>
  );
};

export default Body;
