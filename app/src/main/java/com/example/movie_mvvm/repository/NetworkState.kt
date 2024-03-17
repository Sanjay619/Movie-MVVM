package com.example.movie_mvvm.repository

import androidx.lifecycle.ViewModelProvider

enum class Status {
    RUNNING, SUCCESS, FAILED
}

class NetworkState (val status : Status, val msg : String){

    companion object{
        val LOADED : NetworkState = NetworkState(Status.SUCCESS , "Success")
        val LOADING: NetworkState = NetworkState(Status.RUNNING , "In progress")
        val ERROR : NetworkState = NetworkState(Status.FAILED , "Something went wrong.")
    }
}