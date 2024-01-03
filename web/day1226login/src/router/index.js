import {createRouter, createWebHistory} from 'vue-router'

// 在这里导入页面组件
import Login from '@/views/login.vue'
import Base from '@/views/base.vue'
import NotFound from '@/views/notFound.vue'

// 这里都是导入的东西
import Home from '@/components/Home.vue'
// import User from '@/components/User.vue'
// import Role from '@/components/Role.vue'
import Menu from '@/components/Menu.vue'
import MyList from '@/components/MyList.vue'

// 这里进行页面注册
const routes = [
    {path: "/", redirect: '/login'},
    {path: "/login", name: "Login", component: Login},
    {
        path: "/base", name: "Base", component: Base, children: [
            {path: "/", name: "Home", component: Home},
            // {path: "/user", name: "User", component:User},
            // {path: "/role", name: "Role", ccomponent:Role},
            {path: "/menu", name: "Menu", component: Menu},
            {path: "/mylist", name: "MyList", component: MyList},
        ]
    },
    // 通配符设置
    {path: "/:catchAll(.*)", name: "404", component: NotFound},

];

// 创建一个路由器实例
const router = createRouter({
    history: createWebHistory(),
    routes,
});

// 导出路由
export default router;


