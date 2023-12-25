/*function changeImage() {
    var bubble = document.getElementById('bubble');

    setInterval(function () {
        bubble.src = '../img/light.jpg';
    }, 3000);
}

// 调用函数
changeImage();*/


function bubbleLighter() {
    var bubble = document.getElementById('bubble')
    var temp = 0;
    setInterval(function () {
        temp++;
        if (temp % 2 == 0) {
            bubble.src = '../img/dark.jpg'
            return;
        }
        bubble.src = '../img/light.jpg'


    }, 16)
}

bubbleLighter()


var boxChecker = document.querySelectorAll('.box-checker')
var all = document.querySelectorAll('.ALL')

for (let i = 0; i < boxChecker.length; i++) {
    boxChecker[i].checked = true
}