package za.ac.iie.musicapp_group2

import android.util.Log

// primary constructor takes all the variables as parameters
class Song (songName: String, songArtist: String, songYear: Int, songDuration: String){

    // adding variables for song object's attributes
    var name: String = ""
    var artist: String = ""
    var year: Int = 0
    var duration: String =  ""

    // added secondary constructor for if user only know the name and artist, no other info is given
    constructor(songName: String, songArtist: String) : this(songName, songArtist, 0, ""){}

    // initializing the variables/attributes for the song objects
    init {
        this.name = songName
        this.artist = songArtist
        this.year = songYear
        this.duration = songDuration
    }

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
}
