import { useState, useEffect } from "react";
import { MENU_API } from "../utils/constants";
import { useParams } from "react-router-dom";

const RestaurantMenu = () => {
  const { resId } = useParams();
  const [resInfo, setResInfo] = useState();

  useEffect(() => {
    getRestaurantInfo();
  }, []);
  console.log("res id is : " + resId);

  const getRestaurantInfo = async () => {
    const apiData = await fetch(MENU_API + resId);

    const jsonData = await apiData.json();
    console.log(jsonData.data);

    console.log(jsonData);
    setResInfo(jsonData.data);

    // const data = await fetch(MENU_API + resId);
    // const jsonData = await data.json();
    // setResInfo(jsonData.data);
    // console.log(jsonData.data);
  };

  return (
    <div>
      <h1>{resInfo.id}</h1>
      {/* Menu items will be displayed here */}
    </div>
  );
};

export default RestaurantMenu;
