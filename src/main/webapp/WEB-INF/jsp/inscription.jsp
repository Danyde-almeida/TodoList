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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

</head>

<body>
<div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col col-xl-10">
            <div class="card" style="border-radius: 1rem;">
                <div class="row g-0">
                    <div class="col-md-6 col-lg-5 d-none d-md-block">
                        <img
                                src="https://www.missnumerique.com/blog/wp-content/uploads/photographie-de-nuit-objectif-grand-angle.jpg"
                                alt="login form"
                                class="img-fluid" style="border-radius: 1rem 0 0 1rem; height: 100%;"
                        />
                    </div>
                    <div class="col-md-6 col-lg-7 d-flex align-items-center">
                        <div class="card-body p-4 p-lg-5 text-black">
                            <div class="d-flex align-items-center mb-3 pb-1 logo">
                    <span class="h1 fw-bold mb-0">
                      <img
                              src="https://upload.wikimedia.org/wikipedia/fr/thumb/4/4c/Univ_Aix-Marseille_-_Polytech.svg/1200px-Univ_Aix-Marseille_-_Polytech.svg.png"
                              alt="logo form"
                              class="img-fluid" style="width:30%;"
                      />
                    </span>
                            </div>

                            <h5 class="fw-normal mb-2 pb-3" style="letter-spacing: 1px;">Inscrivez-vous</h5>
                            <c:if test="${errorMessage != null}">
                            <div class="alert alert-danger" role="alert">
                                ${errorMessage}
                            </div>
                            </c:if>
                            <form method="post">
                                <div class="form-outline mb-2">
                                    <label class="form-label" for="login">Nom</label>
                                    <input type="text" id="nom" value="${nom}" name="nom" class="form-control form-control-lg" required="required" />
                                </div>

                                <div class="form-outline mb-2">
                                    <label class="form-label" for="login">Prénom</label>
                                    <input type="text" id="prenom" value="${prenom}"name="prenom" class="form-control form-control-lg" required="required" />
                                </div>

                                <div class="form-outline mb-2">
                                    <label class="form-label" for="login">Addresse e-mail</label>
                                    <input type="email" id="login" value="${login}" name="login" class="form-control form-control-lg " required="required"/>
                                </div>

                                <div class="form-outline mb-2">
                                    <label class="form-label" for="password">Mot de passe</label>
                                    <input type="password" id="password" value="${password}" name="password" class="form-control form-control-lg" required="required" />
                                </div>

                                <div class="pt-1 mb-2">
                                    <button class="btn btn-dark btn-lg btn-block float-right">S'inscrire</button>
                                </div>
                            </form>
                                <span class="small text-muted" >Déjà inscrit ? <a class="small text-muted" href="/login">Se Connecter</a> </span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>