package com.nangokuman.databindingcustomviewsampleapplication

import android.content.Context
import android.databinding.BindingAdapter
import android.databinding.DataBindingUtil
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import com.nangokuman.databindingcustomviewsampleapplication.databinding.SampleUserInfoViewBinding

/**
 * カスタムユーザ情報表示View
 */
class UserInfoView: LinearLayout {

    private val inflater = LayoutInflater.from(context)
    private var binding = DataBindingUtil.inflate<SampleUserInfoViewBinding>(inflater, R.layout.sample_user_info_view, this, true)

    constructor(context: Context): super(context)
    constructor(context: Context, attributeSet: AttributeSet): super(context, attributeSet)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int): super(context, attrs, defStyleAttr)

    override fun getRootView(): View {
        return binding.root
    }

//    companion object {
//        @BindingAdapter("android:user_data")
//        fun UserInfoView.setUser(user: User) {
//            this.setUser(user)
//        }
//    }

    fun setUser(user: User) {
        binding.user = user
        invalidate()
    }
}
