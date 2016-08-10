package cz.smmv.kex

import java.sql.PreparedStatement
import java.sql.Timestamp
import java.time.LocalDateTime
import java.util.UUID

fun PreparedStatement.setUUID(key: Int, uuid : UUID?) {
	setString(key, uuid?.toString())
}

fun PreparedStatement.setLocalDateTime(pos: Int, dt : LocalDateTime?) {
	dt?.let {
		setTimestamp(pos, Timestamp.valueOf(dt))
	}
}
