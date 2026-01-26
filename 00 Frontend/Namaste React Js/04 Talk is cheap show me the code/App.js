import React from "react";
import ReactDOM from "react-dom/client";

/**
 * Header
 *  - logo
 *  - nav items
 *
 * Body
 *  - search bar
 *  - restaurant container
 *    - cards
 *
 * Footer
 */

const resObj = [
  {
    "@type": "type.googleapis.com/swiggy.presentation.food.v2.Restaurant",
    info: {
      id: "234875",
      name: "Adil Hotel",
      cloudinaryImageId: "gp1ityra6utvzqn6ghnv",
      locality: "Rautha Wada",
      areaName: "Chhindwara Locality",
      costForTwo: "₹150 for two",
      cuisines: ["North Indian", "Biryani", "Tandoor"],
      avgRating: 4.3,
      parentId: "27123",
      avgRatingString: "4.3",
      totalRatingsString: "1.3K+",
      sla: {
        deliveryTime: 37,
        lastMileTravel: 11.5,
        serviceability: "SERVICEABLE",
        slaString: "35-40 mins",
        lastMileTravelString: "11.5 km",
        iconType: "ICON_TYPE_EMPTY",
      },
      availability: {
        nextCloseTime: "2025-06-13 00:00:00",
        opened: true,
      },
      badges: {},
      isOpen: true,
      type: "F",
      badgesV2: {
        entityBadges: {
          imageBased: {},
          textBased: {},
          textExtendedBadges: {},
        },
      },
      aggregatedDiscountInfoV3: {
        header: "ITEMS",
        subHeader: "AT ₹129",
      },
      orderabilityCommunication: {
        title: {},
        subTitle: {},
        message: {},
        customIcon: {},
      },
      differentiatedUi: {
        displayType: "ADS_UI_DISPLAY_TYPE_ENUM_DEFAULT",
        differentiatedUiMediaDetails: {
          mediaType: "ADS_MEDIA_ENUM_IMAGE",
          lottie: {},
          video: {},
        },
      },
      reviewsSummary: {},
      displayType: "RESTAURANT_DISPLAY_TYPE_DEFAULT",
      restaurantOfferPresentationInfo: {},
      externalRatings: {
        aggregatedRating: {
          rating: "--",
        },
      },
      ratingsDisplayPreference: "RATINGS_DISPLAY_PREFERENCE_SHOW_SWIGGY",
    },
    analytics: {
      context: "seo-data-4e327c63-b967-4e28-bcdb-8f1d38fa05cd",
    },
    cta: {
      link: "https://www.swiggy.com/city/chhindwara/adil-hotel-rautha-wada-chhindwara-locality-rest234875",
      text: "RESTAURANT_MENU",
      type: "WEBLINK",
    },
    widgetId: "collectionV5RestaurantListWidget_SimRestoRelevance_food_seo",
  },
  {
    "@type": "type.googleapis.com/swiggy.presentation.food.v2.Restaurant",
    info: {
      id: "630193",
      name: "Champaran  Handi Restaurant",
      cloudinaryImageId: "xph0vf5pvbxjf8xchwjk",
      locality: "Sinchai Colony",
      areaName: "Nagpur road",
      costForTwo: "₹200 for two",
      cuisines: ["North Indian"],
      avgRating: 4.3,
      parentId: "376324",
      avgRatingString: "4.3",
      totalRatingsString: "414",
      sla: {
        deliveryTime: 43,
        lastMileTravel: 11.9,
        serviceability: "SERVICEABLE",
        slaString: "40-45 mins",
        lastMileTravelString: "11.9 km",
        iconType: "ICON_TYPE_EMPTY",
      },
      availability: {
        nextCloseTime: "2025-06-12 23:00:00",
        opened: true,
      },
      badges: {},
      isOpen: true,
      aggregatedDiscountInfoV2: {},
      type: "F",
      badgesV2: {
        entityBadges: {
          imageBased: {},
          textBased: {},
          textExtendedBadges: {},
        },
      },
      orderabilityCommunication: {
        title: {},
        subTitle: {},
        message: {},
        customIcon: {},
      },
      differentiatedUi: {
        displayType: "ADS_UI_DISPLAY_TYPE_ENUM_DEFAULT",
        differentiatedUiMediaDetails: {
          mediaType: "ADS_MEDIA_ENUM_IMAGE",
          lottie: {},
          video: {},
        },
      },
      reviewsSummary: {},
      displayType: "RESTAURANT_DISPLAY_TYPE_DEFAULT",
      restaurantOfferPresentationInfo: {},
      externalRatings: {
        aggregatedRating: {
          rating: "--",
        },
      },
      ratingsDisplayPreference: "RATINGS_DISPLAY_PREFERENCE_SHOW_SWIGGY",
    },
    analytics: {
      context: "seo-data-4e327c63-b967-4e28-bcdb-8f1d38fa05cd",
    },
    cta: {
      link: "https://www.swiggy.com/city/chhindwara/champaran-handi-restaurant-sinchai-colony-nagpur-road-rest630193",
      text: "RESTAURANT_MENU",
      type: "WEBLINK",
    },
    widgetId: "collectionV5RestaurantListWidget_SimRestoRelevance_food_seo",
  },
  {
    "@type": "type.googleapis.com/swiggy.presentation.food.v2.Restaurant",
    info: {
      id: "618037",
      name: "Jai Ganesh Bhojnalaya",
      cloudinaryImageId: "yzgqriufpzmloogcn2vl",
      locality: "Railway Colony",
      areaName: "Bus stand",
      costForTwo: "₹200 for two",
      cuisines: ["North Indian", "South Indian", "Indian", "Chinese"],
      avgRating: 4.1,
      veg: true,
      parentId: "368432",
      avgRatingString: "4.1",
      totalRatingsString: "397",
      sla: {
        deliveryTime: 42,
        lastMileTravel: 13.7,
        serviceability: "SERVICEABLE",
        slaString: "40-45 mins",
        lastMileTravelString: "13.7 km",
        iconType: "ICON_TYPE_EMPTY",
      },
      availability: {
        nextCloseTime: "2025-06-12 23:00:00",
        opened: true,
      },
      badges: {
        imageBadges: [
          {
            imageId: "v1695133679/badges/Pure_Veg111.png",
            description: "pureveg",
          },
        ],
      },
      isOpen: true,
      type: "F",
      badgesV2: {
        entityBadges: {
          imageBased: {
            badgeObject: [
              {
                attributes: {
                  description: "pureveg",
                  imageId: "v1695133679/badges/Pure_Veg111.png",
                },
              },
            ],
          },
          textBased: {},
          textExtendedBadges: {},
        },
      },
      aggregatedDiscountInfoV3: {
        header: "₹200 OFF",
        subHeader: "ABOVE ₹799",
        discountTag: "FLAT DEAL",
      },
      orderabilityCommunication: {
        title: {},
        subTitle: {},
        message: {},
        customIcon: {},
      },
      differentiatedUi: {
        displayType: "ADS_UI_DISPLAY_TYPE_ENUM_DEFAULT",
        differentiatedUiMediaDetails: {
          mediaType: "ADS_MEDIA_ENUM_IMAGE",
          lottie: {},
          video: {},
        },
      },
      reviewsSummary: {},
      displayType: "RESTAURANT_DISPLAY_TYPE_DEFAULT",
      restaurantOfferPresentationInfo: {},
      externalRatings: {
        aggregatedRating: {
          rating: "--",
        },
      },
      ratingsDisplayPreference: "RATINGS_DISPLAY_PREFERENCE_SHOW_SWIGGY",
    },
    analytics: {
      context: "seo-data-4e327c63-b967-4e28-bcdb-8f1d38fa05cd",
    },
    cta: {
      link: "https://www.swiggy.com/city/chhindwara/jai-ganesh-bhojnalaya-railway-colony-bus-stand-rest618037",
      text: "RESTAURANT_MENU",
      type: "WEBLINK",
    },
    widgetId: "collectionV5RestaurantListWidget_SimRestoRelevance_food_seo",
  },
  {
    "@type": "type.googleapis.com/swiggy.presentation.food.v2.Restaurant",
    info: {
      id: "151515",
      name: "Gupta Bhojnalay",
      cloudinaryImageId: "jo9pdipf4elcuch8g55q",
      locality: "fulwara chowk",
      areaName: "Chhindwara Locality",
      costForTwo: "₹200 for two",
      cuisines: ["Fast Food", "Indian", "Beverages"],
      avgRating: 4.8,
      veg: true,
      parentId: "91635",
      avgRatingString: "4.8",
      totalRatingsString: "449",
      sla: {
        deliveryTime: 41,
        lastMileTravel: 11,
        serviceability: "SERVICEABLE",
        slaString: "40-45 mins",
        lastMileTravelString: "11.0 km",
        iconType: "ICON_TYPE_EMPTY",
      },
      availability: {
        nextCloseTime: "2025-06-12 23:00:00",
        opened: true,
      },
      badges: {
        imageBadges: [
          {
            imageId: "v1695133679/badges/Pure_Veg111.png",
            description: "pureveg",
          },
        ],
      },
      isOpen: true,
      type: "F",
      badgesV2: {
        entityBadges: {
          imageBased: {
            badgeObject: [
              {
                attributes: {
                  description: "pureveg",
                  imageId: "v1695133679/badges/Pure_Veg111.png",
                },
              },
            ],
          },
          textBased: {},
          textExtendedBadges: {},
        },
      },
      aggregatedDiscountInfoV3: {
        header: "₹100 OFF",
        subHeader: "ABOVE ₹999",
        discountTag: "FLAT DEAL",
      },
      orderabilityCommunication: {
        title: {},
        subTitle: {},
        message: {},
        customIcon: {},
      },
      differentiatedUi: {
        displayType: "ADS_UI_DISPLAY_TYPE_ENUM_DEFAULT",
        differentiatedUiMediaDetails: {
          mediaType: "ADS_MEDIA_ENUM_IMAGE",
          lottie: {},
          video: {},
        },
      },
      reviewsSummary: {},
      displayType: "RESTAURANT_DISPLAY_TYPE_DEFAULT",
      restaurantOfferPresentationInfo: {},
      externalRatings: {
        aggregatedRating: {
          rating: "--",
        },
      },
      ratingsDisplayPreference: "RATINGS_DISPLAY_PREFERENCE_SHOW_SWIGGY",
    },
    analytics: {
      context: "seo-data-4e327c63-b967-4e28-bcdb-8f1d38fa05cd",
    },
    cta: {
      link: "https://www.swiggy.com/city/chhindwara/gupta-bhojnalay-fulwara-chowk-chhindwara-locality-rest151515",
      text: "RESTAURANT_MENU",
      type: "WEBLINK",
    },
    widgetId: "collectionV5RestaurantListWidget_SimRestoRelevance_food_seo",
  },
  {
    "@type": "type.googleapis.com/swiggy.presentation.food.v2.Restaurant",
    info: {
      id: "151648",
      name: "Mr. Gurung Momo & Chinese Corner",
      cloudinaryImageId: "h7oibtpm7kqks8cqz3gh",
      locality: "Teacher's Colony",
      areaName: "Mohan Nagar",
      costForTwo: "₹150 for two",
      cuisines: ["Momos", "Chinese", "Fast Food"],
      avgRating: 4.3,
      veg: true,
      parentId: "140255",
      avgRatingString: "4.3",
      totalRatingsString: "1.1K+",
      sla: {
        deliveryTime: 42,
        lastMileTravel: 12.2,
        serviceability: "SERVICEABLE",
        slaString: "40-45 mins",
        lastMileTravelString: "12.2 km",
        iconType: "ICON_TYPE_EMPTY",
      },
      availability: {
        nextCloseTime: "2025-06-12 23:00:00",
        opened: true,
      },
      badges: {
        imageBadges: [
          {
            imageId: "v1695133679/badges/Pure_Veg111.png",
            description: "pureveg",
          },
        ],
      },
      isOpen: true,
      type: "F",
      badgesV2: {
        entityBadges: {
          imageBased: {
            badgeObject: [
              {
                attributes: {
                  description: "pureveg",
                  imageId: "v1695133679/badges/Pure_Veg111.png",
                },
              },
            ],
          },
          textBased: {},
          textExtendedBadges: {},
        },
      },
      aggregatedDiscountInfoV3: {
        header: "ITEMS",
        subHeader: "AT ₹49",
      },
      orderabilityCommunication: {
        title: {},
        subTitle: {},
        message: {},
        customIcon: {},
      },
      differentiatedUi: {
        displayType: "ADS_UI_DISPLAY_TYPE_ENUM_DEFAULT",
        differentiatedUiMediaDetails: {
          mediaType: "ADS_MEDIA_ENUM_IMAGE",
          lottie: {},
          video: {},
        },
      },
      reviewsSummary: {},
      displayType: "RESTAURANT_DISPLAY_TYPE_DEFAULT",
      restaurantOfferPresentationInfo: {},
      externalRatings: {
        aggregatedRating: {
          rating: "--",
        },
      },
      ratingsDisplayPreference: "RATINGS_DISPLAY_PREFERENCE_SHOW_SWIGGY",
    },
    analytics: {
      context: "seo-data-4e327c63-b967-4e28-bcdb-8f1d38fa05cd",
    },
    cta: {
      link: "https://www.swiggy.com/city/chhindwara/mr-gurung-momo-and-chinese-corner-teachers-colony-mohan-nagar-rest151648",
      text: "RESTAURANT_MENU",
      type: "WEBLINK",
    },
    widgetId: "collectionV5RestaurantListWidget_SimRestoRelevance_food_seo",
  },
  {
    "@type": "type.googleapis.com/swiggy.presentation.food.v2.Restaurant",
    info: {
      id: "615927",
      name: "Roof 5",
      cloudinaryImageId: "glepanv4xjfnhsbieam1",
      locality: "Adarsh Nagar Colony",
      areaName: "Chhindwara Locality",
      costForTwo: "₹200 for two",
      cuisines: ["Indian"],
      avgRating: 4.2,
      parentId: "171348",
      avgRatingString: "4.2",
      totalRatingsString: "173",
      sla: {
        deliveryTime: 54,
        lastMileTravel: 14.5,
        serviceability: "SERVICEABLE",
        slaString: "50-55 mins",
        lastMileTravelString: "14.5 km",
        iconType: "ICON_TYPE_EMPTY",
      },
      availability: {
        nextCloseTime: "2025-06-12 23:45:00",
        opened: true,
      },
      badges: {},
      isOpen: true,
      type: "F",
      badgesV2: {
        entityBadges: {
          imageBased: {},
          textBased: {},
          textExtendedBadges: {},
        },
      },
      aggregatedDiscountInfoV3: {
        header: "₹250 OFF",
        subHeader: "ABOVE ₹999",
        discountTag: "FLAT DEAL",
      },
      orderabilityCommunication: {
        title: {},
        subTitle: {},
        message: {},
        customIcon: {},
      },
      differentiatedUi: {
        displayType: "ADS_UI_DISPLAY_TYPE_ENUM_DEFAULT",
        differentiatedUiMediaDetails: {
          mediaType: "ADS_MEDIA_ENUM_IMAGE",
          lottie: {},
          video: {},
        },
      },
      reviewsSummary: {},
      displayType: "RESTAURANT_DISPLAY_TYPE_DEFAULT",
      restaurantOfferPresentationInfo: {},
      externalRatings: {
        aggregatedRating: {
          rating: "--",
        },
      },
      ratingsDisplayPreference: "RATINGS_DISPLAY_PREFERENCE_SHOW_SWIGGY",
    },
    analytics: {
      context: "seo-data-4e327c63-b967-4e28-bcdb-8f1d38fa05cd",
    },
    cta: {
      link: "https://www.swiggy.com/city/chhindwara/roof-5-adarsh-nagar-colony-chhindwara-locality-rest615927",
      text: "RESTAURANT_MENU",
      type: "WEBLINK",
    },
    widgetId: "collectionV5RestaurantListWidget_SimRestoRelevance_food_seo",
  },
  {
    "@type": "type.googleapis.com/swiggy.presentation.food.v2.Restaurant",
    info: {
      id: "184424",
      name: "Sab Ghar Tak Foods",
      cloudinaryImageId: "ryzswg44bt7thqzkuaj4",
      locality: "Sanchar Colony",
      areaName: "Parsia Road",
      costForTwo: "₹200 for two",
      cuisines: [
        "North Indian",
        "South Indian",
        "Chinese",
        "Beverages",
        "Fast Food",
        "Desserts",
      ],
      avgRating: 4.1,
      parentId: "173932",
      avgRatingString: "4.1",
      totalRatingsString: "617",
      sla: {
        deliveryTime: 46,
        lastMileTravel: 14.1,
        serviceability: "SERVICEABLE",
        slaString: "45-50 mins",
        lastMileTravelString: "14.1 km",
        iconType: "ICON_TYPE_EMPTY",
      },
      availability: {
        nextCloseTime: "2025-06-12 23:00:00",
        opened: true,
      },
      badges: {},
      isOpen: true,
      type: "F",
      badgesV2: {
        entityBadges: {
          imageBased: {},
          textBased: {},
          textExtendedBadges: {},
        },
      },
      aggregatedDiscountInfoV3: {
        header: "₹50 OFF",
        subHeader: "ABOVE ₹199",
        discountTag: "FLAT DEAL",
      },
      orderabilityCommunication: {
        title: {},
        subTitle: {},
        message: {},
        customIcon: {},
      },
      differentiatedUi: {
        displayType: "ADS_UI_DISPLAY_TYPE_ENUM_DEFAULT",
        differentiatedUiMediaDetails: {
          mediaType: "ADS_MEDIA_ENUM_IMAGE",
          lottie: {},
          video: {},
        },
      },
      reviewsSummary: {},
      displayType: "RESTAURANT_DISPLAY_TYPE_DEFAULT",
      restaurantOfferPresentationInfo: {},
      externalRatings: {
        aggregatedRating: {
          rating: "--",
        },
      },
      ratingsDisplayPreference: "RATINGS_DISPLAY_PREFERENCE_SHOW_SWIGGY",
    },
    analytics: {
      context: "seo-data-4e327c63-b967-4e28-bcdb-8f1d38fa05cd",
    },
    cta: {
      link: "https://www.swiggy.com/city/chhindwara/sab-ghar-tak-foods-sanchar-colony-parsia-road-rest184424",
      text: "RESTAURANT_MENU",
      type: "WEBLINK",
    },
    widgetId: "collectionV5RestaurantListWidget_SimRestoRelevance_food_seo",
  },
];

