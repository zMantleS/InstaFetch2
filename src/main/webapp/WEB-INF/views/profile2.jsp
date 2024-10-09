<%--
  Created by IntelliJ IDEA.
  User: smant
  Date: 27/08/2023
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/insta.css" type="text/css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Instafetch.io</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <script src="${pageContext.request.contextPath}/resources/js/preview.js"></script>
</head>
<body>
<header>
    <img alt="Logo here" src="${pageContext.request.contextPath}/resources/images/logo-no-background.png">
    <h1>InstaFetch.io</h1>
    <nav>
        <ul>
            <li><a href="#">home</a></li>
            <li><a href="#">about us</a></li>
            <li><a href="#">contact</a></li>
        </ul>
    </nav>
</header>

<main>
    <section class="profile-info">
        <img src="${profile.data.profile_pic_url}">
        <dl>
            <dt>username: ${profile .data.username}</dt>
            <dt>following: <fmt:formatNumber value="${profile.data.following_count}"></fmt:formatNumber></dt>
            <dt>followers: <fmt:formatNumber value="${profile.data.follower_count}"></fmt:formatNumber></dt>

        </dl>
    </section>
    <section class="profile-content">
        <ul>
            <li><a href="#!">posts</a></li>
            <li><a id="stories" onclick="idk()">stories</a></li>
            <li><a href="#!">highlights</a></li>
            <li><a href="#!">statistics</a></li>
        </ul>


        <script>
            function idk(){
                fetch('/profile/${username}/stories/${userid}')
                    .then(response => response.json())
                    .then(data => {
                        const profileSpaces = document.querySelector('.profile-spaces');
                        const stories = data.stories;
                        const test = stories["data"]
                        profileSpaces.innerHTML = '';
                        const images = [];

                        test.forEach(candidate => {
                            const image = candidate["image_versions2"]["candidates"][0]["url"];
                            images.push(image);

                        })

                        var table = document.createElement("table");








                    })

            }
        </script>



        <h1 id="idk2"></h1>



        <section class="profile-preview">
            <span onmousedown = "navigate('prev')" id="left" class="material-symbols-outlined">arrow_back_ios</span>
            <article>
                <article>

                    <button style="display: none" id="sideL" type="button" onmousedown="navigateCar('left')"></button>
                    <img id="frame" src="">
                    <button style="display: none" id="sideR" type="button" onmousedown="navigateCar('right')"></button>
                </article>
                <a id="down" href="" download="">
                    <span id="download" class="material-symbols-outlined">download</span>
                </a>

            </article>
            <span onmousedown="navigate('next')" id="right" class="material-symbols-outlined">arrow_forward_ios</span>

        </section>

        <section class="post-spaces">
            <table>
                <c:set value="${posts.data.edge_owner_to_timeline_media.items}" var="edges"></c:set>
                <c:set value="0" var="count"></c:set>
                        <c:forEach begin="0" end="${posts.data.edge_owner_to_timeline_media.items.size() div 4}">
                            <tr>
                            <c:forEach begin="0" end="2">
                                <td id="p:${count}">
                                    <a href="#!" onclick="openPreview(this, ${count})">
                                    <img src=${edges[count].node.display_url}>
                                    </a>
                                    <c:choose>
                                        <c:when test="${edges[count].node.__typename == 'GraphImage'}">
                                            <span id="pt" class="material-symbols-outlined">photo_camera</span>
                                        </c:when>
                                        <c:when test="${edges[count].node.__typename == 'GraphVideo'}">
                                            <span id="pt" class="material-symbols-outlined">movie</span>
                                        </c:when>
                                        <c:when test="${edges[count].node.__typename == 'GraphSidecar'}">
                                            <span id="pt" class="material-symbols-outlined">photo_library</span>
                                            <c:set var="carCount" value="0"></c:set>
                                                <c:forEach var="i" items="${edges[count].node.edgeSidecarToChildren.edges}">
                                                    <img class="side" id="${carCount}" style="display: none" src="${i.node.display_url}">
                                                    <c:set var="carCount" value="${carCount + 1}"/>
                                                </c:forEach>
                                        </c:when>

                                    </c:choose>

                                    <article>
                                        <div class="info">
                                            <h1><span class="material-symbols-outlined">favorite</span> <fmt:formatNumber value="${edges[count].node.edge_media_preview_like.count}"/></h1>
                                            <h1><span class="material-symbols-outlined">comment</span> <fmt:formatNumber value="${edges[count].node.edge_media_to_comment.count}"/></h1>
                                        </div>
                                        <p>${edges[count].node.text}</P>
                                    </article>
                                </td>
                                <c:set var="count" value="${count + 1}"></c:set>
                            </c:forEach>
                            </tr>
                        </c:forEach>
            </table>
        </section>

        <section class="story-spaces">
            <table>

            </table>
        </section>
    </section>


</main>
</body>
</html>