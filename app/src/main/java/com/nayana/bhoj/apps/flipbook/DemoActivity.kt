package com.nayana.bhoj.apps.flipbook

import android.graphics.Typeface
import android.os.Build
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.igalata.bubblepicker.BubblePickerListener
import com.igalata.bubblepicker.model.BubbleGradient
import com.igalata.bubblepicker.model.PickerItem
import kotlinx.android.synthetic.main.activity_demo.*
import java.util.*

/**
 * Created by irinagalata on 1/19/17.
 */
class DemoActivity : AppCompatActivity() {

    private val boldTypeface by lazy { Typeface.createFromAsset(assets, ROBOTO_BOLD) }
    private val mediumTypeface by lazy { Typeface.createFromAsset(assets, ROBOTO_MEDIUM) }
    private val regularTypeface by lazy { Typeface.createFromAsset(assets, ROBOTO_REGULAR) }

    companion object {
        private const val ROBOTO_BOLD = "roboto_bold.ttf"
        private const val ROBOTO_MEDIUM = "roboto_medium.ttf"
        private const val ROBOTO_REGULAR = "roboto_regular.ttf"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

        titleTextView.typeface = mediumTypeface
        subtitleTextView.typeface = boldTypeface
        hintTextView.typeface = regularTypeface
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            subtitleTextView.letterSpacing = 0.06f
            hintTextView.letterSpacing = 0.05f
        }

        val titles = resources.getStringArray(R.array.countries)
        val colors = resources.obtainTypedArray(R.array.colors)
        val images = resources.obtainTypedArray(R.array.images)

        picker.items = ArrayList()

        titles.forEachIndexed { i, country ->
            picker.items?.add(PickerItem(country,
                    gradient = BubbleGradient(colors.getColor(i, 0), colors.getColor(i, 0),
                            BubbleGradient.VERTICAL),
                    typeface = mediumTypeface,
                    textColor = ContextCompat.getColor(this, android.R.color.transparent),
                    backgroundImage = ContextCompat.getDrawable(this, images.getResourceId(i, 0)))

            )
        }

        colors.recycle()
        images.recycle()

        picker.bubbleSize = 7
        picker.listener = object : BubblePickerListener {
            override fun onBubbleSelected(item: PickerItem) = toast("${item.title} selected")


            override fun onBubbleDeselected(item: PickerItem) = toast("${item.title} deselected")
        }
        picker.maxSelectedCount = 1
        picker.centerImmediately = true


    }

    override fun onResume() {
        super.onResume()
        picker.onResume()
    }

    override fun onPause() {
        super.onPause()
        picker.onPause()
    }

    private fun toast(text: String) = Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

}