// const resObj = [
//   {
//     info: {
//       id: "234875",
//       name: "Adil Hotel",
//       cloudinaryImageId: "gp1ityra6utvzqn6ghnv",
//       locality: "Rautha Wada",
//       areaName: "Chhindwara Locality",
//       costForTwo: "₹150 for two",
//       cuisines: ["North Indian", "Biryani", "Tandoor"],
//       avgRating: 4.3,
//       parentId: "27123",
//       avgRatingString: "4.3",
//       totalRatingsString: "1.3K+",
//       sla: {
//         deliveryTime: 37,
//         lastMileTravel: 11.5,
//         serviceability: "SERVICEABLE",
//         slaString: "35-40 mins",
//         lastMileTravelString: "11.5 km",
//         iconType: "ICON_TYPE_EMPTY",
//       },
//       availability: {
//         nextCloseTime: "2025-06-13 00:00:00",
//         opened: true,
//       },
//       badges: {},
//       isOpen: true,
//       type: "F",
//       badgesV2: {
//         entityBadges: {
//           imageBased: {},
//           textBased: {},
//           textExtendedBadges: {},
//         },
//       },
//       aggregatedDiscountInfoV3: {
//         header: "ITEMS",
//         subHeader: "AT ₹129",
//       },
//       differentiatedUi: {
//         displayType: "ADS_UI_DISPLAY_TYPE_ENUM_DEFAULT",
//         differentiatedUiMediaDetails: {
//           lottie: {},
//           video: {},
//         },
//       },
//       reviewsSummary: {},
//       displayType: "RESTAURANT_DISPLAY_TYPE_DEFAULT",
//       restaurantOfferPresentationInfo: {},
//       externalRatings: {
//         aggregatedRating: {
//           rating: "--",
//         },
//       },
//       ratingsDisplayPreference: "RATINGS_DISPLAY_PREFERENCE_SHOW_SWIGGY",
//     },
//     analytics: {
//       context: "seo-data-4e327c63-b967-4e28-bcdb-8f1d38fa05cd",
//     },
//     cta: {
//       link: "https://www.swiggy.com/city/chhindwara/adil-hotel-rautha-wada-chhindwara-locality-rest234875",
//       type: "WEBLINK",
//     },
//   },
//   {
//     info: {
//       id: "151515",
//       name: "Gupta Bhojnalay",
//       cloudinaryImageId: "jo9pdipf4elcuch8g55q",
//       locality: "fulwara chowk",
//       areaName: "Chhindwara Locality",
//       costForTwo: "₹200 for two",
//       cuisines: ["Fast Food", "Indian", "Beverages"],
//       avgRating: 4.8,
//       veg: true,
//       parentId: "91635",
//       avgRatingString: "4.8",
//       totalRatingsString: "449",
//       sla: {
//         deliveryTime: 41,
//         lastMileTravel: 11,
//         serviceability: "SERVICEABLE",
//         slaString: "40-45 mins",
//         lastMileTravelString: "11.0 km",
//         iconType: "ICON_TYPE_EMPTY",
//       },
//       availability: {
//         nextCloseTime: "2025-06-12 23:00:00",
//         opened: true,
//       },
//       badges: {
//         imageBadges: [
//           {
//             imageId: "v1695133679/badges/Pure_Veg111.png",
//             description: "pureveg",
//           },
//         ],
//       },
//       isOpen: true,
//       type: "F",
//       badgesV2: {
//         entityBadges: {
//           imageBased: {
//             badgeObject: [
//               {
//                 attributes: {
//                   description: "pureveg",
//                   imageId: "v1695133679/badges/Pure_Veg111.png",
//                 },
//               },
//             ],
//           },
//           textBased: {},
//           textExtendedBadges: {},
//         },
//       },
//       aggregatedDiscountInfoV3: {
//         header: "₹100 OFF",
//         subHeader: "ABOVE ₹999",
//         discountTag: "FLAT DEAL",
//       },
//       differentiatedUi: {
//         displayType: "ADS_UI_DISPLAY_TYPE_ENUM_DEFAULT",
//         differentiatedUiMediaDetails: {
//           lottie: {},
//           video: {},
//         },
//       },
//       reviewsSummary: {},
//       displayType: "RESTAURANT_DISPLAY_TYPE_DEFAULT",
//       restaurantOfferPresentationInfo: {},
//       externalRatings: {
//         aggregatedRating: {
//           rating: "--",
//         },
//       },
//       ratingsDisplayPreference: "RATINGS_DISPLAY_PREFERENCE_SHOW_SWIGGY",
//     },
//     analytics: {
//       context: "seo-data-4e327c63-b967-4e28-bcdb-8f1d38fa05cd",
//     },
//     cta: {
//       link: "https://www.swiggy.com/city/chhindwara/gupta-bhojnalay-fulwara-chowk-chhindwara-locality-rest151515",
//       type: "WEBLINK",
//     },
//   },
//   {
//     info: {
//       id: "151648",
//       name: "Mr. Gurung Momo & Chinese Corner",
//       cloudinaryImageId: "h7oibtpm7kqks8cqz3gh",
//       locality: "Teacher's Colony",
//       areaName: "Mohan Nagar",
//       costForTwo: "₹150 for two",
//       cuisines: ["Momos", "Chinese", "Fast Food"],
//       avgRating: 4.3,
//       veg: true,
//       parentId: "140255",
//       avgRatingString: "4.3",
//       totalRatingsString: "1.1K+",
//       sla: {
//         deliveryTime: 42,
//         lastMileTravel: 12.2,
//         serviceability: "SERVICEABLE",
//         slaString: "40-45 mins",
//         lastMileTravelString: "12.2 km",
//         iconType: "ICON_TYPE_EMPTY",
//       },
//       availability: {
//         nextCloseTime: "2025-06-12 23:00:00",
//         opened: true,
//       },
//       badges: {
//         imageBadges: [
//           {
//             imageId: "v1695133679/badges/Pure_Veg111.png",
//             description: "pureveg",
//           },
//         ],
//       },
//       isOpen: true,
//       type: "F",
//       badgesV2: {
//         entityBadges: {
//           imageBased: {
//             badgeObject: [
//               {
//                 attributes: {
//                   description: "pureveg",
//                   imageId: "v1695133679/badges/Pure_Veg111.png",
//                 },
//               },
//             ],
//           },
//           textBased: {},
//           textExtendedBadges: {},
//         },
//       },
//       aggregatedDiscountInfoV3: {
//         header: "ITEMS",
//         subHeader: "AT ₹49",
//       },
//       differentiatedUi: {
//         displayType: "ADS_UI_DISPLAY_TYPE_ENUM_DEFAULT",
//         differentiatedUiMediaDetails: {
//           lottie: {},
//           video: {},
//         },
//       },
//       reviewsSummary: {},
//       displayType: "RESTAURANT_DISPLAY_TYPE_DEFAULT",
//       restaurantOfferPresentationInfo: {},
//       externalRatings: {
//         aggregatedRating: {
//           rating: "--",
//         },
//       },
//       ratingsDisplayPreference: "RATINGS_DISPLAY_PREFERENCE_SHOW_SWIGGY",
//     },
//     analytics: {
//       context: "seo-data-4e327c63-b967-4e28-bcdb-8f1d38fa05cd",
//     },
//     cta: {
//       link: "https://www.swiggy.com/city/chhindwara/mr-gurung-momo-and-chinese-corner-teachers-colony-mohan-nagar-rest151648",
//       type: "WEBLINK",
//     },
//   },
//   {
//     info: {
//       id: "184424",
//       name: "Sab Ghar Tak Foods",
//       cloudinaryImageId: "ryzswg44bt7thqzkuaj4",
//       locality: "Sanchar Colony",
//       areaName: "Parsia Road",
//       costForTwo: "₹200 for two",
//       cuisines: [
//         "North Indian",
//         "South Indian",
//         "Chinese",
//         "Beverages",
//         "Fast Food",
//         "Desserts",
//       ],
//       avgRating: 4.1,
//       parentId: "173932",
//       avgRatingString: "4.1",
//       totalRatingsString: "617",
//       sla: {
//         deliveryTime: 46,
//         lastMileTravel: 14.1,
//         serviceability: "SERVICEABLE",
//         slaString: "45-50 mins",
//         lastMileTravelString: "14.1 km",
//         iconType: "ICON_TYPE_EMPTY",
//       },
//       availability: {
//         nextCloseTime: "2025-06-12 23:00:00",
//         opened: true,
//       },
//       badges: {},
//       isOpen: true,
//       type: "F",
//       badgesV2: {
//         entityBadges: {
//           imageBased: {},
//           textBased: {},
//           textExtendedBadges: {},
//         },
//       },
//       aggregatedDiscountInfoV3: {
//         header: "₹50 OFF",
//         subHeader: "ABOVE ₹199",
//         discountTag: "FLAT DEAL",
//       },
//       differentiatedUi: {
//         displayType: "ADS_UI_DISPLAY_TYPE_ENUM_DEFAULT",
//         differentiatedUiMediaDetails: {
//           lottie: {},
//           video: {},
//         },
//       },
//       reviewsSummary: {},
//       displayType: "RESTAURANT_DISPLAY_TYPE_DEFAULT",
//       restaurantOfferPresentationInfo: {},
//       externalRatings: {
//         aggregatedRating: {
//           rating: "--",
//         },
//       },
//       ratingsDisplayPreference: "RATINGS_DISPLAY_PREFERENCE_SHOW_SWIGGY",
//     },
//     analytics: {
//       context: "seo-data-4e327c63-b967-4e28-bcdb-8f1d38fa05cd",
//     },
//     cta: {
//       link: "https://www.swiggy.com/city/chhindwara/sab-ghar-tak-foods-sanchar-colony-parsia-road-rest184424",
//       type: "WEBLINK",
//     },
//   },
//   {
//     info: {
//       id: "658210",
//       name: "The Fusion Lounge",
//       cloudinaryImageId: "fa4944f0cfdcbca2bec1f3ab8e3db3f7",
//       locality: "Triloki nagar",
//       areaName: "Railway Station",
//       costForTwo: "₹300 for two",
//       cuisines: [
//         "South Indian",
//         "Chinese",
//         "Beverages",
//         "Fast Food",
//         "Desserts",
//       ],
//       avgRating: 4.2,
//       parentId: "395453",
//       avgRatingString: "4.2",
//       totalRatingsString: "350",
//       sla: {
//         deliveryTime: 45,
//         lastMileTravel: 10.4,
//         serviceability: "SERVICEABLE",
//         slaString: "45-50 mins",
//         lastMileTravelString: "10.4 km",
//         iconType: "ICON_TYPE_EMPTY",
//       },
//       availability: {
//         nextCloseTime: "2025-06-12 23:00:00",
//         opened: true,
//       },
//       badges: {},
//       isOpen: true,
//       aggregatedDiscountInfoV2: {},
//       type: "F",
//       badgesV2: {
//         entityBadges: {
//           imageBased: {},
//           textBased: {},
//           textExtendedBadges: {},
//         },
//       },
//       differentiatedUi: {
//         displayType: "ADS_UI_DISPLAY_TYPE_ENUM_DEFAULT",
//         differentiatedUiMediaDetails: {
//           lottie: {},
//           video: {},
//         },
//       },
//       reviewsSummary: {},
//       displayType: "RESTAURANT_DISPLAY_TYPE_DEFAULT",
//       restaurantOfferPresentationInfo: {},
//       externalRatings: {
//         aggregatedRating: {
//           rating: "--",
//         },
//       },
//       ratingsDisplayPreference: "RATINGS_DISPLAY_PREFERENCE_SHOW_SWIGGY",
//     },
//     analytics: {
//       context: "seo-data-4e327c63-b967-4e28-bcdb-8f1d38fa05cd",
//     },
//     cta: {
//       link: "https://www.swiggy.com/city/chhindwara/the-fusion-lounge-triloki-nagar-railway-station-rest658210",
//       type: "WEBLINK",
//     },
//   },
//   {
//     info: {
//       id: "150591",
//       name: "Satkar Restaurant",
//       cloudinaryImageId: "rvxp5xbniat84r6efku2",
//       locality: "Sinchai Colony",
//       areaName: "Satkar Chowk",
//       costForTwo: "₹250 for two",
//       cuisines: [
//         "North Indian",
//         "South Indian",
//         "Indian",
//         "Salads",
//         "Desserts",
//       ],
//       avgRating: 4.4,
//       veg: true,
//       parentId: "21553",
//       avgRatingString: "4.4",
//       totalRatingsString: "2.9K+",
//       sla: {
//         deliveryTime: 44,
//         lastMileTravel: 13.4,
//         serviceability: "SERVICEABLE",
//         slaString: "40-45 mins",
//         lastMileTravelString: "13.4 km",
//         iconType: "ICON_TYPE_EMPTY",
//       },
//       availability: {
//         nextCloseTime: "2025-06-12 22:45:00",
//         opened: true,
//       },
//       badges: {
//         imageBadges: [
//           {
//             imageId: "Rxawards/_CATEGORY-North%20Indian.png",
//             description: "Delivery!",
//           },
//           {
//             imageId:
//               "Ratnesh_Badges/Rx_Awards_2025/_Milestone%20Restaurants.png",
//             description: "Delivery!",
//           },
//         ],
//       },
//       isOpen: true,
//       aggregatedDiscountInfoV2: {},
//       type: "F",
//       badgesV2: {
//         entityBadges: {
//           imageBased: {
//             badgeObject: [
//               {
//                 attributes: {
//                   description: "Delivery!",
//                   imageId: "Rxawards/_CATEGORY-North%20Indian.png",
//                 },
//               },
//               {
//                 attributes: {
//                   description: "Delivery!",
//                   imageId:
//                     "Ratnesh_Badges/Rx_Awards_2025/_Milestone%20Restaurants.png",
//                 },
//               },
//             ],
//           },
//           textBased: {},
//           textExtendedBadges: {},
//         },
//       },
//       differentiatedUi: {
//         displayType: "ADS_UI_DISPLAY_TYPE_ENUM_DEFAULT",
//         differentiatedUiMediaDetails: {
//           lottie: {},
//           video: {},
//         },
//       },
//       reviewsSummary: {},
//       displayType: "RESTAURANT_DISPLAY_TYPE_DEFAULT",
//       restaurantOfferPresentationInfo: {},
//       externalRatings: {
//         aggregatedRating: {
//           rating: "--",
//         },
//       },
//       ratingsDisplayPreference: "RATINGS_DISPLAY_PREFERENCE_SHOW_SWIGGY",
//     },
//     analytics: {
//       context: "seo-data-4e327c63-b967-4e28-bcdb-8f1d38fa05cd",
//     },
//     cta: {
//       link: "https://www.swiggy.com/city/chhindwara/satkar-restaurant-sinchai-colony-satkar-chowk-rest150591",
//       type: "WEBLINK",
//     },
//   },
// ];

