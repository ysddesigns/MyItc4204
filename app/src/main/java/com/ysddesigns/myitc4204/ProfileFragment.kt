package com.ysddesigns.myitc4204

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ysddesigns.myitc4204.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Sample data - replace with your actual list of users
        val users = listOf(
            User("Yusuf Yusuf", R.drawable.yusuff),
            User("Yusuf Abdullah Ayomide", R.drawable.anonymous),
            User("Abel David Ndamopa", R.drawable.david),
            User("Adelopo Abdullah Adekunle", R.drawable.abdone),
            User("Adeagbo Yusuf Olaitan", R.drawable.yusuf)
        )

        val adapter = UsersAdapter(users)
        binding.usersRecyclerView.adapter = adapter
        binding.usersRecyclerView.layoutManager = LinearLayoutManager(context)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Prevent memory leaks
    }
}