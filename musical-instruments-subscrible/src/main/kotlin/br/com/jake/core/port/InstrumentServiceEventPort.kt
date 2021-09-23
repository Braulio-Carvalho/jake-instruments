package br.com.jake.core.port

import br.com.jake.infrastructure.InstrumentEvent
import java.util.*

interface InstrumentServiceEventPort {

    fun create(instrumentEvent: InstrumentEvent)

    fun update(instrumentEvent: Pair<UUID, InstrumentEvent>)

    fun delete(id: UUID)

}