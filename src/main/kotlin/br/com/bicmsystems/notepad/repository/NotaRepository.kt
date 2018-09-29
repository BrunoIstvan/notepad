package br.com.bicmsystems.notepad.repository

import br.com.bicmsystems.notepad.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface NotaRepository : MongoRepository<Nota, String> {



}