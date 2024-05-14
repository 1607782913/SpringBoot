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
    import news from '@/views/modules/news/list'
    import banjixinwen from '@/views/modules/banjixinwen/list'
    import jiazhangrenwu from '@/views/modules/jiazhangrenwu/list'
    import discussxuexichengji from '@/views/modules/discussxuexichengji/list'
    import xuexichengji from '@/views/modules/xuexichengji/list'
    import xueshengzuoye from '@/views/modules/xueshengzuoye/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import banjiquan from '@/views/modules/banjiquan/list'
    import kechengbiao from '@/views/modules/kechengbiao/list'
    import jiazhang from '@/views/modules/jiazhang/list'
    import discussxueshengzuoye from '@/views/modules/discussxueshengzuoye/list'
    import tijiaorenwu from '@/views/modules/tijiaorenwu/list'
    import banji from '@/views/modules/banji/list'
    import config from '@/views/modules/config/list'
    import discussbanjiquan from '@/views/modules/discussbanjiquan/list'
    import tushuxinxi from '@/views/modules/tushuxinxi/list'


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
	path: '/news',
        name: '公告资讯',
        component: news
      }
      ,{
	path: '/banjixinwen',
        name: '班级新闻',
        component: banjixinwen
      }
      ,{
	path: '/jiazhangrenwu',
        name: '家长任务',
        component: jiazhangrenwu
      }
      ,{
	path: '/discussxuexichengji',
        name: '学习成绩评论',
        component: discussxuexichengji
      }
      ,{
	path: '/xuexichengji',
        name: '学习成绩',
        component: xuexichengji
      }
      ,{
	path: '/xueshengzuoye',
        name: '学生作业',
        component: xueshengzuoye
      }
      ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
      ,{
	path: '/banjiquan',
        name: '班级圈',
        component: banjiquan
      }
      ,{
	path: '/kechengbiao',
        name: '课程表',
        component: kechengbiao
      }
      ,{
	path: '/jiazhang',
        name: '家长',
        component: jiazhang
      }
      ,{
	path: '/discussxueshengzuoye',
        name: '学生作业评论',
        component: discussxueshengzuoye
      }
      ,{
	path: '/tijiaorenwu',
        name: '提交任务',
        component: tijiaorenwu
      }
      ,{
	path: '/banji',
        name: '班级',
        component: banji
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/discussbanjiquan',
        name: '班级圈评论',
        component: discussbanjiquan
      }
      ,{
	path: '/tushuxinxi',
        name: '图书信息',
        component: tushuxinxi
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
