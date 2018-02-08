import { cobineReducers, combineReducers } from 'redux'

const rootReducer = combineReducers({
    todo: () => ({
        description: 'ler livro',
        list: [{
            _id: 1,
            description: 'Pagar Conta',
            done: false
        },{
            _id: 2,
            description: 'Comprar Doritos',
            done: false
        }]
    })
})

export default rootReducer