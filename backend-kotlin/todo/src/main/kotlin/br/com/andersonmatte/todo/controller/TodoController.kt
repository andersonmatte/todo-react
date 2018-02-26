package br.com.andersonmatte.todo.controller

import br.com.andersonmatte.todo.entidade.Todo
import br.com.andersonmatte.todo.repository.TodoRepository
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.io.FileInputStream
import java.util.Properties;

/**
 * @author Anderson Matte
 *
 * Classe Todo controller onde é implementado as regras de negócio do WebService.
 *
 */
@RestController
@RequestMapping("/todos")
class TodoController(val repository: TodoRepository) {
	
	val properties = br.com.andersonmatte.todo.carregaProperties()
	
	@GetMapping("/")
	fun recuperarTodos(): List<Todo> {
		val todos: List<Todo> = this.repository.findAll()
		return todos		
	}
	
	@PostMapping("/post")
	fun inserirTodo(@RequestBody todo: Todo): String {
		this.repository.save(todo)
		return this.properties.getProperty("inserirTodoSucesso")
	} 
	
	@PutMapping("/put/{id}")
	fun atualizarTodo(@PathVariable id: String, @RequestBody todo: Todo): String {		
		todo.id = id
		this.repository.save(todo)
		return this.properties.getProperty("atualizarTodoSucesso")							
	}
    
	@DeleteMapping("/delete/{id}")
	fun apagarTodo(@PathVariable id: String): String {
		this.repository.delete(id)
		return this.properties.getProperty("apagarTodoSucesso")
	}
	
}