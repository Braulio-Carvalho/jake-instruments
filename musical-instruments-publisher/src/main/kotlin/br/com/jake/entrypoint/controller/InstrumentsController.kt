package br.com.jake.entrypoint.controller

import br.com.jake.infrastructure.model.InstrumentEvent
import br.com.jake.infrastructure.service.InstrumentEventService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post


@Controller("/message")
class InstrumentsController(private val instrumentsService: InstrumentEventService) {

    @Post
    fun crete(@Body instrument: InstrumentEvent): HttpResponse<Any> {
        return HttpResponse.created(instrumentsService.create(instrument))
    }


}