package ca.nick.jitpackfun

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ca.nick.core.ThingDoer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ThingDoer.doTheThing()
    }
}
