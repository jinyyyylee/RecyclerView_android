package com.example.testproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.testproject.adapter.BasicAdapter
import com.example.testproject.adapter.GridAdapter
import com.example.testproject.databinding.ActivityMainBinding
import com.example.testproject.databinding.FragmentBasicBinding

class MainActivity : AppCompatActivity() {

    lateinit var basicadapter : BasicAdapter
    lateinit var gridadapter : GridAdapter
    lateinit var binding: ActivityMainBinding
    val basicdata = mutableListOf<BasicData>()
    val griddata = mutableListOf<GridData>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.bindingtest.text = "successfully!"
        supportFragmentManager.beginTransaction().replace(R.id.fragment_location,BasicFragment()).commit()
        setContentView(binding.root)

        initRecycler()
        initGridRecycler()

        val gridLayoutManager = GridLayoutManager(applicationContext,3)
        binding.gridRecycler.layoutManager = gridLayoutManager


        }

    private fun initRecycler(){
        basicadapter = BasicAdapter(this)
        binding.recyclerView.adapter = basicadapter

        basicdata.apply {
            add(BasicData(image = R.drawable.prof1,name = "jylee"))
            add(BasicData(image = R.drawable.prof2,name = "지녕"))
            add(BasicData(image = R.drawable.prof3,name = "진영"))
            add(BasicData(image = R.drawable.prof4,name = "JYL"))
            add(BasicData(image = R.drawable.prof5,name = "LJY"))
            add(BasicData(image = R.drawable.prof6,name = "진"))
            add(BasicData(image = R.drawable.prof7,name = "영"))
            add(BasicData(image = R.drawable.prof8,name = "이진영"))

            basicadapter.basicdata = basicdata
            basicadapter.notifyDataSetChanged()
        }
    }

    private fun initGridRecycler(){
        gridadapter = GridAdapter(this)
        binding.gridRecycler.adapter = gridadapter

        griddata.apply {
            add(GridData(grid_img = R.drawable.prof1))
            add(GridData(grid_img = R.drawable.prof2))
            add(GridData(grid_img = R.drawable.prof3))
            add(GridData(grid_img = R.drawable.prof4))
            add(GridData(grid_img = R.drawable.prof5))
            add(GridData(grid_img = R.drawable.prof6))
            add(GridData(grid_img = R.drawable.prof7))
            add(GridData(grid_img = R.drawable.prof8))


            gridadapter.gridData = griddata
            gridadapter.notifyDataSetChanged()

        }
    }
}