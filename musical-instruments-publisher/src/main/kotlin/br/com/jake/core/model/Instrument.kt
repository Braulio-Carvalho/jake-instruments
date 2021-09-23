package br.com.jake.core.model;

import java.math.BigDecimal
import java.util.*

data class Instrument(

    val id: UUID? = UUID.randomUUID(),
    val name: String,
    val price: BigDecimal
)

