package com.example.vinylapp

import android.os.Parcel
import android.os.Parcelable

data class VinylData(
    val epName: String?,
    val artistName: String?,
    val epCode: String?,
    val epYear: String?,
    val overview: String?

) : Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(epName)
        parcel.writeString(artistName)
        parcel.writeString(epCode)
        parcel.writeString(epYear)
        parcel.writeString(overview)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<VinylData> {
        override fun createFromParcel(parcel: Parcel): VinylData {
            return VinylData(parcel)
        }

        override fun newArray(size: Int): Array<VinylData?> {
            return arrayOfNulls(size)
        }
    }

}
