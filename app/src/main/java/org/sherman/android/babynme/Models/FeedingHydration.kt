package org.sherman.android.babynme.Models

import io.realm.RealmObject

/**
 * Created by fyi2 on 2/13/18.
 */
class FeedingHydration(
        var startTime: Long = 0,
        var duration:Long = 0,
        var water:Double= 0.0

): RealmObject() {
}