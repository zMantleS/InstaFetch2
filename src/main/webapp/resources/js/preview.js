let preview;
let body;
let iD;
let td;
let carC = 0;

function openPreview(element, id) {
    var preview = document.querySelector(".profile-preview");
    var body = document.querySelector("body");
    td = document.querySelectorAll("td");
    iD = id;
    console.log("ID"+iD)
    tdID = document.querySelectorAll(".side");
    var frame = preview.querySelector("#frame");
    var down = preview.querySelector("#down");
    var sideL = preview.querySelector("#sideL");
    var sideR = preview.querySelector("#sideR");
    var img = element.firstChild.nextElementSibling.currentSrc;
    var postType = element.parentNode.querySelector("#pt");

    var img2 = td.item(iD).querySelector("img").currentSrc;;

    body.style.overflow = "hidden";
    preview.style.display = "flex";
    sideL.style.display = "none";
    sideR.style.display = "none";

    down.href = img2;
    frame.src = img2;

    if (postType.textContent === "photo_library") {
        console.log(1);
        sideL.style.display = "inline-block";
        sideR.style.display = "inline-block";
    }

    document.addEventListener("mousedown", handleDocumentClick);
}

function hideProfilePreview() {
    var body = document.querySelector("body");
    var preview = document.querySelector(".profile-preview");

    body.style.overflow = "auto";
    preview.style.display = "none";

    document.removeEventListener("mousedown", handleDocumentClick);
}

function handleDocumentClick(event) {
    var preview = document.querySelector(".profile-preview");

    if (
        event.target !== preview.querySelector("img") &&
        event.target !== preview.querySelector("#left") &&
        event.target !== preview.querySelector("#right") &&
        event.target !== preview.querySelector("#download") &&
        event.target !== preview.querySelector("#sideL") &&
        event.target !== preview.querySelector("#sideR")
    ) {
        iD = 0;
        carC = 0;
        hideProfilePreview();
    }
}

function navigate(direction) {
    var preview = document.querySelector(".profile-preview");
    var frame = preview.querySelector("#frame");
    var down = preview.querySelector("#down");
    var sideL = preview.querySelector("#sideL");
    var sideR = preview.querySelector("#sideR");
    td = document.querySelectorAll("td");

    console.log("am i in");
    console.log(direction);
    console.log(iD);


    carC = 0;
    let postType;

    if (direction === "next") {

        if (iD >= 0 && iD < td.length-1) {

            sideL.style.display = "none";
            sideR.style.display = "none";

            console.log("next");
            console.log(iD);
            iD++;
            carC = 1;
            console.log(iD);

            var select = td.item(iD);

            postType = select.querySelector("#pt");

            checkSide(postType);

            var img = select.querySelector("img").currentSrc;
            down.href = img
            frame.src = img;

        }

    } else if (direction === "prev") {
            if (iD > 0 && iD <= td.length) {

                sideL.style.display = "none";
                sideR.style.display = "none";

                console.log("prev");
                iD--;
                carC = 0;
                var select = td.item(iD);

                postType = select.querySelector("#pt");

                checkSide(postType);

                var img = select.querySelector("img").currentSrc;
                down.href = img
                frame.src = img;
            }
        }
}

function checkSide(postTypeId){
    if (postTypeId.textContent === "photo_library") {
        console.log(1);
        sideL.style.display = "inline-block";
        sideR.style.display = "inline-block";
    }
}

function navigateCar(direction) {
    var preview = document.querySelector(".profile-preview");
    var frame = preview.querySelector("#frame");
    var select = td.item(iD);
    var images = select.querySelectorAll(".side");

    console.log(carC > 0 && carC < images.length);
    switch(direction) {
        case "left":
            if (carC > 0 && carC <= images.length-1) {
                console.log("left");
                console.log(carC);
                carC--;
                frame.src = images[carC].currentSrc;
            }
            break;
        case "right":
            if (carC >= 0 && carC < images.length-1) {
                console.log("right");
                console.log(carC);
                carC++;
                frame.src = images[carC].currentSrc;
            }
            break;
    }
}

