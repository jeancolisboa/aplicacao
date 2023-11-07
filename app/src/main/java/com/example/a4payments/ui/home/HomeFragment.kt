package com.example.a4payments.ui.home


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.a4payments.DigitvalorActivity
import com.example.a4payments.R
import com.example.a4payments.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val meuBotao = binding.root.findViewById<Button>(R.id.button)
        meuBotao.setOnClickListener {
            val intent = Intent(requireActivity(),DigitvalorActivity :: class.java)
            startActivity(intent)
        }

        return root
    }
}

