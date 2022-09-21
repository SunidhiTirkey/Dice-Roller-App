package com.example.diceroller

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
//Debugging
//private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
//Debugging
//    fun division() {
//        val numerator = 60
//        var denominator = 4
//        repeat(5) {
//            Log.v(TAG, "${numerator / denominator}")
//            denominator--
//        }
//    }

    //Debugging
//    fun logging() {
//        Log.v(TAG, "Hello, world!")

//    Replacing above line of code by this
//    Log.e(TAG, "ERROR: a serious error like an app crash")
//    Log.w(TAG, "WARN: warns about the potential for serious errors")
//    Log.i(TAG, "INFO: reporting technical information, such as an operation succeeding")
//    Log.d(TAG, "DEBUG: reporting technical information useful for debugging")
//    Log.v(TAG, "VERBOSE: more verbose than DEBUG logs")

//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Debugging
//        logging()
//        division()

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }

        // Do a dice roll when the app starts
        rollDice()
    }

    class Dice(private val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()
        }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Find the ImageView in the layout
        val diceImage: ImageView = findViewById(R.id.imageView)

        // Determine which drawable resource ID to use based on the dice roll
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)

        // Update the content description
        diceImage.contentDescription = diceRoll.toString()
    }
}

