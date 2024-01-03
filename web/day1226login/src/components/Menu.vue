<template>
  <div>
    <a-menu
        v-model:openKeys="state.openKeys"
        v-model:selectedKeys="state.selectedKeys"
        style="width: 100%"
        :mode="state.mode"
        :items="items"
        :theme="state.theme"
        @click="handleMenuClick"
    ></a-menu>
  </div>
</template>
<script setup>
import {h, reactive} from 'vue';
import MyList from "@/components/MyList.vue"
import Home from "@/components/Home.vue"
// 这里导入的都是图标
import {
  MailOutlined,
  CalendarOutlined,
  AppstoreOutlined,
  SettingOutlined,
} from '@ant-design/icons-vue';
import {useRouter} from "vue-router";

const state = reactive({
  mode: 'inline',
  theme: 'light',
  selectedKeys: ['1'],
  openKeys: ['sub1'],
});

function getItem(label, key, icon, children, type) {
  return {
    key,
    icon,
    children,
    label,
    type,
  };
}

// 这里的key相当于vue router里的名称
const items = reactive([
  getItem('首页', 'Home', h(MailOutlined)),
  getItem('商品管理', 'MyList', h(CalendarOutlined)),
  getItem('系统管理', 'sub1', h(AppstoreOutlined), [
    getItem('用户管理', '3'),
    getItem('角色管理', '4'),
    getItem('菜单管理', '5'),
  ]),
]);

const router = useRouter();

// 这个方法处理点击事件，通过设置@click实现
function handleMenuClick(item) {
  // 这里 'item' 是点击的菜单项
  router.push({name: item.key});
}


</script>