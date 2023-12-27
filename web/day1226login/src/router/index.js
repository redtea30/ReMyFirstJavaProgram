import {createRouter, createWebHistory} from 'vue-router'

// 在这里导入页面组件
import Login from '@/views/login.vue'
import Base from '@/views/base.vue'

// 这里进行页面注册
const routes = [
    {path: "/", redirect: '/login'},
    {path: "/login", name: "Login", component: Login},
    {path: "/base", name: "Base", component: Base},
    {path: "/notFound", redirect: '/notfound'}
];

// 创建一个路由器实例
const router = createRouter({
    history: createWebHistory(),
    routes,
});

// 导出路由
export default router;