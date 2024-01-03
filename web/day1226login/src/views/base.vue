<template>
  <a-layout>
    <a-layout-sider :style="siderStyle">
      <Menu></Menu>
    </a-layout-sider>
    <a-layout>
      <a-layout-header :style="headerStyle">Header</a-layout-header>
      <!--Content部分-->
      <a-layout-content :style="contentStyle">
        <RouterView></RouterView>
      </a-layout-content>
      <a-layout-footer :style="footerStyle">Footer</a-layout-footer>
    </a-layout>
  </a-layout>
</template>

<script setup>
import {ref, reactive, markRaw} from "vue";
import List from "@/components/MyList.vue";
import Menu from "@/components/Menu.vue";
import {RouterView} from "vue-router";
// 改成变量了，问的gpt，获取当前视窗高度
const height = ref(window.innerHeight - 64 * 2);
const headerStyle = {
  textAlign: 'center',
  color: '#fff',
  height: 64,
  paddingInline: 50,
  lineHeight: '64px',
  backgroundColor: '#7dbcea',
};
const contentStyle = {
  textAlign: 'center',
  minHeight: '120px',
  lineHeight: '120px',
  color: '#fff',
  // 这里设置的就是视窗的高度
  height: height + "px",
  backgroundColor: '#108ee9',
};
const siderStyle = {
  textAlign: 'center',
  lineHeight: '120px',
  color: '#fff',
  backgroundColor: '#3ba0e9',
};
const footerStyle = {
  textAlign: 'center',
  color: '#fff',
  backgroundColor: '#7dbcea',
};
// 导入MyList对象
const MyList = markRaw(List)

// 先获取了，有啥用处不知道
const ListHeight = document.getElementsByName("MyList")

</script>
