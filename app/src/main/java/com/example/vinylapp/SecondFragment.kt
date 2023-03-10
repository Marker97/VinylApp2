package com.example.vinylapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.vinylapp.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null


    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.showBtn.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_recyclerViewFragment)
        }

        binding.addBtn.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_addVinyl)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}