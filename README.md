# :movie_camera: Cinema Service :ticket:

<h4 align="center">The simple web application to book the cinema tickets.</h4>

<p align="center">
  <a href="#description">Description</a> •
  <a href="#structure">Structure</a> •
  <a href="#used-technologies">Used technologies</a> •
  <a href="#endpoints">Endpoints</a> •
  <a href="#how-to-use">How To Use</a> •
</p>

## Description

Using this simple web application registered and authenticated user can book cinema tickets. To change the data of the list of films, sessions, cinema halls, user must have ADMIN rights.

## Structure
#### This web application structure is N-tier architecture model that including the following layers:
- Controllers
- Service
- Model
- DAO (CRUD operations)
- DTO

#### DB structure:
![pic](cinema_shop_structure.png)

## Used technologies

- Java 11
- MySQL
- Tomcat
- Maven
- REST
- Spring (MVC, Security)
- Hibernate

## Endpoints

<table>
<thead>
<tr>
<th>Method</th>
<th align="center">Endpoint</th>
<th align="center">Description</th>
<th align="right">Roles</th>
</tr>
</thead>
<tbody>
<tr>
<td>POST</td>
<td>/register</td>
<td>registration of a new user</td>
<td align="center">ADMIN</td>
</tr>
<tr>
<td>POST</td>
<td>/movies</td>
<td>creating a new movie</td>
<td align="center">ADMIN</td>
</tr>
<tr>
<td>POST</td>
<td>/cinema-halls</td>
<td>creating a new cinema hall</td>
<td align="center">ADMIN</td>
</tr>
<tr>
<td>POST</td>
<td>/movie-sessions</td>
<td>creating a new movie sessionl</td>
<td align="center">ADMIN</td>
</tr>
<tr>
<td>POST</td>
<td>/orders/complete</td>
<td>creating an order</td>
<td align="center">USER</td>
</tr>
<tr>
<td>PUT</td>
<td>/movie-sessions/{id}</td>
<td>updating a movie session</td>
<td align="center">ADMIN</td>
</tr>
<tr>
<td>POST</td>
<td>/shopping-carts/movie-sessions</td>
<td>adding a movie session to shopping cart</td>
<td align="center">USER</td>
</tr>
<tr>
<td>DELETE</td>
<td>/movie-sessions/{id}</td>
<td>deleting a movie session</td>
<td align="center">ADMIN</td>
</tr>
<tr>
<td>GET</td>
<td>/users/by-email</td>
<td>getting the user by email</td>
<td align="center">ADMIN</td>
</tr>
<tr>
<td>GET</td>
<td>/orders</td>
<td>getting the order user's history</td>
<td align="center">USER</td>
</tr>
<tr>
<td>GET</td>
<td>/shopping-carts/by-user</td>
<td>getting user's shopping cart</td>
<td align="center">USER</td>
</tr>
<tr>
<td>GET</td>
<td>/movies</td>
<td>returns all movies</td>
<td align="center">ADMIN, USER</td>
</tr>
<tr>
<td>GET</td>
<td>/cinema-halls</td>
<td>getting all cinema halls</td>
<td align="center">ADMIN, USER</td>
</tr>
<tr>
<td>GET</td>
<td>/movie-sessions/available</td>
<td>getting all available movie sessions for the selected movie</td>
<td align="center">ADMIN, USER</td>
</tr>
</tbody>
</table>

## How To Use

- Clone this project.
- Install MySQL and create a schema "ticket_app".
- Set up and run Apache TomCat.
- Change url, driver, username and password in db.properties file. 
- Configure Local Apache TomCat Service in your IDE
- Enjoy

> **Note**
> When the application starts, a user (login - 'admin@i.ua', password = 'admin123') with ADMIN rights is created
