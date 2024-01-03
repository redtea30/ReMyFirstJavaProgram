import {createRouter, createWebHashHistory} from 'vue-router'

// 在这里导入页面组件
import Login from '@/views/login.vue'
import Base from '@/views/base.vue'
import NotFound from '@/views/notFound.vue'
import TestPage from '@/components/TestPage.vue'

// 这里都是导入的东西
import Home from '@/components/Home.vue'
import User from '@/components/User.vue'
// import Role from '@/components/Role.vue'
import Menu from '@/components/Menu.vue'
import MyList from '@/components/MyList.vue'

// 这里进行页面注册
const routes = [
    {path: "/", redirect: '/login'},
    {path: "/login", component: Login},
    {
        path: "/base",
        component: Base,
        children: [
            {path: "/", redirect: 'home'},
            {path: "/home", component: Home},
            {path: "/user", component: User},
            // {path: "/base/role", ccomponent:Role},
            {path: "/menu", component: Menu},
            {path: "/myList", component: MyList},
        ]
    },
    // 测试页面
    {path: "/testPage", component: TestPage},
    // 通配符设置
    {path: "/:catchAll(.*)", component: NotFound},

];

// 创建一个路由器实例，这里没有使用hash history
const router = createRouter({
    history: createWebHashHistory(),
    routes,
});

// todo 路由守卫，根据登陆的状态确认是否能进行跳转


// 导出路由
export default router;


