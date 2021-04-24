package id.rdev.notespenjualan.activity.login

import id.rdev.notespenjualan.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}