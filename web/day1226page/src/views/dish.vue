
<template>
    <h1>烤肉</h1>
  <div v-if="dishName">
    <p>{{ dishName.id }}</p>
    <p>{{ dishName.name }}</p>
    <p>{{ dishName.purchased }}</p>
    <img :src="`/images/${dishName.image}`" alt="Dish Image">
  </div>
    <p>显示图片结束</p>
</template>
<script>
import dishes from '../data.json'
export default {
    computed: {
        name() {
            return this.$route.params.name
        },
        dishName() {
            return dishes.find(
                dish => dish.name === this.name
            )
        }
    }
}

</script>