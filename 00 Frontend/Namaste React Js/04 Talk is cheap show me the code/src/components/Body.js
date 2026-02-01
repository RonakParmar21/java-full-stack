import FoodCard from "./FoodCard";
// import resObj from "../utils/mockData"; // not required because I fetch live swiggy data.

import { useState, useEffect } from "react";
import Shimmer from "./Shimmer";

const Body = () => {
  // local state variable - super powerfull variable
  // hook is a just js function given by react
  // const [noOfRestaurant, setNoOfRestaurant] = useState
  // ([]);
  // const [listOfRestaurants, setListOfRestraunt] = useState(resObj);
  const [listOfRestaurants, setListOfRestraunt] = useState([]);
  const [filteredRestaurant, setFilteredRestaurant] = useState([]);
  const [searchText, setSearchText] = useState("");

  useEffect(() => {
    fetchData();
  }, []);

  const fetchData = async () => {
    // const data = await fetch("https://www.swiggy.com/dapi/restaurants/list/v5?lat=19.9615398&lng=79.2961468&is-seo-homepage-enabled=true&page_type=DESKTOP_WEB_LISTING");
    const data = await fetch(
      "https://www.swiggy.com/dapi/restaurants/list/v5?lat=19.9615398&lng=79.296",
    );

    const jsonData = await data.json();
    // this line of code is not valid because it is not good way to write code like this.
    // instead of this we can use optional chaining.
    // setListOfRestraunt(jsonData.data.cards[1].card.card.gridElements.infoWithStyle.restaurants);
    setListOfRestraunt(
      jsonData?.data?.cards[1]?.card?.card?.gridElements?.infoWithStyle
        ?.restaurants,
    ); // this is optional chaining concept
    setFilteredRestaurant(jsonData?.data?.cards[1]?.card?.card?.gridElements?.infoWithStyle
        ?.restaurants,);

    // console.log(jsonData)
    // console.log(jsonData?.data?.cards[1]?.card?.card?.gridElements?.infoWithStyle?.restaurants[0]?.info?.name);
  };

  // whenever state variable update, react triggers a reconcilation cycle(re-render the component).

  // conditional rendering. :- rendering based on some condition is called conditional rendering.
  // if(listOfRestaurants.length === 0)
  //   return <Shimmer />;
  // return <h1>Loading....</h1>; // here we can put spinner but spineer is not good way it is old way to put spinner to here so I am using latest technique which is called shimmer ui

  return listOfRestaurants.length === 0 ? (
    <Shimmer />
  ) : (
    <>
      <div className="search">
        <input
          type="text"
          className="search-box"
          value={searchText}
          onChange={(e) => {
            setSearchText(e.target.value);
          }}
        />
        <button
          className="search-btn"
          onClick={() => {
            const filteredRestaurant = listOfRestaurants.filter((res) =>
              res?.info?.name?.toLowerCase().includes(searchText.toLowerCase()),
            );
            setFilteredRestaurant(filteredRestaurant);
          }}
        >
          Search
        </button>
      </div>
      <div className="filter">
        <button
          className="filter-btn"
          onClick={() => {
            const filteredRestaurant = listOfRestaurants.filter(
              (res) => res.info.avgRating > 4.3,
            );
            setListOfRestraunt(filteredRestaurant);
          }}
        >
          Top Rated Restaurants
        </button>
      </div>
      <div className="rest-container">
        {filteredRestaurant.map((res) => (
          <FoodCard key={res.info.id} resData={res} />
        ))}
      </div>
    </>
  );
};

export default Body;
