package com.ndhzs.demo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ndhzs.demo.R
import com.ndhzs.demo.adapter.RecyclerAdapter
import com.ndhzs.slideshow.SlideShow

/**
 * .....
 * @author 985892345
 * @email 2767465918@qq.com
 * @data 2021/5/30
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fg_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val slideShow = view.findViewById<SlideShow>(R.id.fg_1_slideShow)
        val fragments = ArrayList<Fragment>()
        fragments.add(FF1())
        fragments.add(FF2())
        slideShow.setAdapter(fragments, requireActivity())

        super.onViewCreated(view, savedInstanceState)
    }
}