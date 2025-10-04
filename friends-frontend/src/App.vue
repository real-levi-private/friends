<script setup>
import MapView from './components/MapView.vue'
</script>

<template>
  <header id="main-header">      
    <nav>
      <div id="title">
        <span>Willkommen!</span>
      </div>

      <div id="header-element">
        <a href="#">Start</a>
        <a href="#">Über uns</a>
        <a href="#">Kontakt</a>
      </div>
    </nav>
  </header>
  <main id="main-content">
    <section id="left-content">
      Linke Seite (25%)
    </section>
    <section id="right-content">
      <map-view/>
    </section>
  </main>
</template>

<style scoped>
#main-header {
  box-sizing: border-box;
  background-color: blueviolet;
  position: static;
  height: 60px;
}

#main-content {
  display: flex;
  height: calc(100vh - 60px);
}

#left-content {
  width: 25%;
  background-color: #525252; 
}

#right-content {
  width: 75%;
  background-color: #000000;
}

nav {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 10px 20px;
}

#title {
  font-size: 1.5em;
  color: white;
}

#header-element a {
  margin-left: 20px;
  text-decoration: none;
  color: white;
}

</style>
