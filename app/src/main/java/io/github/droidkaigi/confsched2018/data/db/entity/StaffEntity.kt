package io.github.droidkaigi.confsched2018.data.db.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "staff")
data class StaffEntity(
        @PrimaryKey var name: String,
        var avatarUrl: String,
        var htmlUrl: String
)
