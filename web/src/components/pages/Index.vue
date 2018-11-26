<template>
  <div class="container">
    <div class="row">
      <site-header />
    </div>
    <div class="row">
      <div class="col-5">
        <side-bar />
      </div>
      <div class="col-7">
        <content-panel />
      </div>
    </div>
    <div class="row">
      <site-footer />
    </div>
  </div>
</template>

<script>
import SiteHeader from '@/components/pages/partitial/SiteHeader'
import SideBar from '@/components/pages/partitial/SideBar'
import ContentPanel from '@/components/pages/partitial/ContentPanel'
import SiteFooter from '@/components/pages/partitial/SiteFooter'

export default {
  name: 'index-page',
  components: {
    'site-header': SiteHeader,
    'side-bar': SideBar,
    'content-panel': ContentPanel,
    'site-footer': SiteFooter
  }
}
</script>

<style scoped>

</style>
