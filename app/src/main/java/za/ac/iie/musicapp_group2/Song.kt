package za.ac.iie.musicapp_group2

import android.util.Log

class Song {

    // adding variables for song object's attributes
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

    //function to favorite a song
    fun favorite(): Boolean {
        Log.v("Song", "$name favorited now")
        return true
    }


}