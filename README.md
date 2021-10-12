# Spring Boot Application
Backend application using Spring Boot Jpa, having mysql as database to store datas related to the movie. The goal of this project was to create a spring movie application where you could retrieve informations related to movies.

## Tables
This project had 4 tables:
-actor having as primary key actor_id and having first_name and last_name attributes.
-film_actor having as primary key actor_id and film_id and having as foreign key actor_id and film_id.
-film having as primary key film_id,having category_id as foreign key and having title,description,length and rating as attributes.
-category having category_id as primary key and having name as a attribute.

## Functionalities
-For actor you can add an actor,delete an actor, list all actors, get a actor with an specificy id, and you could find all movies that a certain actor had participated.
-For category you can add,delete an category, find all categories, get a category name given a id and get a category id given a category name.
-For film_actor you can add, list all film_actors, find a list of actors who had participated in a movie and get a list of films that an actor had participated in it.
-For film you can add a movie, find a movie given an id, find all informations of a movie given its title, find a movie rating given a movie title, find a movie length given an film_id, find the category type of a movie(Action,Drama,etc...) and find all actors that have appeared in a certain movie.
