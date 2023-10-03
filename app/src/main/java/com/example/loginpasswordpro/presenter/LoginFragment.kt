package com.example.loginpasswordpro.presenter

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.loginpasswordpro.R
import com.example.loginpasswordpro.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    var binding: FragmentLoginBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btnSend?.setOnClickListener {
            val email = binding?.email?.text.toString()
            val password = binding?.password?.text.toString()
            sendEmailPassword(email, password)



        }
    }


     fun sendEmailPassword(text: String, text1: String): PresentModel =

         PresentModel(text, text1)


}