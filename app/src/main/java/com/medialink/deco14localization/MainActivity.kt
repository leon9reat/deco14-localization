package com.medialink.deco14localization

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pokeCount = 3
        val hello = resources.getString(R.string.hello_world, "Bambang A", pokeCount, "Fery Mohi")
        tv_hello.text = hello

        val songCount = 5
        val pluralText = resources.getQuantityString(R.plurals.numberOfSongsAvailable, songCount, songCount)
        tv_plural.text = pluralText

        tv_xliff.text = resources.getString(R.string.app_homeurl)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_options, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_change_settings) {
            val intentSetting = Intent(Settings.ACTION_LOCALE_SETTINGS)
            startActivity(intentSetting)
        }
        return super.onOptionsItemSelected(item)
    }
}
