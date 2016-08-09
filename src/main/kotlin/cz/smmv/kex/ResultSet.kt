package cz.smmv.kex

import java.sql.ResultSet
import java.util.UUID

fun ResultSet.getUUID(key : String) : UUID? = if (getString(key) == null) null else UUID.fromString(getString(key))
