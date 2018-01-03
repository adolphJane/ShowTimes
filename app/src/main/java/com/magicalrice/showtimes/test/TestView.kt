package com.magicalrice.showtimes.test

import android.content.Context
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet

/**
 * Created by Adolph on 2018/1/3.
 */

class TestView : AppCompatTextView {
    constructor(context: Context) : super(context) {
        showText()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        showText()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        showText()
    }

    private fun showText() {

    }
}
