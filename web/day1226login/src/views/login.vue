<style scoped>
#bigBox {
  background-color: #f3e9cb;

}

#headline {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100px;
  background-color: #333;
  color: #fff;
  font-size: 20px;
  margin: 10px 10px 20px 10px;
}

#container {
  height: 100vh;
  display: flex;
  align-items: center;
  justify-content: center;
}

#bigForm {
  margin: 10px;
  display: flex;
  justify-content: center;
  align-items: center;
}

#formInnerBorder {
  width: 400px;
}
</style>
<template>
  <div id="container">
    <div id="bigBox">
      <div id="headline">
        <!--图片后期需要替换-->
        <img alt="Vue Logo" src="@/assets/vue.svg" width="50px">
        <h1>kfm用户登陆界面</h1>
      </div>

      <a-form id="bigForm" ref="formRef" :rules="rules" :model="form" :style="{width:'600px'}" @submit="handleSubmit">
        <div id="formInnerBorder">
          <a-form-item field="name" label="用户名" validate-trigger="change,blur" required :rules="rules">
            <a-input v-model:value="form.name" placeholder="请输入用户名" allow-clear show-count/>
          </a-form-item>
          <a-form-item field="password" label="密码" validate-trigger="change,blur" required>
            <a-input-password v-model:value="form.password" placeholder="请输入用户密码" allow-clear show-count/>
          </a-form-item>
          <a-form-item name="remember" :wrapper-col="{ offset:1, span: 16 }">
            <a-checkbox v-model:checked="form.remember">下次自动登录</a-checkbox>
          </a-form-item>
          <a-form-item :wrapper-col="{ offset:8, span: 16 }">
            <a-space>
              <a-button :disabled="disabled" type="primary" html-type="submit">提交</a-button>
              <a-button @click="$refs.formRef.resetFields()" type="primary" danger>重置</a-button>
            </a-space>
          </a-form-item>
        </div>

      </a-form>
      输入结果，暂时保留{{ form }}
    </div>
  </div>
</template>

<script setup>
// 导入reactive 响应式对象
import {reactive, computed} from 'vue';

const handleSubmit = ({form, errors}) => {
  console.log('form:', form, '\nerrors:', errors)
}

const form = reactive({
  name: '',
  password: '',
  remember: true,
});

const disabled = computed(() => {
  return !(form.name && form.password);
})
const regexValidation = async (_, value) => {
  const pattern = /[^a-zA-Z0-9]/; // 正则表达式匹配非字母和数字字符
  if (pattern.test(value)) {
    return Promise.reject('只能包含字母和数字');
  }
  return Promise.resolve();
}
const rules = {
  name: [
    {required: true, message: '必须输入用户名', trigger: 'blur'},
    {minLength: 5, message: "用户名最少输入5个字符", trigger: 'change'},
    {maxLength: 20, message: "用户名最多输入20个字符", trigger: 'change'},
    {validator: regexValidation, message: '只能包含字母和数字', trigger: 'change'}
  ],
  password: [
    {required: true, message: '密码必须填写',},
    {minLength: 5, message: "用户名最少输入5个字符"},
    {maxLength: 20, message: "用户名最多输入20个字符"},
  ],
}
</script>
