package com.magicalrice.showtimes.view.customview

import android.content.Context
import android.graphics.Typeface
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet

/**
 * Created by Adolph on 2018/1/3.
 */
class CustomTextView : AppCompatTextView {

    constructor(context: Context) : super(context){
        init(context)
    }
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context)
    }
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context)
    }

    private fun init(context: Context) {
        val assets = context.assets
        val font = Typeface.createFromAsset(assets,"fonts/Lobster-1.4.otf")
        setTypeface(font)
    }
}