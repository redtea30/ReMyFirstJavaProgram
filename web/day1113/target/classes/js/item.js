let all = document.querySelector("[name='all']")
let goodses = document.querySelectorAll("[name='goods']")
let totalBox = document.querySelector(".total")

console.log(all, goodses, totalBox)

all.onclick = () => {
    let total = 0

    goodses.forEach((e) => {
        e.checked = all.checked
        total += parseInt(e.value)
    })

    if (!all.checked) {
        totalBox.innerText = 0
        return
    }
    totalBox.innerText = total
}

let count = 0;


goodses.forEach(e => {
    e.onclick = () => {
        // 当前元素的父元素
        let td = e.parentNode;
        // 找兄弟元素 -- 单价
        let price = td.nextElementSibling.nextElementSibling.nextElementSibling
        console.log(price.innerText);
        // -- 数量
        let number = price.nextElementSibling.children[1]
        console.log(number.value);
        let rowTotal = parseInt(price.innerText) * parseInt(number.value)
        let rowTotalEl = price.parentNode.lastElementChild
        console.log(rowTotalEl);
        rowTotalEl.innerText = rowTotal
    }


})

function minus(event) {
    let t = event.target
    // 数量
    let number = t.nextElementSibling
    let num = parseInt(number.value)
    if (num > 0) {
        num--;
    }
    number.value = num
}

function plus(event) {
    let t = event.target
    // 数量
    let number = t.previousElementSibling
    let num = parseInt(number.value)
    if (num < 99) {
        num++;
    }
    number.value = num
    console.log(num)
}

function getSum(event) {
    // 求数量
    let temp = event.target
    let quantity = temp.value
    console.log(quantity)

    // 单价


}
