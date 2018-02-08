# todo-react

App de TodoList com React


# Objetivos 

- [x] Criação de backend / api para CRUD de API
- [x] Criiação de frontend
- [ ] Refactory para redux
- [ ] Deploy do app no serviço da [Heroku](https://www.heroku.com)
- [x] Geração de Docker compose com todo o projeto para desenvolvimento


# Instalando dependências pra desenvolvimento

Na pasta raiz execute o comando:

`npm i`

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

`./node_modules/.bin/pm2 stop todo-react`


# Frontend

## Sem Redux

`cd frontend-sem-redux/ && npm run dev`

http://0.0.0.0:8484

# Testes API com postman

Naa pasta **_postman-tests_** exite um arquivo **_todo-react.postman_collection.json_** que pode ser importado e usado para testes.
