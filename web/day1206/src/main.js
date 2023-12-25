import {createApp} from 'vue'
// import './style.css'
import App from './App.vue'
import ElementPlus from 'element-plus'
import * as ElementPlusIconsVue from '@element-plus/icons-vue'
import MainPage from './components/MainPage.vue'
// import router from './routers'


// 全局注册图标
const app = createApp(App)
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}
app.use(ElementPlus)


// app.use(router)
app.mount('#app')