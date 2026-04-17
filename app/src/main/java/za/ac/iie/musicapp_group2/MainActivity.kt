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

        //adding variables for song object's attributes
        val songDisplayId = findViewById<TextView>(R.id.songDisplayId)

        //calling the song class for a song object
        Song("Ordinary", "Alex Warren", "2026", "2,5")
        Song("So Easy", "Olivia Dean", "2023", "2,5")
        Song("Swim", "BTS", "2026", "3,5")

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}