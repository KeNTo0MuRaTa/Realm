package add.murata.muraken.realm

import android.app.Application
import android.os.Bundle
import io.realm.Realm
import io.realm.RealmConfiguration

class RealmMemoApplcation : Application() {
    override fun onCreate() {
        super.onCreate()

        Realm.init(this)
        val realmConfig = RealmConfiguration.Builder()
            .deleteRealmIfMigrationNeeded()
            .build()
        Realm.setDefaultConfiguration(realmConfig)
    }
}