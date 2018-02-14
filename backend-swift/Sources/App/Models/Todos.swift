//
//  Todo.swift
//  App
//
//  Created by Michel Anderson Lutz Teixeira on 14/02/2018.
//

import Foundation
import Vapor

class Todos: Codable, JSONRepresentable {
    var description: String
    var createdAt: Date = Date()
    var done: Bool = false
    
    init?(request: Request) {
        guard let description = request.data["description"]?.string else {
            return nil
        }
        self.description = description
        self.createdAt = request.data["createdAt"]?.date ?? Date()
        self.done = request.data["done"]?.bool ?? false
    }
    
    func makeJSON() throws -> JSON {
        var json = JSON()
        try json.set("description", description)
        try json.set("createdAt", createdAt)
        try json.set("done", done)
        
        return json
    }
}
