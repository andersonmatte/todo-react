const mongoose = require('mongoose')
mongoose.Promise = global.Promise


//Para Ambiente local
//module.exports = mongoose.connect('mongodb://localhost/todo')

//Para Docker
module.exports = mongoose.connect('mongodb://db/todo')