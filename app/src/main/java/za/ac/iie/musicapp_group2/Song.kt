package za.ac.iie.musicapp_group2

import android.util.Log

class Song {

    // properties
    var name: String = ""
    var artist: String = ""
    var year: Int = 0
    var duration: String =  ""

    //function to play a song
    fun Play () {
        Log.v("Song", "$name playing now")
    }

    //function to pause a song
    fun Pause() {
        Log.v("Song", "$name paused now")
    }

    //function to stop a song
    fun Stop() {
        Log.v("Song", "$name stopped now")
    }


}