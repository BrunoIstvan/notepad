package br.com.bicmsystems.notepad.controller

import br.com.bicmsystems.notepad.model.Nota
import br.com.bicmsystems.notepad.service.NotaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/nota")
class NotaController {

    @Autowired
    lateinit var notaService: NotaService

    @GetMapping("/check")
    fun checkIsOnline(): String {
        return "OK"
    }

    @PostMapping
    fun salva(@RequestBody nota: Nota ) : Nota{
        return notaService.salva(nota)
    }

    @GetMapping("/{id}")
    fun obtemPorId(@PathVariable("id") id: String) : Optional<Nota> {
        return notaService.buscaPorId(id)
    }

    @GetMapping
    fun lista() : List<Nota> {
        return notaService.buscaTodos()
    }

    @PutMapping
    fun atualiza(@RequestBody nota: Nota ) : Nota {
        return notaService.salva(nota)
    }

    @DeleteMapping("/{id}")
    fun apagaPorId(@PathVariable("id") id: String) {
        notaService.apagaPorId(id)
    }

}
