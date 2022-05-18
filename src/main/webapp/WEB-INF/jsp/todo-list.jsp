<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">

    <title>Polytech Chat 2022</title>

    <!-- Include the JQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
            integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
            integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
            crossorigin="anonymous"></script>

    <style>
        div.scroll {
            background-color: white;
            width: 100%;
            height: 300px;
            overflow-x: hidden;
            overflow-y: auto;
        }
        li{
            list-style: none;
        }
        div.scrolladd {
            background-color: white;
            width: 100%;
            height: 200px;
            overflow-x: hidden;
            overflow-y: auto;
        }
    </style>
</head>

<body>
<div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col col-xl-10">
            <div class="card" style="border-radius: 1rem;">
                <div class="row g-0">
                    <div class="col-md-6 col-lg-6 d-flex align-items-center">
                        <div class="card-body p-4 p-lg-5 text-black">
                            <h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Todo List personelle:</h5>
                            <form method="post">
                                <div class="scroll">
                                    <nav >
                                        <ul>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                        </ul>
                                    </nav>
                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-6 d-flex align-items-center">
                        <div class="card-body p-4 p-lg-5 text-black">
                            <h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Todo List partagée:</h5>
                            <form method="post">
                                <div class="scroll">
                                    <nav >
                                        <ul>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                            <li>
                                                <input type="checkbox" id="horns" name="horns">
                                                <label for="horns">Horns</label>
                                            </li>
                                        </ul>
                                    </nav>
                                </div>
                            </form>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>

<div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col col-xl-10">
            <div class="card" style="border-radius: 1rem;">
                <div class="row g-0">
                    <div class="col-md-6 col-lg-6 d-flex align-items-center">
                        <div class="card-body p-4 p-lg-5 text-black">
                            <h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Ajouter une Task à votre ToDo-List</h5>
                            <form method="post">
                                <div class="form-outline mb-4">
                                    <label class="form-label" for="nameTask">Nom de la tache:</label>
                                    <input type="text" id="nameTask" value="${nameTask}" name="nameTask"
                                           class="form-control form-control-lg" required="required"/>
                                </div>

                                <div class="form-outline mb-4">
                                    <label class="form-label" for="dateFin">Date de fin</label>
                                    <input type="date" id="dateFin" value="${dateFin}" name="dateFin"
                                           class="form-control form-control-lg" required="required"/>
                                </div>
                                <br>
                                <div class="pt-1 mb-4">
                                    <button class="btn btn-dark btn-lg btn-block">Valider</button>
                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-6 d-flex align-items-center">
                        <div class="card-body p-4 p-lg-5 text-black">
                            <h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Partagée à:</h5>
                            <form method="post">
                                <div class="scroll">
                                    <nav>
                                        <ul>
                                            <c:if test='${sessionScope.list_users == [] }'>
                                                <h4>Aucune personne disponible</h4>
                                            </c:if>
                                            <c:forEach var="user" items="${sessionScope.list_users}">
                                                <li>
                                                    <input type="checkbox" id="${user.idUser}" name="${user.idUser}">
                                                    <label for="${user.idUser}">${user.nom} ${user.prenom}</label>
                                                </li>
                                            </c:forEach>
                                        </ul>
                                    </nav>
                                </div>
                            </form>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>