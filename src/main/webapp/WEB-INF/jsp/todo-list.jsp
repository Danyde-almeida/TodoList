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
                            <h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Todo List personelle:</h5>
                                <div class="scroll">
                                    <nav >
                                        <ul>
                                            <c:if test='${taskListNotShared == [] }'>
                                                <h4>Aucune tache enregistrée</h4>
                                            </c:if>
                                            <c:forEach var="task" items="${taskListNotShared}">
                                                <c:if test='${task.status == false }'>
                                                    <li>
                                                        <input class="checkbox" type="checkbox" id="${task.taskId}" value="${task.taskId}" name="validate">
                                                        <label for="${task.taskId}">-> Nom de la tache: ${task.name}
                                                            <br>-> Date de début de la tache:
                                                            <script>
                                                                var date = new Date('${task.dateDebut}');
                                                                var day = date.getDate();
                                                                var month = date.getMonth();
                                                                var year = date.getFullYear();
                                                                document.write(day + '/'+ month + '/'+ year);
                                                            </script>
                                                            <br>-> Date de fin de la tache:  <script>
                                                                var date = new Date('${task.dateFin}');
                                                                var day = date.getDate();
                                                                var month = date.getMonth();
                                                                var year = date.getFullYear();
                                                                document.write(day + '/'+ month + '/'+ year);
                                                            </script>
                                                        </label>
                                                    </li>
                                                </c:if>
                                                <c:if test='${task.status == true }'>
                                                    <li class="validated checkbox">
                                                        <input class="checkbox" type="checkbox" id="${task.taskId}" value="${task.taskId}" name="validate" checked>
                                                        <label for="${task.taskId}">-> Nom de la tache: ${task.name}
                                                            <br>-> Date de début de la tache:
                                                            <script>
                                                                var date = new Date('${task.dateDebut}');
                                                                var day = date.getDate();
                                                                var month = date.getMonth();
                                                                var year = date.getFullYear();
                                                                document.write(day + '/'+ month + '/'+ year);
                                                            </script>
                                                            <br>-> Date de fin de la tache:  <script>
                                                                var date = new Date('${task.dateFin}');
                                                                var day = date.getDate();
                                                                var month = date.getMonth();
                                                                var year = date.getFullYear();
                                                                document.write(day + '/'+ month + '/'+ year);
                                                            </script>
                                                        </label>
                                                    </li>
                                                </c:if>
                                            </c:forEach>
                                        </ul>
                                    </nav>
                                </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-6 d-flex align-items-center">
                        <div class="card-body p-4 p-lg-5 text-black">
                            <h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Todo List partagée:</h5>
                                <div class="scrollAdd">
                                    <nav >
                                        <ul>
                                            <c:if test='${taskListShared == [] }'>
                                                <h4>Aucune tache enregistrée</h4>
                                            </c:if>
                                            <c:forEach var="task" items="${taskListShared}">
                                                <c:if test='${task.status == false }'>
                                                    <li>
                                                        <c:if test='${task.creatorId == sessionScope.id }'>
                                                            <input class="checkbox" type="checkbox" id="${task.taskId}" value="${task.taskId}" name="validate">
                                                        </c:if>
                                                        <label for="${task.taskId}">-> Nom de la tache: ${task.name}
                                                            <br>-> Date de début de la tache:
                                                            <script>
                                                                var date = new Date('${task.dateDebut}');
                                                                var day = date.getDate();
                                                                var month = date.getMonth();
                                                                var year = date.getFullYear();
                                                                document.write(day + '/'+ month + '/'+ year);
                                                            </script>
                                                            <br>-> Date de fin de la tache:  <script>
                                                                var date = new Date('${task.dateFin}');
                                                                var day = date.getDate();
                                                                var month = date.getMonth();
                                                                var year = date.getFullYear();
                                                                document.write(day + '/'+ month + '/'+ year);
                                                            </script>
                                                        </label>
                                                    </li>
                                                </c:if>
                                                <c:if test='${task.status == true }'>
                                                    <li class="validated checkbox">
                                                        <c:if test='${task.creatorId == sessionScope.id}'>
                                                            <input class="checkbox" type="checkbox" id="${task.taskId}" value="${task.taskId}" name="validate" checked>
                                                            <label for="${task.taskId}">-> Nom de la tache: ${task.name}
                                                                <br>-> Date de début de la tache:
                                                                <script>
                                                                    var date = new Date('${task.dateDebut}');
                                                                    var day = date.getDate();
                                                                    var month = date.getMonth();
                                                                    var year = date.getFullYear();
                                                                    document.write(day + '/'+ month + '/'+ year);
                                                                </script>
                                                                <br>-> Date de fin de la tache:  <script>
                                                                    var date = new Date('${task.dateFin}');
                                                                    var day = date.getDate();
                                                                    var month = date.getMonth();
                                                                    var year = date.getFullYear();
                                                                    document.write(day + '/'+ month + '/'+ year);
                                                                </script>
                                                            </label>
                                                        </c:if>
                                                        <c:if test='${task.creatorId != sessionScope.id}'>
                                                            <input hidden="true" class="checkbox" type="checkbox" id="${task.taskId}" value="${task.taskId}" name="validate" checked>
                                                            <label for="${task.taskId}">-> Nom de la tache: ${task.name}
                                                                <br>-> Date de début de la tache:
                                                                <script>
                                                                    var date = new Date('${task.dateDebut}');
                                                                    var day = date.getDate();
                                                                    var month = date.getMonth();
                                                                    var year = date.getFullYear();
                                                                    document.write(day + '/'+ month + '/'+ year);
                                                                </script>
                                                                <br>-> Date de fin de la tache:  <script>
                                                                    var date = new Date('${task.dateFin}');
                                                                    var day = date.getDate();
                                                                    var month = date.getMonth();
                                                                    var year = date.getFullYear();
                                                                    document.write(day + '/'+ month + '/'+ year);
                                                                </script>
                                                            </label>
                                                        </c:if>
                                                    </li>
                                                </c:if>
                                            </c:forEach>
                                        </ul>
                                    </nav>
                                </div>
                            <div class="pt-1 mb-4">
                            <c:if test='${taskListShared != [] || taskListNotShared !=[] }'>
                                    <button class="btn btn-dark btn-lg btn-block">Valider</button>
                            </c:if>
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