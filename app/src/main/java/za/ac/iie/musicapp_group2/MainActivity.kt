package za.ac.iie.musicapp_group2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Find the TextView to display songs
        val songDisplayId = findViewById<TextView>(R.id.songDisplayId)

        // Create song objects
        val song1 = Song("Ordinary", "Alex Warren", 2026, "2:30")
        val song2 = Song("So Easy", "Olivia Dean", 2023, "2:45")
        val song3 = Song("Swim", "BTS", 2026, "3:15")

        // Create a list of songs
        val songList = listOf(song1, song2, song3)

        // Build a string to display all songs
        val displayText = StringBuilder()
        for (song in songList) {
            displayText.append(song.toString()).append("\n\n")
        }

        // Set the text to the TextView
        songDisplayId.text = displayText.toString()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
