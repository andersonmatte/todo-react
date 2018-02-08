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

# Usando o Docker

Parto do pressuposto que já existe em sua maquina o docker instalado
Caso não ... acesse o site e instale conforme seu ambiente: [Docker](https://store.docker.com/search?type=edition&offering=community)

Após clonar o projeto na sua maquina acesse a pasta 

`cd todo-react/`

`docker-compose up`

## Pode ser que em ambientes linux necessite da instalação do _docker_ compose e rodar como _sudo docker-compose up_

Aguarde a instalação das imagens e o docker iniciar as mesmas (a primeira vez demora mesmo pois é feito o download e pull das imagens)

Após receber no terminal a mensagem **webpack: Compiled successfully.** 

basta acessar o navegador no seguinte link: http://localhost:8383/#/todos

