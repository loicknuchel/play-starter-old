# Play 2 scala starter
_(currently in development)_

This project aims to include common tools and libs and best possible practices in a Play 2 / Scala project.

Tools versions : 

- Scala 2.10.2
- [Play framework 2.2.1](http://www.playframework.com/)
- [SecureSocial 2.1.2](http://securesocial.ws/)
- [Twitter Bootstrap 3.0.3](http://getbootstrap.com/)

## Getting started

1. Clone this repo
1. Find and rename ```conf/securesocial-sample.conf``` to ```conf/securesocial.conf```, then add your API private keys
1. Execute ```play run```
1. Go to [http://localhost:9000/](http://localhost:9000/)

## TODO

- configure SecureSocial to get custom login/logout/signup screens
- add simple CRUD with MongoDB or some SQL db
- integrate with elastic search
- add AngularJs and some front-end workflow (LESS, ...)
- add deployment instructions to heroku, cloudbees, http://playframework-cloud.com/ or amazon...
