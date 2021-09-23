package br.com.jake.infrastructure.model

import java.math.BigDecimal
import java.util.*

data class InstrumentEvent(

    val id: UUID?,
    val name: String,
    val price: BigDecimal

)
