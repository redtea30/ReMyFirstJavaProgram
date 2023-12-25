let body = document.querySelector('body')

let rand = () => {
    return Math.floor(Math.random() * 256)
}


window.onclick = (event) => {
    let heart = document.createElement("span")
    let x = event.clientX
    let y = event.clientY
    console.log(x + "    " + y)
    heart.innerText = "♥"
    heart.style.position = "absolute"
    heart.style.top = y + "px"
    heart.style.left = x + "px"
    heart.className = 'span'
    heart.style.color = "rgb(" + rand() + "," + rand() + "," + rand() + ")"

    body.appendChild(heart)

    setTimeout(function () {
        body.removeChild(heart)
    }, 2000)
}


