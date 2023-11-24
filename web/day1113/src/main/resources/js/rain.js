let body = document.querySelector('body')


let drop = () => {
    let heart = document.createElement("span");
    let x = Math.random() * window.innerWidth;
    let y = 0;

    heart.innerText = "♥";
    heart.style.position = "absolute";
    heart.style.top = y + "px";
    heart.style.left = x + "px";
    heart.className = 'span'
    heart.style.color = "pink"

    body.appendChild(heart)

    setTimeout(function () {
        body.removeChild(heart)
    }, 2000)
}

window.onload = () => {
    setInterval(drop, 0.000000000001)
}