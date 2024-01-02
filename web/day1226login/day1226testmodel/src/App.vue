<template>
  <p>这是测试页面</p>
  <hr>
  <a-table :columns="columns" :data-source="dataSource" bordered>
    <template #bodyCell="{ column, text }">
      <template v-if="column.dataIndex === 'name'">
        <a>{{ text }}</a>
      </template>
    </template>
    <template #title>Header</template>
    <template #footer>Footer</template>
  </a-table>
  <hr>

</template>
<script setup>
// 这里直接注入我想要的数据
import Content from './myTest.json'
import Title from './title.json'
import {ref} from 'vue'
// 把数据通过响应式赋值给dataSource对象
const dataSource = ref(Content)
console.log(dataSource)
const columns = ref(Title)
console.log(columns)
</script>