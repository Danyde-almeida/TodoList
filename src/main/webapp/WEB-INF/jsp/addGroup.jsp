<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">

    <title>Polytech Todo 2022</title>

    <!-- Include the JQuery library -->
    <%@ include file="links.jsp"%>

</head>

<body>

<%@ include file="navbar.jsp"%>

<form method="post">
<div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col col-xl-10">
            <div class="card" style="border-radius: 1rem;">
                <div class="row g-0">
                    <div class="col-md-6 col-lg-6 d-flex align-items-center">
                        <div class="card-body p-4 p-lg-5 text-black">
                            <h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Nom du groupe</h5>
                                <div class="form-outline mb-4">
                                    <label class="form-label" for="nameGroup">Nom du groupe:</label>
                                    <input type="text" id="nameGroup" value="${nameGroup}" name="nameGroup"
                                           class="form-control form-control-lg" required="required"/>
                                </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-6 d-flex align-items-center">
                        <div class="card-body p-4 p-lg-5 text-black">
                            <h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Ajouté des gens au groupe:</h5>
                                <div class="scrollValidation">
                                    <nav>
                                        <ul>
                                            <c:if test='${sessionScope.list_users == [] }'>
                                                <h4>Aucune personne disponible</h4>
                                            </c:if>
                                            <c:forEach var="user" items="${sessionScope.list_users}">
                                                <li>
                                                    <input type="checkbox" value="${user.userId}" id="${user.userId}" name="users">
                                                    <label for="${user.userId}">${user.nom} ${user.prenom}</label>
                                                </li>
                                            </c:forEach>
                                        </ul>
                                    </nav>
                                </div>
                            <div class="pt-1 mb-4">
                                <button class="btn btn-dark btn-lg btn-block">Valider</button>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
</form>

</body>
</html>