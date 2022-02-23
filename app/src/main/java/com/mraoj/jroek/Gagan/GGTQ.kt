package com.mraoj.jroek.Gagan

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mraoj.jroek.R
import kotlinx.android.synthetic.main.layout_ggtq.*

class GGTQ : AppCompatActivity() {
    lateinit var ueyq: Array<Int>
    var yy = 20
    override fun onCreate(upere: Bundle?) {
        super.onCreate(upere)
        window.addFlags(1024)
        setContentView(R.layout.layout_ggtq)
        ueyq = arrayOf(
            R.drawable.ic_slot_1,
            R.drawable.ic_slot_2,
            R.drawable.ic_slot_3,
            R.drawable.ic_slot_4,
            R.drawable.ic_slot_5,
            R.drawable.ic_slot_6,
        )
        batik_st.setOnClickListener {
            rypika()
        }

    }

    fun rypika() {
        if (yy <= 60) {
            var reactika = (0..5).random()
            img1.setImageResource(ueyq[reactika])
            img1.animate().rotationYBy(0f).setDuration(yy.toLong()).withEndAction() {
                reactika = (0..5).random()
                img1.setImageResource(ueyq[reactika])
                img1.animate().rotationYBy(0f).setDuration(yy.toLong()).withEndAction() {
                    reactika = (0..5).random()
                    img1.setImageResource(ueyq[reactika])
                    img1.animate().rotationYBy(0f).setDuration(yy.toLong()).withEndAction() {
                        reactika = (0..5).random()
                        img1.setImageResource(ueyq[reactika])
                        img1.tag = ueyq[reactika]
                        img1.animate().rotationYBy(0f).setDuration(yy.toLong()).withEndAction() {
                            yy += 20
                            rypika()
                        }

                    }

                }
            }
        } else if (yy in 80..140) {
            var reactika = (0..5).random()
            img2.setImageResource(ueyq[reactika])
            img2.animate().rotationYBy(0f).setDuration(yy.toLong()).withEndAction() {
                reactika = (0..5).random()
                img2.setImageResource(ueyq[reactika])
                img2.animate().rotationYBy(0f).setDuration(yy.toLong()).withEndAction() {
                    reactika = (0..5).random()
                    img2.setImageResource(ueyq[reactika])
                    img2.animate().rotationYBy(0f).setDuration(yy.toLong()).withEndAction() {
                        reactika = (0..5).random()
                        img2.setImageResource(ueyq[reactika])
                        img2.tag = ueyq[reactika]
                        img2.animate().rotationYBy(0f).setDuration(yy.toLong()).withEndAction() {
                            yy += 20
                            rypika()
                        }

                    }

                }
            }
        } else {
            if (yy in 160..220) {
                var reactika = (0..5).random()
                img3.setImageResource(ueyq[reactika])
                img3.animate().rotationYBy(0f).setDuration(yy.toLong()).withEndAction() {
                    reactika = (0..5).random()
                    img3.setImageResource(ueyq[reactika])
                    img3.animate().rotationYBy(0f).setDuration(yy.toLong()).withEndAction() {
                        reactika = (0..5).random()
                        img3.setImageResource(ueyq[reactika])
                        img3.animate().rotationYBy(0f).setDuration(yy.toLong()).withEndAction() {
                            reactika = (0..5).random()
                            img3.setImageResource(ueyq[reactika])
                            img3.tag = ueyq[reactika]
                            img3.animate().rotationYBy(0f).setDuration(yy.toLong())
                                .withEndAction() {
                                    yy += 20
                                    rypika()
                                }

                        }

                    }
                }
            } else {
                if (img1.tag.equals(img2.tag) && img1.tag.equals(img3.tag)) {
                    winn.visibility = ImageView.VISIBLE
                    Toast.makeText(this, "You Win", Toast.LENGTH_SHORT).show()
                    Handler(Looper.getMainLooper()).postDelayed({
                        recreate()
                    }, 2500)
                } else if (img1.tag != (img2.tag) && img1.tag != (img2.tag)) {
                    Toast.makeText(this, "You Lose", Toast.LENGTH_SHORT).show()
                    Handler(Looper.getMainLooper()).postDelayed({
                        recreate()
                    }, 2500)
                } else {
                    if (img1.tag.equals(img2.tag) && img1.tag != (img3.tag)) {
                        Toast.makeText(this, "Almost, try again please", Toast.LENGTH_SHORT).show()
                        Handler(Looper.getMainLooper()).postDelayed({
                            recreate()
                        }, 2500)
                    } else if (img1.tag.equals(img3.tag) && img1.tag != (img2.tag)) {
                        Toast.makeText(this, "Almost, try again please", Toast.LENGTH_SHORT).show()
                        Handler(Looper.getMainLooper()).postDelayed({
                            recreate()
                        }, 2500)
                    } else {
                        if (img3.tag.equals(img2.tag) && img3.tag != (img1.tag)) {
                            Toast.makeText(this, "Almost, try again please", Toast.LENGTH_SHORT)
                                .show()
                            Handler(Looper.getMainLooper()).postDelayed({
                                recreate()
                            }, 2500)
                        } else if (img3.tag.equals(img1.tag) && img3.tag != (img2.tag)) {

                        } else {
                            Toast.makeText(this, "You Lose", Toast.LENGTH_SHORT).show()
                            Handler(Looper.getMainLooper()).postDelayed({
                                recreate()
                            }, 2500)
                        }
                    }
                }

            }
        }
    }

}

