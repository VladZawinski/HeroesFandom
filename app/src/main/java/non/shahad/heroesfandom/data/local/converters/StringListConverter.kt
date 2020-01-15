package non.shahad.heroesfandom.data.local.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

open class StringListConverter{

    @TypeConverter
    fun fromString(value : String) : List<String>? {
        val listType = object : TypeToken<List<String>>(){}.type
        return Gson().fromJson<List<String>>(value, listType)
    }

    @TypeConverter
    fun fromList(value : List<String>) : String?{
        return Gson().toJson(value)
    }
}