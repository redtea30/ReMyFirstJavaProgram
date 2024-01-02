<template>
  <div>
    <a-table :row-selection="rowSelection"
             :columns="columnsFromJson"
             :data-source="dataSource"
             bordered
             :loading="loading"
             :pagination="pagination"
    >

      <template #bodyCell="{ column, text }">
        <template v-if="column.dataIndex === 'name'">
          <a>{{ text }}</a>
        </template>
      </template>

    </a-table>
  </div>
  <div>
    <!--    获取列表的列数-->
    <span>默认展示数据：总数{{ contentNumbers }}</span>
  </div>
</template>

<script setup>
import Content from '@/assets/myTest.json'; // 导入数据
import Title from '@/assets/title.json'; // 导入列定义
import {ref, computed} from 'vue';

// 将导入的数据和列定义转换为响应式对象
const dataSource = ref(Content);
const columnsFromJson = ref(Title);
// 数据列数
const contentNumbers = computed(() => dataSource.value.length);
// 添加序号列
const indexColumn = {
  title: '序号',
  dataIndex: 'index',
  key: 'index',
  // 使用 scopedSlots 自定义渲染内容（如果需要）
  scopedSlots: {customRender: 'serial'},
};

// 将序号列添加到列的开始位置
columnsFromJson.value.unshift(indexColumn);

const columns = computed(() => {
  return columnsFromJson.value.map((col, index) => {
    // 如果是序号列，添加序号逻辑
    if (col.dataIndex === 'index') {
      return {
        ...col,
        customRender: (_, record, rowIndex) => `${rowIndex + 1}`, // 这里 rowIndex + 1 就是序号
      };
    }
    return col;
  });
});
const deleteRow = (index) => {
  dataSource.value.splice(index, 1);
}
// 添加操作列
const operationColumn = {
  title: '操作',
  dataIndex: 'index',
  key: 'index',
  // 使用 scopedSlots 自定义渲染内容（如果需要）
  scopedSlots: {customRender: 'serial'},
};

columnsFromJson.value.push(operationColumn);

const loading = ref(false);

const pagination = ref({
  position: ["bottomLeft"],
  showSizeChanger: true,
  pageSizeOptions: [1, 2, 5, 10],
  defaultPageSize: 2,
  // 底下的直接写死了，不能用
  // pageSize: 2,
  // current: 1,
  showQuickJumper: true,
});

// todo 多选，不会写，有问题
</script>
