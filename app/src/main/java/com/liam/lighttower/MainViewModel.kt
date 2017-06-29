package com.liam.lighttower

import android.databinding.BaseObservable
import android.databinding.ObservableBoolean
import android.databinding.ObservableField

/**
 * MainActivity ViewModel.
 * Created by Liam on 2017/6/29.
 */
class MainViewModel : BaseObservable() {

    var switchText: ObservableField<String> = ObservableField()
    var isChecked: ObservableBoolean = ObservableBoolean()

    init {
        val callback = object : android.databinding.Observable.OnPropertyChangedCallback() {
            override fun onPropertyChanged(p0: android.databinding.Observable, p1: Int) {
//                switchText.set(isChecked.get() ? "on" : "off")
            }
        }
        isChecked.addOnPropertyChangedCallback(callback)
    }

}