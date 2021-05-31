package com.ariqandrean.myapplication190421.nav_bottom

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ariqandrean.myapplication190421.R
import com.ariqandrean.myapplication190421.adapter.CategoryAdapter
import com.ariqandrean.myapplication190421.api.ApiClient
import com.ariqandrean.myapplication190421.api.ApiInterface
import com.ariqandrean.myapplication190421.model.CategoryModel
import kotlinx.android.synthetic.main.fragment_dashboard.*
import retrofit2.Call
import retrofit2.Response

/**
 * A simple [Fragment] subclass.
 * Use the [Dashboard.newInstance] factory method to
 * create an instance of this fragment.
 */
class Dashboard : Fragment() {

    lateinit var context: Activity
    lateinit var rvCategory: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)

        rvCategory = view.findViewById(R.id.rv_Category)

        val catLayoutManager = LinearLayoutManager(activity)
        catLayoutManager.orientation = LinearLayoutManager.VERTICAL

//        rvCategory.adapter = CategoryAdapter(arrayCategory)
        rvCategory.layoutManager = catLayoutManager

        return view
    }

    val arrayCategory: ArrayList<CategoryModel>get(){
        val array = ArrayList<CategoryModel>()
        val category = CategoryModel()
        category.name = "RAM"

        var apiInterface: ApiInterface = ApiClient().getApiClient()!!.create(ApiInterface::class.java)
        apiInterface.getCategory().enqueue(object : retrofit2.Callback<ArrayList<CategoryModel>> {
            override fun onResponse(
                call: Call<ArrayList<CategoryModel>>,
                response: Response<ArrayList<CategoryModel>>
            ) {
                var catData = response?.body()!!
                if (catData.size > 0){
//                    rvCategory.adapter = CategoryAdapter(this@Dashboard, catData)
                }
            }

            override fun onFailure(call: Call<ArrayList<CategoryModel>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

        return  array
    }

    @SuppressLint("ResourceType")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        context = requireActivity()
//        view?.findViewById<ImageView>(R.id.imageView).setOnClickListener{
//            val intent = Intent(context, OrderRam::class.java)

//            startActivity(intent)
        }




}

