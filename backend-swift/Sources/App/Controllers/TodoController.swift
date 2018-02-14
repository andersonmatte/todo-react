//
//  TodoController.swift
//  App
//
//  Created by Michel Anderson Lutz Teixeira on 14/02/2018.
//

import Foundation
import Vapor
import MongoKitten

class TodoController {
    
    var drop: Droplet!
    var mongoDb: Database!
    
    init(drop: Droplet){
        self.drop = drop
        setupMongoDb()
        setupRoutes()
    }
    
    private func setupMongoDb() {
        self.mongoDb = try! Database("mongodb://0.0.0.0:27017/todo")
    }
    
    private func setupRoutes() {
        let result = self.mongoDb.server.isConnected ? "Backend Connected" : "Backend Not Connected"
        
        self.drop.get("/hello") { request in
           return result
        }
        
        self.drop.post("/todos") { request in
            if let todo = Todos(request: request){
                let document = try BSONEncoder().encode(todo)
                try self.mongoDb["todos"].insert(document)
                return try todo.makeJSON()
            }
            
            return JSON(["error": "Não foi possível criar a todo"])
        }
    }
}
