const BASE_URL =
"http://localhost:8080/weather/forecast";

function getIcon(condition){

    condition = condition.toLowerCase();

    if(condition.includes("cloud"))
        return "icons/cloudy.svg";

    if(condition.includes("rain"))
        return "icons/rainy.svg";

    if(condition.includes("storm"))
        return "icons/storm.svg";

    return "icons/sunny.svg";
}

async function getWeather(){

    const city =
        document.getElementById("city").value;

    const days =
        document.getElementById("days").value;

    if(!city || !days){
        alert("Enter city and days");
        return;
    }

    const url =
`${BASE_URL}?city=${city}&days=${days}`;

    try{

        const response =
            await fetch(url);

        const data =
            await response.json();

        document
        .getElementById("location")
        .innerHTML =
        `${data.weatherResponse.city},
        ${data.weatherResponse.region},
        ${data.weatherResponse.country}`;

        document
        .getElementById("condition")
        .innerHTML =
        data.weatherResponse.condition;

        document
        .getElementById("temperature")
        .innerHTML =
        data.weatherResponse.temperature;

        const icon =
        getIcon(
        data.weatherResponse.condition);

        document
        .getElementById("weatherIcon")
        .src = icon;

        const container =
        document
        .getElementById(
        "forecastContainer");

        container.innerHTML = "";

        data.dayTemp.forEach(day => {

            container.innerHTML += `
            <div class="forecast-card">

                <h3>${day.date}</h3>

                <img src="${icon}">

                <div class="weather-details">

                    <p>
                    Average:
                    ${day.avgTemp}°C
                    </p>

                    <p>
                    Maximum:
                    ${day.maxTemp}°C
                    </p>

                    <p>
                    Minimum:
                    ${day.minTemp}°C
                    </p>

                </div>

            </div>
            `;
        });

    }catch(error){

        alert("Unable to fetch weather");
        console.log(error);
    }
}

getWeather();