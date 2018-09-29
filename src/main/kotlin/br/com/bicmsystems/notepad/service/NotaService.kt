package br.com.bicmsystems.notepad.service

import br.com.bicmsystems.notepad.model.Nota
import br.com.bicmsystems.notepad.repository.NotaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class NotaService {

    @Autowired
    lateinit var notaRepository: NotaRepository

    fun salva(nota: Nota) : Nota {
        return notaRepository.save(nota)
    }

    fun buscaTodos() : List<Nota> {
        return notaRepository.findAll()
    }

    fun buscaPorId(id: String) : Optional<Nota> {
        return notaRepository.findById(id)
    }

    fun apagaPorId(id: String) {
        notaRepository.deleteById(id)
    }

    fun buscaPorTitulo(titulo: String) : List<Nota> {
        return notaRepository.findByTitulo(titulo)
    }

    fun buscaPorTituloContaining(titulo: String) : List<Nota> {
        return notaRepository.findByTituloContainingIgnoreCase(titulo)
    }

}