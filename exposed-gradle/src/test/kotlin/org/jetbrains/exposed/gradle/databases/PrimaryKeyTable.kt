package org.jetbrains.exposed.gradle.databases

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object SinglePrimaryKeyTable : Table("single_primary_key_table") {
    val c1: Column<Int> = integer("c1")
    val c2: Column<Int> = integer("c2")

    override val primaryKey: PrimaryKey = PrimaryKey(c1)
}

