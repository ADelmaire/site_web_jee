<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link rel = "stylesheet" href = "ressources/css/login.css">
</head>

<body>

<h1 id="titre">Page de login</h1>

<div>
	<form action="login" method= "post">
	<%-- post appelle un doPost dans la servlet
	permet de sécuriser les données:
	en get tout apparait ds l'url
	seuls input qu'on peut mettre en get= formulaires de recherche
	 --%>
	
		<fieldset>
		<legend>Se connecter</legend>
		
		<div id="contenu">
			<label for"login">login</label>
			<input id="login" name="login"/>
			
			<label for "password">password</label>
			<input type= "password" name="password"/>
			
			<input type="submit" value="Se connecter"/>
			
			<input type="reset" value="Annuler"/>
		</div>
		</fieldset>
	</form>
</div>


<a href = "accueil">Accueil</a>

</body>
</html>