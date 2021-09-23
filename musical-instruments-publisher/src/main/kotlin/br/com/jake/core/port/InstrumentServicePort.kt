package br.com.jake.core.port

import br.com.jake.core.model.Instrument
import java.util.*

interface InstrumentServicePort {

    fun create(instrument: Instrument)

    fun update(instrument: Pair<UUID, Instrument>)

    fun delete(id: UUID)

}