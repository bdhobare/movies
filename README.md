[![Build Status](https://travis-ci.com/bdhobare/movies.svg?token=fWDtLxfqsFps4n9z5XgB&branch=master)](https://travis-ci.com/bdhobare/movies)

# Description
This Spring boot project shows simple CRUD operations with a REST API and CI integration with Travis CI

It also shows Authentication using Spring Security

# Building

1. Install [Grails](http://grails.org/download.html).Grails is used to provide the `json-views` needed to render json with HAL

2. clone this repository and open it in IntelliJ

3. Open a terminal and make sure you `cd` to the project root

4. Run `grails run-app` and open [http://localhost:8080/](http://localhost:8080/)

# Authorization.
This uses Spring Security

1. POST: `/api/login`.The default credentials are `{"username": "user", "password": "pass"}`.The header `Accept: application/json`

2. You will get an authorization token from the above step. Pass it as a header in the following subsequent API calls
`Authorization: Bearer <Access_Token>`

# Create

1. POST: `/api/movies` Parameters `{
                                   	"name" :"Test Movie",
                                   	"dateCreated" : "12/12/2018",
                                   	"rating" : 3.5,
                                   	"isReleased" : false
                                   }`
# Update

1. PUT: `api/movies/1` Parameters `{
                                    	"name" :"Test Movie",
                                    	"dateCreated" : "12/12/2018",
                                    	"rating" : 3.5,
                                    	"isReleased" : false
                                    }`
                              
# READ

1. GET :`/api/movies/1`
2. To get all the movies: GET: `api/movies`

# DELETE

1. DELETE: `/api/movies/1`

# Testing 

All the unit tests are under *src/test*

The two tests check if login is working and that a movie can be saved with the correct entities or can't otherwise.

# CI and CD with Travis
The repository is integrated with Travis CI. The configuration file can be found at `.travis.yml`

Once a user commits to the master branch, Travis runs the automated tests and if they succeed it deploys it 
with the `deploy.sh` file.

The `deploy.sh` file simply pushes the code to the server.
On the server a git `post-receive` hook builds a war file and deploys it to Tomcat *webapps* folder.