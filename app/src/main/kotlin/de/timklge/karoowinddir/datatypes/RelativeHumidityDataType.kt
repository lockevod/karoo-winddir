package de.timklge.karoowinddir.datatypes

import android.content.Context
import de.timklge.karoowinddir.OpenMeteoCurrentWeatherResponse

class RelativeHumidityDataType(context: Context) : WeatherDataType(context, "relativeHumidity"){
    override fun getValue(data: OpenMeteoCurrentWeatherResponse): Double {
        return data.current.relativeHumidity.toDouble()
    }
}