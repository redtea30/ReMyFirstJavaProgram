// 引入 vue-router 路由实例
import { createRouter, createWebHistory } from 'vue-router';


// 引入路由文件地址
import Page1 from '../views/page1.vue'
import Page2 from '../views/page2.vue'
import Dish from '../views/dish.vue'
import notFound from '../views/notFound.vue'

// 通过一个对象保存router规则
const router1 = [
    // 以下目录对应views目录下的对应文件
    { path: '/', component: Page1 },
    { path: '/page2', component: Page2 },
    { path: '/name/:Dish', component: Dish },
    { path: '/:matchPath(.*)*', component: notFound }
]
// 创建 保存实例
const router = createRouter(
    {
        history: createWebHistory(),
        // 导入router规则
        router1,
    }
)

// 导出router规则
export default router;