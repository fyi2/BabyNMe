package org.sherman.android.babynme

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

/**
 * Created by fyi2 on 2/13/18.
 */
class BabyNMeApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        Realm.init(this)
        val realmConfiguration:RealmConfiguration = RealmConfiguration.Builder()
                .name(Realm.DEFAULT_REALM_NAME)
                .schemaVersion(0)
                .deleteRealmIfMigrationNeeded()
                .build()
        Realm.setDefaultConfiguration(realmConfiguration)

    }
}
