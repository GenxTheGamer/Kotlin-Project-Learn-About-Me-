package com.ghost.aboutme


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat.getSystemService
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.ghost.aboutme.databinding.ActivityMainBinding
import com.ghost.aboutme.databinding.FragmentAboutBinding
import com.ghost.aboutme.databinding.FragmentFragStartBinding

/**
 * A simple [Fragment] subclass.
 */
class AboutFrag : Fragment() {
    lateinit var binding : FragmentAboutBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_about,container,false)
        binding.done.setOnClickListener { addNick(it,binding.nicknameText,binding.nickText) }
        binding.nickText.setOnClickListener { updateNick(it,binding.nicknameText,binding.done) }
        return binding.root
    }
    private fun addNick(but: View, editext: EditText, nicktext: TextView){
        nicktext.text = editext.text
        editext.visibility = View.GONE
        but.visibility = View.GONE
        nicktext.visibility = View.VISIBLE

    }

    private fun updateNick(nicktext: View,editext: EditText,but: Button){
        editext.visibility = View.VISIBLE
        but.visibility = View.VISIBLE
        nicktext.visibility = View.GONE

        editext.requestFocus()
    }

}
