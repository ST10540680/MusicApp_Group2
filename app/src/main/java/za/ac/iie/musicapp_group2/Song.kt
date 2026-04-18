package za.ac.iie.musicapp_group2

import android.util.Log

// primary constructor takes all the variables as parameters and declares them as properties
class Song(
    var name: String,
    var artist: String,
    var year: Int = 0,
    var duration: String = ""
) {

    // added secondary constructor for if user only know the name and artist, no other info is given
    // Note: With default values in primary constructor, this might be redundant but kept for compatibility
    constructor(songName: String, songArtist: String) : this(songName, songArtist, 0, "")

    //function to play a song
    fun play() {
        Log.v("Song", "$name playing now")
    }

    //function to pause a song
    fun pause() {
        Log.v("Song", "$name paused now")
    }

    //function to stop a song
    fun stop() {
        Log.v("Song", "$name stopped now")
    }

    //function to favorite a song
    fun favorite(): Boolean {
        Log.v("Song", "$name favorited now")
        return true
    }

    override fun toString(): String {
        return "$name - $artist ($year) [$duration]"
    }
}
