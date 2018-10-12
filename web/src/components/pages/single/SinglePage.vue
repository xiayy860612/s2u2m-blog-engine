<template>
  <div>
    <div class="row">
      <div class="col markdown-body" v-html="compiledMarkdown"></div>
    </div>
    <div class="row">
      <div class="col">
        <creative-commons></creative-commons>
      </div>
    </div>
  </div>
</template>

<script>
import marked from 'marked'
import axios from 'axios'
import 'github-markdown-css'
import CreativeCommons from '@/components/elements/CreativeCommons'

export default {
  name: 'single-page',
  props: {
    mdUrl: String
  },
  data () {
    return {
      content: ''
    }
  },
  components: {
    'creative-commons': CreativeCommons
  },
  beforeMount: function () {
    axios.get(this.mdUrl).then(response => {
      this.content = response.data
    })
  },
  computed: {
    compiledMarkdown: function () {
      return marked(this.content, { sanitize: true })
    }
  }
}
</script>

<style scoped>

</style>
