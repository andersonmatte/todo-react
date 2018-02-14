@_exported import Vapor

extension Droplet {
    public func setup() throws {
        try setupRoutes()
        setupControllers()
    }
    
    private func setupControllers() {
        _ = TodoController(drop: self)
    }
}
