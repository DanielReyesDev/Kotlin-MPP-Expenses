package com.skylabs.expenses


import com.skylabs.expenses.R
//import sample.R

import android.graphics.Bitmap
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.Main
import kotlin.coroutines.CoroutineContext
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar

class MainActivity: AppCompatActivity(), CoroutineScope {
    private lateinit var job: Job
    //private lateinit var api: PokeApi
    private val adapter = PokeListAdapter()

    override val coroutineContext: CoroutineContext
        get() = job + Main


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        adapter.onClick = {
            //loadPokemon(it.entry_number)
        }

        pokelist_rv.layoutManager = LinearLayoutManager(this)
        pokelist_rv.adapter = adapter
        pokelist_rv.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
    }

}