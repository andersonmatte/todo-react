package br.com.andersonmatte.todo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import java.io.FileInputStream
import java.util.Properties

/**
 * @author Anderson Matte
 *
 * Classe principal que executa o serviço em Kotlin.
 *
 */
@SpringBootApplication
open class TodoApplication

fun main(args: Array<String>) {
	carregaProperties()
	SpringApplication.run(TodoApplication::class.java, *args)
}

public fun carregaProperties(): Properties {
	val props = Properties()
	val file: FileInputStream = FileInputStream("src/main/kotlin/br/com/andersonmatte/todo/mensagens/mensagens.properties")
	props.load(file)
	return props
}	