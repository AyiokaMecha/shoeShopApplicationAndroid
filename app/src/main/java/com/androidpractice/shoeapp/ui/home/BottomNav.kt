package com.androidpractice.shoeapp.ui.home

import com.androidpractice.shoeapp.R

enum class BottomNav(val route: String, val icon: Int, val title: String) {
    Home("home", R.drawable.ic_home, "Home"),
    Search("favorite", R.drawable.ic_heart, "Favorite"),
    Profile("profile", R.drawable.ic_profile, "Profile"),
    Favorites("cart", R.drawable.ic_shop, "Cart"),
    Settings("settings", R.drawable.ic_settings, "Settings")
}

interface Printable {
    fun printInfo()
}

enum class LogLevel: Printable {
    INFO {
        override fun printInfo() {
            println("INFORMATION LEVEL")
        }
    },
    WARNING {
        override fun printInfo() {
            println("WARNING")
        }
    }
}