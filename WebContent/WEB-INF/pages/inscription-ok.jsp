<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscription ok</title>
</head>
<body>
<h1>Inscription ok</h1>

<div>
<p>Civilité: ${ civilite }</P>
<%--= Civilité: <%= civilite %> --%>
<p>nom: ${nom }</P>
<p>prenom: ${ prenom }</P>
<p>Date de naissance: ${ date }</P>
<p>Numéro et rue: ${ numrue }</P>
<p>Ville: ${ ville }</P>
<p>Département: ${ dep }</P>
<p>Pays: ${ pays }</P>
<p>Téléphone : ${ tel }</P>
<p>Email: ${ email }</P>
<p>Vos commentaires: ${ comment }</P>
</div>

<div>
<a href = "accueil">Accueil</a>
</div>


</body>
</html>