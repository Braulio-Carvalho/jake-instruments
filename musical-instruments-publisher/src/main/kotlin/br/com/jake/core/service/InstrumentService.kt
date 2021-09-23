package br.com.jake.core.service;

import br.com.jake.core.mapper.InstrumentConverter
import br.com.jake.core.model.Instrument
import br.com.jake.core.port.InstrumentEventServicePort
import br.com.jake.core.port.InstrumentServicePort
import jakarta.inject.Singleton
import java.util.*


@Singleton
class InstrumentService(val instrumentEventServicePort: InstrumentEventServicePort) : InstrumentServicePort {

    override fun create(instrument: Instrument) {
     instrumentEventServicePort.create(InstrumentConverter.toInstrumentEvent(instrument))
    }

    override fun update(instrument: Pair<UUID, Instrument>) {
     instrumentEventServicePort.update(InstrumentConverter.toMapperProductEvent(Pair(instrument.first, instrument.second)))
    }

    override fun delete(id: UUID) {
       instrumentEventServicePort.delete(id)
    }
}
