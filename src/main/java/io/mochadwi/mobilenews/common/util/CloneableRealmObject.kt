package io.mochadwi.mobilenews.common.util

/**
 * Created by mochadwi on 3/15/18.
 */
open interface CloneableRealmObject<T> {
    fun cloneRealmObject(): T
}