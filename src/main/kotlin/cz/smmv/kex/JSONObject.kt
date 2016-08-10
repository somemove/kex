package cz.smmv.kex

import org.json.JSONObject
import java.util.UUID

fun JSONObject.getUUID(key : String) : UUID? = if (has(key)) UUID.fromString(getString(key)) else null
