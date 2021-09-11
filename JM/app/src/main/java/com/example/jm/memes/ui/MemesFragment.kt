package com.example.jm.memes.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.jm.jokes.viewmodel.JokesViewModel
import com.example.jm.databinding.FragmentMemesBinding

class MemesFragment : Fragment() {

    lateinit var binding: FragmentMemesBinding
    val jokesViewModel: JokesViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMemesBinding.inflate(layoutInflater)
        return binding.root
    }

    //we need to add this, it means all the views has been created
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }

}