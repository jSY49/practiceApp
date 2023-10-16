package com.jaysdevapp.practiceapp

import android.app.PictureInPictureParams
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.Rational
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.jaysdevapp.practiceapp.databinding.ActivityPipBinding


@RequiresApi(Build.VERSION_CODES.O)
class PipActivity : AppCompatActivity() {

    private val binding by lazy { ActivityPipBinding.inflate(layoutInflater) }
    private val mPipBuilder = PictureInPictureParams.Builder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.startBtn.setOnClickListener {
            binding.videoView?.run {
                setOnCompletionListener { it.start() }
                val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.kangaroo_1080p_sample)
                setVideoURI(uri)
                start()
            }
        }
        binding.pipBtn.setOnClickListener {
            startPip()
        }

    }

    private fun startPip() {
        if(binding.videoView.isPlaying) {
            mPipBuilder.setAspectRatio(Rational(binding.videoView.width, binding.videoView.height))
            enterPictureInPictureMode(mPipBuilder.build())
        }
    }

    override fun onUserLeaveHint() {
        super.onUserLeaveHint()
        startPip()
    }
}