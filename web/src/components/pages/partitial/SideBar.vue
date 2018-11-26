<template>
<div class="container">
  <div class="row">
    <intro  />
  </div>
  <div class="row">
    <category-list />
  </div>
</div>
</template>

<script>
import axios from 'axios'
import Introduction from '@/components/elements/intro/Introduction'
import CategoryList from '@/components/elements/CategoryList'

export default {
  name: 'side-bar',
  components: {
    'intro': Introduction,
    'category-list': CategoryList
  },
  data: function () {
    return {

    }
  }

}
</script>

<style scoped>

</style>
