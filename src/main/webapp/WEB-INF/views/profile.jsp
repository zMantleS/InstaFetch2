<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>Profile</title>
    <script async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js?client=ca-pub-4028570985492693"
            crossorigin="anonymous"></script>
    <style>
        /* Add some basic styling */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
        }

        h1 {
            margin-top: 0;
        }

        p {
            margin-bottom: 10px;
        }

        /* Style the navigation bar */
        ul.navbar {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #f9f9f9;
        }

        li.navitem {
            float: left;
        }

        li.navitem a {
            display: block;
            color: #333;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        li.navitem a:hover {
            background-color: #ddd;
        }
    </style>
</head>
<body>
<ul class="navbar">
    <li class="navitem"><a href="/">Home</a></li>
    <li class="navitem"><a href="/privacy">Privacy Policy</a></li>
</ul>
<br>
<h1>Profile</h1>
<p>${profile.toString()}</p>
<section>
    <h2>Username: ${profile.data.username}</h2>
    <h2>Image:</h2>
    <img src="${profile.data.profile_pic_url_hd}" width="150" height="150" alt="Image Filler">
</section>

<section>
    <h2>Followers</h2>
    <h3><fmt:formatNumber value="${profile.data.edge_followed_by.count}"/></h3>

</section>

<section>
<h2>Following</h2>
    <h3><fmt:formatNumber value="${profile.data.edge_follow.count}"/></h3>
</section>

<section>
<h2>Posts</h2>
    <p><fmt:formatNumber value="${profile.data.edge_owner_to_timeline_media.count}"/></p>
</section>

    <table>
    <c:forEach var="i" items="${profile.data.edge_owner_to_timeline_media.edges}">

        <c:if test="${i.node.__typename eq 'GraphSidecar'}">
            <tr>
            <c:forEach var="f" items="${i.node.edge_sidecar_to_children.edges}">
                <td>
                    <img style="width:auto;height:300px" src=${f.node.display_url}/>
                </td>
            </c:forEach>
            </tr>


            <td><fmt:formatNumber value="${i.node.edge_liked_by.count}"/></td>
        </c:if>
        <c:if test="${i.node.__typename ne 'GraphSidecar'}">
            <tr>
            <td>
                <img style="width:auto;height:300px" src=${i.node.display_url}>
                <td>${i.node.edge_media_to_caption.edges.get(0).node.text}</td>
                <td><fmt:formatNumber value="${i.node.edge_liked_by.count}"/></td>
            </td>
        </c:if>
        </tr>
    </c:forEach>
    </table>

<section>
    <h2>Highlights</h2>
    <table>
        <c:forEach var="i" items="${highlights.data}">
            <td>
                <img style="width:auto;height:300px" src=${i.node.cover_media.thumbnail_src}
            </td>
        </c:forEach>
    </table>
</section>

<section>
    <h2>Highlight 1</h2>
    <table>
        <c:forEach var="i" items="${highlight.data.reels.highlight.items}">
        <c:if test="${i.media_type eq 2}">
            <td>
                <video style="width:auto;height:300px" controls>
                    <source src="${i.video_versions.get(0).url}" type="video/mp4">
                </video>
            </td>
        </c:if>
                <c:if test="${i.media_type eq 1}">
                <td>
                    <img style="width:auto;height:300px" src=${i.image_versions2.candidates.get(0).url}</td>
                </c:if>


        </c:forEach>
    </table>
</section>

<!-- Additional sections for your profile page -->
<script async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js?client=ca-pub-4028570985492693"
    crossorigin="anonymous"></script>
<!-- Test -->
<ins class="adsbygoogle"
 style="display:block"
 data-ad-client="ca-pub-4028570985492693"
 data-ad-slot="4690824288"
 data-ad-format="auto"
 data-full-width-responsive="true"></ins>
<script>
(adsbygoogle = window.adsbygoogle || []).push({});
</script>

</body>
</html>