<template>
  <a-menu
      v-model:openKeys="state.openKeys"
      v-model:selectedKeys="state.selectedKeys"
      style="width: 100%"
      :items="items"
      @click="handleClick"
  />
</template>
<script setup>
import {h, reactive, ref} from 'vue';
import {useRouter} from "vue-router";
import {
  MailOutlined,
  CalendarOutlined,
  AppstoreOutlined,
  SettingOutlined,
} from '@ant-design/icons-vue';


const state = reactive({
  collapsed: false,
  selectedKeys: [sessionStorage.getItem("selectedKeys") || "Home"],
  openKeys: [sessionStorage.getItem("openKeys") || ""],
  preOpenKeys: [],
});

const items = reactive([
  {
    key: 'Home',
    icon: () => h(MailOutlined),
    label: '首页',
    title: '首页',
    path: '/home',
  },
  {
    key: 'MyList',
    icon: () => h(CalendarOutlined),
    label: '商品列表',
    title: '商品列表',
    path: '/myList',
  },
  {
    key: 'user',
    icon: () => h(CalendarOutlined),
    label: '用户管理',
    title: '用户管理',
    path: '/user',
  }
]);
const router = useRouter();
const handleClick = ({item, key, keyPath}) => {
  console.log(item, key, keyPath);
  sessionStorage.setItem("selectedKeys", key);
  state.selectedKeys = [key];
  if (keyPath.length > 1) {
    // 有子菜单
    state.openKeys = [keyPath[0]];
    sessionStorage.setItem("openKeys", keyPath[0]);
  } else {
    state.openKeys = [];
    sessionStorage.setItem("openKeys", "/");
  }
  console.log(item.path)
  // 路由跳转
  router.push(item.path);
};
</script>