# todo-react
App de TodoList com React

# Instalando dependencias 

Na pasta raiz execute `npm i`

# Frontend
- Em desenvolvimento

# Backend

:heavy_exclamation_mark: É necessário estar com o serviço de **mongod** ativo :heavy_exclamation_mark:

## Levantando servidor backend

Por padrão o servidor backend roda na porta **3003** para alterar edite o arquivo: 

_/Users/michel.teixeira/Sites/todo-react/backend/src/config/server.js_

## servidor dsv - nodemon
`cd backend/ && npm run dev`

## servidor produção - pm2 => [PM2](http://pm2.keymetrics.io)
`cd backend/ && npm run production`

- Status do serviço:

`./node_modules/.bin/pm2 status`

- Monitorando serviço:

`./node_modules/.bin/pm2 monit`
 
 * Control+C sai

- Parando serviço:

`/node_modules/.bin/pm2 stop todo-react`


# Testes API com postman

Naa pasta postman-tests exite um arquivo **todo-react.postman_collection.json** que pode ser importado e usado para testes.
