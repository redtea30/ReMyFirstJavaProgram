<style>
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
  margin-bottom: 20px;
}

</style>
<template>
  <div id="bigBox">
    <div id="headline">
      <!--图片后期需要替换-->
      <img src="../src/assets/vue.svg" width="50px">
      <h1>kfm用户登陆界面</h1>
    </div>


    <a-form ref="formRef" :rules="rules" :model="form" :style="{width:'600px'}" @submit="handleSubmit">
      <a-form-item field="name" label="用户名">
        <a-input v-model="form.name" placeholder="请输入用户名"/>
      </a-form-item>
      <a-form-item field="password" label="密码" validate-trigger="change">
        <a-input-password v-model="form.password" placeholder="请输入用户密码" allow-clear/>
      </a-form-item>
      <a-form-item>
        <a-space>
          <a-button html-type="submit">提交</a-button>
          <a-button @click="$refs.formRef.resetFields()">重置</a-button>
        </a-space>
      </a-form-item>
    </a-form>
    {{ form }}
  </div>

</template>

<script>
import {reactive} from 'vue';

export default {
  setup() {
    const handleSubmit = ({values, errors}) => {
      console.log('values:', values, '\nerrors:', errors)
    }

    const form = reactive({
      name: '',
      password: '',
      match: ''
    });
    const regexValidation = (_, value) => {
      const pattern = /[^a-zA-Z0-9]/; // 正则表达式匹配非字母和数字字符
      if (pattern.test(value)) {
        return Promise.reject('只能包含字母和数字');
      }
      return Promise.resolve();
    }

    const rules = {
      name: [
        {required: true, message: '必须输入用户名', trigger: 'blur'},
        {minLength: 5, message: "用户名最少输入5个字符"},
        {maxLength: 20, message: "用户名最多输入20个字符"},
        {validator: regexValidation, message: '只能包含字母和数字'}
      ],
      password: [
        {required: true, message: '密码必须填写',},
        {minLength: 5, message: "用户名最少输入5个字符"},
        {maxLength: 20, message: "用户名最多输入20个字符"},

      ],


    }


    return {
      form,
      rules,
      handleSubmit,
      regexValidation
    }
  },
}
</script>