// {
//                         id: "123456",
//                         name: "Pizza Paradise",
//                         "cloudinaryImageId": "RX_THUMBNAIL/IMAGES/VENDOR/2025/6/17/6def0f0f-9e6c-45c0-b5e6-05af750f27b5_795906.JPG",
//                         "locality": "MG Road",
//                         "areaName": "Central District",
//                         "costForTwo": "₹400 for two",
//                         "cuisines": [
//                           "Pizza",
//                           "Italian",
//                           "Fast Food"
//                         ],
//                         "avgRating": 4.3,
//                         "avgRatingString": "4.3",
//                         "totalRatingsString": "10K+ ratings",
//                         "veg": false,
//                         "sla": {
//                           "deliveryTime": 30,
//                           "lastMileTravel": 3.5,
//                           "slaString": "30 mins"
//                         },
//                         "aggregatedDiscountInfoV3": {
//                           "header": "50% OFF",
//                           "subHeader": "UPTO ₹100"
//                         }
//                       }

const Header = () => {
  return (
    <header className="header">
      <div className="logo-container">
        <img
          src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFrwlx1tQZlR4R7tGELo9g6GAgYOTYHhW5Rw&s"
          alt="Logo"
        />
      </div>

      <nav className="nav-container">
        <ul className="nav-list">
          <li>Home</li>
          <li>About Us</li>
          <li>Contact Us</li>
          <li className="cart">Cart</li>
        </ul>
      </nav>
    </header>
  );
};

