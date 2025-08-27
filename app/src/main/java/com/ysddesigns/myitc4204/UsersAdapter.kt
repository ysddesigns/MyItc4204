package com.ysddesigns.myitc4204

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import android.widget.ImageView
import android.widget.TextView
import com.ysddesigns.myitc4204.R

class UsersAdapter(private val users: List<User>) :
    RecyclerView.Adapter<UsersAdapter.UserViewHolder>() {

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profilePic: ImageView = itemView.findViewById(R.id.profile_pic)
        val usernameText: TextView = itemView.findViewById(R.id.username)
        val editButton: MaterialButton = itemView.findViewById(R.id.edit_profile_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.user_item, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = users[position]
        holder.usernameText.text = user.username
        holder.profilePic.setImageResource(user.profilePicResId) // Or load from URL if needed
        holder.editButton.setOnClickListener {
            // Handle edit profile click, e.g., navigate to edit screen for this user
        }
    }

    override fun getItemCount(): Int = users.size
}