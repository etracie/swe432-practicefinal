<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
		<script>
    			var servletURL = window.location.origin;
		</script>
		<title>Practice Exam</title>
		<link rel="stylesheet" href="./432-style.css" type="text/css">
                <style>
                        button {
                                border: 3px solid rgb(23,53,95);
                                border-radius: 8px;
                                padding: 10px;
                                background-color: rgb(193,231,247);
                                font-size: 20px;
                        }
                        div {
                                background-color: rgb(235,197,0);
                                color: rgb(23,53,95);
                                padding: 20px;
                                border: 3px solid rgb(23,53,95);
                        }
                </style>
	</head>
	<%@ page import="java.util.Date" %>
	<body style="background-color: rgb(54,94,120);">
		<h1 align="center" style="padding:20px; font-size:40px; color: rgb(235,197,0);">Beth's Practice Exam</h1>
                <div align="center">
                        <h2 align="center" style="font-size: 30px;">Your Favorite Book Titles:</h2>
                        <!-- MRE 1. accept three strings & concat them -->
			<form>
				<input type="text" id="book1" name="book1"><br>
				<input type="text" id="book2" name="book2"><br>
				<input type="text" id="book3" name="book3"><br>
				<button type='submit'>Submit</button>
			</form>
                        <!-- MRE 2. select any order of the strings to output -->
                </div>
	</body>
</html>
