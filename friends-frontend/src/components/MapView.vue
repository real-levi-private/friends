<template>
  <div id="map"></div>
</template>

<script setup>
import { onMounted } from "vue";
import L from "leaflet";
import "leaflet/dist/leaflet.css";
import { GeoSearchControl, OpenStreetMapProvider } from "leaflet-geosearch";
import "leaflet-geosearch/dist/geosearch.css";

onMounted(() => {
  const map = L.map("map").setView([51.505, -0.09], 13);

  L.tileLayer("https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png", {
    attribution:
      '&copy; <a href="https://www.openstreetmap.org/">OpenStreetMap</a> contributors',
  }).addTo(map);

  const provider = new OpenStreetMapProvider();
  const searchControl = new GeoSearchControl({
    provider,
    style: "bar",
    autoComplete: true,
    autoCompleteDelay: 300,
    showMarker: false,
    retainZoomLevel: false,
    animateZoom: true,
    keepResult: true,
  });

  map.addControl(searchControl);
});
</script>

<style>
#map {
  height: 100%;
  width: 100%;
}

.leaflet-control-geosearch form input {
  color: black !important;
}

.leaflet-control-geosearch .results > * {
  color: black !important;
}
</style>
