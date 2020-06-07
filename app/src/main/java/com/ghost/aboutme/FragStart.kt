package com.ghost.aboutme


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.ghost.aboutme.databinding.FragmentFragStartBinding

/**
 * A simple [Fragment] subclass.
 */
class FragStart : Fragment() {
    lateinit var binding : FragmentFragStartBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_about,container,false)
        binding.proceed.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_fragStart_to_aboutFrag) }
        return binding.root
    }


}
