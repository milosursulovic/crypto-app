package com.example.cryptoapp.common

sealed class Resource<T>(val data: T? = null, val message: T? = null) {
    class Success<T>(data: T): Resource<T>(data)
    class Error<T>(message: T, data: T? = null): Resource<T>(data, message)
    class Loading<T>(data: T? = null): Resource<T>(data)
}
