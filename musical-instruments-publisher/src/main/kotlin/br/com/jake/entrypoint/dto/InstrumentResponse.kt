package br.com.jake.entrypoint.dto

import java.math.BigDecimal
import java.util.*

data class InstrumentResponse(
    val id: UUID? = UUID.randomUUID(),
    val name: String,
    val price: BigDecimal
)
