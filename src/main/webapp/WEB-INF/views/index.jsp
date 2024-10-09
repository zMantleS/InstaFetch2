<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html;charset=UTF-8" language="java"%>

<!DOCTYPE html>
<html>

<head>
    <title>InstaFetch</title>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../resources/css/style.css">

    <script async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js?client=ca-pub-4028570985492693"
            crossorigin="anonymous"></script>

    <!-- Css Stylesheet -->

</head>
<body>
<!------------------------------------------------------------------------------------------------------------------>
<!-- Main Container -->
<!------------------------------------------------------------------------------------------------------------------>
<div class="container">

    <!-- Header -->
    <div class="header">
        <nav class="navbar">
            <div class="logo-box">
                <img class="logo" src="${pageContext.request.contextPath}/resources/images/logo-no-background.png"/>
                <p class="logo-text">InstaFetch.io</p>
                <p>${pageContext.request.contextPath}</p>
            </div>
            <div class="nav-box">
                <div class="nav-links">
                    <a href="#">Home</a>
                    <a href="#">About Us</a>
                    <a href="#">Contact Us</a>
                </div>
            </div>
        </nav>
    </div>

    <!-- Content -->
    <div class="content">
        <div class="search-box">
            <div class="content-header">
                <h1>Profile Viewer</h1>
            </div>
            <div class="content-tagline">
                <p>Type in a name to search for an Instagram overview.</p>
            </div>
            <div class="content-input">
                <!-- <form class="form-input" action="">
                    <button class="user-symbol" type="submit">@</button>
                    <input type="text" placeholder="Type in a Instagram name..." name="search">
                    <button class="search-button" type="submit">Search</button>
                </form>
                -->

                <form:form method="post" id="profileForm" modelAttribute="profile" onsubmit="updateFormAction()">
                    <form:label path="username">Name</form:label>
                    <form:input path="username" id="usernameInput"/>
                    <input type="submit" value="Submit"/>
                </form:form>

                <script>
                    function updateFormAction() {
                        var username = document.getElementById("usernameInput").value;
                        var form = document.getElementById("profileForm");
                        console.log(username);
                        form.action = "/profile/" + username;
                    }
                </script>

            </div>
        </div>
        <div class="ads-box">
            <div class="ad">
                <img class="ad-space" src="${pageContext.request.contextPath}/resources/images/fake-ad.jpg" />
            </div>
        </div>
    </div>

    <!-- Footer -->
    <div class="footer">
        <div class="footer-box">
            <p>&copy; 2023 InstaFetch.io All rights reserved.</p>
            <a href="#">About us</a>
            <a href="/privacy">Privacy policy</a>
            <a href="#">Terms & conditions</a>
        </div>
    </div>

</div>


<!------------------------------------------------------------------------------------------------------------------>
<!-- Test Code -->
<!------------------------------------------------------------------------------------------------------------------>
<!--


<ins class="adsbygoogle" style="display:block"
     data-ad-client="ca-pub-4028570985492693"
     data-ad-slot="4690824288"
     data-ad-format="auto"
     data-full-width-responsive="true"></ins>
-->
<!------------------------------------------------------------------------------------------------------------------>
<!-- Google Ads -->
<!------------------------------------------------------------------------------------------------------------------>
<script async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js?client=ca-pub-4028570985492693" crossorigin="anonymous"></script>
<script>
    (adsbygoogle = window.adsbygoogle || []).push({});
</script>

</body>
</html>