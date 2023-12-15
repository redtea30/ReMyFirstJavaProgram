// src/router/index.js

import { createRouter, createWebHistory } from 'vue-router'
import HomePage from '../views/HelloWorld.vue'
import AboutPage from '../views/AboutPage.vue'

// 定义路由
// 每个路由都需要映射到一个组件。
const routes = [
    { path: '/', component: HomePage },
    { path: '/about', component: AboutPage },
]

// 创建 router 实例
const router = createRouter({
    history: createWebHistory(), // 使用 HTML5 历史模式
    routes, // `routes: routes` 的缩写
})

export default router
