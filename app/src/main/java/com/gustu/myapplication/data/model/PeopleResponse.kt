package com.gustu.myapplication.data.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class PeopleResponse(

	@field:SerializedName("results")
	val results: List<ResultsItem>,

	@field:SerializedName("info")
	val info: Info? = null
)

data class Dob(

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("age")
	val age: Int? = null
) : Parcelable {
    constructor(parcel: Parcel) : this(
		parcel.readString(),
		parcel.readValue(Int::class.java.classLoader) as? Int
	) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(date)
        parcel.writeValue(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Dob> {
        override fun createFromParcel(parcel: Parcel): Dob {
            return Dob(parcel)
        }

        override fun newArray(size: Int): Array<Dob?> {
            return arrayOfNulls(size)
        }
    }
}

data class Timezone(

	@field:SerializedName("offset")
	val offset: String? = null,

	@field:SerializedName("description")
	val description: String? = null
) : Parcelable {
    constructor(parcel: Parcel) : this(
		parcel.readString(),
		parcel.readString()
	) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(offset)
        parcel.writeString(description)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Timezone> {
        override fun createFromParcel(parcel: Parcel): Timezone {
            return Timezone(parcel)
        }

        override fun newArray(size: Int): Array<Timezone?> {
            return arrayOfNulls(size)
        }
    }
}

data class Id(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("value")
	val value: Any? = null
) : Parcelable {
    constructor(parcel: Parcel) : this(
		parcel.readString(),
		TODO("value")
	) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Id> {
        override fun createFromParcel(parcel: Parcel): Id {
            return Id(parcel)
        }

        override fun newArray(size: Int): Array<Id?> {
            return arrayOfNulls(size)
        }
    }
}

data class Info(

	@field:SerializedName("seed")
	val seed: String? = null,

	@field:SerializedName("page")
	val page: Int? = null,

	@field:SerializedName("results")
	val results: Int? = null,

	@field:SerializedName("version")
	val version: String? = null
) : Parcelable {
    constructor(parcel: Parcel) : this(
		parcel.readString(),
		parcel.readValue(Int::class.java.classLoader) as? Int,
		parcel.readValue(Int::class.java.classLoader) as? Int,
		parcel.readString()
	) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(seed)
        parcel.writeValue(page)
        parcel.writeValue(results)
        parcel.writeString(version)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Info> {
        override fun createFromParcel(parcel: Parcel): Info {
            return Info(parcel)
        }

        override fun newArray(size: Int): Array<Info?> {
            return arrayOfNulls(size)
        }
    }
}

data class Picture(

	@field:SerializedName("thumbnail")
	val thumbnail: String? = null,

	@field:SerializedName("large")
	val large: String? = null,

	@field:SerializedName("medium")
	val medium: String? = null
) : Parcelable {
    constructor(parcel: Parcel) : this(
		parcel.readString(),
		parcel.readString(),
		parcel.readString()
	) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(thumbnail)
        parcel.writeString(large)
        parcel.writeString(medium)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Picture> {
        override fun createFromParcel(parcel: Parcel): Picture {
            return Picture(parcel)
        }

        override fun newArray(size: Int): Array<Picture?> {
            return arrayOfNulls(size)
        }
    }
}

data class Coordinates(

	@field:SerializedName("latitude")
	val latitude: String? = null,

	@field:SerializedName("longitude")
	val longitude: String? = null
) : Parcelable {
    constructor(parcel: Parcel) : this(
		parcel.readString(),
		parcel.readString()
	) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(latitude)
        parcel.writeString(longitude)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Coordinates> {
        override fun createFromParcel(parcel: Parcel): Coordinates {
            return Coordinates(parcel)
        }

        override fun newArray(size: Int): Array<Coordinates?> {
            return arrayOfNulls(size)
        }
    }
}

data class Registered(

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("age")
	val age: Int? = null
) : Parcelable {
    constructor(parcel: Parcel) : this(
		parcel.readString(),
		parcel.readValue(Int::class.java.classLoader) as? Int
	) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(date)
        parcel.writeValue(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Registered> {
        override fun createFromParcel(parcel: Parcel): Registered {
            return Registered(parcel)
        }

        override fun newArray(size: Int): Array<Registered?> {
            return arrayOfNulls(size)
        }
    }
}

@Suppress("UNREACHABLE_CODE")
data class ResultsItem(

	@field:SerializedName("nat")
	val nat: String? = null,

	@field:SerializedName("gender")
	val gender: String? = null,

	@field:SerializedName("phone")
	val phone: String? = null,

	@field:SerializedName("dob")
	val dob: Dob? = null,

	@field:SerializedName("name")
	val name: Name? = null,

	@field:SerializedName("registered")
	val registered: Registered? = null,

	@field:SerializedName("location")
	val location: Location? = null,

	@field:SerializedName("id")
	val id: Id? = null,

	@field:SerializedName("login")
	val login: Login? = null,

	@field:SerializedName("cell")
	val cell: String? = null,

	@field:SerializedName("email")
	val email: String? = null,

	@field:SerializedName("picture")
	val picture: Picture? = null
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readParcelable(Dob::class.java.classLoader),
        parcel.readParcelable(Name::class.java.classLoader),
        parcel.readParcelable(Registered::class.java.classLoader),
        parcel.readParcelable(Location::class.java.classLoader),
        parcel.readParcelable(Id::class.java.classLoader),
        parcel.readParcelable(Login::class.java.classLoader),
        parcel.readString(),
        parcel.readString(),
        parcel.readParcelable(Picture::class.java.classLoader)
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nat)
        parcel.writeString(gender)
        parcel.writeString(phone)
        parcel.writeParcelable(dob, flags)
        parcel.writeParcelable(name, flags)
        parcel.writeParcelable(registered, flags)
        parcel.writeParcelable(location, flags)
        parcel.writeParcelable(id, flags)
        parcel.writeParcelable(login, flags)
        parcel.writeString(cell)
        parcel.writeString(email)
        parcel.writeParcelable(picture, flags)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ResultsItem> {
        override fun createFromParcel(parcel: Parcel): ResultsItem {
            return ResultsItem(parcel)
        }

        override fun newArray(size: Int): Array<ResultsItem?> {
            return arrayOfNulls(size)
        }
    }
}

data class Name(

	@field:SerializedName("last")
	val last: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("first")
	val first: String? = null
) : Parcelable {
    constructor(parcel: Parcel) : this(
		parcel.readString(),
		parcel.readString(),
		parcel.readString()
	) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(last)
        parcel.writeString(title)
        parcel.writeString(first)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Name> {
        override fun createFromParcel(parcel: Parcel): Name {
            return Name(parcel)
        }

        override fun newArray(size: Int): Array<Name?> {
            return arrayOfNulls(size)
        }
    }
}

data class Login(

	@field:SerializedName("sha1")
	val sha1: String? = null,

	@field:SerializedName("password")
	val password: String? = null,

	@field:SerializedName("salt")
	val salt: String? = null,

	@field:SerializedName("sha256")
	val sha256: String? = null,

	@field:SerializedName("uuid")
	val uuid: String? = null,

	@field:SerializedName("username")
	val username: String? = null,

	@field:SerializedName("md5")
	val md5: String? = null
) : Parcelable {
    constructor(parcel: Parcel) : this(
		parcel.readString(),
		parcel.readString(),
		parcel.readString(),
		parcel.readString(),
		parcel.readString(),
		parcel.readString(),
		parcel.readString()
	) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(sha1)
        parcel.writeString(password)
        parcel.writeString(salt)
        parcel.writeString(sha256)
        parcel.writeString(uuid)
        parcel.writeString(username)
        parcel.writeString(md5)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Login> {
        override fun createFromParcel(parcel: Parcel): Login {
            return Login(parcel)
        }

        override fun newArray(size: Int): Array<Login?> {
            return arrayOfNulls(size)
        }
    }
}

data class Location(

	@field:SerializedName("city")
	val city: String? = null,

	@field:SerializedName("street")
	val street: String? = null,

	@field:SerializedName("timezone")
	val timezone: Timezone? = null,

	@field:SerializedName("postcode")
	val postcode: Int? = null,

	@field:SerializedName("coordinates")
	val coordinates: Coordinates? = null,

	@field:SerializedName("state")
	val state: String? = null
) : Parcelable {
    constructor(parcel: Parcel) : this(
		parcel.readString(),
		parcel.readString(),
		TODO("timezone"),
		parcel.readValue(Int::class.java.classLoader) as? Int,
		parcel.readParcelable(Coordinates::class.java.classLoader),
		parcel.readString()
	) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(city)
        parcel.writeString(street)
        parcel.writeValue(postcode)
        parcel.writeParcelable(coordinates, flags)
        parcel.writeString(state)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Location> {
        override fun createFromParcel(parcel: Parcel): Location {
            return Location(parcel)
        }

        override fun newArray(size: Int): Array<Location?> {
            return arrayOfNulls(size)
        }
    }
}
