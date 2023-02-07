package com.example.vinylapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vinylapp.databinding.RecyclerViewVinylBinding
import kotlinx.android.synthetic.main.recycler_view_vinyl.*

class RecyclerViewFragment : Fragment() {

    private var _binding: RecyclerViewVinylBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        _binding = RecyclerViewVinylBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        recycler_vinyl.adapter = VinylAdapter(setData.setVinyl())
        recycler_vinyl.layoutManager = LinearLayoutManager(context)

    }



    }









