package io.mochadwi.mobilenews.common

interface BaseView<T> {

    fun setPresenter(presenter: T)

    fun showToast(message: String)

    fun showProgress()

    fun hideProgress()
}