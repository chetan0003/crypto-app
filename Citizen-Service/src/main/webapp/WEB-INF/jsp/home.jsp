<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crypto App</title>
<style>
.auth_subm {
  height: 20pt;
  width: 130pt;
  font: bold 10pt Arial, Helvetica, sans-serif;
  margin: 2pt;
  margin-right: 0px;
  text-align: center
}
.c_conv {
  font: bold 17pt Arial, Helvetica, sans-serif;
  margin: 2pt;
  margin-right: 0px;
  text-align: center
 }
 .article1{
 font: bold 17pt Arial, Helvetica, sans-serif;
  margin: 2pt;
  margin-right: 0px;
  text-align: center
}

</style>
</head>
<body background=
"https://cdn.pixabay.com/photo/2016/11/10/05/09/bitcoin-1813503_640.jpg">
     
   <h2 align="center" style="color: #ffffff;">Crypto App</h2>
   <h4 align="center">Here, you will get the details of crypto currency at real time</h4>
   
   <tr>
   <td><a  href="https://springboot-heroku-cryptoapp.herokuapp.com/crypto/tickers"><input type ="button" value="Get All Tickers" class="auth_subm" style="background-color:#00d100"/></a></td>
   &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp&nbsp &nbsp &nbsp
   &nbsp 
  <td><a  href="https://springboot-heroku-cryptoapp.herokuapp.com/"><input type ="button" value="Home" class="auth_subm" style="background-color:#00d100"/></a></td>
   &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
   <td><a  href="https://springboot-heroku-cryptoapp.herokuapp.com/crypto/author"><input type ="button" value="About Author" class="auth_subm" style="background-color:#00d100"/></a></td>
   </tr>
    <!-- error message  -->
	<c:if test="${not empty msg}">
		<div align="center">
			<h3 style="color: #ff2424;">${msg}</h3>
		</div>
	</c:if>
	
	<c:choose>
		<c:when test="${empty author && empty data}">

			<div style="margin-top: 150px;">
				<article align="center" style="color: #ffffff;" class="article1">
					<p>𝘊𝘳𝘺𝘱𝘵𝘰𝘤𝘶𝘳𝘳𝘦𝘯𝘤𝘺 𝘪𝘴 𝘢𝘯 𝘪𝘯𝘵𝘦𝘳𝘯𝘦𝘵-𝘣𝘢𝘴𝘦𝘥 𝘮𝘦𝘥𝘪𝘶𝘮 𝘰𝘧 𝘦𝘹𝘤𝘩𝘢𝘯𝘨𝘦 𝘸𝘩𝘪𝘤𝘩 𝘶𝘴𝘦𝘴 𝘤𝘳𝘺𝘱𝘵𝘰𝘨𝘳𝘢𝘱𝘩𝘪𝘤𝘢𝘭 𝘧𝘶𝘯𝘤𝘵𝘪𝘰𝘯𝘴 𝘵𝘰 𝘤𝘰𝘯𝘥𝘶𝘤𝘵 𝘧𝘪𝘯𝘢𝘯𝘤𝘪𝘢𝘭 𝘵𝘳𝘢𝘯𝘴𝘢𝘤𝘵𝘪𝘰𝘯𝘴. 
					𝘊𝘳𝘺𝘱𝘵𝘰𝘤𝘶𝘳𝘳𝘦𝘯𝘤𝘪𝘦𝘴 𝘭𝘦𝘷𝘦𝘳𝘢𝘨𝘦 𝘣𝘭𝘰𝘤𝘬𝘤𝘩𝘢𝘪𝘯 𝘵𝘦𝘤𝘩𝘯𝘰𝘭𝘰𝘨𝘺 𝘵𝘰 𝘨𝘢𝘪𝘯 𝘥𝘦𝘤𝘦𝘯𝘵𝘳𝘢𝘭𝘪𝘻𝘢𝘵𝘪𝘰𝘯, 𝘵𝘳𝘢𝘯𝘴𝘱𝘢𝘳𝘦𝘯𝘤𝘺, 𝘢𝘯𝘥 𝘪𝘮𝘮𝘶𝘵𝘢𝘣𝘪𝘭𝘪𝘵𝘺.</p>
				</article>
				<div style="margin-top: 100px;" class="c_conv">
				<article align="center">
				<p style="color : #ffffff;"><marquee behavior="alternate" direction="left" scrollamount="5">𝓒𝓾𝓻𝓻𝓮𝓷𝓬𝔂 𝓒𝓸𝓷𝓿𝓮𝓻𝓽𝓮𝓻 𝓯𝓮𝓪𝓽𝓾𝓻𝓮 𝔀𝓲𝓵𝓵 𝓫𝓮 𝓪𝓭𝓭𝓮𝓭 𝓼𝓸𝓸𝓷!!!</marquee></p>
				</article>
				<article>
				<p><marquee behavior="scroll" direction="left"><img src="//www.html.am/images/html-codes/marquees/fish-swimming.gif" width="94" height="88" alt="Swimming fish" /></marquee></p>
				</article>
				</div> 
			</div>
		</c:when> 
	</c:choose>

	<c:if test="${not empty author}">
	<table cellSpacing='0'  align="center" style="background-color:#FFFFE0; margin-top: 60px;" class="auth_table" border="1">
	        <tr><td cellspacing="20px"><img src="/IMG_20181130_191634.jpg" alt="Girl in a jacket" width="200" height="200"></td></tr>
			<tr><td><h4>Name: ${author.name}</h4></td></tr>
			<tr><td><h4>Designation: ${author.designation}</h4></td></tr>
			<tr><td><h4>Experience: ${author.experience} year(S)</h4></td></tr>
	</table>

</c:if>
	
	<c:if test="${not empty data}">
	<table  border="1" style="background-color:#FFFFE0; margin-top: 10px;">
	<thead>
	<tr>
	<th style="background-color:#FFFFE0;"><h4>Symbol</h4></th>
	<th>Name</th>
	<th>NameId</th>
	<th>Rank</th>
	<th>Price_usd</th>
	<th>Percent_change_24h</th>
	<th>Percent_change_1h</th>
	<!-- <th>Percent_change_7d</th> -->
	<th>Price_btc</th>
	<th>Market_cap_usd</th>
	<!-- <th>Volume24</th>
	<th>Volume24a</th> -->
	<!-- <th>Csupply</th>
	<th>Tsupply</th>
	<th>Msupply</th> -->
    <th>Get Details</th>
    </tr>
	</thead>
	<c:forEach items="${data}" var="city">
		<tr>
			<td>${city.symbol}</td>
			<td>${city.name}</td>
			<td>${city.nameid}</td>
			<td>${city.rank}</td>
			<td>${city.price_usd}</td>
			<td>${city.percent_change_24h}</td>
			<td>${city.percent_change_1h}</td>
			<%-- <td>${city.percent_change_7d}</td> --%>
			<td>${city.price_btc}</td>
			<td>${city.market_cap_usd}</td>
<%-- 			<td>${city.volume24}</td> --%>
<%-- 			<td>${city.volume24a}</td> --%>
			<%-- <td>${city.csupply}</td>
			<td>${city.tsupply}</td>
			<td>${city.msupply}</td> --%>
			<td><a  href="https://springboot-heroku-cryptoapp.herokuapp.com/crypto/ticker/id/${city.id}"><input type ="button" value="Get Details" style="background-color:#d6d6d6"/></a></td>
	   </tr>
	</c:forEach>
	</table>
	</c:if>
	</body>
</html>