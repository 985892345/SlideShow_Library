package com.ndhzs.demo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ndhzs.demo.R

/**
 * .....
 * @author 985892345
 * @email 2767465918@qq.com
 * @data 2021/6/3
 */
class FF2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fg_1_2, container, false)
    }
}