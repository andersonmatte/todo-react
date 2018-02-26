package br.com.andersonmatte.todo.entidade

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.Date

/**
 * @author Anderson Matte 
 * 
 * Classe que representa a TODO do BD.
 * 
 */
@Document(collection = "todos")
data class Todo(
		@Id
		var id: String? = null,
		var description: String? = null,
		var done: Boolean = false,
		var createdAt: Date? = null){
}