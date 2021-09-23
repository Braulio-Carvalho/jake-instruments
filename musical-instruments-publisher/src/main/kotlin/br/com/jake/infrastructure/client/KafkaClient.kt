package br.com.jake.infrastructure.client

import br.com.jake.infrastructure.model.InstrumentEvent
import io.micronaut.configuration.kafka.annotation.KafkaClient
import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.Topic

@KafkaClient
interface KafkaClient {

    fun create(@Topic topic: String = "CREATE", @KafkaKey key: String? = null,  instrument: InstrumentEvent)

    @Topic("UPDATE")
    fun update()

    @Topic("DELETE")
    fun delete()
}