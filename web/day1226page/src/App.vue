

<template>
  <p>这里是主页</p>
  <nav>
    <a href="/">page1</a> |
    <a href="/page2">page2</a>
    <!-- 这里是对于读取倒的数据进行输出 -->
    <router-link v-for="item in dataSnack" :key="item.name" :to="`/name/${item.name}`"> |
      {{ item.name }}
    </router-link>
    
  </nav>
  <router-view></router-view>
</template> 
<script>
// 这里是直接读取json中的数据然后向前台导出
import dataSnack from './data.json'
// 暴露json的数据，dataSnack 方法和属性同名
export default {
  data() {
    return {
      dataSnack
    }
  }
} 
</script>  

