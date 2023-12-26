// 引入 vue-router 路由实例
import { createRouter, createWebHistory } from 'vue-router';


// 引入路由文件地址
import Page1 from '../views/page1.vue'
import Page2 from '../views/page2.vue'
import notFound from '../views/notFound.vue'

// 创建 保存实例
const router = createRouter(
    {
        history: createWebHistory(),
        routes: [
            { path: '/', component: Page1 },
            { path: '/page2', component: Page2 },
            { path: '/:matchPath(.*)*', component: notFound }]
    }
)


export default router;