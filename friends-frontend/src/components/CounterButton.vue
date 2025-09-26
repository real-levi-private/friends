<template>
  <div>
    <button @click="increment">Pressed {{ count }} times</button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      count: 0
    };
  },
  methods: {
    async increment() {
      const res = await fetch('http://localhost:8081/api/counter', {
        method: 'POST',
        headers: {
          'Authorization': 'Basic ' + btoa('admin:secret')
  }
      });
      const data = await res.json();
      this.count = data.count;
    }
  },
  async mounted() {
    const res = await fetch('http://localhost:8081/api/counter', {
        method: 'GET',
        headers: {
          'Authorization': 'Basic ' + btoa('admin:secret')
        }
      });
    const data = await res.json();
    this.count = data.count;
  }
};
</script>
