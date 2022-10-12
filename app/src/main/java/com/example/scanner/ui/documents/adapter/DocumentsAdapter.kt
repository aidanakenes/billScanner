package com.example.scanner.ui.documents.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.scanner.R
import com.example.scanner.entity.Document

class DocumentsAdapter: RecyclerView.Adapter<DocumentHolder>() {

    private var list: List<Document> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DocumentHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_document, parent, false)
        return DocumentHolder(itemView)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(
        holder: DocumentHolder,
        position: Int
    ) = holder.bind(list[position])

    fun updateList(newList: List<Document>) {
        this.list = newList
        notifyDataSetChanged()
    }

}