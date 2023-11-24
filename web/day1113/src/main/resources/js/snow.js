// 获取 canvas 元素和上下文
const canvas = document.getElementById('snowCanvas');
const ctx = canvas.getContext('2d');

// 设置 canvas 大小
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

// 创建雪花粒子数组
let snowflakes = [];

// 定义一个函数来创建一个新的雪花
function createSnowflake() {
    snowflakes.push({
        x: Math.random() * canvas.width,
        y: Math.random() * canvas.height,
        size: Math.random() * 5 + 2,
        speed: Math.random() * 1 + 0.5
    });
}

// 绘制雪花
function drawSnowflake(flake) {
    ctx.beginPath();
    ctx.arc(flake.x, flake.y, flake.size, 0, Math.PI * 2);
    ctx.fillStyle = 'white';
    ctx.fill();
    ctx.closePath();
}

// 更新和绘制所有的雪花
function updateAndDrawSnowflakes() {
    ctx.clearRect(0, 0, canvas.width, canvas.height);

    for (let i = 0; i < snowflakes.length; i++) {
        let flake = snowflakes[i];
        drawSnowflake(flake);
        flake.y += flake.speed;

        // 当雪花移出屏幕时，重新放置它在屏幕顶部
        if (flake.y > canvas.height) {
            snowflakes[i] = {
                x: Math.random() * canvas.width,
                y: -flake.size,
                size: flake.size,
                speed: flake.speed
            };
        }
    }

    requestAnimationFrame(updateAndDrawSnowflakes);
}

// 每秒添加一些新的雪花
setInterval(createSnowflake, 1);

// 开始动画
updateAndDrawSnowflakes();
