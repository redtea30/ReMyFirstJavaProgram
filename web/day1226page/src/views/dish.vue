
<template>
    <h1>烤肉</h1>
    <p>{{ $dishName.id }}</p><br>
    <p>{{ $dishName.name }}</p><br>
    <p>{{ $dishName.purchased }}</p><br>
    <p>显示图片开始</p>
    <img :src="`../src/images/${$dishName.image}`">
    <p>显示图片结束</p>
</template>
<script>
import dishs from '../data.json'
export default {
    computed: {
        name() {
            return this.$route.params.name
        },
        dishName() {
            return dishs.find(
                dishName => dataName.name === this.name
            )
        }
    }
}

</script>