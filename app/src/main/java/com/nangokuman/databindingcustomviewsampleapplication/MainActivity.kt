package com.nangokuman.databindingcustomviewsampleapplication

import android.databinding.ObservableField
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class User {
    val name: ObservableField<String> = ObservableField()
    val age: ObservableField<Int> = ObservableField()
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user = User()
        user.name.set("name hogehoge")
        user.age.set(30)
        user_info.setUser(user)
    }
}
