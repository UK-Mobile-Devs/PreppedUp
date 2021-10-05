package com.frezzcoding.androidinterview

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import kotlinx.android.synthetic.main.fragment_splashscreen_activity.*

class SplashscreenActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_splashscreen_activity)

        /*
        iv_note.alpha = 0f
        iv_note.animate().setDuration(1500).alpha(1f).withEndAction {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
         */

        motionLayout.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                val i = Intent(this@SplashscreenActivity, MainActivity::class.java)
                startActivity(i)
            }

            override fun onTransitionStarted(motionLayout: MotionLayout?, startId: Int, endId: Int) {}

            override fun onTransitionChange(motionLayout: MotionLayout?, startId: Int, endId: Int, progress: Float) {}

            override fun onTransitionTrigger(motionLayout: MotionLayout?, triggerId: Int, positive: Boolean, progress: Float) {}
        })
    }


    override fun onResume() {
        super.onResume()
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            hideSystemUIAndNavigation(this)
        }
    }

    private fun hideSystemUIAndNavigation(activity: Activity) {
        val decorView: View = activity.window.decorView
        WindowInsetsControllerCompat(window, decorView).let { controller ->
            controller.hide(WindowInsetsCompat.Type.systemBars())
            controller.hide(WindowInsetsCompat.Type.navigationBars())
        }
    }

}