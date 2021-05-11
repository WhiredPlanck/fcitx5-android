package io.wp.fcitx5.settings.fragments

import android.os.Bundle
import android.view.Menu
import androidx.preference.PreferenceFragmentCompat
import io.wp.fcitx5.R

class LayoutPickerFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.prefs_layout_picker, rootKey)
        setHasOptionsMenu(true)
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        menu.setGroupVisible(R.id.settings__menu_group_1, false)
        super.onPrepareOptionsMenu(menu)
    }
}