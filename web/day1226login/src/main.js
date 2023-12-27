import {createApp} from 'vue'
// import './style.css'
// 这是在导包
import App from '@/App.vue'
import router from '@/router'
import Antd from 'ant-design-vue';

const app = createApp(App)
app.use(Antd);
app.use(router)
app.mount('#app')