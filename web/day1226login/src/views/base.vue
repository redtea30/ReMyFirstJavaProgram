<script setup>

</script>

<template>
  <div id="bigBox1">
    <a-layout-sider id="sideBar"></a-layout-sider>
    <div id="divider">
      <a-layout-header id="header"></a-layout-header>
      <a-layout-content id="content"></a-layout-content>
      <a-layout-footer id="footer"></a-layout-footer>
    </div>
  </div>

</template>

<style scoped>
html, body {
  height: 100%;
  margin: 0;
  padding: 0;
}

#sideBar {
  background-color: yellow;
  width: 200px;
  height: 100%;
}

#bigBox1, #divider {
  height: 100%;
}

#bigBox1 {
  display: flex;
  flex-direction: row; /* 水平布局 */
}

#divider {
  flex-grow: 1; /* 填充剩余空间 */
}


#header {
  background-color: #333;
  width: 100%;
  height: 100px;
  color: #fff;
  font-size: 20px;
}

#content {
  background-color: #f3e9cb;
  width: 100%;
  height: 100%;
}

#footer {
  background-color: #333;
  width: 100%;
  height: 100px;
  color: #fff;
}

</style>