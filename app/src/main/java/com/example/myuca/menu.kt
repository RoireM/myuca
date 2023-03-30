package com.example.myuca

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.myuca.databinding.FragmentMenuBinding
import com.google.android.material.internal.NavigationMenu


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class menu : Fragment() {
    private lateinit var fbinding: FragmentMenuBinding
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        fbinding = FragmentMenuBinding.inflate(layoutInflater)
        initialize()
        return fbinding.root
    }

    private fun initialize() {
        fbinding.btncoordinador.setOnClickListener {
            Navigation.findNavController(fbinding.root).navigate(R.id.coordinador)
        }
    }

    companion object {

        fun newInstance(param1: String, param2: String) =
            menu().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}