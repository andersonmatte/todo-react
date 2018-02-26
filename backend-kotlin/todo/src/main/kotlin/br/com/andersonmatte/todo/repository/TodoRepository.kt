package br.com.andersonmatte.todo.repository

import br.com.andersonmatte.todo.entidade.Todo
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 * @author Anderson Matte 
 * 
 * Interface Cliente.
 * 
 */
@RepositoryRestResource(collectionResourceRel = "todos", path = "todos")
public interface TodoRepository : MongoRepository <Todo, String> 