const FoodCard = (props) => {
  const { resData } = props;
  const { name, cuisines, avgRating } = resData?.info;
  return (
    <div className="food-card">
      <img
        src={
          "https://media-assets.swiggy.com/swiggy/image/upload/v1695133679/badges/" +
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

const Body = () => {
  return (
    <div className="rest-container">
      {resObj.map((res) => (
        <FoodCard key={res.info.id} resData={res} />
      ))}
    </div>
  );
};

const Footer = () => {
  return (
    <footer className="footer">
      <div className="footer-section logo-section">
        <img
          src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFrwlx1tQZlR4R7tGELo9g6GAgYOTYHhW5Rw&s"
          alt="Logo"
        />
        <p>Good food, good mood 🍽️</p>
      </div>

      <div className="footer-section">
        <h4>Quick Links</h4>
        <ul className="footer-nav">
          <li>Home</li>
          <li>About Us</li>
          <li>Contact Us</li>
          <li>Cart</li>
        </ul>
      </div>

      <div className="footer-section">
        <h4>Location</h4>
        <p>Anand, Gujarat</p>
      </div>
    </footer>
  );
};

const AppLayout = () => {
  return (
    <div>
      <Header />
      <Body />
      <Footer />
    </div>
  );
};

const root = ReactDOM.createRoot(document.getElementById("root"));
// root.render(heading);
root.render(<AppLayout />);
