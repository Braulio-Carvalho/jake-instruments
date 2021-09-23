package br.com.jake.core.mapper;

import br.com.jake.core.model.Instrument
import br.com.jake.entrypoint.dto.InstrumentResponse
import br.com.jake.infrastructure.model.InstrumentEvent
import java.util.*

class InstrumentConverter {

    companion object {

        fun toInstrumentEvent(instrument: Instrument) = InstrumentEvent(
            instrument.id,
            instrument.name,
            instrument.price
        )

        fun toMapperProductEvent(instrument: Pair<UUID, Instrument>) = Pair(
            instrument.first,
            toInstrumentEvent(instrument.second)
        )


    }
}
