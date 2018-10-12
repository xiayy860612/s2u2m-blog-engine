<template>
  <div>
    {{ msg }}

    <single-page v-bind:mdUrl="mdUrl"></single-page>
  </div>
</template>

<script>
import SinglePage from '@/components/pages/single/SinglePage'

export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App',
      mdUrl: 'https://raw.githubusercontent.com/xiayy860612/pure-blog-content/master/content/IT%E7%B2%BE%E5%8D%8E/Framework/spring/request-workflow/request-workflow.md'
    }
  },
  components: {
    'single-page': SinglePage
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
