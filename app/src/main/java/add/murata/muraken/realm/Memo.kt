package add.murata.muraken.realm

import io.realm.RealmObject

open class Memo (
    open var title: String = "",
    open var content: String = ""
): RealmObject()
