import { CDN_URL } from "../utils/constants";

const FoodCard = (props) => {
  const { resData } = props;
  const { name, cuisines, avgRating } = resData?.info;
  return (
    <div className="food-card">
      <img
        src={
          CDN_URL +
          resData.info.cloudinaryImageId
        }
      />

      <div className="food-info">
        <h3>{name}</h3>
        <p className="cuisine">{cuisines.join(", ")}</p>

        <div className="food-meta">
          <span>⭐ {avgRating}</span>
          <span>⏱ {resData.info.sla.deliveryTime} min</span>
        </div>
      </div>
    </div>
  );
};

export default FoodCard;
