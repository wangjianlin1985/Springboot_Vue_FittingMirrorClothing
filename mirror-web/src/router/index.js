import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [{
    path: '/',
    name: 'Loadding',
    component: () => import('../views/Loadding.vue')
}, {
  path: '/logon',
  name: 'Logon',
  component: () => import('../views/Logon.vue')
}, {
  path: '/waring',
  name: 'Waring',
  component: () => import('../views/app/Waring.vue')
}, {
  path: '/index',
  name: 'Index',
  component: () => import('../views/Index.vue'),
  children: [{
    path: '/createClothes',
    name: 'CreateClothes',
    component: () => import('../views/clothes/CreateClothes')
  }, {
    path: '/searchClothes',
    name: 'SearchClothes',
    component: () => import('../views/clothes/SearchClothes')
  }, {
    path: '/searchUser',
    name: 'SearchUser',
    component: () => import('../views/user/SearchUser')
  }]
}]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
