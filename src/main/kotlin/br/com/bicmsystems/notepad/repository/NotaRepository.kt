package br.com.bicmsystems.notepad.repository

import br.com.bicmsystems.notepad.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.stereotype.Repository

@Repository
interface NotaRepository : MongoRepository<Nota, String> {

    fun findByTitulo(titulo: String) : List<Nota>

    fun findByTituloContainingIgnoreCase(titulo: String) : List<Nota>

}