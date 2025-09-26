<script setup>
defineProps({
  msg: {
    type: String,
    required: true,
  },
})
import CounterButton from './CounterButton.vue';
</script>

<template>
  <div class="greetings">
    <h1 class="green">{{ msg }}</h1>
    <h3>
      You’ve successfully created a project
    </h3>
    <CounterButton />
  </div>
</template>

<style scoped>
</style>
