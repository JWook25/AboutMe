package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        findViewById<Button>(R.id.done_button).setOnClickListener{ addNickname(it)}
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun clickHandlerFunction(viewThatIsClicked : View)
    {

    }

    private fun addNickname(view: View)
    {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)

        nicknameTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE)
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
