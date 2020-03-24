package com.example.tuantx.kotlinmvp.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.tuantx.kotlinmvp.model.Post
import com.example.tuantx.kotlinmvp.R

class PostAdapter(var context: Context, var listPost: List<Post>) : RecyclerView.Adapter<PostViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listPost.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {

        holder.txtTitle.text = listPost[position].title
        holder.txtAuthor.text = listPost[position].id.toString()
        holder.txtContent.text = listPost[position].body
    }


}