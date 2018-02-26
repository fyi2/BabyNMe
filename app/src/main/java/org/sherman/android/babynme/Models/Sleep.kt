package org.sherman.android.babynme.Models

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Created by fyi2 on 2/13/18.
 */
open class Sleep(
        var whoBaby:Boolean = true,
        var startTime:Long = 0,
        var duration:Long = 0

): RealmObject() {

}