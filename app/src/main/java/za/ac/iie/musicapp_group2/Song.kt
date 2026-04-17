package za.ac.iie.musicapp_group2

import android.util.Log

class Song {

    // properties
    var name: String = ""
    var artist: String = ""
    var year: Int = 0
    var duration: String =  ""

    fun play () {
        Log.v("Song", "$name playing now")
    }
}