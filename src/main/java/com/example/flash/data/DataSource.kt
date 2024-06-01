package com.example.flash.data

import com.example.flash.R

object DataSource {
    fun loadCategories(): List<Categories>{
        return listOf<Categories>(
            Categories(stringResourceId = R.string.fresh_fruits,imageResourceId = R.drawable.fruits),
            Categories(stringResourceId = R.string.bath_body, imageResourceId = R.drawable.bathbody),
            Categories(stringResourceId = R.string.beverages, imageResourceId = R.drawable.beverages),
            Categories(stringResourceId = R.string.bread_biscuits, imageResourceId = R.drawable.breadbiscuit),
            Categories(stringResourceId = R.string.cleaning_essentials, imageResourceId = R.drawable.cleaning),
            Categories(stringResourceId = R.string.kitchen_essentials, imageResourceId = R.drawable.kitchen),
            Categories(stringResourceId = R.string.munchies, imageResourceId = R.drawable.munchies),
            Categories(stringResourceId = R.string.package_food, imageResourceId = R.drawable.packagefood),
            Categories(stringResourceId = R.string.pet_food, imageResourceId = R.drawable.petfood),
            Categories(stringResourceId = R.string.stationary, imageResourceId = R.drawable.stationary),
            Categories(stringResourceId = R.string.sweet_tooth, imageResourceId = R.drawable.sweets),
            Categories(stringResourceId = R.string.vegetables, imageResourceId = R.drawable.vegetables)
            )
    }
}