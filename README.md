# todo-react

App de TodoList com React

<p align="center">
  <img width="400" height="189"src="https://cdn-images-1.medium.com/max/800/1*wjlfZatDlTnqfgYJ9iKnKQ.png">
</p>


# Objetivos 

- [x] Criação de backend / api para CRUD de API
- [x] Criiação de frontend
- [x] Refactory para redux
- [ ] Deploy do app no serviço da [Heroku](https://www.heroku.com)
- [x] Geração de Docker compose com todo o projeto para desenvolvimento
- [ ] Backend com Swift Vapor
- [ ] Backend com Kotlin - por [Anderson Matte](https://github.com/andersonmatte) 
- [ ] App com Swift (MVC, MVVM, VIPER)
- [ ] App com Kotlin
- [ ] App com React Native


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


# backend-swift

## Necessário ter o Vapor instalado em sua maquina

<p align="center">
  <img src="https://avatars1.githubusercontent.com/u/17364220?s=200&v=4">
</p>

###  [Instalando Vapor](https://docs.vapor.codes/2.0/getting-started/install-on-macos/)



## No Mac

Execute o seguinte comando: 

`cd backend-swift/ && vapor xcode`

Aguarde o terminal:

`Generating Xcode Project [Done]
Select the `Run` scheme to run.
Open Xcode project?
y/n> Y`

Altere seu target para Run e deixe o device em MyMac

Command + B e depois Command + R 

aguarde o retorno do xcode no console `Starting server on 0.0.0.0:3004`

Pronto seu servidor backend com o Swift e Vapor está pronto para uso.

# Frontend

## Sem Redux

- Sem docker

`cd frontend-sem-redux/ && npm run dev`

- Com docker apenas acesse: 

http://0.0.0.0:8484

## Com Redux

- Sem docker

`cd frontend-redux/ && npm run dev`

- Com docker apenas acesse: 

http://0.0.0.0:8585

# Testes API com postman

Naa pasta **_postman-tests_** exite um arquivo **_todo-react.postman_collection.json_** que pode ser importado e usado para testes.

# Usando o Docker

<p align="center">
  <img src="https://jamesradley.co.uk/blog/wp-content/uploads/2017/07/Whale-Logo332_5.png">
</p>

Parto do pressuposto que já existe em sua maquina o docker instalado
Caso não ... acesse o site e instale conforme seu ambiente: [Docker](https://store.docker.com/search?type=edition&offering=community)

Após clonar o projeto na sua maquina acesse a pasta 

`cd todo-react/`

`docker-compose up`

- Pode ser que em ambientes linux necessite da instalação do _docker_ compose e rodar como _sudo docker-compose up_

Aguarde a instalação das imagens e o docker iniciar as mesmas (a primeira vez demora mesmo pois é feito o download e pull das imagens)

Após receber no terminal a mensagem **webpack: Compiled successfully.** 

basta acessar o navegador no seguinte link: http://localhost:8383/#/todos

# Issues conhecidas

- Docker reclama da versão do arquivo docker-compose.yml:
 - Cerifique a versão do seu docker com `docker version` depois verifique neste link [Docker compose Docs](https://docs.docker.com/compose/compose-file/) a versão que seu docker suporte do compose. 
 Como estou em um Mac e com a ultima versão do Docker a versão ficou a 3 mesmo, mas em problemas que já vi de docker 17.12 em um ubuntu 16.04 LTS bastou alterar para '2.0' que o problema foi resolvido.

- Imagem do mongo não levanta:
 - Verifique se você possuí algum serviço mongo rodando na maquina na porta padrão, precisas parar o serviço ou alterar as portas no projeto.
 
 
 
 

