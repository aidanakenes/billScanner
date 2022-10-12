package com.example.scanner.ui.documents.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.scanner.R
import com.example.scanner.entity.Document
import kotlinx.android.synthetic.main.item_document.view.*
import java.text.DateFormat
import java.util.*

class DocumentHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bind(data: Document) {
        itemView.iv_preview.setImageResource(R.drawable.ic_launcher_background)
        itemView.tv_name.text = data.id
        itemView.tv_created_at.text = DateFormat.getDateInstance().format(Date(data.createdAt))
    }
}