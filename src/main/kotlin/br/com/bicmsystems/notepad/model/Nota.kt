package br.com.bicmsystems.notepad.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "Notas")
data class Nota (
        @Id var id: String?,
        var titulo: String = "",
        var descricao: String = "",
        var data: String = ""
) {
}