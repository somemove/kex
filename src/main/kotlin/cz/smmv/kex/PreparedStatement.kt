package cz.smmv.kex

import java.sql.PreparedStatement
import java.util.UUID

fun PreparedStatement.setUUID(key: Int, uuid : UUID) {
	setString(key, uuid.toString())
}
