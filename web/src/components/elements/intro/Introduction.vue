<template>
<div class="container">
  <div class="row">
    <div class="card text-left">
      <img class="card-img-top" src="{{ avartar }}" alt="{{ name }}">
      <div class="card-body">
        <h4 class="card-title">{{ name }}</h4>
        <!-- <p class="card-text">Body</p> -->
      </div>
      <div class="card-body">

      </div>
    </div>
  </div>
</div>
</template>

<script>

export default {
  name: 'intro',
  props: {
    avatar: String,
    name: String,
    contacts: Array
  }
}
</script>

<style scoped>

</style>
