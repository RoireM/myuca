package com.example.myuca

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myuca.databinding.FragmentCoordinadorBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class coordinador : Fragment() {
    private lateinit var fbinding: FragmentCoordinadorBinding

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        fbinding = FragmentCoordinadorBinding.inflate(layoutInflater)
        get()
        return fbinding.root
    }

    private fun get() {
        TODO("Not yet implemented")
    }


    fun get(ServiceGenerator: Any) {


        fbinding.btnMostrar.setOnClickListener {
            val serviceGenerator = ServiceGenerator.buildService(ApiService::class.java)
            val call = serviceGenerator.getPosts()
            val recyclerView = fbinding.myReciclerView


            call.enqueue(object : Callback<MutableList<PostModel>> {
                override fun onResponse(
                    call: Call<MutableList<PostModel>>,
                    response: Response<MutableList<PostModel>>,
                ) {
                    if (response.isSuccessful) {
                        recyclerView.apply {
                            layoutManager = LinearLayoutManager(requireContext())
                            adapter = PostAdapter(response.body()!!)
                        }
                    }
                }

                override fun onFailure(call: Call<MutableList<PostModel>>, t: Throwable) {
                    t.printStackTrace()
                    Log.e("Failed", t.message.toString())
                }

            })

        }

    }

    private fun PostAdapter(body: MutableList<PostModel>): RecyclerView.Adapter<RecyclerView.ViewHolder>? {
        TODO("Not yet implemented")
    }


    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            coordinador().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

private fun Any.enqueue(callback: Callback<MutableList<PostModel>>) {
    TODO("Not yet implemented")
}

private fun Any.getPosts(): Any {
    TODO("Not yet implemented")
}

private fun Any.buildService(java: Class<ApiService>): Any {
    TODO("Not yet implemented")
}
