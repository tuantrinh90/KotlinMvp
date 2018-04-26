package com.example.tuantx.kotlinmvp.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.item_post.view.*

/**
 * Created by tuantx on 4/26/2018.
 */
class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val txtTitle = itemView.txtTitle
    val txtContent = itemView.txtContent
    val txtAuthor = itemView.txtAuthor
}