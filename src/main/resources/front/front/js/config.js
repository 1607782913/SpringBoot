
var projectName = '中小学家校通系统的设计与实现';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '课程表',
	url: './pages/kechengbiao/list.html'
}, 
{
	name: '学习成绩',
	url: './pages/xuexichengji/list.html'
}, 
{
	name: '学生作业',
	url: './pages/xueshengzuoye/list.html'
}, 
{
	name: '班级圈',
	url: './pages/banjiquan/list.html'
}, 
{
	name: '图书信息',
	url: './pages/tushuxinxi/list.html'
}, 
{
	name: '家长任务',
	url: './pages/jiazhangrenwu/list.html'
}, 

{
	name: '公告资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springboot7z6vr/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除"],"menu":"家长","menuJump":"列表","tableName":"jiazhang"}],"menu":"家长管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["新增","查看","修改","删除"],"menu":"班级","menuJump":"列表","tableName":"banji"}],"menu":"班级管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["新增","查看","修改","删除"],"menu":"课程表","menuJump":"列表","tableName":"kechengbiao"}],"menu":"课程表管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","修改","删除","查看评论"],"menu":"学习成绩","menuJump":"列表","tableName":"xuexichengji"}],"menu":"学习成绩管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","修改","删除","查看评论"],"menu":"学生作业","menuJump":"列表","tableName":"xueshengzuoye"}],"menu":"学生作业管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","修改","删除","查看评论"],"menu":"班级圈","menuJump":"列表","tableName":"banjiquan"}],"menu":"班级圈管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","修改","删除"],"menu":"班级新闻","menuJump":"列表","tableName":"banjixinwen"}],"menu":"班级新闻管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"图书信息","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","修改","删除"],"menu":"家长任务","menuJump":"列表","tableName":"jiazhangrenwu"}],"menu":"家长任务管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","修改","删除"],"menu":"提交任务","menuJump":"列表","tableName":"tijiaorenwu"}],"menu":"提交任务管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告资讯","tableName":"news"},{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看"],"menu":"课程表列表","menuJump":"列表","tableName":"kechengbiao"}],"menu":"课程表模块"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","查看评论"],"menu":"学习成绩列表","menuJump":"列表","tableName":"xuexichengji"}],"menu":"学习成绩模块"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","查看评论"],"menu":"学生作业列表","menuJump":"列表","tableName":"xueshengzuoye"}],"menu":"学生作业模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","查看评论"],"menu":"班级圈列表","menuJump":"列表","tableName":"banjiquan"}],"menu":"班级圈模块"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"图书信息列表","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息模块"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","提交任务"],"menu":"家长任务列表","menuJump":"列表","tableName":"jiazhangrenwu"}],"menu":"家长任务模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除","查看评论"],"menu":"学习成绩","menuJump":"列表","tableName":"xuexichengji"}],"menu":"学习成绩管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除","查看评论"],"menu":"学生作业","menuJump":"列表","tableName":"xueshengzuoye"}],"menu":"学生作业管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["新增","查看","修改","删除"],"menu":"班级新闻","menuJump":"列表","tableName":"banjixinwen"}],"menu":"班级新闻管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["新增","查看","修改","删除"],"menu":"家长任务","menuJump":"列表","tableName":"jiazhangrenwu"}],"menu":"家长任务管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","修改","删除","审核"],"menu":"提交任务","menuJump":"列表","tableName":"tijiaorenwu"}],"menu":"提交任务管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看"],"menu":"课程表列表","menuJump":"列表","tableName":"kechengbiao"}],"menu":"课程表模块"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","查看评论"],"menu":"学习成绩列表","menuJump":"列表","tableName":"xuexichengji"}],"menu":"学习成绩模块"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","查看评论"],"menu":"学生作业列表","menuJump":"列表","tableName":"xueshengzuoye"}],"menu":"学生作业模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","查看评论"],"menu":"班级圈列表","menuJump":"列表","tableName":"banjiquan"}],"menu":"班级圈模块"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"图书信息列表","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息模块"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","提交任务"],"menu":"家长任务列表","menuJump":"列表","tableName":"jiazhangrenwu"}],"menu":"家长任务模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"教师","tableName":"jiaoshi"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["新增","查看","修改","删除","查看评论"],"menu":"班级圈","menuJump":"列表","tableName":"banjiquan"}],"menu":"班级圈管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","修改","删除"],"menu":"班级新闻","menuJump":"列表","tableName":"banjixinwen"}],"menu":"班级新闻管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","修改","删除"],"menu":"提交任务","menuJump":"列表","tableName":"tijiaorenwu"}],"menu":"提交任务管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看"],"menu":"课程表列表","menuJump":"列表","tableName":"kechengbiao"}],"menu":"课程表模块"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","查看评论"],"menu":"学习成绩列表","menuJump":"列表","tableName":"xuexichengji"}],"menu":"学习成绩模块"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","查看评论"],"menu":"学生作业列表","menuJump":"列表","tableName":"xueshengzuoye"}],"menu":"学生作业模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","查看评论"],"menu":"班级圈列表","menuJump":"列表","tableName":"banjiquan"}],"menu":"班级圈模块"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"图书信息列表","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息模块"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","提交任务"],"menu":"家长任务列表","menuJump":"列表","tableName":"jiazhangrenwu"}],"menu":"家长任务模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"家长","tableName":"jiazhang"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
