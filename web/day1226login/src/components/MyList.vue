<template>
  <div>
    <a-table :row-selection="rowSelection"
             :columns="columnsFromJson"
             :data-source="dataSource"
             bordered
             size="small"
             :pagination="pagination"
    >

      <template #bodyCell="{ column, text, record }">
        <template v-if="column.dataIndex === 'name'">
          <a>{{ text }}</a>
        </template>
        <template v-if="column.dataIndex === 'operation'">
          <!-- 操作列 -->
          <a-button @click="onEdit(record)" type="primary">修改</a-button>
          <!--    这里是配合上面修改的弹出框      -->
          <a-popconfirm
              title="你确定要删除吗?"
              ok-text="Yes"
              cancel-text="No"
              @confirm="confirm"
              @cancel="cancel"
          >
            <a-button @click="onDelete(record)" type="primary" danger>删除</a-button>
          </a-popconfirm>

        </template>
      </template>

    </a-table>
  </div>
  <!--  信息展示模块，随时可以删除掉-->
  <div>
    <!--    获取列表的列数-->
    <span>默认展示数据：总数{{ contentNumbers }} ，当前页{{ currentPage }}，每页显示{{ pageSize }}</span>
  </div>
</template>

<script setup>
import Content from '@/assets/myTest.json'; // 导入数据
import Title from '@/assets/title.json'; // 导入列定义
import {ref, computed} from 'vue';

// 将导入的数据和列定义转换为响应式对象
const dataSource = ref(Content);
const columnsFromJson = ref(Title);
// 获取数据表列总数
const contentNumbers = computed(() => dataSource.value.length);

// 当前页和每页显示的数量
const currentPage = ref(1);
const pageSize = ref(10);  // 或者使用 pagination.defaultPageSize

// 计算行数的方法
const calculateRowNumber = (index) => {
  return (currentPage.value - 1) * pageSize.value + index + 1;
};

// 添加序号列
const indexColumn = {
  title: '序号',
  dataIndex: 'serial',
  key: 'serial',
  customRender: ({index}) => calculateRowNumber(index),
  width: '50px'
};
// 将序号列添加到列的开始位置
columnsFromJson.value.unshift(indexColumn);

const pagination = ref({
  position: ["bottomLeft"],
  showSizeChanger: true,
  pageSizeOptions: [10, 20, 50],
  defaultPageSize: 10,
  showQuickJumper: true,
  currentPage,
  pageSize,
  onChange: handleTableChange,
  onShowSizeChange: handleTableChange,
});

// 处理表格变化事件
function handleTableChange(newPage, newPageSize) {
  currentPage.value = newPage;
  pageSize.value = newPageSize;
}

// todo 多选，不会写，有问题
// todo 操作，不会写，在抄

// dataSource.forEach(item => {
//   item.status = 1;
// });
</script>
