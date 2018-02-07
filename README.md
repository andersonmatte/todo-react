# todo-react
App de TodoList com React

# Instalando dependencias 

Na pasta raiz execute `npm i`

# Frontend
- Em desenvolvimento

# Backend

## Levantando servidor backend

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
