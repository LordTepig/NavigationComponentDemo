package com.bowen.navigationcomponentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.bowen.navigationcomponentdemo.databinding.FragmentSendMessageBinding


class SendMessageFragment : Fragment() {

    private var _binding: FragmentSendMessageBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSendMessageBinding.inflate(inflater, container, false)
        val rootView = binding.root
        binding.sendButton.setOnClickListener {
        rootView.findNavController()
            .navigate(R.id.action_sendMessageFragment_to_replyFragment)
        }
        return rootView
       }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}