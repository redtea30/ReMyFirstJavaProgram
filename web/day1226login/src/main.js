import {createApp} from 'vue'
import ArcoVue from "@arco-design/web-vue";
import './style.css'
// 这是在导包
import App from '@/App.vue'
import '@arco-design/web-vue/dist/arco.css';
import router from '@/router'

const app = createApp(App)
app.use(ArcoVue, {
    // 用于改变使用组件时的前缀名称
    componentPrefix: 'arco'
});
app.use(router)
app.mount('#app')