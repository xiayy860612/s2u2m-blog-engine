import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import VueInfo from '@/components/VueInfo'
import SinglePage from '@/components/pages/single/SinglePage'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/vi',
      name: 'ViewInfo',
      component: VueInfo
    },
    {
      path: '/md',
      name: 'SinglePage',
      component: SinglePage
    }
  ]
})
