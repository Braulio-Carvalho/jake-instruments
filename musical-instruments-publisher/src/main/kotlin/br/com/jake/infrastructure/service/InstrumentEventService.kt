package br.com.jake.infrastructure.service

import br.com.jake.core.mapper.InstrumentConverter
import br.com.jake.core.port.InstrumentEventServicePort
import br.com.jake.infrastructure.client.KafkaClient
import br.com.jake.infrastructure.model.InstrumentEvent
import jakarta.inject.Singleton
import org.apache.kafka.common.requests.DeleteAclsResponse.log
import java.util.*

@Singleton
class InstrumentEventService(private val kafkaClient: KafkaClient): InstrumentEventServicePort {

    override fun create(instrumentEvent: InstrumentEvent) {
       kafkaClient.create(instrument = instrumentEvent)
        log.info("SENDING: $instrumentEvent")
    }

    override fun update(instrumentEvent: Pair<UUID, InstrumentEvent>) {
        TODO("Not yet implemented")
    }

    override fun delete(id: UUID) {
        TODO("Not yet implemented")
    }
}