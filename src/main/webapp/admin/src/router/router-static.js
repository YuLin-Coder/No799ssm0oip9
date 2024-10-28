import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import chukujilu from '@/views/modules/chukujilu/list'
    import xiaoshouyuan from '@/views/modules/xiaoshouyuan/list'
    import baosunshenbao from '@/views/modules/baosunshenbao/list'
    import yaopinxinxi from '@/views/modules/yaopinxinxi/list'
    import xiaoshoujilu from '@/views/modules/xiaoshoujilu/list'
    import rukujilu from '@/views/modules/rukujilu/list'
    import yaopinfenlei from '@/views/modules/yaopinfenlei/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/chukujilu',
        name: '出库记录',
        component: chukujilu
      }
      ,{
	path: '/xiaoshouyuan',
        name: '销售员',
        component: xiaoshouyuan
      }
      ,{
	path: '/baosunshenbao',
        name: '报损申报',
        component: baosunshenbao
      }
      ,{
	path: '/yaopinxinxi',
        name: '药品信息',
        component: yaopinxinxi
      }
      ,{
	path: '/xiaoshoujilu',
        name: '销售记录',
        component: xiaoshoujilu
      }
      ,{
	path: '/rukujilu',
        name: '入库记录',
        component: rukujilu
      }
      ,{
	path: '/yaopinfenlei',
        name: '药品分类',
        component: yaopinfenlei
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
