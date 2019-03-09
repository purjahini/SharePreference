package com.bedev.sharepreference

import android.content.Context
import android.content.SharedPreferences

class SharePref(context: Context) {
    internal var pref: SharedPreferences
    internal var editor: SharedPreferences.Editor
    internal var private_mode = 0
    var nama: String?
        get() = pref.getString("nama", null)
        set(nama) {
            editor.putString("nama", nama)
            editor.commit()
        }

    init {
        pref = context.getSharedPreferences(PREV_NAME, private_mode)
        editor = pref.edit()
    }

    companion object {
        private val PREV_NAME = "Tutorial"
    }
}
