package juan.com.youtubeapi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.youtube.player.YouTubeStandalonePlayer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val API_KEY = "API_KEY_HERE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        reproducir.setOnClickListener(View.OnClickListener {
            //val intent=YouTubeStandalonePlayer.createVideoIntent(this,API_KEY,"GonKGBCt96o")
            //startActivity(intent)
            val intent=YouTubeStandalonePlayer.createPlaylistIntent(this,API_KEY,"PLTxC2Mcr6QrcgfRNGQjcZ1VLUD-LFahZ3")
            startActivity(intent)


        })
    }
}
