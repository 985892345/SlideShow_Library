package com.ndhzs.slideshowdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ndhzs.slideshowdemo.R

/**
 * .....
 * @author 985892345
 * @email 2767465918@qq.com
 * @data 2021/5/30
 */
class FF2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fg_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

//        val slideShow = view.findViewById<SlideShow>(R.id.fg_2_slideShow)
//        val fragments = ArrayList<Fragment>()
//        fragments.add(FF21())
//        fragments.add(FF22())
//        slideShow
//            .setOffscreenPageLimit(1)
//            .setOpenNestedScroll(true)
//            .setFragmentAdapter(requireActivity(), fragments)

        super.onViewCreated(view, savedInstanceState)
    }
}