package br.com.jake.core.port

import br.com.jake.infrastructure.model.InstrumentEvent
import java.util.*

interface InstrumentEventServicePort {

    fun create(instrumentEvent: InstrumentEvent)

    fun update(instrumentEvent: Pair<UUID, InstrumentEvent>)

    fun delete(id: UUID)

}